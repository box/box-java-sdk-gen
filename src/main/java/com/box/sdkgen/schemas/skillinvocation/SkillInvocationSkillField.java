package com.box.sdkgen.schemas.skillinvocation;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class SkillInvocationSkillField extends SerializableObject {

  protected String id;

  @JsonDeserialize(
      using = SkillInvocationSkillTypeField.SkillInvocationSkillTypeFieldDeserializer.class)
  @JsonSerialize(
      using = SkillInvocationSkillTypeField.SkillInvocationSkillTypeFieldSerializer.class)
  protected EnumWrapper<SkillInvocationSkillTypeField> type;

  protected String name;

  @JsonProperty("api_key")
  protected String apiKey;

  public SkillInvocationSkillField() {
    super();
  }

  protected SkillInvocationSkillField(SkillInvocationSkillFieldBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
    this.apiKey = builder.apiKey;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<SkillInvocationSkillTypeField> getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public String getApiKey() {
    return apiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillInvocationSkillField casted = (SkillInvocationSkillField) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(name, casted.name)
        && Objects.equals(apiKey, casted.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, apiKey);
  }

  @Override
  public String toString() {
    return "SkillInvocationSkillField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "apiKey='"
        + apiKey
        + '\''
        + "}";
  }

  public static class SkillInvocationSkillFieldBuilder {

    protected String id;

    protected EnumWrapper<SkillInvocationSkillTypeField> type;

    protected String name;

    protected String apiKey;

    public SkillInvocationSkillFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public SkillInvocationSkillFieldBuilder type(EnumWrapper<SkillInvocationSkillTypeField> type) {
      this.type = type;
      return this;
    }

    public SkillInvocationSkillFieldBuilder type(SkillInvocationSkillTypeField type) {
      this.type = new EnumWrapper<SkillInvocationSkillTypeField>(type.getValue(), type);
      return this;
    }

    public SkillInvocationSkillFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public SkillInvocationSkillFieldBuilder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    public SkillInvocationSkillField build() {
      return new SkillInvocationSkillField(this);
    }
  }
}
