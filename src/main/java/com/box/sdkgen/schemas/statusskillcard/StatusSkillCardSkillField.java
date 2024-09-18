package com.box.sdkgen.schemas.statusskillcard;

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

public class StatusSkillCardSkillField {

  @JsonDeserialize(using = StatusSkillCardSkillTypeField.StatusSkillCardSkillTypeFieldDeserializer.class)
  @JsonSerialize(using = StatusSkillCardSkillTypeField.StatusSkillCardSkillTypeFieldSerializer.class)
  protected EnumWrapper<StatusSkillCardSkillTypeField> type;

  protected final String id;

  public StatusSkillCardSkillField(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<StatusSkillCardSkillTypeField>(StatusSkillCardSkillTypeField.SERVICE.getValue(), StatusSkillCardSkillTypeField.SERVICE);
  }

  protected StatusSkillCardSkillField(StatusSkillCardSkillFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<StatusSkillCardSkillTypeField> getType() {
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
    StatusSkillCardSkillField casted = (StatusSkillCardSkillField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id
    );
  }

  @Override
  public String toString() {
    return "StatusSkillCardSkillField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class StatusSkillCardSkillFieldBuilder {

    protected EnumWrapper<StatusSkillCardSkillTypeField> type;

    protected final String id;

    public StatusSkillCardSkillFieldBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<StatusSkillCardSkillTypeField>(StatusSkillCardSkillTypeField.SERVICE.getValue(), StatusSkillCardSkillTypeField.SERVICE);
    }

    public StatusSkillCardSkillFieldBuilder type(StatusSkillCardSkillTypeField type) {
      this.type = new EnumWrapper<StatusSkillCardSkillTypeField>(type.getValue(), type);
      return this;
    }

    public StatusSkillCardSkillField build() {
      return new StatusSkillCardSkillField(this);
    }

  }

}
