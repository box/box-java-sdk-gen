package com.box.sdkgen.managers.usercollaborations;

import java.util.List;
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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaboration.Collaboration;
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

public class CreateCollaborationRequestBodyAccessibleByField {

  @JsonDeserialize(using = CreateCollaborationRequestBodyAccessibleByTypeField.CreateCollaborationRequestBodyAccessibleByTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateCollaborationRequestBodyAccessibleByTypeField.CreateCollaborationRequestBodyAccessibleByTypeFieldSerializer.class)
  protected final EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> type;

  protected String id;

  protected String login;

  public CreateCollaborationRequestBodyAccessibleByField(@JsonProperty("type") EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> type) {
    this.type = type;
  }

  public CreateCollaborationRequestBodyAccessibleByField(CreateCollaborationRequestBodyAccessibleByTypeField type) {
    this.type = new EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>(type.getValue(), type);
  }

  protected CreateCollaborationRequestBodyAccessibleByField(CreateCollaborationRequestBodyAccessibleByFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
    this.login = builder.login;
  }

  public EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
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
    CreateCollaborationRequestBodyAccessibleByField casted = (CreateCollaborationRequestBodyAccessibleByField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id) &&
      Objects.equals(login, casted.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id, login
    );
  }

  @Override
  public String toString() {
    return "CreateCollaborationRequestBodyAccessibleByField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + ", " + "login='" + login + '\'' + "}";
  }

  public static class CreateCollaborationRequestBodyAccessibleByFieldBuilder {

    protected final EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> type;

    protected String id;

    protected String login;

    public CreateCollaborationRequestBodyAccessibleByFieldBuilder(CreateCollaborationRequestBodyAccessibleByTypeField type) {
      this.type = new EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>(type.getValue(), type);
    }

    public CreateCollaborationRequestBodyAccessibleByFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateCollaborationRequestBodyAccessibleByFieldBuilder login(String login) {
      this.login = login;
      return this;
    }

    public CreateCollaborationRequestBodyAccessibleByField build() {
      return new CreateCollaborationRequestBodyAccessibleByField(this);
    }

  }

}
