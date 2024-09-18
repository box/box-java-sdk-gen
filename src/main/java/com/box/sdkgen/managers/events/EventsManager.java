package com.box.sdkgen.managers.events;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.realtimeservers.RealtimeServers;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.events.Events;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public class EventsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public EventsManager() {
    this.networkSession = new NetworkSession();
  }

  protected EventsManager(EventsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public RealtimeServers getEventsWithLongPolling() {
    return getEventsWithLongPolling(new GetEventsWithLongPollingHeaders());
  }

  public RealtimeServers getEventsWithLongPolling(GetEventsWithLongPollingHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/events")).method("OPTIONS").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), RealtimeServers.class);
  }

  public Events getEvents() {
    return getEvents(new GetEventsQueryParams(), new GetEventsHeaders());
  }

  public Events getEvents(GetEventsQueryParams queryParams) {
    return getEvents(queryParams, new GetEventsHeaders());
  }

  public Events getEvents(GetEventsHeaders headers) {
    return getEvents(new GetEventsQueryParams(), headers);
  }

  public Events getEvents(GetEventsQueryParams queryParams, GetEventsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("stream_type", convertToString(queryParams.getStreamType())), entryOf("stream_position", convertToString(queryParams.getStreamPosition())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("event_type", convertToString(queryParams.getEventType())), entryOf("created_after", convertToString(queryParams.getCreatedAfter())), entryOf("created_before", convertToString(queryParams.getCreatedBefore()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/events")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Events.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class EventsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public EventsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public EventsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public EventsManager build() {
      return new EventsManager(this);
    }

  }

}
