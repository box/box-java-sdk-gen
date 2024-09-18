package com.box.sdkgen.schemas.collaborationallowlistexempttarget;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.usermini.UserMini;

public class CollaborationAllowlistExemptTargetEnterpriseField {

  protected String id;

  @JsonDeserialize(using = CollaborationAllowlistExemptTargetEnterpriseTypeField.CollaborationAllowlistExemptTargetEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(using = CollaborationAllowlistExemptTargetEnterpriseTypeField.CollaborationAllowlistExemptTargetEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<CollaborationAllowlistExemptTargetEnterpriseTypeField> type;

  protected String name;

  public CollaborationAllowlistExemptTargetEnterpriseField() {
  }

  protected CollaborationAllowlistExemptTargetEnterpriseField(CollaborationAllowlistExemptTargetEnterpriseFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CollaborationAllowlistExemptTargetEnterpriseTypeField> getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborationAllowlistExemptTargetEnterpriseField casted = (CollaborationAllowlistExemptTargetEnterpriseField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(name, casted.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, name
    );
  }

  @Override
  public String toString() {
    return "CollaborationAllowlistExemptTargetEnterpriseField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class CollaborationAllowlistExemptTargetEnterpriseFieldBuilder {

    protected String id;

    protected EnumWrapper<CollaborationAllowlistExemptTargetEnterpriseTypeField> type;

    protected String name;

    public CollaborationAllowlistExemptTargetEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CollaborationAllowlistExemptTargetEnterpriseFieldBuilder type(CollaborationAllowlistExemptTargetEnterpriseTypeField type) {
      this.type = new EnumWrapper<CollaborationAllowlistExemptTargetEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public CollaborationAllowlistExemptTargetEnterpriseFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CollaborationAllowlistExemptTargetEnterpriseField build() {
      return new CollaborationAllowlistExemptTargetEnterpriseField(this);
    }

  }

}
