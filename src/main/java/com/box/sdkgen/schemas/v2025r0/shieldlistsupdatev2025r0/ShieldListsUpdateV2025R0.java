package com.box.sdkgen.schemas.v2025r0.shieldlistsupdatev2025r0;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentrequestv2025r0.ShieldListContentRequestV2025R0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ShieldListsUpdateV2025R0 extends SerializableObject {

  protected final String name;

  protected String description;

  protected final ShieldListContentRequestV2025R0 content;

  public ShieldListsUpdateV2025R0(
      @JsonProperty("name") String name,
      @JsonProperty("content") ShieldListContentRequestV2025R0 content) {
    super();
    this.name = name;
    this.content = content;
  }

  protected ShieldListsUpdateV2025R0(Builder builder) {
    super();
    this.name = builder.name;
    this.description = builder.description;
    this.content = builder.content;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public ShieldListContentRequestV2025R0 getContent() {
    return content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldListsUpdateV2025R0 casted = (ShieldListsUpdateV2025R0) o;
    return Objects.equals(name, casted.name)
        && Objects.equals(description, casted.description)
        && Objects.equals(content, casted.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, content);
  }

  @Override
  public String toString() {
    return "ShieldListsUpdateV2025R0{"
        + "name='"
        + name
        + '\''
        + ", "
        + "description='"
        + description
        + '\''
        + ", "
        + "content='"
        + content
        + '\''
        + "}";
  }

  public static class Builder {

    protected final String name;

    protected String description;

    protected final ShieldListContentRequestV2025R0 content;

    public Builder(String name, ShieldListContentRequestV2025R0 content) {
      this.name = name;
      this.content = content;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public ShieldListsUpdateV2025R0 build() {
      return new ShieldListsUpdateV2025R0(this);
    }
  }
}
