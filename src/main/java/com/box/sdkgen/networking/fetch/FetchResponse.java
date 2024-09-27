package com.box.sdkgen.networking.fetch;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.InputStream;
import java.util.Map;

public class FetchResponse {

  protected final int status;

  protected final JsonNode data;

  protected final InputStream content;

  protected final Map<String, String> headers;

  public FetchResponse(
      int status, JsonNode data, InputStream content, Map<String, String> headers) {
    this.status = status;
    this.data = data;
    this.content = content;
    this.headers = headers;
  }

  public int getStatus() {
    return status;
  }

  public JsonNode getData() {
    return data;
  }

  public InputStream getContent() {
    return content;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }
}
