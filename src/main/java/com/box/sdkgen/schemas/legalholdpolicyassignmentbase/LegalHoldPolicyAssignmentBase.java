package com.box.sdkgen.schemas.legalholdpolicyassignmentbase;

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

public class LegalHoldPolicyAssignmentBase {

  protected String id;

  @JsonDeserialize(using = LegalHoldPolicyAssignmentBaseTypeField.LegalHoldPolicyAssignmentBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = LegalHoldPolicyAssignmentBaseTypeField.LegalHoldPolicyAssignmentBaseTypeFieldSerializer.class)
  protected EnumWrapper<LegalHoldPolicyAssignmentBaseTypeField> type;

  public LegalHoldPolicyAssignmentBase() {
  }

  protected LegalHoldPolicyAssignmentBase(LegalHoldPolicyAssignmentBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<LegalHoldPolicyAssignmentBaseTypeField> getType() {
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
    LegalHoldPolicyAssignmentBase casted = (LegalHoldPolicyAssignmentBase) o;
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
    return "LegalHoldPolicyAssignmentBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class LegalHoldPolicyAssignmentBaseBuilder {

    protected String id;

    protected EnumWrapper<LegalHoldPolicyAssignmentBaseTypeField> type;

    public LegalHoldPolicyAssignmentBaseBuilder id(String id) {
      this.id = id;
      return this;
    }

    public LegalHoldPolicyAssignmentBaseBuilder type(LegalHoldPolicyAssignmentBaseTypeField type) {
      this.type = new EnumWrapper<LegalHoldPolicyAssignmentBaseTypeField>(type.getValue(), type);
      return this;
    }

    public LegalHoldPolicyAssignmentBase build() {
      return new LegalHoldPolicyAssignmentBase(this);
    }

  }

}
