package com.box.sdkgen.schemas.zipdownloadrequest;

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

public class ZipDownloadRequestItemsField {

  @JsonDeserialize(using = ZipDownloadRequestItemsTypeField.ZipDownloadRequestItemsTypeFieldDeserializer.class)
  @JsonSerialize(using = ZipDownloadRequestItemsTypeField.ZipDownloadRequestItemsTypeFieldSerializer.class)
  protected final EnumWrapper<ZipDownloadRequestItemsTypeField> type;

  protected final String id;

  public ZipDownloadRequestItemsField(@JsonProperty("type") EnumWrapper<ZipDownloadRequestItemsTypeField> type, @JsonProperty("id") String id) {
    this.type = type;
    this.id = id;
  }

  public ZipDownloadRequestItemsField(ZipDownloadRequestItemsTypeField type, String id) {
    this.type = new EnumWrapper<ZipDownloadRequestItemsTypeField>(type.getValue(), type);
    this.id = id;
  }

  public EnumWrapper<ZipDownloadRequestItemsTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDownloadRequestItemsField casted = (ZipDownloadRequestItemsField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id
    );
  }

  @Override
  public String toString() {
    return "ZipDownloadRequestItemsField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

}
