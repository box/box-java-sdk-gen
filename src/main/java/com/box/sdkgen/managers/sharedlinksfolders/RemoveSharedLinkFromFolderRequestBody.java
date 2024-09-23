package com.box.sdkgen.managers.sharedlinksfolders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RemoveSharedLinkFromFolderRequestBody {

  @JsonProperty("shared_link")
  protected RemoveSharedLinkFromFolderRequestBodySharedLinkField sharedLink;

  public RemoveSharedLinkFromFolderRequestBody() {}

  protected RemoveSharedLinkFromFolderRequestBody(
      RemoveSharedLinkFromFolderRequestBodyBuilder builder) {
    this.sharedLink = builder.sharedLink;
  }

  public RemoveSharedLinkFromFolderRequestBodySharedLinkField getSharedLink() {
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
    RemoveSharedLinkFromFolderRequestBody casted = (RemoveSharedLinkFromFolderRequestBody) o;
    return Objects.equals(sharedLink, casted.sharedLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedLink);
  }

  @Override
  public String toString() {
    return "RemoveSharedLinkFromFolderRequestBody{" + "sharedLink='" + sharedLink + '\'' + "}";
  }

  public static class RemoveSharedLinkFromFolderRequestBodyBuilder {

    protected RemoveSharedLinkFromFolderRequestBodySharedLinkField sharedLink;

    public RemoveSharedLinkFromFolderRequestBodyBuilder sharedLink(
        RemoveSharedLinkFromFolderRequestBodySharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    public RemoveSharedLinkFromFolderRequestBody build() {
      return new RemoveSharedLinkFromFolderRequestBody(this);
    }
  }
}
