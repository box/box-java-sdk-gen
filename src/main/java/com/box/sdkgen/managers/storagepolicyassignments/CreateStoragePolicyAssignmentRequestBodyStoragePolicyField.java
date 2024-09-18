package com.box.sdkgen.managers.storagepolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.storagepolicyassignments.StoragePolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.storagepolicyassignment.StoragePolicyAssignment;
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

public class CreateStoragePolicyAssignmentRequestBodyStoragePolicyField {

  @JsonDeserialize(using = CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeFieldSerializer.class)
  protected EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> type;

  protected final String id;

  public CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY.getValue(), CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
  }

  protected CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> getType() {
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
    CreateStoragePolicyAssignmentRequestBodyStoragePolicyField casted = (CreateStoragePolicyAssignmentRequestBodyStoragePolicyField) o;
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
    return "CreateStoragePolicyAssignmentRequestBodyStoragePolicyField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder {

    protected EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> type;

    protected final String id;

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY.getValue(), CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
    }

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder type(CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField type) {
      this.type = new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(type.getValue(), type);
      return this;
    }

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyField build() {
      return new CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(this);
    }

  }

}
