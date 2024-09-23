package com.box.sdkgen.managers.filewatermarks;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateFileWatermarkRequestBodyWatermarkField {

  @JsonDeserialize(
      using =
          UpdateFileWatermarkRequestBodyWatermarkImprintField
              .UpdateFileWatermarkRequestBodyWatermarkImprintFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateFileWatermarkRequestBodyWatermarkImprintField
              .UpdateFileWatermarkRequestBodyWatermarkImprintFieldSerializer.class)
  protected EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> imprint;

  public UpdateFileWatermarkRequestBodyWatermarkField() {
    this.imprint =
        new EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField>(
            UpdateFileWatermarkRequestBodyWatermarkImprintField.DEFAULT.getValue(),
            UpdateFileWatermarkRequestBodyWatermarkImprintField.DEFAULT);
  }

  protected UpdateFileWatermarkRequestBodyWatermarkField(
      UpdateFileWatermarkRequestBodyWatermarkFieldBuilder builder) {
    this.imprint = builder.imprint;
  }

  public EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> getImprint() {
    return imprint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileWatermarkRequestBodyWatermarkField casted =
        (UpdateFileWatermarkRequestBodyWatermarkField) o;
    return Objects.equals(imprint, casted.imprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imprint);
  }

  @Override
  public String toString() {
    return "UpdateFileWatermarkRequestBodyWatermarkField{" + "imprint='" + imprint + '\'' + "}";
  }

  public static class UpdateFileWatermarkRequestBodyWatermarkFieldBuilder {

    protected EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> imprint;

    public UpdateFileWatermarkRequestBodyWatermarkFieldBuilder imprint(
        UpdateFileWatermarkRequestBodyWatermarkImprintField imprint) {
      this.imprint =
          new EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField>(
              imprint.getValue(), imprint);
      return this;
    }

    public UpdateFileWatermarkRequestBodyWatermarkField build() {
      return new UpdateFileWatermarkRequestBodyWatermarkField(this);
    }
  }
}
