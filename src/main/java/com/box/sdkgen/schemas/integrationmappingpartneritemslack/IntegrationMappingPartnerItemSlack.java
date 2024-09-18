package com.box.sdkgen.schemas.integrationmappingpartneritemslack;

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

public class IntegrationMappingPartnerItemSlack {

  @JsonDeserialize(using = IntegrationMappingPartnerItemSlackTypeField.IntegrationMappingPartnerItemSlackTypeFieldDeserializer.class)
  @JsonSerialize(using = IntegrationMappingPartnerItemSlackTypeField.IntegrationMappingPartnerItemSlackTypeFieldSerializer.class)
  protected EnumWrapper<IntegrationMappingPartnerItemSlackTypeField> type;

  protected final String id;

  @JsonProperty("slack_workspace_id")
  protected String slackWorkspaceId;

  @JsonProperty("slack_org_id")
  protected String slackOrgId;

  public IntegrationMappingPartnerItemSlack(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<IntegrationMappingPartnerItemSlackTypeField>(IntegrationMappingPartnerItemSlackTypeField.CHANNEL.getValue(), IntegrationMappingPartnerItemSlackTypeField.CHANNEL);
  }

  protected IntegrationMappingPartnerItemSlack(IntegrationMappingPartnerItemSlackBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
    this.slackWorkspaceId = builder.slackWorkspaceId;
    this.slackOrgId = builder.slackOrgId;
  }

  public EnumWrapper<IntegrationMappingPartnerItemSlackTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public String getSlackWorkspaceId() {
    return slackWorkspaceId;
  }

  public String getSlackOrgId() {
    return slackOrgId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMappingPartnerItemSlack casted = (IntegrationMappingPartnerItemSlack) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id) &&
      Objects.equals(slackWorkspaceId, casted.slackWorkspaceId) &&
      Objects.equals(slackOrgId, casted.slackOrgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id, slackWorkspaceId, slackOrgId
    );
  }

  @Override
  public String toString() {
    return "IntegrationMappingPartnerItemSlack{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + ", " + "slackWorkspaceId='" + slackWorkspaceId + '\'' + ", " + "slackOrgId='" + slackOrgId + '\'' + "}";
  }

  public static class IntegrationMappingPartnerItemSlackBuilder {

    protected EnumWrapper<IntegrationMappingPartnerItemSlackTypeField> type;

    protected final String id;

    protected String slackWorkspaceId;

    protected String slackOrgId;

    public IntegrationMappingPartnerItemSlackBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<IntegrationMappingPartnerItemSlackTypeField>(IntegrationMappingPartnerItemSlackTypeField.CHANNEL.getValue(), IntegrationMappingPartnerItemSlackTypeField.CHANNEL);
    }

    public IntegrationMappingPartnerItemSlackBuilder type(IntegrationMappingPartnerItemSlackTypeField type) {
      this.type = new EnumWrapper<IntegrationMappingPartnerItemSlackTypeField>(type.getValue(), type);
      return this;
    }

    public IntegrationMappingPartnerItemSlackBuilder slackWorkspaceId(String slackWorkspaceId) {
      this.slackWorkspaceId = slackWorkspaceId;
      return this;
    }

    public IntegrationMappingPartnerItemSlackBuilder slackOrgId(String slackOrgId) {
      this.slackOrgId = slackOrgId;
      return this;
    }

    public IntegrationMappingPartnerItemSlack build() {
      return new IntegrationMappingPartnerItemSlack(this);
    }

  }

}
