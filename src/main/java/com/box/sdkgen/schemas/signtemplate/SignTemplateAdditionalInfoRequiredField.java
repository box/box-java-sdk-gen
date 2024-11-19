package com.box.sdkgen.schemas.signtemplate;

import com.box.sdkgen.internal.SerializableObject;
import java.util.List;
import java.util.Objects;

public class SignTemplateAdditionalInfoRequiredField extends SerializableObject {

  protected List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers;

  public SignTemplateAdditionalInfoRequiredField() {
    super();
  }

  protected SignTemplateAdditionalInfoRequiredField(
      SignTemplateAdditionalInfoRequiredFieldBuilder builder) {
    super();
    this.signers = builder.signers;
  }

  public List<List<SignTemplateAdditionalInfoRequiredSignersField>> getSigners() {
    return signers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignTemplateAdditionalInfoRequiredField casted = (SignTemplateAdditionalInfoRequiredField) o;
    return Objects.equals(signers, casted.signers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signers);
  }

  @Override
  public String toString() {
    return "SignTemplateAdditionalInfoRequiredField{" + "signers='" + signers + '\'' + "}";
  }

  public static class SignTemplateAdditionalInfoRequiredFieldBuilder {

    protected List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers;

    public SignTemplateAdditionalInfoRequiredFieldBuilder signers(
        List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers) {
      this.signers = signers;
      return this;
    }

    public SignTemplateAdditionalInfoRequiredField build() {
      return new SignTemplateAdditionalInfoRequiredField(this);
    }
  }
}
