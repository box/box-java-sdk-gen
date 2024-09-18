package com.box.sdkgen.schemas.signrequestcreaterequest;

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
import com.box.sdkgen.schemas.signrequestcreatesigner.SignRequestCreateSigner;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public enum SignRequestCreateRequestSignatureColorField {
  BLUE("blue"),
  BLACK("black"),
  RED("red");

  private final String value;

  SignRequestCreateRequestSignatureColorField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SignRequestCreateRequestSignatureColorFieldDeserializer extends JsonDeserializer<EnumWrapper<SignRequestCreateRequestSignatureColorField>> {

    public SignRequestCreateRequestSignatureColorFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SignRequestCreateRequestSignatureColorField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SignRequestCreateRequestSignatureColorField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SignRequestCreateRequestSignatureColorField>(value, v)).orElse(new EnumWrapper<SignRequestCreateRequestSignatureColorField>(value));
    }

  }

  public static class SignRequestCreateRequestSignatureColorFieldSerializer extends JsonSerializer<EnumWrapper<SignRequestCreateRequestSignatureColorField>> {

    public SignRequestCreateRequestSignatureColorFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SignRequestCreateRequestSignatureColorField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
