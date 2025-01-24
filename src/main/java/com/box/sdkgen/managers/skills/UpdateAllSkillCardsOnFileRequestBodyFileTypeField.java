package com.box.sdkgen.managers.skills;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum UpdateAllSkillCardsOnFileRequestBodyFileTypeField implements Valuable {
  FILE("file");

  private final String value;

  UpdateAllSkillCardsOnFileRequestBodyFileTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyFileTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileTypeField>> {

    public UpdateAllSkillCardsOnFileRequestBodyFileTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateAllSkillCardsOnFileRequestBodyFileTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(EnumWrapper::new)
          .orElse(new EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileTypeField>(value));
    }
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyFileTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileTypeField>> {

    public UpdateAllSkillCardsOnFileRequestBodyFileTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
