package com.box.sdkgen.test.client;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.users.CreateUserRequestBody;
import com.box.sdkgen.networking.baseurls.BaseUrls;
import com.box.sdkgen.schemas.userfull.UserFull;
import org.junit.jupiter.api.Test;

public class ClientITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testWithAsUserHeader() {
    String userName = getUuid();
    UserFull createdUser =
        client
            .getUsers()
            .createUser(
                new CreateUserRequestBody.CreateUserRequestBodyBuilder(userName)
                    .isPlatformAccessOnly(true)
                    .build());
    BoxClient asUserClient = client.withAsUserHeader(createdUser.getId());
    UserFull adminUser = client.getUsers().getUserMe();
    assert !(convertToString(adminUser.getName()).equals(userName));
    UserFull appUser = asUserClient.getUsers().getUserMe();
    assert convertToString(appUser.getName()).equals(userName);
    client.getUsers().deleteUserById(createdUser.getId());
  }

  @Test
  public void testWithSuppressedNotifications() {
    BoxClient newClient = client.withSuppressedNotifications();
    UserFull user = newClient.getUsers().getUserMe();
    assert !(user.getId().equals(""));
  }

  @Test
  public void testWithExtraHeaders() {
    String userName = getUuid();
    UserFull createdUser =
        client
            .getUsers()
            .createUser(
                new CreateUserRequestBody.CreateUserRequestBodyBuilder(userName)
                    .isPlatformAccessOnly(true)
                    .build());
    BoxClient asUserClient =
        client.withExtraHeaders(mapOf(entryOf("As-User", createdUser.getId())));
    UserFull adminUser = client.getUsers().getUserMe();
    assert !(convertToString(adminUser.getName()).equals(userName));
    UserFull appUser = asUserClient.getUsers().getUserMe();
    assert convertToString(appUser.getName()).equals(userName);
    client.getUsers().deleteUserById(createdUser.getId());
  }

  @Test
  public void testWithCustomBaseUrls() {
    BaseUrls newBaseUrls =
        new BaseUrls.BaseUrlsBuilder()
            .baseUrl("https://box.com/")
            .uploadUrl("https://box.com/")
            .oauth2Url("https://box.com/")
            .build();
    BoxClient customBaseClient = client.withCustomBaseUrls(newBaseUrls);
    assertThrows(RuntimeException.class, () -> customBaseClient.getUsers().getUserMe());
  }
}
