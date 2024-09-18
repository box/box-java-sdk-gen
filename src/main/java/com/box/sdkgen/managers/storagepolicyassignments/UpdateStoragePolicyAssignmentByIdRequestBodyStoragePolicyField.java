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

public class UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField {

  @JsonDeserialize(using = UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeFieldDeserializer.class)
  @JsonSerialize(using = UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeFieldSerializer.class)
  protected EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField> type;

  protected final String id;

  public UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField>(UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.STORAGE_POLICY.getValue(), UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
  }

  protected UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField(UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField> getType() {
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
    UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField casted = (UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField) o;
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
    return "UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyFieldBuilder {

    protected EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField> type;

    protected final String id;

    public UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyFieldBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField>(UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.STORAGE_POLICY.getValue(), UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
    }

    public UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyFieldBuilder type(UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField type) {
      this.type = new EnumWrapper<UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyTypeField>(type.getValue(), type);
      return this;
    }

    public UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField build() {
      return new UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField(this);
    }

  }

}
