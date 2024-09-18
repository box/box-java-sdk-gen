package com.box.sdkgen.schemas.conflicterror;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.clienterror.ClientErrorTypeField;
import com.box.sdkgen.schemas.clienterror.ClientErrorCodeField;
import com.box.sdkgen.schemas.clienterror.ClientErrorContextInfoField;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileconflict.FileConflict;

public class ConflictError extends ClientError {

  public ConflictError() {
    super();
  }

  protected ConflictError(ConflictErrorBuilder builder) {
    super(builder);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConflictError casted = (ConflictError) o;
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
    return "ConflictError{" + "type='" + type + '\'' + ", " + "status='" + status + '\'' + ", " + "code='" + code + '\'' + ", " + "message='" + message + '\'' + ", " + "contextInfo='" + contextInfo + '\'' + ", " + "helpUrl='" + helpUrl + '\'' + ", " + "requestId='" + requestId + '\'' + "}";
  }

  public static class ConflictErrorBuilder extends ClientErrorBuilder {

    @Override
    public ConflictErrorBuilder type(ClientErrorTypeField type) {
      this.type = new EnumWrapper<ClientErrorTypeField>(type.getValue(), type);
      return this;
    }

    @Override
    public ConflictErrorBuilder status(Integer status) {
      this.status = status;
      return this;
    }

    @Override
    public ConflictErrorBuilder code(ClientErrorCodeField code) {
      this.code = new EnumWrapper<ClientErrorCodeField>(code.getValue(), code);
      return this;
    }

    @Override
    public ConflictErrorBuilder message(String message) {
      this.message = message;
      return this;
    }

    @Override
    public ConflictErrorBuilder contextInfo(ClientErrorContextInfoField contextInfo) {
      this.contextInfo = contextInfo;
      return this;
    }

    @Override
    public ConflictErrorBuilder helpUrl(String helpUrl) {
      this.helpUrl = helpUrl;
      return this;
    }

    @Override
    public ConflictErrorBuilder requestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public ConflictError build() {
      return new ConflictError(this);
    }

  }

}
