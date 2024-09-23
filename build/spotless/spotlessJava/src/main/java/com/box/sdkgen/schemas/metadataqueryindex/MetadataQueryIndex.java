package com.box.sdkgen.schemas.metadataqueryindex;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class MetadataQueryIndex {

  protected String id;

  protected final String type;

  @JsonDeserialize(
      using = MetadataQueryIndexStatusField.MetadataQueryIndexStatusFieldDeserializer.class)
  @JsonSerialize(
      using = MetadataQueryIndexStatusField.MetadataQueryIndexStatusFieldSerializer.class)
  protected final EnumWrapper<MetadataQueryIndexStatusField> status;

  protected List<MetadataQueryIndexFieldsField> fields;

  public MetadataQueryIndex(
      @JsonProperty("type") String type,
      @JsonProperty("status") EnumWrapper<MetadataQueryIndexStatusField> status) {
    this.type = type;
    this.status = status;
  }

  public MetadataQueryIndex(String type, MetadataQueryIndexStatusField status) {
    this.type = type;
    this.status = new EnumWrapper<MetadataQueryIndexStatusField>(status.getValue(), status);
  }

  protected MetadataQueryIndex(MetadataQueryIndexBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.status = builder.status;
    this.fields = builder.fields;
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public EnumWrapper<MetadataQueryIndexStatusField> getStatus() {
    return status;
  }

  public List<MetadataQueryIndexFieldsField> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataQueryIndex casted = (MetadataQueryIndex) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(status, casted.status)
        && Objects.equals(fields, casted.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, fields);
  }

  @Override
  public String toString() {
    return "MetadataQueryIndex{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "status='"
        + status
        + '\''
        + ", "
        + "fields='"
        + fields
        + '\''
        + "}";
  }

  public static class MetadataQueryIndexBuilder {

    protected String id;

    protected final String type;

    protected final EnumWrapper<MetadataQueryIndexStatusField> status;

    protected List<MetadataQueryIndexFieldsField> fields;

    public MetadataQueryIndexBuilder(String type, MetadataQueryIndexStatusField status) {
      this.type = type;
      this.status = new EnumWrapper<MetadataQueryIndexStatusField>(status.getValue(), status);
    }

    public MetadataQueryIndexBuilder id(String id) {
      this.id = id;
      return this;
    }

    public MetadataQueryIndexBuilder fields(List<MetadataQueryIndexFieldsField> fields) {
      this.fields = fields;
      return this;
    }

    public MetadataQueryIndex build() {
      return new MetadataQueryIndex(this);
    }
  }
}
