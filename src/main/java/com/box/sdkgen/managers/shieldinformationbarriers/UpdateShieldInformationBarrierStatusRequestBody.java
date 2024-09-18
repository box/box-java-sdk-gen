package com.box.sdkgen.managers.shieldinformationbarriers;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarrier.ShieldInformationBarrier;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriers.ShieldInformationBarriers;
import com.box.sdkgen.schemas.enterprisebase.EnterpriseBase;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateShieldInformationBarrierStatusRequestBody {

  protected final String id;

  @JsonDeserialize(using = UpdateShieldInformationBarrierStatusRequestBodyStatusField.UpdateShieldInformationBarrierStatusRequestBodyStatusFieldDeserializer.class)
  @JsonSerialize(using = UpdateShieldInformationBarrierStatusRequestBodyStatusField.UpdateShieldInformationBarrierStatusRequestBodyStatusFieldSerializer.class)
  protected final EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField> status;

  public UpdateShieldInformationBarrierStatusRequestBody(@JsonProperty("id") String id, @JsonProperty("status") EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField> status) {
    this.id = id;
    this.status = status;
  }

  public UpdateShieldInformationBarrierStatusRequestBody(String id, UpdateShieldInformationBarrierStatusRequestBodyStatusField status) {
    this.id = id;
    this.status = new EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField>(status.getValue(), status);
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShieldInformationBarrierStatusRequestBody casted = (UpdateShieldInformationBarrierStatusRequestBody) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(status, casted.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, status
    );
  }

  @Override
  public String toString() {
    return "UpdateShieldInformationBarrierStatusRequestBody{" + "id='" + id + '\'' + ", " + "status='" + status + '\'' + "}";
  }

}
