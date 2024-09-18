package com.box.sdkgen.managers.classifications;

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
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.classificationtemplate.ClassificationTemplate;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateClassificationRequestBodyDataStaticConfigField {

  protected UpdateClassificationRequestBodyDataStaticConfigClassificationField classification;

  public UpdateClassificationRequestBodyDataStaticConfigField() {
  }

  protected UpdateClassificationRequestBodyDataStaticConfigField(UpdateClassificationRequestBodyDataStaticConfigFieldBuilder builder) {
    this.classification = builder.classification;
  }

  public UpdateClassificationRequestBodyDataStaticConfigClassificationField getClassification() {
    return classification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationRequestBodyDataStaticConfigField casted = (UpdateClassificationRequestBodyDataStaticConfigField) o;
    return Objects.equals(classification, casted.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      classification
    );
  }

  @Override
  public String toString() {
    return "UpdateClassificationRequestBodyDataStaticConfigField{" + "classification='" + classification + '\'' + "}";
  }

  public static class UpdateClassificationRequestBodyDataStaticConfigFieldBuilder {

    protected UpdateClassificationRequestBodyDataStaticConfigClassificationField classification;

    public UpdateClassificationRequestBodyDataStaticConfigFieldBuilder classification(UpdateClassificationRequestBodyDataStaticConfigClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigField build() {
      return new UpdateClassificationRequestBodyDataStaticConfigField(this);
    }

  }

}
