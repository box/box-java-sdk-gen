package com.box.sdkgen.schemas.storagepolicymini;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class StoragePolicyMini extends SerializableObject {

  protected final String id;

  @JsonDeserialize(using = StoragePolicyMiniTypeField.StoragePolicyMiniTypeFieldDeserializer.class)
  @JsonSerialize(using = StoragePolicyMiniTypeField.StoragePolicyMiniTypeFieldSerializer.class)
  protected EnumWrapper<StoragePolicyMiniTypeField> type;

  public StoragePolicyMini(@JsonProperty("id") String id) {
    super();
    this.id = id;
    this.type =
        new EnumWrapper<StoragePolicyMiniTypeField>(StoragePolicyMiniTypeField.STORAGE_POLICY);
  }

  protected StoragePolicyMini(StoragePolicyMiniBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<StoragePolicyMiniTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePolicyMini casted = (StoragePolicyMini) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "StoragePolicyMini{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class StoragePolicyMiniBuilder {

    protected final String id;

    protected EnumWrapper<StoragePolicyMiniTypeField> type;

    public StoragePolicyMiniBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<StoragePolicyMiniTypeField>(StoragePolicyMiniTypeField.STORAGE_POLICY);
    }

    public StoragePolicyMiniBuilder type(StoragePolicyMiniTypeField type) {
      this.type = new EnumWrapper<StoragePolicyMiniTypeField>(type);
      return this;
    }

    public StoragePolicyMiniBuilder type(EnumWrapper<StoragePolicyMiniTypeField> type) {
      this.type = type;
      return this;
    }

    public StoragePolicyMini build() {
      return new StoragePolicyMini(this);
    }
  }
}
