package com.box.sdkgen.schemas.retentionpolicyassignment;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public class RetentionPolicyAssignmentFilterFieldsField {

  protected String field;

  protected String value;

  public RetentionPolicyAssignmentFilterFieldsField() {
  }

  protected RetentionPolicyAssignmentFilterFieldsField(RetentionPolicyAssignmentFilterFieldsFieldBuilder builder) {
    this.field = builder.field;
    this.value = builder.value;
  }

  public String getField() {
    return field;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPolicyAssignmentFilterFieldsField casted = (RetentionPolicyAssignmentFilterFieldsField) o;
    return Objects.equals(field, casted.field) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      field, value
    );
  }

  @Override
  public String toString() {
    return "RetentionPolicyAssignmentFilterFieldsField{" + "field='" + field + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class RetentionPolicyAssignmentFilterFieldsFieldBuilder {

    protected String field;

    protected String value;

    public RetentionPolicyAssignmentFilterFieldsFieldBuilder field(String field) {
      this.field = field;
      return this;
    }

    public RetentionPolicyAssignmentFilterFieldsFieldBuilder value(String value) {
      this.value = value;
      return this;
    }

    public RetentionPolicyAssignmentFilterFieldsField build() {
      return new RetentionPolicyAssignmentFilterFieldsField(this);
    }

  }

}
