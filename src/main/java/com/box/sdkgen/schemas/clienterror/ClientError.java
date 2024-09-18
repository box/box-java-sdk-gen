package com.box.sdkgen.schemas.clienterror;

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

public class ClientError {

  @JsonDeserialize(using = ClientErrorTypeField.ClientErrorTypeFieldDeserializer.class)
  @JsonSerialize(using = ClientErrorTypeField.ClientErrorTypeFieldSerializer.class)
  protected EnumWrapper<ClientErrorTypeField> type;

  protected Integer status;

  @JsonDeserialize(using = ClientErrorCodeField.ClientErrorCodeFieldDeserializer.class)
  @JsonSerialize(using = ClientErrorCodeField.ClientErrorCodeFieldSerializer.class)
  protected EnumWrapper<ClientErrorCodeField> code;

  protected String message;

  @JsonProperty("context_info")
  protected ClientErrorContextInfoField contextInfo;

  @JsonProperty("help_url")
  protected String helpUrl;

  @JsonProperty("request_id")
  protected String requestId;

  public ClientError() {
  }

  protected ClientError(ClientErrorBuilder builder) {
    this.type = builder.type;
    this.status = builder.status;
    this.code = builder.code;
    this.message = builder.message;
    this.contextInfo = builder.contextInfo;
    this.helpUrl = builder.helpUrl;
    this.requestId = builder.requestId;
  }

  public EnumWrapper<ClientErrorTypeField> getType() {
    return type;
  }

  public Integer getStatus() {
    return status;
  }

  public EnumWrapper<ClientErrorCodeField> getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public ClientErrorContextInfoField getContextInfo() {
    return contextInfo;
  }

  public String getHelpUrl() {
    return helpUrl;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientError casted = (ClientError) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(status, casted.status) &&
      Objects.equals(code, casted.code) &&
      Objects.equals(message, casted.message) &&
      Objects.equals(contextInfo, casted.contextInfo) &&
      Objects.equals(helpUrl, casted.helpUrl) &&
      Objects.equals(requestId, casted.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, status, code, message, contextInfo, helpUrl, requestId
    );
  }

  @Override
  public String toString() {
    return "ClientError{" + "type='" + type + '\'' + ", " + "status='" + status + '\'' + ", " + "code='" + code + '\'' + ", " + "message='" + message + '\'' + ", " + "contextInfo='" + contextInfo + '\'' + ", " + "helpUrl='" + helpUrl + '\'' + ", " + "requestId='" + requestId + '\'' + "}";
  }

  public static class ClientErrorBuilder {

    protected EnumWrapper<ClientErrorTypeField> type;

    protected Integer status;

    protected EnumWrapper<ClientErrorCodeField> code;

    protected String message;

    protected ClientErrorContextInfoField contextInfo;

    protected String helpUrl;

    protected String requestId;

    public ClientErrorBuilder type(ClientErrorTypeField type) {
      this.type = new EnumWrapper<ClientErrorTypeField>(type.getValue(), type);
      return this;
    }

    public ClientErrorBuilder status(Integer status) {
      this.status = status;
      return this;
    }

    public ClientErrorBuilder code(ClientErrorCodeField code) {
      this.code = new EnumWrapper<ClientErrorCodeField>(code.getValue(), code);
      return this;
    }

    public ClientErrorBuilder message(String message) {
      this.message = message;
      return this;
    }

    public ClientErrorBuilder contextInfo(ClientErrorContextInfoField contextInfo) {
      this.contextInfo = contextInfo;
      return this;
    }

    public ClientErrorBuilder helpUrl(String helpUrl) {
      this.helpUrl = helpUrl;
      return this;
    }

    public ClientErrorBuilder requestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public ClientError build() {
      return new ClientError(this);
    }

  }

}
