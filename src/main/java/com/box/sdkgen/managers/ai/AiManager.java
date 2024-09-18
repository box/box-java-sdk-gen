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

public class AiManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public AiManager() {
    this.networkSession = new NetworkSession();
  }

  protected AiManager(AiManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public AiResponseFull createAiAsk(AiAsk requestBody) {
    return createAiAsk(requestBody, new CreateAiAskHeaders());
  }

  public AiResponseFull createAiAsk(AiAsk requestBody, CreateAiAskHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/ai/ask")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AiResponseFull.class);
  }

  public AiResponse createAiTextGen(AiTextGen requestBody) {
    return createAiTextGen(requestBody, new CreateAiTextGenHeaders());
  }

  public AiResponse createAiTextGen(AiTextGen requestBody, CreateAiTextGenHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/ai/text_gen")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AiResponse.class);
  }

  public AiAgentAskOrAiAgentExtractOrAiAgentExtractStructuredOrAiAgentTextGen getAiAgentDefaultConfig(GetAiAgentDefaultConfigQueryParams queryParams) {
    return getAiAgentDefaultConfig(queryParams, new GetAiAgentDefaultConfigHeaders());
  }

  public AiAgentAskOrAiAgentExtractOrAiAgentExtractStructuredOrAiAgentTextGen getAiAgentDefaultConfig(GetAiAgentDefaultConfigQueryParams queryParams, GetAiAgentDefaultConfigHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("mode", convertToString(queryParams.getMode())), entryOf("language", convertToString(queryParams.getLanguage())), entryOf("model", convertToString(queryParams.getModel()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/ai_agent_default")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AiAgentAskOrAiAgentExtractOrAiAgentExtractStructuredOrAiAgentTextGen.class);
  }

  public AiResponse createAiExtract(AiExtract requestBody) {
    return createAiExtract(requestBody, new CreateAiExtractHeaders());
  }

  public AiResponse createAiExtract(AiExtract requestBody, CreateAiExtractHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/ai/extract")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AiResponse.class);
  }

  public AiExtractResponse createAiExtractStructured(AiExtractStructured requestBody) {
    return createAiExtractStructured(requestBody, new CreateAiExtractStructuredHeaders());
  }

  public AiExtractResponse createAiExtractStructured(AiExtractStructured requestBody, CreateAiExtractStructuredHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/ai/extract_structured")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AiExtractResponse.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class AiManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public AiManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public AiManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public AiManager build() {
      return new AiManager(this);
    }

  }

}
