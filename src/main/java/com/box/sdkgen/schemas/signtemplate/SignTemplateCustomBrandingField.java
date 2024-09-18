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

public class SignTemplateCustomBrandingField {

  @JsonProperty("company_name")
  protected String companyName;

  @JsonProperty("logo_uri")
  protected String logoUri;

  @JsonProperty("branding_color")
  protected String brandingColor;

  @JsonProperty("email_footer_text")
  protected String emailFooterText;

  public SignTemplateCustomBrandingField() {
  }

  protected SignTemplateCustomBrandingField(SignTemplateCustomBrandingFieldBuilder builder) {
    this.companyName = builder.companyName;
    this.logoUri = builder.logoUri;
    this.brandingColor = builder.brandingColor;
    this.emailFooterText = builder.emailFooterText;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getLogoUri() {
    return logoUri;
  }

  public String getBrandingColor() {
    return brandingColor;
  }

  public String getEmailFooterText() {
    return emailFooterText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignTemplateCustomBrandingField casted = (SignTemplateCustomBrandingField) o;
    return Objects.equals(companyName, casted.companyName) &&
      Objects.equals(logoUri, casted.logoUri) &&
      Objects.equals(brandingColor, casted.brandingColor) &&
      Objects.equals(emailFooterText, casted.emailFooterText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      companyName, logoUri, brandingColor, emailFooterText
    );
  }

  @Override
  public String toString() {
    return "SignTemplateCustomBrandingField{" + "companyName='" + companyName + '\'' + ", " + "logoUri='" + logoUri + '\'' + ", " + "brandingColor='" + brandingColor + '\'' + ", " + "emailFooterText='" + emailFooterText + '\'' + "}";
  }

  public static class SignTemplateCustomBrandingFieldBuilder {

    protected String companyName;

    protected String logoUri;

    protected String brandingColor;

    protected String emailFooterText;

    public SignTemplateCustomBrandingFieldBuilder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    public SignTemplateCustomBrandingFieldBuilder logoUri(String logoUri) {
      this.logoUri = logoUri;
      return this;
    }

    public SignTemplateCustomBrandingFieldBuilder brandingColor(String brandingColor) {
      this.brandingColor = brandingColor;
      return this;
    }

    public SignTemplateCustomBrandingFieldBuilder emailFooterText(String emailFooterText) {
      this.emailFooterText = emailFooterText;
      return this;
    }

    public SignTemplateCustomBrandingField build() {
      return new SignTemplateCustomBrandingField(this);
    }

  }

}
