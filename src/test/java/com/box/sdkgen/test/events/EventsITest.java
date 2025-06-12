package com.box.sdkgen.test.events;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.epochSecondsToDateTime;
import static com.box.sdkgen.internal.utils.UtilsManager.getEpochTimeInSeconds;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.events.GetEventsQueryParams;
import com.box.sdkgen.managers.events.GetEventsQueryParamsEventTypeField;
import com.box.sdkgen.managers.events.GetEventsQueryParamsStreamTypeField;
import com.box.sdkgen.schemas.event.Event;
import com.box.sdkgen.schemas.events.Events;
import com.box.sdkgen.schemas.realtimeserver.RealtimeServer;
import com.box.sdkgen.schemas.realtimeservers.RealtimeServers;
import java.util.Arrays;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class EventsITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testEvents() {
    Events events = client.getEvents().getEvents();
    assert events.getEntries().size() > 0;
    Event firstEvent = events.getEntries().get(0);
    assert convertToString(firstEvent.getCreatedBy().getType()).equals("user");
    assert !(convertToString(firstEvent.getEventType()).equals(""));
  }

  @Test
  public void testEventUpload() {
    Events events =
        client
            .getEvents()
            .getEvents(
                new GetEventsQueryParams.GetEventsQueryParamsBuilder()
                    .streamType(GetEventsQueryParamsStreamTypeField.ADMIN_LOGS)
                    .eventType(Arrays.asList(GetEventsQueryParamsEventTypeField.UPLOAD))
                    .build());
    assert events.getEntries().size() > 0;
    Event firstEvent = events.getEntries().get(0);
    assert convertToString(firstEvent.getEventType()).equals("UPLOAD");
  }

  @Test
  public void testEventDeleteUser() {
    Events events =
        client
            .getEvents()
            .getEvents(
                new GetEventsQueryParams.GetEventsQueryParamsBuilder()
                    .streamType(GetEventsQueryParamsStreamTypeField.ADMIN_LOGS)
                    .eventType(Arrays.asList(GetEventsQueryParamsEventTypeField.DELETE_USER))
                    .build());
    assert events.getEntries().size() > 0;
    Event firstEvent = events.getEntries().get(0);
    assert convertToString(firstEvent.getEventType()).equals("DELETE_USER");
  }

  @Test
  public void testEventSourceFileOrFolder() {
    Events events =
        client
            .getEvents()
            .getEvents(
                new GetEventsQueryParams.GetEventsQueryParamsBuilder()
                    .streamType(GetEventsQueryParamsStreamTypeField.CHANGES)
                    .build());
    assert events.getEntries().size() > 0;
  }

  @Test
  public void testGetEventsWithLongPolling() {
    RealtimeServers servers = client.getEvents().getEventsWithLongPolling();
    assert servers.getEntries().size() > 0;
    RealtimeServer server = servers.getEntries().get(0);
    assert convertToString(server.getType()).equals("realtime_server");
    assert !(server.getUrl().equals(""));
  }

  @Test
  public void testGetEventsWithDateFilters() {
    long currentEpochTimeInSeconds = getEpochTimeInSeconds();
    long epochTimeInSecondsAWeekAgo = currentEpochTimeInSeconds - 7 * 24 * 60 * 60;
    Date createdAfterDate = epochSecondsToDateTime(epochTimeInSecondsAWeekAgo);
    Date createdBeforeDate = epochSecondsToDateTime(currentEpochTimeInSeconds);
    Events servers =
        client
            .getEvents()
            .getEvents(
                new GetEventsQueryParams.GetEventsQueryParamsBuilder()
                    .streamType(GetEventsQueryParamsStreamTypeField.ADMIN_LOGS)
                    .limit(1L)
                    .createdAfter(createdAfterDate)
                    .createdBefore(createdBeforeDate)
                    .build());
    assert servers.getEntries().size() == 1;
  }
}
