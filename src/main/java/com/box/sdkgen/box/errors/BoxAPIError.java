package com.box.sdkgen.box.errors;

import okhttp3.Request;
import okhttp3.Response;

import java.time.LocalDateTime;

import static java.lang.String.format;

public class BoxAPIError extends BoxSDKError {

    public final RequestInfo requestInfo;

    public final ResponseInfo responseInfo;

    public BoxAPIError(String message, RequestInfo requestInfo, ResponseInfo responseInfo) {
        super(message);
        this.requestInfo = requestInfo;
        this.responseInfo = responseInfo;
    }

    public static BoxAPIError fromAPICall(Request request, Response response) {

        RequestInfo requestInfo = RequestInfo.fromRequest(request);
        ResponseInfo responseInfo = ResponseInfo.fromResponse(response);

        return new BoxAPIError.BoxAPIErrorBuilder(
                format("%d %s; Request ID: %s", response.code(), response.message(), responseInfo.getBody().get("request_id").asText("")),
                requestInfo, responseInfo
        ).timestamp(LocalDateTime.now().toString()).build();
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
