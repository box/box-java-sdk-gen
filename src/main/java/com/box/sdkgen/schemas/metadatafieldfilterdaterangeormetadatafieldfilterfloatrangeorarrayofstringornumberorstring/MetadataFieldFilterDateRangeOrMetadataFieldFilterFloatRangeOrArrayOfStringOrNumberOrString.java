package com.box.sdkgen.schemas.metadatafieldfilterdaterangeormetadatafieldfilterfloatrangeorarrayofstringornumberorstring;

import com.box.sdkgen.internal.OneOfFive;
import com.box.sdkgen.schemas.metadatafieldfilterdaterange.MetadataFieldFilterDateRange;
import com.box.sdkgen.schemas.metadatafieldfilterfloatrange.MetadataFieldFilterFloatRange;
import com.box.sdkgen.serialization.json.JsonManager;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.List;

@JsonDeserialize(
    using =
        MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString
            .MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrStringDeserializer
            .class)
@JsonSerialize(using = OneOfFive.OneOfFiveSerializer.class)
public
class MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString
    extends OneOfFive<
        MetadataFieldFilterDateRange, MetadataFieldFilterFloatRange, List<String>, Double, String> {

  public MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
      MetadataFieldFilterDateRange metadataFieldFilterDateRange) {
    super(metadataFieldFilterDateRange, null, null, null, null);
  }

  public MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
      MetadataFieldFilterFloatRange metadataFieldFilterFloatRange) {
    super(null, metadataFieldFilterFloatRange, null, null, null);
  }

  public MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
      List<String> listOfString) {
    super(null, null, listOfString, null, null);
  }

  public MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
      Double number) {
    super(null, null, null, number, null);
  }

  public MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
      String string) {
    super(null, null, null, null, string);
  }

  public MetadataFieldFilterDateRange getMetadataFieldFilterDateRange() {
    return value0;
  }

  public MetadataFieldFilterFloatRange getMetadataFieldFilterFloatRange() {
    return value1;
  }

  public List<String> getListOfString() {
    return value2;
  }

  public Double getNumber() {
    return value3;
  }

  public String getString() {
    return value4;
  }

  static
  class MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrStringDeserializer
      extends JsonDeserializer<
          MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString> {

    public
    MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrStringDeserializer() {
      super();
    }

    @Override
    public
    MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString
        deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      try {
        return new MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
            OneOfFive.OBJECT_MAPPER.convertValue(node, MetadataFieldFilterDateRange.class));
      } catch (Exception ignored) {
      }
      try {
        return new MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
            OneOfFive.OBJECT_MAPPER.convertValue(node, MetadataFieldFilterFloatRange.class));
      } catch (Exception ignored) {
      }
      try {
        return new MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
            OneOfFive.OBJECT_MAPPER.convertValue(node, List.class));
      } catch (Exception ignored) {
      }
      try {
        return new MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
            OneOfFive.OBJECT_MAPPER.convertValue(node, Double.class));
      } catch (Exception ignored) {
      }
      try {
        return new MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString(
            OneOfFive.OBJECT_MAPPER.convertValue(node, String.class));
      } catch (Exception ignored) {
      }
      throw new JsonMappingException(
          jp,
          "Unable to deserialize MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString");
    }
  }
}
