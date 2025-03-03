package com.box.sdkgen.schemas.termsofservices;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.termsofservice.TermsOfService;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class TermsOfServices extends SerializableObject {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected List<TermsOfService> entries;

  public TermsOfServices() {
    super();
  }

  protected TermsOfServices(TermsOfServicesBuilder builder) {
    super();
    this.totalCount = builder.totalCount;
    this.entries = builder.entries;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public List<TermsOfService> getEntries() {
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
    TermsOfServices casted = (TermsOfServices) o;
    return Objects.equals(totalCount, casted.totalCount) && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, entries);
  }

  @Override
  public String toString() {
    return "TermsOfServices{"
        + "totalCount='"
        + totalCount
        + '\''
        + ", "
        + "entries='"
        + entries
        + '\''
        + "}";
  }

  public static class TermsOfServicesBuilder {

    protected Long totalCount;

    protected List<TermsOfService> entries;

    public TermsOfServicesBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public TermsOfServicesBuilder entries(List<TermsOfService> entries) {
      this.entries = entries;
      return this;
    }

    public TermsOfServices build() {
      return new TermsOfServices(this);
    }
  }
}
