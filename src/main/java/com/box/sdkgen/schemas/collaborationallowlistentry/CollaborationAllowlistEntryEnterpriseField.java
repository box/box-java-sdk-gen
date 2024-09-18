package com.box.sdkgen.schemas.collaborationallowlistentry;

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

public class CollaborationAllowlistEntryEnterpriseField {

  protected String id;

  @JsonDeserialize(using = CollaborationAllowlistEntryEnterpriseTypeField.CollaborationAllowlistEntryEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(using = CollaborationAllowlistEntryEnterpriseTypeField.CollaborationAllowlistEntryEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField> type;

  protected String name;

  public CollaborationAllowlistEntryEnterpriseField() {
  }

  protected CollaborationAllowlistEntryEnterpriseField(CollaborationAllowlistEntryEnterpriseFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField> getType() {
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
    CollaborationAllowlistEntryEnterpriseField casted = (CollaborationAllowlistEntryEnterpriseField) o;
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
    return "CollaborationAllowlistEntryEnterpriseField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class CollaborationAllowlistEntryEnterpriseFieldBuilder {

    protected String id;

    protected EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField> type;

    protected String name;

    public CollaborationAllowlistEntryEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CollaborationAllowlistEntryEnterpriseFieldBuilder type(CollaborationAllowlistEntryEnterpriseTypeField type) {
      this.type = new EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public CollaborationAllowlistEntryEnterpriseFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CollaborationAllowlistEntryEnterpriseField build() {
      return new CollaborationAllowlistEntryEnterpriseField(this);
    }

  }

}
