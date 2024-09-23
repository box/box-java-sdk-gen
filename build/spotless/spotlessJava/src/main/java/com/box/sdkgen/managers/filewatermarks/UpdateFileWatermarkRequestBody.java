package com.box.sdkgen.managers.filewatermarks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateFileWatermarkRequestBody {

  protected final UpdateFileWatermarkRequestBodyWatermarkField watermark;

  public UpdateFileWatermarkRequestBody(
      @JsonProperty("watermark") UpdateFileWatermarkRequestBodyWatermarkField watermark) {
    this.watermark = watermark;
  }

  public UpdateFileWatermarkRequestBodyWatermarkField getWatermark() {
    return watermark;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileWatermarkRequestBody casted = (UpdateFileWatermarkRequestBody) o;
    return Objects.equals(watermark, casted.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watermark);
  }

  @Override
  public String toString() {
    return "UpdateFileWatermarkRequestBody{" + "watermark='" + watermark + '\'' + "}";
  }
}
