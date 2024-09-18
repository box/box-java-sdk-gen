package com.box.sdkgen.schemas.retentionpolicy;

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
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBaseTypeField;
import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBase;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMiniDispositionActionField;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public class RetentionPolicyAssignmentCountsField {

  protected Long enterprise;

  protected Long folder;

  @JsonProperty("metadata_template")
  protected Long metadataTemplate;

  public RetentionPolicyAssignmentCountsField() {
  }

  protected RetentionPolicyAssignmentCountsField(RetentionPolicyAssignmentCountsFieldBuilder builder) {
    this.enterprise = builder.enterprise;
    this.folder = builder.folder;
    this.metadataTemplate = builder.metadataTemplate;
  }

  public Long getEnterprise() {
    return enterprise;
  }

  public Long getFolder() {
    return folder;
  }

  public Long getMetadataTemplate() {
    return metadataTemplate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPolicyAssignmentCountsField casted = (RetentionPolicyAssignmentCountsField) o;
    return Objects.equals(enterprise, casted.enterprise) &&
      Objects.equals(folder, casted.folder) &&
      Objects.equals(metadataTemplate, casted.metadataTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      enterprise, folder, metadataTemplate
    );
  }

  @Override
  public String toString() {
    return "RetentionPolicyAssignmentCountsField{" + "enterprise='" + enterprise + '\'' + ", " + "folder='" + folder + '\'' + ", " + "metadataTemplate='" + metadataTemplate + '\'' + "}";
  }

  public static class RetentionPolicyAssignmentCountsFieldBuilder {

    protected Long enterprise;

    protected Long folder;

    protected Long metadataTemplate;

    public RetentionPolicyAssignmentCountsFieldBuilder enterprise(Long enterprise) {
      this.enterprise = enterprise;
      return this;
    }

    public RetentionPolicyAssignmentCountsFieldBuilder folder(Long folder) {
      this.folder = folder;
      return this;
    }

    public RetentionPolicyAssignmentCountsFieldBuilder metadataTemplate(Long metadataTemplate) {
      this.metadataTemplate = metadataTemplate;
      return this;
    }

    public RetentionPolicyAssignmentCountsField build() {
      return new RetentionPolicyAssignmentCountsField(this);
    }

  }

}
