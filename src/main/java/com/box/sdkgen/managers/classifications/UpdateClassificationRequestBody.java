package com.box.sdkgen.managers.classifications;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.classificationtemplate.ClassificationTemplate;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateClassificationRequestBody {

  @JsonDeserialize(using = UpdateClassificationRequestBodyOpField.UpdateClassificationRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = UpdateClassificationRequestBodyOpField.UpdateClassificationRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationRequestBodyOpField> op;

  @JsonDeserialize(using = UpdateClassificationRequestBodyFieldKeyField.UpdateClassificationRequestBodyFieldKeyFieldDeserializer.class)
  @JsonSerialize(using = UpdateClassificationRequestBodyFieldKeyField.UpdateClassificationRequestBodyFieldKeyFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationRequestBodyFieldKeyField> fieldKey;

  protected final String enumOptionKey;

  protected final UpdateClassificationRequestBodyDataField data;

  public UpdateClassificationRequestBody(@JsonProperty("enumOptionKey") String enumOptionKey, @JsonProperty("data") UpdateClassificationRequestBodyDataField data) {
    this.enumOptionKey = enumOptionKey;
    this.data = data;
    this.op = new EnumWrapper<UpdateClassificationRequestBodyOpField>(UpdateClassificationRequestBodyOpField.EDITENUMOPTION.getValue(), UpdateClassificationRequestBodyOpField.EDITENUMOPTION);
    this.fieldKey = new EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>(UpdateClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), UpdateClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
  }

  protected UpdateClassificationRequestBody(UpdateClassificationRequestBodyBuilder builder) {
    this.op = builder.op;
    this.fieldKey = builder.fieldKey;
    this.enumOptionKey = builder.enumOptionKey;
    this.data = builder.data;
  }

  public EnumWrapper<UpdateClassificationRequestBodyOpField> getOp() {
    return op;
  }

  public EnumWrapper<UpdateClassificationRequestBodyFieldKeyField> getFieldKey() {
    return fieldKey;
  }

  public String getEnumOptionKey() {
    return enumOptionKey;
  }

  public UpdateClassificationRequestBodyDataField getData() {
    return data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationRequestBody casted = (UpdateClassificationRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(fieldKey, casted.fieldKey) &&
      Objects.equals(enumOptionKey, casted.enumOptionKey) &&
      Objects.equals(data, casted.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, fieldKey, enumOptionKey, data
    );
  }

  @Override
  public String toString() {
    return "UpdateClassificationRequestBody{" + "op='" + op + '\'' + ", " + "fieldKey='" + fieldKey + '\'' + ", " + "enumOptionKey='" + enumOptionKey + '\'' + ", " + "data='" + data + '\'' + "}";
  }

  public static class UpdateClassificationRequestBodyBuilder {

    protected EnumWrapper<UpdateClassificationRequestBodyOpField> op;

    protected EnumWrapper<UpdateClassificationRequestBodyFieldKeyField> fieldKey;

    protected final String enumOptionKey;

    protected final UpdateClassificationRequestBodyDataField data;

    public UpdateClassificationRequestBodyBuilder(String enumOptionKey, UpdateClassificationRequestBodyDataField data) {
      this.enumOptionKey = enumOptionKey;
      this.data = data;
      this.op = new EnumWrapper<UpdateClassificationRequestBodyOpField>(UpdateClassificationRequestBodyOpField.EDITENUMOPTION.getValue(), UpdateClassificationRequestBodyOpField.EDITENUMOPTION);
      this.fieldKey = new EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>(UpdateClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), UpdateClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
    }

    public UpdateClassificationRequestBodyBuilder op(UpdateClassificationRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateClassificationRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateClassificationRequestBodyBuilder fieldKey(UpdateClassificationRequestBodyFieldKeyField fieldKey) {
      this.fieldKey = new EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>(fieldKey.getValue(), fieldKey);
      return this;
    }

    public UpdateClassificationRequestBody build() {
      return new UpdateClassificationRequestBody(this);
    }

  }

}
