package com.box.sdkgen.test.hubs;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.getEnvVar;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClientWithUserSubject;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.hubs.GetEnterpriseHubsV2025R0QueryParams;
import com.box.sdkgen.managers.hubs.GetEnterpriseHubsV2025R0QueryParamsDirectionField;
import com.box.sdkgen.managers.hubs.GetHubsV2025R0QueryParams;
import com.box.sdkgen.managers.hubs.GetHubsV2025R0QueryParamsDirectionField;
import com.box.sdkgen.schemas.v2025r0.hubsv2025r0.HubsV2025R0;
import com.box.sdkgen.schemas.v2025r0.hubv2025r0.HubV2025R0;
import org.junit.jupiter.api.Test;

public class HubsITest {

  private static final BoxClient client = getDefaultClientWithUserSubject(getEnvVar("USER_ID"));

  @Test
  public void testGetAndDeleteHubs() {
    HubsV2025R0 userHubs =
        client
            .getHubs()
            .getHubsV2025R0(
                new GetHubsV2025R0QueryParams.Builder()
                    .scope("all")
                    .sort("name")
                    .direction(GetHubsV2025R0QueryParamsDirectionField.ASC)
                    .build());
    assert userHubs.getEntries().size() > 0;
    HubV2025R0 userHub = userHubs.getEntries().get(0);
    assert !(userHub.getTitle().equals(""));
    assert !(userHub.getId().equals(""));
    assert convertToString(userHub.getType()).equals("hubs");
    HubsV2025R0 enterpriseHubs =
        client
            .getHubs()
            .getEnterpriseHubsV2025R0(
                new GetEnterpriseHubsV2025R0QueryParams.Builder()
                    .sort("name")
                    .direction(GetEnterpriseHubsV2025R0QueryParamsDirectionField.ASC)
                    .build());
    assert enterpriseHubs.getEntries().size() > 0;
    HubV2025R0 enterpriseHub = enterpriseHubs.getEntries().get(0);
    assert !(enterpriseHub.getTitle().equals(""));
    assert !(enterpriseHub.getId().equals(""));
    assert convertToString(enterpriseHub.getType()).equals("hubs");
    HubV2025R0 hub = client.getHubs().getHubByIdV2025R0(userHub.getId());
    assert !(hub.getTitle().equals(""));
    assert !(hub.getId().equals(""));
    assert convertToString(hub.getType()).equals("hubs");
    if (enterpriseHubs.getEntries().size() > 10) {
      client.getHubs().deleteHubByIdV2025R0(hub.getId());
    }
  }
}
