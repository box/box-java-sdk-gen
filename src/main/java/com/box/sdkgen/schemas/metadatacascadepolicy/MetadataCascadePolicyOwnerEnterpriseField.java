package com.box.sdkgen.schemas.metadatacascadepolicy;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class MetadataCascadePolicyOwnerEnterpriseField {

  @JsonDeserialize(
      using =
          MetadataCascadePolicyOwnerEnterpriseTypeField
              .MetadataCascadePolicyOwnerEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          MetadataCascadePolicyOwnerEnterpriseTypeField
              .MetadataCascadePolicyOwnerEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<MetadataCascadePolicyOwnerEnterpriseTypeField> type;

  protected String id;

  public MetadataCascadePolicyOwnerEnterpriseField() {}

  protected MetadataCascadePolicyOwnerEnterpriseField(
      MetadataCascadePolicyOwnerEnterpriseFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<MetadataCascadePolicyOwnerEnterpriseTypeField> getType() {
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
    MetadataCascadePolicyOwnerEnterpriseField casted =
        (MetadataCascadePolicyOwnerEnterpriseField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "MetadataCascadePolicyOwnerEnterpriseField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class MetadataCascadePolicyOwnerEnterpriseFieldBuilder {

    protected EnumWrapper<MetadataCascadePolicyOwnerEnterpriseTypeField> type;

    protected String id;

    public MetadataCascadePolicyOwnerEnterpriseFieldBuilder type(
        MetadataCascadePolicyOwnerEnterpriseTypeField type) {
      this.type =
          new EnumWrapper<MetadataCascadePolicyOwnerEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public MetadataCascadePolicyOwnerEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public MetadataCascadePolicyOwnerEnterpriseField build() {
      return new MetadataCascadePolicyOwnerEnterpriseField(this);
    }
  }
}
