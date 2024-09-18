package com.box.sdkgen.schemas.enterprisebase;

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

public class EnterpriseBase {

  protected String id;

  @JsonDeserialize(using = EnterpriseBaseTypeField.EnterpriseBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = EnterpriseBaseTypeField.EnterpriseBaseTypeFieldSerializer.class)
  protected EnumWrapper<EnterpriseBaseTypeField> type;

  public EnterpriseBase() {
  }

  protected EnterpriseBase(EnterpriseBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<EnterpriseBaseTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseBase casted = (EnterpriseBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "EnterpriseBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class EnterpriseBaseBuilder {

    protected String id;

    protected EnumWrapper<EnterpriseBaseTypeField> type;

    public EnterpriseBaseBuilder id(String id) {
      this.id = id;
      return this;
    }

    public EnterpriseBaseBuilder type(EnterpriseBaseTypeField type) {
      this.type = new EnumWrapper<EnterpriseBaseTypeField>(type.getValue(), type);
      return this;
    }

    public EnterpriseBase build() {
      return new EnterpriseBase(this);
    }

  }

}
