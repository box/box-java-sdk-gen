package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.integrationmappingboxitemslack.IntegrationMappingBoxItemSlack;
import com.box.sdkgen.schemas.integrationmappingslackoptions.IntegrationMappingSlackOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateSlackIntegrationMappingByIdRequestBody extends SerializableObject {

  @JsonProperty("box_item")
  protected IntegrationMappingBoxItemSlack boxItem;

  protected IntegrationMappingSlackOptions options;

  public UpdateSlackIntegrationMappingByIdRequestBody() {
    super();
  }

  protected UpdateSlackIntegrationMappingByIdRequestBody(
      UpdateSlackIntegrationMappingByIdRequestBodyBuilder builder) {
    super();
    this.boxItem = builder.boxItem;
    this.options = builder.options;
  }

  public IntegrationMappingBoxItemSlack getBoxItem() {
    return boxItem;
  }

  public IntegrationMappingSlackOptions getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSlackIntegrationMappingByIdRequestBody casted =
        (UpdateSlackIntegrationMappingByIdRequestBody) o;
    return Objects.equals(boxItem, casted.boxItem) && Objects.equals(options, casted.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxItem, options);
  }

  @Override
  public String toString() {
    return "UpdateSlackIntegrationMappingByIdRequestBody{"
        + "boxItem='"
        + boxItem
        + '\''
        + ", "
        + "options='"
        + options
        + '\''
        + "}";
  }

  public static class UpdateSlackIntegrationMappingByIdRequestBodyBuilder {

    protected IntegrationMappingBoxItemSlack boxItem;

    protected IntegrationMappingSlackOptions options;

    public UpdateSlackIntegrationMappingByIdRequestBodyBuilder boxItem(
        IntegrationMappingBoxItemSlack boxItem) {
      this.boxItem = boxItem;
      return this;
    }

    public UpdateSlackIntegrationMappingByIdRequestBodyBuilder options(
        IntegrationMappingSlackOptions options) {
      this.options = options;
      return this;
    }

    public UpdateSlackIntegrationMappingByIdRequestBody build() {
      return new UpdateSlackIntegrationMappingByIdRequestBody(this);
    }
  }
}
