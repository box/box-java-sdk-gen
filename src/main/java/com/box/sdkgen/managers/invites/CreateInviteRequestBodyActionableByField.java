package com.box.sdkgen.managers.invites;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.invite.Invite;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateInviteRequestBodyActionableByField {

  protected String login;

  public CreateInviteRequestBodyActionableByField() {
  }

  protected CreateInviteRequestBodyActionableByField(CreateInviteRequestBodyActionableByFieldBuilder builder) {
    this.login = builder.login;
  }

  public String getLogin() {
    return login;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInviteRequestBodyActionableByField casted = (CreateInviteRequestBodyActionableByField) o;
    return Objects.equals(login, casted.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      login
    );
  }

  @Override
  public String toString() {
    return "CreateInviteRequestBodyActionableByField{" + "login='" + login + '\'' + "}";
  }

  public static class CreateInviteRequestBodyActionableByFieldBuilder {

    protected String login;

    public CreateInviteRequestBodyActionableByFieldBuilder login(String login) {
      this.login = login;
      return this;
    }

    public CreateInviteRequestBodyActionableByField build() {
      return new CreateInviteRequestBodyActionableByField(this);
    }

  }

}
