package com.box.sdkgen.box.errors;

import static java.lang.String.format;

import com.box.sdkgen.networking.fetchresponse.FetchResponse;
import java.time.LocalDateTime;
import okhttp3.Request;

public class BoxAPIError extends BoxSDKError {

  public final RequestInfo requestInfo;

  public final ResponseInfo responseInfo;

  public BoxAPIError(String message, RequestInfo requestInfo, ResponseInfo responseInfo) {
    super(message);
    this.requestInfo = requestInfo;
    this.responseInfo = responseInfo;
  }

  public static BoxAPIError fromAPICall(Request request, FetchResponse fetchResponse) {
    RequestInfo requestInfo = RequestInfo.fromRequest(request);
    ResponseInfo responseInfo = ResponseInfo.fromResponse(fetchResponse);
    String requestId =
        responseInfo.getBody().get("request_id") != null
            ? responseInfo.getBody().get("request_id").asText()
            : "";
    return new BoxAPIError.BoxAPIErrorBuilder(
            format("Status %d; Request ID: %s", responseInfo.getStatusCode(), requestId),
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
