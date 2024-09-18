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

public class UpdateClassificationRequestBodyDataStaticConfigClassificationField {

  protected String classificationDefinition;

  @JsonProperty("colorID")
  protected Long colorId;

  public UpdateClassificationRequestBodyDataStaticConfigClassificationField() {
  }

  protected UpdateClassificationRequestBodyDataStaticConfigClassificationField(UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder builder) {
    this.classificationDefinition = builder.classificationDefinition;
    this.colorId = builder.colorId;
  }

  public String getClassificationDefinition() {
    return classificationDefinition;
  }

  public Long getColorId() {
    return colorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationRequestBodyDataStaticConfigClassificationField casted = (UpdateClassificationRequestBodyDataStaticConfigClassificationField) o;
    return Objects.equals(classificationDefinition, casted.classificationDefinition) &&
      Objects.equals(colorId, casted.colorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      classificationDefinition, colorId
    );
  }

  @Override
  public String toString() {
    return "UpdateClassificationRequestBodyDataStaticConfigClassificationField{" + "classificationDefinition='" + classificationDefinition + '\'' + ", " + "colorId='" + colorId + '\'' + "}";
  }

  public static class UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder {

    protected String classificationDefinition;

    protected Long colorId;

    public UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder classificationDefinition(String classificationDefinition) {
      this.classificationDefinition = classificationDefinition;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder colorId(Long colorId) {
      this.colorId = colorId;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigClassificationField build() {
      return new UpdateClassificationRequestBodyDataStaticConfigClassificationField(this);
    }

  }

}
