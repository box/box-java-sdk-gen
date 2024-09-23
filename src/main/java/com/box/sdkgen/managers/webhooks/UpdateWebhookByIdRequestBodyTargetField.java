package com.box.sdkgen.managers.webhooks;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateWebhookByIdRequestBodyTargetField {

  protected String id;

  @JsonDeserialize(
      using =
          UpdateWebhookByIdRequestBodyTargetTypeField
              .UpdateWebhookByIdRequestBodyTargetTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateWebhookByIdRequestBodyTargetTypeField
              .UpdateWebhookByIdRequestBodyTargetTypeFieldSerializer.class)
  protected EnumWrapper<UpdateWebhookByIdRequestBodyTargetTypeField> type;

  public UpdateWebhookByIdRequestBodyTargetField() {}

  protected UpdateWebhookByIdRequestBodyTargetField(
      UpdateWebhookByIdRequestBodyTargetFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<UpdateWebhookByIdRequestBodyTargetTypeField> getType() {
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
    UpdateWebhookByIdRequestBodyTargetField casted = (UpdateWebhookByIdRequestBodyTargetField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "UpdateWebhookByIdRequestBodyTargetField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class UpdateWebhookByIdRequestBodyTargetFieldBuilder {

    protected String id;

    protected EnumWrapper<UpdateWebhookByIdRequestBodyTargetTypeField> type;

    public UpdateWebhookByIdRequestBodyTargetFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateWebhookByIdRequestBodyTargetFieldBuilder type(
        UpdateWebhookByIdRequestBodyTargetTypeField type) {
      this.type =
          new EnumWrapper<UpdateWebhookByIdRequestBodyTargetTypeField>(type.getValue(), type);
      return this;
    }

    public UpdateWebhookByIdRequestBodyTargetField build() {
      return new UpdateWebhookByIdRequestBodyTargetField(this);
    }
  }
}
