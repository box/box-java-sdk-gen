package com.box.sdkgen.schemas.storagepolicyassignment;

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
import com.box.sdkgen.schemas.storagepolicymini.StoragePolicyMini;

public class StoragePolicyAssignment {

  protected final String id;

  @JsonDeserialize(using = StoragePolicyAssignmentTypeField.StoragePolicyAssignmentTypeFieldDeserializer.class)
  @JsonSerialize(using = StoragePolicyAssignmentTypeField.StoragePolicyAssignmentTypeFieldSerializer.class)
  protected EnumWrapper<StoragePolicyAssignmentTypeField> type;

  @JsonProperty("storage_policy")
  protected StoragePolicyMini storagePolicy;

  @JsonProperty("assigned_to")
  protected StoragePolicyAssignmentAssignedToField assignedTo;

  public StoragePolicyAssignment(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<StoragePolicyAssignmentTypeField>(StoragePolicyAssignmentTypeField.STORAGE_POLICY_ASSIGNMENT.getValue(), StoragePolicyAssignmentTypeField.STORAGE_POLICY_ASSIGNMENT);
  }

  protected StoragePolicyAssignment(StoragePolicyAssignmentBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.storagePolicy = builder.storagePolicy;
    this.assignedTo = builder.assignedTo;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<StoragePolicyAssignmentTypeField> getType() {
    return type;
  }

  public StoragePolicyMini getStoragePolicy() {
    return storagePolicy;
  }

  public StoragePolicyAssignmentAssignedToField getAssignedTo() {
    return assignedTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePolicyAssignment casted = (StoragePolicyAssignment) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(storagePolicy, casted.storagePolicy) &&
      Objects.equals(assignedTo, casted.assignedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, storagePolicy, assignedTo
    );
  }

  @Override
  public String toString() {
    return "StoragePolicyAssignment{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "storagePolicy='" + storagePolicy + '\'' + ", " + "assignedTo='" + assignedTo + '\'' + "}";
  }

  public static class StoragePolicyAssignmentBuilder {

    protected final String id;

    protected EnumWrapper<StoragePolicyAssignmentTypeField> type;

    protected StoragePolicyMini storagePolicy;

    protected StoragePolicyAssignmentAssignedToField assignedTo;

    public StoragePolicyAssignmentBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<StoragePolicyAssignmentTypeField>(StoragePolicyAssignmentTypeField.STORAGE_POLICY_ASSIGNMENT.getValue(), StoragePolicyAssignmentTypeField.STORAGE_POLICY_ASSIGNMENT);
    }

    public StoragePolicyAssignmentBuilder type(StoragePolicyAssignmentTypeField type) {
      this.type = new EnumWrapper<StoragePolicyAssignmentTypeField>(type.getValue(), type);
      return this;
    }

    public StoragePolicyAssignmentBuilder storagePolicy(StoragePolicyMini storagePolicy) {
      this.storagePolicy = storagePolicy;
      return this;
    }

    public StoragePolicyAssignmentBuilder assignedTo(StoragePolicyAssignmentAssignedToField assignedTo) {
      this.assignedTo = assignedTo;
      return this;
    }

    public StoragePolicyAssignment build() {
      return new StoragePolicyAssignment(this);
    }

  }

}
