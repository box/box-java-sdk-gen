package com.box.sdkgen.schemas.legalholdpolicymini;

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

public class LegalHoldPolicyMini {

  protected final String id;

  @JsonDeserialize(using = LegalHoldPolicyMiniTypeField.LegalHoldPolicyMiniTypeFieldDeserializer.class)
  @JsonSerialize(using = LegalHoldPolicyMiniTypeField.LegalHoldPolicyMiniTypeFieldSerializer.class)
  protected EnumWrapper<LegalHoldPolicyMiniTypeField> type;

  public LegalHoldPolicyMini(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<LegalHoldPolicyMiniTypeField>(LegalHoldPolicyMiniTypeField.LEGAL_HOLD_POLICY.getValue(), LegalHoldPolicyMiniTypeField.LEGAL_HOLD_POLICY);
  }

  protected LegalHoldPolicyMini(LegalHoldPolicyMiniBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<LegalHoldPolicyMiniTypeField> getType() {
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
    LegalHoldPolicyMini casted = (LegalHoldPolicyMini) o;
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
    return "LegalHoldPolicyMini{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class LegalHoldPolicyMiniBuilder {

    protected final String id;

    protected EnumWrapper<LegalHoldPolicyMiniTypeField> type;

    public LegalHoldPolicyMiniBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<LegalHoldPolicyMiniTypeField>(LegalHoldPolicyMiniTypeField.LEGAL_HOLD_POLICY.getValue(), LegalHoldPolicyMiniTypeField.LEGAL_HOLD_POLICY);
    }

    public LegalHoldPolicyMiniBuilder type(LegalHoldPolicyMiniTypeField type) {
      this.type = new EnumWrapper<LegalHoldPolicyMiniTypeField>(type.getValue(), type);
      return this;
    }

    public LegalHoldPolicyMini build() {
      return new LegalHoldPolicyMini(this);
    }

  }

}
