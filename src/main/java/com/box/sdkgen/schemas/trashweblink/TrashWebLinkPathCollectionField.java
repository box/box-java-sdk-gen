package com.box.sdkgen.schemas.trashweblink;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public class TrashWebLinkPathCollectionField {

  @JsonProperty("total_count")
  protected final long totalCount;

  protected final List<TrashWebLinkPathCollectionEntriesField> entries;

  public TrashWebLinkPathCollectionField(@JsonProperty("total_count") long totalCount, @JsonProperty("entries") List<TrashWebLinkPathCollectionEntriesField> entries) {
    this.totalCount = totalCount;
    this.entries = entries;
  }

  public long getTotalCount() {
    return totalCount;
  }

  public List<TrashWebLinkPathCollectionEntriesField> getEntries() {
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
    TrashWebLinkPathCollectionField casted = (TrashWebLinkPathCollectionField) o;
    return Objects.equals(totalCount, casted.totalCount) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      totalCount, entries
    );
  }

  @Override
  public String toString() {
    return "TrashWebLinkPathCollectionField{" + "totalCount='" + totalCount + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

}
