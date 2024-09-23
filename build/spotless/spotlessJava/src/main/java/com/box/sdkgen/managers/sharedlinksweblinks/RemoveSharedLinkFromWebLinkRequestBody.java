package com.box.sdkgen.managers.sharedlinksweblinks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RemoveSharedLinkFromWebLinkRequestBody {

  @JsonProperty("shared_link")
  protected RemoveSharedLinkFromWebLinkRequestBodySharedLinkField sharedLink;

  public RemoveSharedLinkFromWebLinkRequestBody() {}

  protected RemoveSharedLinkFromWebLinkRequestBody(
      RemoveSharedLinkFromWebLinkRequestBodyBuilder builder) {
    this.sharedLink = builder.sharedLink;
  }

  public RemoveSharedLinkFromWebLinkRequestBodySharedLinkField getSharedLink() {
    return sharedLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveSharedLinkFromWebLinkRequestBody casted = (RemoveSharedLinkFromWebLinkRequestBody) o;
    return Objects.equals(sharedLink, casted.sharedLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedLink);
  }

  @Override
  public String toString() {
    return "RemoveSharedLinkFromWebLinkRequestBody{" + "sharedLink='" + sharedLink + '\'' + "}";
  }

  public static class RemoveSharedLinkFromWebLinkRequestBodyBuilder {

    protected RemoveSharedLinkFromWebLinkRequestBodySharedLinkField sharedLink;

    public RemoveSharedLinkFromWebLinkRequestBodyBuilder sharedLink(
        RemoveSharedLinkFromWebLinkRequestBodySharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    public RemoveSharedLinkFromWebLinkRequestBody build() {
      return new RemoveSharedLinkFromWebLinkRequestBody(this);
    }
  }
}
