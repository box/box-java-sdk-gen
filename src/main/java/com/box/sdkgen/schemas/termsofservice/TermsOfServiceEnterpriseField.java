package com.box.sdkgen.schemas.termsofservice;

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
import com.box.sdkgen.schemas.termsofservicebase.TermsOfServiceBaseTypeField;
import com.box.sdkgen.schemas.termsofservicebase.TermsOfServiceBase;

public class TermsOfServiceEnterpriseField {

  protected String id;

  @JsonDeserialize(using = TermsOfServiceEnterpriseTypeField.TermsOfServiceEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(using = TermsOfServiceEnterpriseTypeField.TermsOfServiceEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<TermsOfServiceEnterpriseTypeField> type;

  protected String name;

  public TermsOfServiceEnterpriseField() {
  }

  protected TermsOfServiceEnterpriseField(TermsOfServiceEnterpriseFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<TermsOfServiceEnterpriseTypeField> getType() {
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
    TermsOfServiceEnterpriseField casted = (TermsOfServiceEnterpriseField) o;
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
    return "TermsOfServiceEnterpriseField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class TermsOfServiceEnterpriseFieldBuilder {

    protected String id;

    protected EnumWrapper<TermsOfServiceEnterpriseTypeField> type;

    protected String name;

    public TermsOfServiceEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public TermsOfServiceEnterpriseFieldBuilder type(TermsOfServiceEnterpriseTypeField type) {
      this.type = new EnumWrapper<TermsOfServiceEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public TermsOfServiceEnterpriseFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public TermsOfServiceEnterpriseField build() {
      return new TermsOfServiceEnterpriseField(this);
    }

  }

}
