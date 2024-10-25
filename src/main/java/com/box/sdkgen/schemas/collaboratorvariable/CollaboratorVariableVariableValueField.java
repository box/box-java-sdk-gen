package com.box.sdkgen.schemas.collaboratorvariable;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CollaboratorVariableVariableValueField {

  @JsonDeserialize(
      using =
          CollaboratorVariableVariableValueTypeField
              .CollaboratorVariableVariableValueTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CollaboratorVariableVariableValueTypeField
              .CollaboratorVariableVariableValueTypeFieldSerializer.class)
  protected EnumWrapper<CollaboratorVariableVariableValueTypeField> type;

  protected final String id;

  public CollaboratorVariableVariableValueField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<CollaboratorVariableVariableValueTypeField>(
            CollaboratorVariableVariableValueTypeField.USER.getValue(),
            CollaboratorVariableVariableValueTypeField.USER);
  }

  protected CollaboratorVariableVariableValueField(
      CollaboratorVariableVariableValueFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CollaboratorVariableVariableValueTypeField> getType() {
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
    CollaboratorVariableVariableValueField casted = (CollaboratorVariableVariableValueField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CollaboratorVariableVariableValueField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CollaboratorVariableVariableValueFieldBuilder {

    protected EnumWrapper<CollaboratorVariableVariableValueTypeField> type;

    protected final String id;

    public CollaboratorVariableVariableValueFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<CollaboratorVariableVariableValueTypeField>(
              CollaboratorVariableVariableValueTypeField.USER.getValue(),
              CollaboratorVariableVariableValueTypeField.USER);
    }

    public CollaboratorVariableVariableValueFieldBuilder type(
        EnumWrapper<CollaboratorVariableVariableValueTypeField> type) {
      this.type = type;
      return this;
    }

    public CollaboratorVariableVariableValueFieldBuilder type(
        CollaboratorVariableVariableValueTypeField type) {
      this.type =
          new EnumWrapper<CollaboratorVariableVariableValueTypeField>(type.getValue(), type);
      return this;
    }

    public CollaboratorVariableVariableValueField build() {
      return new CollaboratorVariableVariableValueField(this);
    }
  }
}
