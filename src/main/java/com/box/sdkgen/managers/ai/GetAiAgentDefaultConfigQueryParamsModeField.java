package com.box.sdkgen.managers.ai;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.airesponsefull.AiResponseFull;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.aiask.AiAsk;
import com.box.sdkgen.schemas.airesponse.AiResponse;
import com.box.sdkgen.schemas.aitextgen.AiTextGen;
import com.box.sdkgen.schemas.aiagentaskoraiagentextractoraiagentextractstructuredoraiagenttextgen.AiAgentAskOrAiAgentExtractOrAiAgentExtractStructuredOrAiAgentTextGen;
import com.box.sdkgen.schemas.aiextract.AiExtract;
import com.box.sdkgen.schemas.aiextractresponse.AiExtractResponse;
import com.box.sdkgen.schemas.aiextractstructured.AiExtractStructured;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public enum GetAiAgentDefaultConfigQueryParamsModeField {
  ASK("ask"),
  TEXT_GEN("text_gen"),
  EXTRACT("extract"),
  EXTRACT_STRUCTURED("extract_structured");

  private final String value;

  GetAiAgentDefaultConfigQueryParamsModeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetAiAgentDefaultConfigQueryParamsModeFieldDeserializer extends JsonDeserializer<EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>> {

    public GetAiAgentDefaultConfigQueryParamsModeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetAiAgentDefaultConfigQueryParamsModeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>(value, v)).orElse(new EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>(value));
    }

  }

  public static class GetAiAgentDefaultConfigQueryParamsModeFieldSerializer extends JsonSerializer<EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>> {

    public GetAiAgentDefaultConfigQueryParamsModeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
