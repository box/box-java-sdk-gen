package com.box.sdkgen.networking.fetch;

import com.box.sdkgen.internal.utils.ByteStream;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;

public class FetchResponse {

  protected final int status;

  protected final JsonNode data;

  protected final ByteStream content;

  protected final Map<String, String> headers;

  public FetchResponse(int status, JsonNode data, ByteStream content, Map<String, String> headers) {
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

  public ByteStream getContent() {
    return content;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }
}
