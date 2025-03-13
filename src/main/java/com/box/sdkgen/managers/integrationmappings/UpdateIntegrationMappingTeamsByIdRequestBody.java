package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.folderreference.FolderReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateIntegrationMappingTeamsByIdRequestBody extends SerializableObject {

  @JsonProperty("box_item")
  protected FolderReference boxItem;

  public UpdateIntegrationMappingTeamsByIdRequestBody() {
    super();
  }

  protected UpdateIntegrationMappingTeamsByIdRequestBody(
      UpdateIntegrationMappingTeamsByIdRequestBodyBuilder builder) {
    super();
    this.boxItem = builder.boxItem;
  }

  public FolderReference getBoxItem() {
    return boxItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIntegrationMappingTeamsByIdRequestBody casted =
        (UpdateIntegrationMappingTeamsByIdRequestBody) o;
    return Objects.equals(boxItem, casted.boxItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxItem);
  }

  @Override
  public String toString() {
    return "UpdateIntegrationMappingTeamsByIdRequestBody{" + "boxItem='" + boxItem + '\'' + "}";
  }

  public static class UpdateIntegrationMappingTeamsByIdRequestBodyBuilder {

    protected FolderReference boxItem;

    public UpdateIntegrationMappingTeamsByIdRequestBodyBuilder boxItem(FolderReference boxItem) {
      this.boxItem = boxItem;
      return this;
    }

    public UpdateIntegrationMappingTeamsByIdRequestBody build() {
      return new UpdateIntegrationMappingTeamsByIdRequestBody(this);
    }
  }
}
