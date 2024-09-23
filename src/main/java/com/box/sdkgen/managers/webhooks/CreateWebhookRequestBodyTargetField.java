package com.box.sdkgen.managers.webhooks;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateWebhookRequestBodyTargetField {

  protected String id;

  @JsonDeserialize(
      using =
          CreateWebhookRequestBodyTargetTypeField
              .CreateWebhookRequestBodyTargetTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateWebhookRequestBodyTargetTypeField.CreateWebhookRequestBodyTargetTypeFieldSerializer
              .class)
  protected EnumWrapper<CreateWebhookRequestBodyTargetTypeField> type;

  public CreateWebhookRequestBodyTargetField() {}

  protected CreateWebhookRequestBodyTargetField(
      CreateWebhookRequestBodyTargetFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CreateWebhookRequestBodyTargetTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestBodyTargetField casted = (CreateWebhookRequestBodyTargetField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "CreateWebhookRequestBodyTargetField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class CreateWebhookRequestBodyTargetFieldBuilder {

    protected String id;

    protected EnumWrapper<CreateWebhookRequestBodyTargetTypeField> type;

    public CreateWebhookRequestBodyTargetFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateWebhookRequestBodyTargetFieldBuilder type(
        CreateWebhookRequestBodyTargetTypeField type) {
      this.type = new EnumWrapper<CreateWebhookRequestBodyTargetTypeField>(type.getValue(), type);
      return this;
    }

    public CreateWebhookRequestBodyTargetField build() {
      return new CreateWebhookRequestBodyTargetField(this);
    }
  }
}
