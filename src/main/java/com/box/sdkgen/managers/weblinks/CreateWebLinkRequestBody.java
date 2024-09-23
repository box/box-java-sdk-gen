package com.box.sdkgen.managers.weblinks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateWebLinkRequestBody {

  protected final String url;

  protected final CreateWebLinkRequestBodyParentField parent;

  protected String name;

  protected String description;

  public CreateWebLinkRequestBody(
      @JsonProperty("url") String url,
      @JsonProperty("parent") CreateWebLinkRequestBodyParentField parent) {
    this.url = url;
    this.parent = parent;
  }

  protected CreateWebLinkRequestBody(CreateWebLinkRequestBodyBuilder builder) {
    this.url = builder.url;
    this.parent = builder.parent;
    this.name = builder.name;
    this.description = builder.description;
  }

  public String getUrl() {
    return url;
  }

  public CreateWebLinkRequestBodyParentField getParent() {
    return parent;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebLinkRequestBody casted = (CreateWebLinkRequestBody) o;
    return Objects.equals(url, casted.url)
        && Objects.equals(parent, casted.parent)
        && Objects.equals(name, casted.name)
        && Objects.equals(description, casted.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, parent, name, description);
  }

  @Override
  public String toString() {
    return "CreateWebLinkRequestBody{"
        + "url='"
        + url
        + '\''
        + ", "
        + "parent='"
        + parent
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "description='"
        + description
        + '\''
        + "}";
  }

  public static class CreateWebLinkRequestBodyBuilder {

    protected final String url;

    protected final CreateWebLinkRequestBodyParentField parent;

    protected String name;

    protected String description;

    public CreateWebLinkRequestBodyBuilder(String url, CreateWebLinkRequestBodyParentField parent) {
      this.url = url;
      this.parent = parent;
    }

    public CreateWebLinkRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CreateWebLinkRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public CreateWebLinkRequestBody build() {
      return new CreateWebLinkRequestBody(this);
    }
  }
}
