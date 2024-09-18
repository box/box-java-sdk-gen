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

public enum CreateClassificationTemplateRequestBodyTemplateKeyField {
  SECURITYCLASSIFICATION_6VMVOCHWUWO("securityClassification-6VMVochwUWo");

  private final String value;

  CreateClassificationTemplateRequestBodyTemplateKeyField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateClassificationTemplateRequestBodyTemplateKeyFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>> {

    public CreateClassificationTemplateRequestBodyTemplateKeyFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateClassificationTemplateRequestBodyTemplateKeyField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>(value, v)).orElse(new EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>(value));
    }

  }

  public static class CreateClassificationTemplateRequestBodyTemplateKeyFieldSerializer extends JsonSerializer<EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>> {

    public CreateClassificationTemplateRequestBodyTemplateKeyFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
