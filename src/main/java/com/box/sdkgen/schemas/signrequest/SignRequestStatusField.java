package com.box.sdkgen.schemas.signrequest;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.signrequestprefilltag.SignRequestPrefillTag;
import com.box.sdkgen.schemas.signrequestbase.SignRequestBase;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.signrequestsigner.SignRequestSigner;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public enum SignRequestStatusField {
  CONVERTING("converting"),
  CREATED("created"),
  SENT("sent"),
  VIEWED("viewed"),
  SIGNED("signed"),
  CANCELLED("cancelled"),
  DECLINED("declined"),
  ERROR_CONVERTING("error_converting"),
  ERROR_SENDING("error_sending"),
  EXPIRED("expired"),
  FINALIZING("finalizing"),
  ERROR_FINALIZING("error_finalizing");

  private final String value;

  SignRequestStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SignRequestStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<SignRequestStatusField>> {

    public SignRequestStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SignRequestStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SignRequestStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SignRequestStatusField>(value, v)).orElse(new EnumWrapper<SignRequestStatusField>(value));
    }

  }

  public static class SignRequestStatusFieldSerializer extends JsonSerializer<EnumWrapper<SignRequestStatusField>> {

    public SignRequestStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SignRequestStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
