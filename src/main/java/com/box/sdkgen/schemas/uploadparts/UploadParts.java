package com.box.sdkgen.schemas.uploadparts;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.uploadpart.UploadPart;

public class UploadParts {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long limit;

  protected Long offset;

  protected List<UploadPartsOrderField> order;

  protected List<UploadPart> entries;

  public UploadParts() {
  }

  protected UploadParts(UploadPartsBuilder builder) {
    this.totalCount = builder.totalCount;
    this.limit = builder.limit;
    this.offset = builder.offset;
    this.order = builder.order;
    this.entries = builder.entries;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public Long getLimit() {
    return limit;
  }

  public Long getOffset() {
    return offset;
  }

  public List<UploadPartsOrderField> getOrder() {
    return order;
  }

  public List<UploadPart> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadParts casted = (UploadParts) o;
    return Objects.equals(totalCount, casted.totalCount) &&
      Objects.equals(limit, casted.limit) &&
      Objects.equals(offset, casted.offset) &&
      Objects.equals(order, casted.order) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      totalCount, limit, offset, order, entries
    );
  }

  @Override
  public String toString() {
    return "UploadParts{" + "totalCount='" + totalCount + '\'' + ", " + "limit='" + limit + '\'' + ", " + "offset='" + offset + '\'' + ", " + "order='" + order + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

  public static class UploadPartsBuilder {

    protected Long totalCount;

    protected Long limit;

    protected Long offset;

    protected List<UploadPartsOrderField> order;

    protected List<UploadPart> entries;

    public UploadPartsBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public UploadPartsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public UploadPartsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public UploadPartsBuilder order(List<UploadPartsOrderField> order) {
      this.order = order;
      return this;
    }

    public UploadPartsBuilder entries(List<UploadPart> entries) {
      this.entries = entries;
      return this;
    }

    public UploadParts build() {
      return new UploadParts(this);
    }

  }

}
