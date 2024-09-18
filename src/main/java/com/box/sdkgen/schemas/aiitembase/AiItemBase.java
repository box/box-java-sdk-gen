package com.box.sdkgen.schemas.aiitembase;

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

public class AiItemBase {

  protected final String id;

  @JsonDeserialize(using = AiItemBaseTypeField.AiItemBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = AiItemBaseTypeField.AiItemBaseTypeFieldSerializer.class)
  protected EnumWrapper<AiItemBaseTypeField> type;

  protected String content;

  public AiItemBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<AiItemBaseTypeField>(AiItemBaseTypeField.FILE.getValue(), AiItemBaseTypeField.FILE);
  }

  protected AiItemBase(AiItemBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.content = builder.content;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<AiItemBaseTypeField> getType() {
    return type;
  }

  public String getContent() {
    return content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiItemBase casted = (AiItemBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(content, casted.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, content
    );
  }

  @Override
  public String toString() {
    return "AiItemBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "content='" + content + '\'' + "}";
  }

  public static class AiItemBaseBuilder {

    protected final String id;

    protected EnumWrapper<AiItemBaseTypeField> type;

    protected String content;

    public AiItemBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<AiItemBaseTypeField>(AiItemBaseTypeField.FILE.getValue(), AiItemBaseTypeField.FILE);
    }

    public AiItemBaseBuilder type(AiItemBaseTypeField type) {
      this.type = new EnumWrapper<AiItemBaseTypeField>(type.getValue(), type);
      return this;
    }

    public AiItemBaseBuilder content(String content) {
      this.content = content;
      return this;
    }

    public AiItemBase build() {
      return new AiItemBase(this);
    }

  }

}
