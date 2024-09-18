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

public class AddClassificationRequestBody {

  @JsonDeserialize(using = AddClassificationRequestBodyOpField.AddClassificationRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = AddClassificationRequestBodyOpField.AddClassificationRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<AddClassificationRequestBodyOpField> op;

  @JsonDeserialize(using = AddClassificationRequestBodyFieldKeyField.AddClassificationRequestBodyFieldKeyFieldDeserializer.class)
  @JsonSerialize(using = AddClassificationRequestBodyFieldKeyField.AddClassificationRequestBodyFieldKeyFieldSerializer.class)
  protected EnumWrapper<AddClassificationRequestBodyFieldKeyField> fieldKey;

  protected final AddClassificationRequestBodyDataField data;

  public AddClassificationRequestBody(@JsonProperty("data") AddClassificationRequestBodyDataField data) {
    this.data = data;
    this.op = new EnumWrapper<AddClassificationRequestBodyOpField>(AddClassificationRequestBodyOpField.ADDENUMOPTION.getValue(), AddClassificationRequestBodyOpField.ADDENUMOPTION);
    this.fieldKey = new EnumWrapper<AddClassificationRequestBodyFieldKeyField>(AddClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), AddClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
  }

  protected AddClassificationRequestBody(AddClassificationRequestBodyBuilder builder) {
    this.op = builder.op;
    this.fieldKey = builder.fieldKey;
    this.data = builder.data;
  }

  public EnumWrapper<AddClassificationRequestBodyOpField> getOp() {
    return op;
  }

  public EnumWrapper<AddClassificationRequestBodyFieldKeyField> getFieldKey() {
    return fieldKey;
  }

  public AddClassificationRequestBodyDataField getData() {
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
    AddClassificationRequestBody casted = (AddClassificationRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(fieldKey, casted.fieldKey) &&
      Objects.equals(data, casted.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, fieldKey, data
    );
  }

  @Override
  public String toString() {
    return "AddClassificationRequestBody{" + "op='" + op + '\'' + ", " + "fieldKey='" + fieldKey + '\'' + ", " + "data='" + data + '\'' + "}";
  }

  public static class AddClassificationRequestBodyBuilder {

    protected EnumWrapper<AddClassificationRequestBodyOpField> op;

    protected EnumWrapper<AddClassificationRequestBodyFieldKeyField> fieldKey;

    protected final AddClassificationRequestBodyDataField data;

    public AddClassificationRequestBodyBuilder(AddClassificationRequestBodyDataField data) {
      this.data = data;
      this.op = new EnumWrapper<AddClassificationRequestBodyOpField>(AddClassificationRequestBodyOpField.ADDENUMOPTION.getValue(), AddClassificationRequestBodyOpField.ADDENUMOPTION);
      this.fieldKey = new EnumWrapper<AddClassificationRequestBodyFieldKeyField>(AddClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), AddClassificationRequestBodyFieldKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
    }

    public AddClassificationRequestBodyBuilder op(AddClassificationRequestBodyOpField op) {
      this.op = new EnumWrapper<AddClassificationRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public AddClassificationRequestBodyBuilder fieldKey(AddClassificationRequestBodyFieldKeyField fieldKey) {
      this.fieldKey = new EnumWrapper<AddClassificationRequestBodyFieldKeyField>(fieldKey.getValue(), fieldKey);
      return this;
    }

    public AddClassificationRequestBody build() {
      return new AddClassificationRequestBody(this);
    }

  }

}
