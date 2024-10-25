package com.box.sdkgen.schemas.metadatacascadepolicy;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class MetadataCascadePolicyParentField {

  @JsonDeserialize(
      using =
          MetadataCascadePolicyParentTypeField.MetadataCascadePolicyParentTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          MetadataCascadePolicyParentTypeField.MetadataCascadePolicyParentTypeFieldSerializer.class)
  protected EnumWrapper<MetadataCascadePolicyParentTypeField> type;

  protected String id;

  public MetadataCascadePolicyParentField() {}

  protected MetadataCascadePolicyParentField(MetadataCascadePolicyParentFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<MetadataCascadePolicyParentTypeField> getType() {
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
    MetadataCascadePolicyParentField casted = (MetadataCascadePolicyParentField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "MetadataCascadePolicyParentField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class MetadataCascadePolicyParentFieldBuilder {

    protected EnumWrapper<MetadataCascadePolicyParentTypeField> type;

    protected String id;

    public MetadataCascadePolicyParentFieldBuilder type(
        EnumWrapper<MetadataCascadePolicyParentTypeField> type) {
      this.type = type;
      return this;
    }

    public MetadataCascadePolicyParentFieldBuilder type(MetadataCascadePolicyParentTypeField type) {
      this.type = new EnumWrapper<MetadataCascadePolicyParentTypeField>(type.getValue(), type);
      return this;
    }

    public MetadataCascadePolicyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public MetadataCascadePolicyParentField build() {
      return new MetadataCascadePolicyParentField(this);
    }
  }
}
