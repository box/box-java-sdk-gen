package com.box.sdkgen.box.errors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import static com.box.sdkgen.serialization.json.JsonManager.jsonToSerializedData;

public class ResponseInfo {

    public final int statusCode;

    public final Map<String, String> headers;

    public JsonNode body;

    public String rawBody;

    public String code;

    public JsonNode contextInfo;

    public String requestId;

    public String helpUrl;

    public ResponseInfo(int statusCode, Map<String, String> headers) {
        this.statusCode = statusCode;
        this.headers = headers;
    }

    protected ResponseInfo(ResponseInfoBuilder builder) {
        this.statusCode = builder.statusCode;
        this.headers = builder.headers;
        this.body = builder.body;
        this.rawBody = builder.rawBody;
        this.code = builder.code;
        this.contextInfo = builder.contextInfo;
        this.requestId = builder.requestId;
        this.helpUrl = builder.helpUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public JsonNode getBody() {
        return body;
    }

    public String getRawBody() {
        return rawBody;
    }

    public String getCode() {
        return code;
    }

    public JsonNode getContextInfo() {
        return contextInfo;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public static class ResponseInfoBuilder {

        protected final int statusCode;

        protected final Map<String, String> headers;

        protected JsonNode body;

        protected String rawBody;

        protected String code;

        protected JsonNode contextInfo;

        protected String requestId;

        protected String helpUrl;

        public ResponseInfoBuilder(int statusCode, Map<String, String> headers) {
            this.statusCode = statusCode;
            this.headers = headers;
        }

        public ResponseInfoBuilder body(JsonNode body) {
            this.body = body;
            return this;
        }

        public ResponseInfoBuilder rawBody(String rawBody) {
            this.rawBody = rawBody;
            return this;
        }

        public ResponseInfoBuilder code(String code) {
            this.code = code;
            return this;
        }

        public ResponseInfoBuilder contextInfo(JsonNode contextInfo) {
            this.contextInfo = contextInfo;
            return this;
        }

        public ResponseInfoBuilder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResponseInfoBuilder helpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }

        public ResponseInfo build() {
            return new ResponseInfo(this);
        }

    }

    public static ResponseInfo fromResponse(Response response){
        JsonNode body = JsonNodeFactory.instance.objectNode();
        String rawBody = null;
        try {
            if (response.body() != null) {
                rawBody = response.body().string();
                body = jsonToSerializedData(rawBody);
            }
        } catch (IOException ignored) {
        }

        return new ResponseInfo.ResponseInfoBuilder(
                response.code(),
                response.headers().toMultimap().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get(0)))
        ).body(body)
                .rawBody(rawBody)
                .code(body.get("code").asText(""))
                .contextInfo(body.get("context_info") != null ? body.get("context_info") : null)
                .requestId(body.get("request_id").asText(""))
                .helpUrl(body.get("help_url").asText("")).build();

    }

}
