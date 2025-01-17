package com.box.sdkgen.schemas.v2025r0.docgentemplatesv2025r0;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.v2025r0.docgentemplatev2025r0.DocGenTemplateV2025R0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class DocGenTemplatesV2025R0 extends SerializableObject {

  protected Long limit;

  @JsonProperty("next_marker")
  protected String nextMarker;

  @JsonProperty("prev_marker")
  protected String prevMarker;

  protected List<DocGenTemplateV2025R0> entries;

  public DocGenTemplatesV2025R0() {
    super();
  }

  protected DocGenTemplatesV2025R0(DocGenTemplatesV2025R0Builder builder) {
    super();
    this.limit = builder.limit;
    this.nextMarker = builder.nextMarker;
    this.prevMarker = builder.prevMarker;
    this.entries = builder.entries;
  }

  public Long getLimit() {
    return limit;
  }

  public String getNextMarker() {
    return nextMarker;
  }

  public String getPrevMarker() {
    return prevMarker;
  }

  public List<DocGenTemplateV2025R0> getEntries() {
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
    DocGenTemplatesV2025R0 casted = (DocGenTemplatesV2025R0) o;
    return Objects.equals(limit, casted.limit)
        && Objects.equals(nextMarker, casted.nextMarker)
        && Objects.equals(prevMarker, casted.prevMarker)
        && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextMarker, prevMarker, entries);
  }

  @Override
  public String toString() {
    return "DocGenTemplatesV2025R0{"
        + "limit='"
        + limit
        + '\''
        + ", "
        + "nextMarker='"
        + nextMarker
        + '\''
        + ", "
        + "prevMarker='"
        + prevMarker
        + '\''
        + ", "
        + "entries='"
        + entries
        + '\''
        + "}";
  }

  public static class DocGenTemplatesV2025R0Builder {

    protected Long limit;

    protected String nextMarker;

    protected String prevMarker;

    protected List<DocGenTemplateV2025R0> entries;

    public DocGenTemplatesV2025R0Builder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public DocGenTemplatesV2025R0Builder nextMarker(String nextMarker) {
      this.nextMarker = nextMarker;
      return this;
    }

    public DocGenTemplatesV2025R0Builder prevMarker(String prevMarker) {
      this.prevMarker = prevMarker;
      return this;
    }

    public DocGenTemplatesV2025R0Builder entries(List<DocGenTemplateV2025R0> entries) {
      this.entries = entries;
      return this;
    }

    public DocGenTemplatesV2025R0 build() {
      return new DocGenTemplatesV2025R0(this);
    }
  }
}
