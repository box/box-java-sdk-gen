package com.box.sdkgen.schemas.uploadpart;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.uploadpartmini.UploadPartMini;

public class UploadPart extends UploadPartMini {

  protected String sha1;

  public UploadPart() {
    super();
  }

  protected UploadPart(UploadPartBuilder builder) {
    super(builder);
    this.sha1 = builder.sha1;
  }

  public String getSha1() {
    return sha1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadPart casted = (UploadPart) o;
    return Objects.equals(partId, casted.partId) &&
      Objects.equals(offset, casted.offset) &&
      Objects.equals(size, casted.size) &&
      Objects.equals(sha1, casted.sha1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      partId, offset, size, sha1
    );
  }

  @Override
  public String toString() {
    return "UploadPart{" + "partId='" + partId + '\'' + ", " + "offset='" + offset + '\'' + ", " + "size='" + size + '\'' + ", " + "sha1='" + sha1 + '\'' + "}";
  }

  public static class UploadPartBuilder extends UploadPartMiniBuilder {

    protected String sha1;

    public UploadPartBuilder sha1(String sha1) {
      this.sha1 = sha1;
      return this;
    }

    @Override
    public UploadPartBuilder partId(String partId) {
      this.partId = partId;
      return this;
    }

    @Override
    public UploadPartBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    @Override
    public UploadPartBuilder size(Long size) {
      this.size = size;
      return this;
    }

    public UploadPart build() {
      return new UploadPart(this);
    }

  }

}
