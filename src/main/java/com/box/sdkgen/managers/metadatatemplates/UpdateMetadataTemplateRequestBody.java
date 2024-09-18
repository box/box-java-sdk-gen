package com.box.sdkgen.managers.metadatatemplates;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.metadatatemplates.MetadataTemplates;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadatatemplate.MetadataTemplate;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateMetadataTemplateRequestBody {

  @JsonDeserialize(using = UpdateMetadataTemplateRequestBodyOpField.UpdateMetadataTemplateRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = UpdateMetadataTemplateRequestBodyOpField.UpdateMetadataTemplateRequestBodyOpFieldSerializer.class)
  protected final EnumWrapper<UpdateMetadataTemplateRequestBodyOpField> op;

  protected Map<String, String> data;

  protected String fieldKey;

  protected List<String> fieldKeys;

  protected String enumOptionKey;

  protected List<String> enumOptionKeys;

  protected String multiSelectOptionKey;

  protected List<String> multiSelectOptionKeys;

  public UpdateMetadataTemplateRequestBody(@JsonProperty("op") EnumWrapper<UpdateMetadataTemplateRequestBodyOpField> op) {
    this.op = op;
  }

  public UpdateMetadataTemplateRequestBody(UpdateMetadataTemplateRequestBodyOpField op) {
    this.op = new EnumWrapper<UpdateMetadataTemplateRequestBodyOpField>(op.getValue(), op);
  }

  protected UpdateMetadataTemplateRequestBody(UpdateMetadataTemplateRequestBodyBuilder builder) {
    this.op = builder.op;
    this.data = builder.data;
    this.fieldKey = builder.fieldKey;
    this.fieldKeys = builder.fieldKeys;
    this.enumOptionKey = builder.enumOptionKey;
    this.enumOptionKeys = builder.enumOptionKeys;
    this.multiSelectOptionKey = builder.multiSelectOptionKey;
    this.multiSelectOptionKeys = builder.multiSelectOptionKeys;
  }

  public EnumWrapper<UpdateMetadataTemplateRequestBodyOpField> getOp() {
    return op;
  }

  public Map<String, String> getData() {
    return data;
  }

  public String getFieldKey() {
    return fieldKey;
  }

  public List<String> getFieldKeys() {
    return fieldKeys;
  }

  public String getEnumOptionKey() {
    return enumOptionKey;
  }

  public List<String> getEnumOptionKeys() {
    return enumOptionKeys;
  }

  public String getMultiSelectOptionKey() {
    return multiSelectOptionKey;
  }

  public List<String> getMultiSelectOptionKeys() {
    return multiSelectOptionKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMetadataTemplateRequestBody casted = (UpdateMetadataTemplateRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(data, casted.data) &&
      Objects.equals(fieldKey, casted.fieldKey) &&
      Objects.equals(fieldKeys, casted.fieldKeys) &&
      Objects.equals(enumOptionKey, casted.enumOptionKey) &&
      Objects.equals(enumOptionKeys, casted.enumOptionKeys) &&
      Objects.equals(multiSelectOptionKey, casted.multiSelectOptionKey) &&
      Objects.equals(multiSelectOptionKeys, casted.multiSelectOptionKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, data, fieldKey, fieldKeys, enumOptionKey, enumOptionKeys, multiSelectOptionKey, multiSelectOptionKeys
    );
  }

  @Override
  public String toString() {
    return "UpdateMetadataTemplateRequestBody{" + "op='" + op + '\'' + ", " + "data='" + data + '\'' + ", " + "fieldKey='" + fieldKey + '\'' + ", " + "fieldKeys='" + fieldKeys + '\'' + ", " + "enumOptionKey='" + enumOptionKey + '\'' + ", " + "enumOptionKeys='" + enumOptionKeys + '\'' + ", " + "multiSelectOptionKey='" + multiSelectOptionKey + '\'' + ", " + "multiSelectOptionKeys='" + multiSelectOptionKeys + '\'' + "}";
  }

  public static class UpdateMetadataTemplateRequestBodyBuilder {

    protected final EnumWrapper<UpdateMetadataTemplateRequestBodyOpField> op;

    protected Map<String, String> data;

    protected String fieldKey;

    protected List<String> fieldKeys;

    protected String enumOptionKey;

    protected List<String> enumOptionKeys;

    protected String multiSelectOptionKey;

    protected List<String> multiSelectOptionKeys;

    public UpdateMetadataTemplateRequestBodyBuilder(UpdateMetadataTemplateRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateMetadataTemplateRequestBodyOpField>(op.getValue(), op);
    }

    public UpdateMetadataTemplateRequestBodyBuilder data(Map<String, String> data) {
      this.data = data;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder fieldKey(String fieldKey) {
      this.fieldKey = fieldKey;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder fieldKeys(List<String> fieldKeys) {
      this.fieldKeys = fieldKeys;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder enumOptionKey(String enumOptionKey) {
      this.enumOptionKey = enumOptionKey;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder enumOptionKeys(List<String> enumOptionKeys) {
      this.enumOptionKeys = enumOptionKeys;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder multiSelectOptionKey(String multiSelectOptionKey) {
      this.multiSelectOptionKey = multiSelectOptionKey;
      return this;
    }

    public UpdateMetadataTemplateRequestBodyBuilder multiSelectOptionKeys(List<String> multiSelectOptionKeys) {
      this.multiSelectOptionKeys = multiSelectOptionKeys;
      return this;
    }

    public UpdateMetadataTemplateRequestBody build() {
      return new UpdateMetadataTemplateRequestBody(this);
    }

  }

}
