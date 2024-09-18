package com.box.sdkgen.managers.retentionpolicyassignments;

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
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.retentionpolicyassignments.RetentionPolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.retentionpolicyassignment.RetentionPolicyAssignment;
import com.box.sdkgen.schemas.filesunderretention.FilesUnderRetention;
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

public class CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField {

  protected String field;

  protected String value;

  public CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField() {
  }

  protected CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField(CreateRetentionPolicyAssignmentRequestBodyFilterFieldsFieldBuilder builder) {
    this.field = builder.field;
    this.value = builder.value;
  }

  public String getField() {
    return field;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField casted = (CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField) o;
    return Objects.equals(field, casted.field) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      field, value
    );
  }

  @Override
  public String toString() {
    return "CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField{" + "field='" + field + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class CreateRetentionPolicyAssignmentRequestBodyFilterFieldsFieldBuilder {

    protected String field;

    protected String value;

    public CreateRetentionPolicyAssignmentRequestBodyFilterFieldsFieldBuilder field(String field) {
      this.field = field;
      return this;
    }

    public CreateRetentionPolicyAssignmentRequestBodyFilterFieldsFieldBuilder value(String value) {
      this.value = value;
      return this;
    }

    public CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField build() {
      return new CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField(this);
    }

  }

}
