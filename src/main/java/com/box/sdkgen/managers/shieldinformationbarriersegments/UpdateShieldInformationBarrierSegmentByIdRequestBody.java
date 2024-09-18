package com.box.sdkgen.managers.shieldinformationbarriersegments;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarriersegment.ShieldInformationBarrierSegment;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegments.ShieldInformationBarrierSegments;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
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

public class UpdateShieldInformationBarrierSegmentByIdRequestBody {

  protected String name;

  protected String description;

  public UpdateShieldInformationBarrierSegmentByIdRequestBody() {
  }

  protected UpdateShieldInformationBarrierSegmentByIdRequestBody(UpdateShieldInformationBarrierSegmentByIdRequestBodyBuilder builder) {
    this.name = builder.name;
    this.description = builder.description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShieldInformationBarrierSegmentByIdRequestBody casted = (UpdateShieldInformationBarrierSegmentByIdRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(description, casted.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, description
    );
  }

  @Override
  public String toString() {
    return "UpdateShieldInformationBarrierSegmentByIdRequestBody{" + "name='" + name + '\'' + ", " + "description='" + description + '\'' + "}";
  }

  public static class UpdateShieldInformationBarrierSegmentByIdRequestBodyBuilder {

    protected String name;

    protected String description;

    public UpdateShieldInformationBarrierSegmentByIdRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public UpdateShieldInformationBarrierSegmentByIdRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public UpdateShieldInformationBarrierSegmentByIdRequestBody build() {
      return new UpdateShieldInformationBarrierSegmentByIdRequestBody(this);
    }

  }

}
