package com.box.sdkgen.box.errors;

import com.box.sdkgen.networking.fetchresponse.FetchResponse;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDateTime;
import java.util.Optional;
import okhttp3.Request;

public class BoxAPIError extends BoxSDKError {

  public final RequestInfo requestInfo;

  public final ResponseInfo responseInfo;

  public BoxAPIError(String message, RequestInfo requestInfo, ResponseInfo responseInfo) {
    super(message);
    this.requestInfo = requestInfo;
    this.responseInfo = responseInfo;
  }

  public static BoxAPIError fromAPICall(
      Request request, FetchResponse fetchResponse, String rawResponseBody) {
    RequestInfo requestInfo = RequestInfo.fromRequest(request);
    ResponseInfo responseInfo = ResponseInfo.fromResponse(fetchResponse, rawResponseBody);

    String requestId =
        Optional.ofNullable(responseInfo.getBody())
            .map(body -> body.get("request_id"))
            .map(JsonNode::asText)
            .orElse("");

    return new BoxAPIError.BoxAPIErrorBuilder(
            String.format("Status %d; Request ID: %s", responseInfo.getStatusCode(), requestId),
            requestInfo,
            responseInfo)
        .timestamp(LocalDateTime.now().toString())
        .build();
  }

  protected BoxAPIError(BoxAPIErrorBuilder builder) {
    super(builder);
    this.requestInfo = builder.requestInfo;
    this.responseInfo = builder.responseInfo;
  }

  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public static class BoxAPIErrorBuilder extends BoxSDKErrorBuilder {

    protected final RequestInfo requestInfo;

    protected final ResponseInfo responseInfo;

    public BoxAPIErrorBuilder(String message, RequestInfo requestInfo, ResponseInfo responseInfo) {
      super(message);
      this.requestInfo = requestInfo;
      this.responseInfo = responseInfo;
    }

    @Override
    public BoxAPIErrorBuilder timestamp(String timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    public BoxAPIErrorBuilder error(Exception error) {
      this.error = error;
      return this;
    }

    @Override
    public BoxAPIErrorBuilder name(String name) {
      this.name = name;
      return this;
    }

    public BoxAPIError build() {
      return new BoxAPIError(this);
    }
  }
}
