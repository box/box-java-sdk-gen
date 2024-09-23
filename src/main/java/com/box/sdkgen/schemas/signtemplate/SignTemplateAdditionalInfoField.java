package com.box.sdkgen.schemas.signtemplate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class SignTemplateAdditionalInfoField {

  @JsonProperty("non_editable")
  protected List<SignTemplateAdditionalInfoNonEditableField> nonEditable;

  protected SignTemplateAdditionalInfoRequiredField required;

  public SignTemplateAdditionalInfoField() {}

  protected SignTemplateAdditionalInfoField(SignTemplateAdditionalInfoFieldBuilder builder) {
    this.nonEditable = builder.nonEditable;
    this.required = builder.required;
  }

  public List<SignTemplateAdditionalInfoNonEditableField> getNonEditable() {
    return nonEditable;
  }

  public SignTemplateAdditionalInfoRequiredField getRequired() {
    return required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignTemplateAdditionalInfoField casted = (SignTemplateAdditionalInfoField) o;
    return Objects.equals(nonEditable, casted.nonEditable)
        && Objects.equals(required, casted.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonEditable, required);
  }

  @Override
  public String toString() {
    return "SignTemplateAdditionalInfoField{"
        + "nonEditable='"
        + nonEditable
        + '\''
        + ", "
        + "required='"
        + required
        + '\''
        + "}";
  }

  public static class SignTemplateAdditionalInfoFieldBuilder {

    protected List<SignTemplateAdditionalInfoNonEditableField> nonEditable;

    protected SignTemplateAdditionalInfoRequiredField required;

    public SignTemplateAdditionalInfoFieldBuilder nonEditable(
        List<SignTemplateAdditionalInfoNonEditableField> nonEditable) {
      this.nonEditable = nonEditable;
      return this;
    }

    public SignTemplateAdditionalInfoFieldBuilder required(
        SignTemplateAdditionalInfoRequiredField required) {
      this.required = required;
      return this;
    }

    public SignTemplateAdditionalInfoField build() {
      return new SignTemplateAdditionalInfoField(this);
    }
  }
}
