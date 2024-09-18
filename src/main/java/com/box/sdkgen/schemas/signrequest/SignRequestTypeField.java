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

public enum SignRequestTypeField {
  SIGN_REQUEST("sign-request");

  private final String value;

  SignRequestTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SignRequestTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<SignRequestTypeField>> {

    public SignRequestTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SignRequestTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SignRequestTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SignRequestTypeField>(value, v)).orElse(new EnumWrapper<SignRequestTypeField>(value));
    }

  }

  public static class SignRequestTypeFieldSerializer extends JsonSerializer<EnumWrapper<SignRequestTypeField>> {

    public SignRequestTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SignRequestTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
