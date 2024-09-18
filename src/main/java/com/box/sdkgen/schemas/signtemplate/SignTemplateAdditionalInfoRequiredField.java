package com.box.sdkgen.schemas.signtemplate;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.templatesigner.TemplateSigner;

public class SignTemplateAdditionalInfoRequiredField {

  protected List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers;

  public SignTemplateAdditionalInfoRequiredField() {
  }

  protected SignTemplateAdditionalInfoRequiredField(SignTemplateAdditionalInfoRequiredFieldBuilder builder) {
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
    return Objects.hash(
      signers
    );
  }

  @Override
  public String toString() {
    return "SignTemplateAdditionalInfoRequiredField{" + "signers='" + signers + '\'' + "}";
  }

  public static class SignTemplateAdditionalInfoRequiredFieldBuilder {

    protected List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers;

    public SignTemplateAdditionalInfoRequiredFieldBuilder signers(List<List<SignTemplateAdditionalInfoRequiredSignersField>> signers) {
      this.signers = signers;
      return this;
    }

    public SignTemplateAdditionalInfoRequiredField build() {
      return new SignTemplateAdditionalInfoRequiredField(this);
    }

  }

}
