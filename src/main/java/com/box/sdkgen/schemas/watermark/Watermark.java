package com.box.sdkgen.schemas.watermark;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Watermark {

  protected WatermarkWatermarkField watermark;

  public Watermark() {
  }

  protected Watermark(WatermarkBuilder builder) {
    this.watermark = builder.watermark;
  }

  public WatermarkWatermarkField getWatermark() {
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
    Watermark casted = (Watermark) o;
    return Objects.equals(watermark, casted.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      watermark
    );
  }

  @Override
  public String toString() {
    return "Watermark{" + "watermark='" + watermark + '\'' + "}";
  }

  public static class WatermarkBuilder {

    protected WatermarkWatermarkField watermark;

    public WatermarkBuilder watermark(WatermarkWatermarkField watermark) {
      this.watermark = watermark;
      return this;
    }

    public Watermark build() {
      return new Watermark(this);
    }

  }

}
