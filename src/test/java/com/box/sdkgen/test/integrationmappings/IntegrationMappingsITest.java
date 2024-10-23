package com.box.sdkgen.test.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.getEnvVar;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClientWithUserSubject;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.folders.CreateFolderRequestBody;
import com.box.sdkgen.managers.folders.CreateFolderRequestBodyParentField;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.integrationmappingboxitemslack.IntegrationMappingBoxItemSlack;
import com.box.sdkgen.schemas.integrationmappingpartneritemslack.IntegrationMappingPartnerItemSlack;
import com.box.sdkgen.schemas.integrationmappings.IntegrationMappings;
import com.box.sdkgen.schemas.integrationmappingslackcreaterequest.IntegrationMappingSlackCreateRequest;
import org.junit.jupiter.api.Test;

public class IntegrationMappingsITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testIntegrationMappings() {
    FolderFull folder =
        client
            .getFolders()
            .createFolder(
                new CreateFolderRequestBody(
                    getUuid(), new CreateFolderRequestBodyParentField("0")));
    String slackOrgId = "1";
    String partnerItemId = "1";
    String userId = getEnvVar("USER_ID");
    BoxClient userClient = getDefaultClientWithUserSubject(userId);
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .createSlackIntegrationMapping(
                    new IntegrationMappingSlackCreateRequest(
                        new IntegrationMappingPartnerItemSlack
                                .IntegrationMappingPartnerItemSlackBuilder(partnerItemId)
                            .slackOrgId(slackOrgId)
                            .build(),
                        new IntegrationMappingBoxItemSlack(folder.getId()))));
    IntegrationMappings integrationMappings =
        userClient.getIntegrationMappings().getSlackIntegrationMapping();
    assert integrationMappings.getEntries().size() == 0;
    client.getFolders().deleteFolderById(folder.getId());
  }
}
