package com.box.sdkgen.managers.filewatermarks;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.watermark.Watermark;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateFileWatermarkRequestBodyWatermarkField {

  @JsonDeserialize(using = UpdateFileWatermarkRequestBodyWatermarkImprintField.UpdateFileWatermarkRequestBodyWatermarkImprintFieldDeserializer.class)
  @JsonSerialize(using = UpdateFileWatermarkRequestBodyWatermarkImprintField.UpdateFileWatermarkRequestBodyWatermarkImprintFieldSerializer.class)
  protected EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> imprint;

  public UpdateFileWatermarkRequestBodyWatermarkField() {
    this.imprint = new EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField>(UpdateFileWatermarkRequestBodyWatermarkImprintField.DEFAULT.getValue(), UpdateFileWatermarkRequestBodyWatermarkImprintField.DEFAULT);
  }

  protected UpdateFileWatermarkRequestBodyWatermarkField(UpdateFileWatermarkRequestBodyWatermarkFieldBuilder builder) {
    this.imprint = builder.imprint;
  }

  public EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> getImprint() {
    return imprint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileWatermarkRequestBodyWatermarkField casted = (UpdateFileWatermarkRequestBodyWatermarkField) o;
    return Objects.equals(imprint, casted.imprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      imprint
    );
  }

  @Override
  public String toString() {
    return "UpdateFileWatermarkRequestBodyWatermarkField{" + "imprint='" + imprint + '\'' + "}";
  }

  public static class UpdateFileWatermarkRequestBodyWatermarkFieldBuilder {

    protected EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField> imprint;

    public UpdateFileWatermarkRequestBodyWatermarkFieldBuilder imprint(UpdateFileWatermarkRequestBodyWatermarkImprintField imprint) {
      this.imprint = new EnumWrapper<UpdateFileWatermarkRequestBodyWatermarkImprintField>(imprint.getValue(), imprint);
      return this;
    }

    public UpdateFileWatermarkRequestBodyWatermarkField build() {
      return new UpdateFileWatermarkRequestBodyWatermarkField(this);
    }

  }

}
