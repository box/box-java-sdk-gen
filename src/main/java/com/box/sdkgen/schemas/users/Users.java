package com.box.sdkgen.schemas.users;

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
import com.box.sdkgen.schemas.userfull.UserFull;

public class Users {

  protected Long limit;

  @JsonProperty("next_marker")
  protected String nextMarker;

  @JsonProperty("prev_marker")
  protected String prevMarker;

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long offset;

  protected List<UsersOrderField> order;

  protected List<UserFull> entries;

  public Users() {
  }

  protected Users(UsersBuilder builder) {
    this.limit = builder.limit;
    this.nextMarker = builder.nextMarker;
    this.prevMarker = builder.prevMarker;
    this.totalCount = builder.totalCount;
    this.offset = builder.offset;
    this.order = builder.order;
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

  public Long getTotalCount() {
    return totalCount;
  }

  public Long getOffset() {
    return offset;
  }

  public List<UsersOrderField> getOrder() {
    return order;
  }

  public List<UserFull> getEntries() {
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
    Users casted = (Users) o;
    return Objects.equals(limit, casted.limit) &&
      Objects.equals(nextMarker, casted.nextMarker) &&
      Objects.equals(prevMarker, casted.prevMarker) &&
      Objects.equals(totalCount, casted.totalCount) &&
      Objects.equals(offset, casted.offset) &&
      Objects.equals(order, casted.order) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      limit, nextMarker, prevMarker, totalCount, offset, order, entries
    );
  }

  @Override
  public String toString() {
    return "Users{" + "limit='" + limit + '\'' + ", " + "nextMarker='" + nextMarker + '\'' + ", " + "prevMarker='" + prevMarker + '\'' + ", " + "totalCount='" + totalCount + '\'' + ", " + "offset='" + offset + '\'' + ", " + "order='" + order + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

  public static class UsersBuilder {

    protected Long limit;

    protected String nextMarker;

    protected String prevMarker;

    protected Long totalCount;

    protected Long offset;

    protected List<UsersOrderField> order;

    protected List<UserFull> entries;

    public UsersBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public UsersBuilder nextMarker(String nextMarker) {
      this.nextMarker = nextMarker;
      return this;
    }

    public UsersBuilder prevMarker(String prevMarker) {
      this.prevMarker = prevMarker;
      return this;
    }

    public UsersBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public UsersBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public UsersBuilder order(List<UsersOrderField> order) {
      this.order = order;
      return this;
    }

    public UsersBuilder entries(List<UserFull> entries) {
      this.entries = entries;
      return this;
    }

    public Users build() {
      return new Users(this);
    }

  }

}
