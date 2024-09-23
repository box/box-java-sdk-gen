package com.box.sdkgen.managers.usercollaborations;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateCollaborationRequestBodyItemField {

  @JsonDeserialize(
      using =
          CreateCollaborationRequestBodyItemTypeField
              .CreateCollaborationRequestBodyItemTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateCollaborationRequestBodyItemTypeField
              .CreateCollaborationRequestBodyItemTypeFieldSerializer.class)
  protected EnumWrapper<CreateCollaborationRequestBodyItemTypeField> type;

  protected String id;

  public CreateCollaborationRequestBodyItemField() {}

  protected CreateCollaborationRequestBodyItemField(
      CreateCollaborationRequestBodyItemFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateCollaborationRequestBodyItemTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollaborationRequestBodyItemField casted = (CreateCollaborationRequestBodyItemField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateCollaborationRequestBodyItemField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CreateCollaborationRequestBodyItemFieldBuilder {

    protected EnumWrapper<CreateCollaborationRequestBodyItemTypeField> type;

    protected String id;

    public CreateCollaborationRequestBodyItemFieldBuilder type(
        CreateCollaborationRequestBodyItemTypeField type) {
      this.type =
          new EnumWrapper<CreateCollaborationRequestBodyItemTypeField>(type.getValue(), type);
      return this;
    }

    public CreateCollaborationRequestBodyItemFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateCollaborationRequestBodyItemField build() {
      return new CreateCollaborationRequestBodyItemField(this);
    }
  }
}
