package com.box.sdkgen.test.usercollaborations;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.test.commons.CommonsManager.createNewFolder;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBody;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBodyAccessibleByField;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBodyAccessibleByTypeField;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBodyItemField;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBodyItemTypeField;
import com.box.sdkgen.managers.usercollaborations.CreateCollaborationRequestBodyRoleField;
import com.box.sdkgen.managers.usercollaborations.UpdateCollaborationByIdRequestBody;
import com.box.sdkgen.managers.usercollaborations.UpdateCollaborationByIdRequestBodyRoleField;
import com.box.sdkgen.managers.users.CreateUserRequestBody;
import com.box.sdkgen.schemas.collaboration.Collaboration;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.userfull.UserFull;
import org.junit.jupiter.api.Test;

public class UserCollaborationsITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testUserCollaborations() {
    String userName = getUuid();
    String userLogin = String.join("", getUuid(), "@gmail.com");
    UserFull user =
        client
            .getUsers()
            .createUser(
                new CreateUserRequestBody.CreateUserRequestBodyBuilder(userName)
                    .login(userLogin)
                    .isPlatformAccessOnly(true)
                    .build());
    FolderFull folder = createNewFolder();
    Collaboration collaboration =
        client
            .getUserCollaborations()
            .createCollaboration(
                new CreateCollaborationRequestBody(
                    new CreateCollaborationRequestBodyItemField
                            .CreateCollaborationRequestBodyItemFieldBuilder()
                        .type(CreateCollaborationRequestBodyItemTypeField.FOLDER)
                        .id(folder.getId())
                        .build(),
                    new CreateCollaborationRequestBodyAccessibleByField
                            .CreateCollaborationRequestBodyAccessibleByFieldBuilder(
                            CreateCollaborationRequestBodyAccessibleByTypeField.USER)
                        .id(user.getId())
                        .build(),
                    CreateCollaborationRequestBodyRoleField.EDITOR));
    assert convertToString(collaboration.getRole()).equals("editor");
    String collaborationId = collaboration.getId();
    Collaboration collaborationFromApi =
        client.getUserCollaborations().getCollaborationById(collaborationId);
    assert collaborationId.equals(collaborationFromApi.getId());
    assert convertToString(collaborationFromApi.getStatus()).equals("accepted");
    assert convertToString(collaborationFromApi.getType()).equals("collaboration");
    assert collaborationFromApi.getInviteEmail().equals(null);
    Collaboration updatedCollaboration =
        client
            .getUserCollaborations()
            .updateCollaborationById(
                collaborationId,
                new UpdateCollaborationByIdRequestBody(
                    UpdateCollaborationByIdRequestBodyRoleField.VIEWER));
    assert convertToString(updatedCollaboration.getRole()).equals("viewer");
    client.getUserCollaborations().deleteCollaborationById(collaborationId);
    assertThrows(
        RuntimeException.class,
        () -> client.getUserCollaborations().getCollaborationById(collaborationId));
    client.getFolders().deleteFolderById(folder.getId());
    client.getUsers().deleteUserById(user.getId());
  }

  @Test
  public void testExternalUserCollaborations() {
    String userName = getUuid();
    String userLogin = String.join("", getUuid(), "@boxdemo.com");
    FolderFull folder = createNewFolder();
    Collaboration collaboration =
        client
            .getUserCollaborations()
            .createCollaboration(
                new CreateCollaborationRequestBody(
                    new CreateCollaborationRequestBodyItemField
                            .CreateCollaborationRequestBodyItemFieldBuilder()
                        .type(CreateCollaborationRequestBodyItemTypeField.FOLDER)
                        .id(folder.getId())
                        .build(),
                    new CreateCollaborationRequestBodyAccessibleByField
                            .CreateCollaborationRequestBodyAccessibleByFieldBuilder(
                            CreateCollaborationRequestBodyAccessibleByTypeField.USER)
                        .login(userLogin)
                        .build(),
                    CreateCollaborationRequestBodyRoleField.EDITOR));
    assert convertToString(collaboration.getRole()).equals("editor");
    String collaborationId = collaboration.getId();
    Collaboration collaborationFromApi =
        client.getUserCollaborations().getCollaborationById(collaborationId);
    assert collaborationId.equals(collaborationFromApi.getId());
    assert convertToString(collaborationFromApi.getStatus()).equals("pending");
    assert convertToString(collaborationFromApi.getType()).equals("collaboration");
    assert collaborationFromApi.getInviteEmail().equals(userLogin);
    Collaboration updatedCollaboration =
        client
            .getUserCollaborations()
            .updateCollaborationById(
                collaborationId,
                new UpdateCollaborationByIdRequestBody(
                    UpdateCollaborationByIdRequestBodyRoleField.VIEWER));
    assert convertToString(updatedCollaboration.getRole()).equals("viewer");
    client.getUserCollaborations().deleteCollaborationById(collaborationId);
    assertThrows(
        RuntimeException.class,
        () -> client.getUserCollaborations().getCollaborationById(collaborationId));
    client.getFolders().deleteFolderById(folder.getId());
  }
}
