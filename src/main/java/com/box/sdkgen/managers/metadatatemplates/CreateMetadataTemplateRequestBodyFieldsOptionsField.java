package com.box.sdkgen.managers.metadatatemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateMetadataTemplateRequestBodyFieldsOptionsField {

  protected final String key;

  public CreateMetadataTemplateRequestBodyFieldsOptionsField(@JsonProperty("key") String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetadataTemplateRequestBodyFieldsOptionsField casted =
        (CreateMetadataTemplateRequestBodyFieldsOptionsField) o;
    return Objects.equals(key, casted.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    return "CreateMetadataTemplateRequestBodyFieldsOptionsField{" + "key='" + key + '\'' + "}";
  }
}
