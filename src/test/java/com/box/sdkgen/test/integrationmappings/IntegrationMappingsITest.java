package com.box.sdkgen.test.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.getEnvVar;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClientWithUserSubject;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.folders.CreateFolderRequestBody;
import com.box.sdkgen.managers.folders.CreateFolderRequestBodyParentField;
import com.box.sdkgen.managers.integrationmappings.UpdateSlackIntegrationMappingByIdRequestBody;
import com.box.sdkgen.managers.integrationmappings.UpdateTeamsIntegrationMappingByIdRequestBody;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.folderreference.FolderReference;
import com.box.sdkgen.schemas.integrationmappingboxitemslack.IntegrationMappingBoxItemSlack;
import com.box.sdkgen.schemas.integrationmappingpartneritemslack.IntegrationMappingPartnerItemSlack;
import com.box.sdkgen.schemas.integrationmappingpartneritemteamscreaterequest.IntegrationMappingPartnerItemTeamsCreateRequest;
import com.box.sdkgen.schemas.integrationmappingpartneritemteamscreaterequest.IntegrationMappingPartnerItemTeamsCreateRequestTypeField;
import com.box.sdkgen.schemas.integrationmappings.IntegrationMappings;
import com.box.sdkgen.schemas.integrationmappingslackcreaterequest.IntegrationMappingSlackCreateRequest;
import com.box.sdkgen.schemas.integrationmappingteamscreaterequest.IntegrationMappingTeamsCreateRequest;
import org.junit.jupiter.api.Test;

public class IntegrationMappingsITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testSlackIntegrationMappings() {
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
    String integrationMappingId = "123456";
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .updateSlackIntegrationMappingById(
                    integrationMappingId,
                    new UpdateSlackIntegrationMappingByIdRequestBody
                            .UpdateSlackIntegrationMappingByIdRequestBodyBuilder()
                        .boxItem(new IntegrationMappingBoxItemSlack("1234567"))
                        .build()));
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .deleteSlackIntegrationMappingById(integrationMappingId));
    client.getFolders().deleteFolderById(folder.getId());
  }

  @Test
  public void testTeamsIntegrationMappings() {
    FolderFull folder =
        client
            .getFolders()
            .createFolder(
                new CreateFolderRequestBody(
                    getUuid(), new CreateFolderRequestBodyParentField("0")));
    String tenantId = "1";
    String teamId = "2";
    String partnerItemId = "3";
    String userId = getEnvVar("USER_ID");
    BoxClient userClient = getDefaultClientWithUserSubject(userId);
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .createTeamsIntegrationMapping(
                    new IntegrationMappingTeamsCreateRequest(
                        new IntegrationMappingPartnerItemTeamsCreateRequest(
                            IntegrationMappingPartnerItemTeamsCreateRequestTypeField.CHANNEL,
                            partnerItemId,
                            tenantId,
                            teamId),
                        new FolderReference(folder.getId()))));
    assertThrows(
        RuntimeException.class,
        () -> userClient.getIntegrationMappings().getTeamsIntegrationMapping());
    String integrationMappingId = "123456";
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .updateTeamsIntegrationMappingById(
                    integrationMappingId,
                    new UpdateTeamsIntegrationMappingByIdRequestBody
                            .UpdateTeamsIntegrationMappingByIdRequestBodyBuilder()
                        .boxItem(new FolderReference("1234567"))
                        .build()));
    assertThrows(
        RuntimeException.class,
        () ->
            userClient
                .getIntegrationMappings()
                .deleteTeamsIntegrationMappingById(integrationMappingId));
    client.getFolders().deleteFolderById(folder.getId());
  }
}
