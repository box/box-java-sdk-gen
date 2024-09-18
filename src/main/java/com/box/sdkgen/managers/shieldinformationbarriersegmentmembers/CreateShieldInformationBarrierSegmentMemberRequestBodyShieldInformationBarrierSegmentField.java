package com.box.sdkgen.managers.shieldinformationbarriersegmentmembers;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmembers.ShieldInformationBarrierSegmentMembers;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
import com.box.sdkgen.schemas.userbase.UserBase;
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

public class CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField {

  protected String id;

  @JsonDeserialize(using = CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField.CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField.CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeFieldSerializer.class)
  protected EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField> type;

  public CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField() {
  }

  protected CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField(CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField> getType() {
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
    CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField casted = (CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField> type;

    public CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentFieldBuilder type(CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField type) {
      this.type = new EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentTypeField>(type.getValue(), type);
      return this;
    }

    public CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField build() {
      return new CreateShieldInformationBarrierSegmentMemberRequestBodyShieldInformationBarrierSegmentField(this);
    }

  }

}
