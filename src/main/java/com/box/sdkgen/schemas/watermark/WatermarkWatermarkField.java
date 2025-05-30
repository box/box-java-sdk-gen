package com.box.sdkgen.schemas.watermark;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.internal.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.Objects;

public class WatermarkWatermarkField extends SerializableObject {

  @JsonProperty("created_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date createdAt;

  @JsonProperty("modified_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date modifiedAt;

  public WatermarkWatermarkField() {
    super();
  }

  protected WatermarkWatermarkField(WatermarkWatermarkFieldBuilder builder) {
    super();
    this.createdAt = builder.createdAt;
    this.modifiedAt = builder.modifiedAt;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getModifiedAt() {
    return modifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkWatermarkField casted = (WatermarkWatermarkField) o;
    return Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(modifiedAt, casted.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    return "WatermarkWatermarkField{"
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "modifiedAt='"
        + modifiedAt
        + '\''
        + "}";
  }

  public static class WatermarkWatermarkFieldBuilder {

    protected Date createdAt;

    protected Date modifiedAt;

    public WatermarkWatermarkFieldBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public WatermarkWatermarkFieldBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    public WatermarkWatermarkField build() {
      return new WatermarkWatermarkField(this);
    }
  }
}
