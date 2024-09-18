package com.box.sdkgen.schemas.skillinvocation;

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
import com.box.sdkgen.schemas.fileorfolder.FileOrFolder;
import com.box.sdkgen.schemas.event.Event;

public class SkillInvocationEnterpriseField {

  protected String id;

  @JsonDeserialize(using = SkillInvocationEnterpriseTypeField.SkillInvocationEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(using = SkillInvocationEnterpriseTypeField.SkillInvocationEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<SkillInvocationEnterpriseTypeField> type;

  protected String name;

  public SkillInvocationEnterpriseField() {
  }

  protected SkillInvocationEnterpriseField(SkillInvocationEnterpriseFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<SkillInvocationEnterpriseTypeField> getType() {
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
    SkillInvocationEnterpriseField casted = (SkillInvocationEnterpriseField) o;
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
    return "SkillInvocationEnterpriseField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class SkillInvocationEnterpriseFieldBuilder {

    protected String id;

    protected EnumWrapper<SkillInvocationEnterpriseTypeField> type;

    protected String name;

    public SkillInvocationEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public SkillInvocationEnterpriseFieldBuilder type(SkillInvocationEnterpriseTypeField type) {
      this.type = new EnumWrapper<SkillInvocationEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public SkillInvocationEnterpriseFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public SkillInvocationEnterpriseField build() {
      return new SkillInvocationEnterpriseField(this);
    }

  }

}
