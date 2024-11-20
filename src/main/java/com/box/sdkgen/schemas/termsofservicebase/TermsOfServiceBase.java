package com.box.sdkgen.schemas.termsofservicebase;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class TermsOfServiceBase extends SerializableObject {

  protected final String id;

  @JsonDeserialize(
      using = TermsOfServiceBaseTypeField.TermsOfServiceBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = TermsOfServiceBaseTypeField.TermsOfServiceBaseTypeFieldSerializer.class)
  protected EnumWrapper<TermsOfServiceBaseTypeField> type;

  public TermsOfServiceBase(@JsonProperty("id") String id) {
    super();
    this.id = id;
    this.type =
        new EnumWrapper<TermsOfServiceBaseTypeField>(
            TermsOfServiceBaseTypeField.TERMS_OF_SERVICE.getValue(),
            TermsOfServiceBaseTypeField.TERMS_OF_SERVICE);
  }

  protected TermsOfServiceBase(TermsOfServiceBaseBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<TermsOfServiceBaseTypeField> getType() {
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
    TermsOfServiceBase casted = (TermsOfServiceBase) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "TermsOfServiceBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class TermsOfServiceBaseBuilder {

    protected final String id;

    protected EnumWrapper<TermsOfServiceBaseTypeField> type;

    public TermsOfServiceBaseBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<TermsOfServiceBaseTypeField>(
              TermsOfServiceBaseTypeField.TERMS_OF_SERVICE.getValue(),
              TermsOfServiceBaseTypeField.TERMS_OF_SERVICE);
    }

    public TermsOfServiceBaseBuilder type(EnumWrapper<TermsOfServiceBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public TermsOfServiceBaseBuilder type(TermsOfServiceBaseTypeField type) {
      this.type = new EnumWrapper<TermsOfServiceBaseTypeField>(type.getValue(), type);
      return this;
    }

    public TermsOfServiceBase build() {
      return new TermsOfServiceBase(this);
    }
  }
}
