package com.box.sdkgen.schemas.integrationmapping;

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
import com.box.sdkgen.schemas.integrationmappingbase.IntegrationMappingBaseTypeField;
import com.box.sdkgen.schemas.integrationmappingbase.IntegrationMappingBase;
import com.box.sdkgen.schemas.integrationmappingpartneritemslackunion.IntegrationMappingPartnerItemSlackUnion;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.integrationmappingslackoptions.IntegrationMappingSlackOptions;
import com.box.sdkgen.schemas.userintegrationmappings.UserIntegrationMappings;

public class IntegrationMapping extends IntegrationMappingBase {

  @JsonDeserialize(using = IntegrationMappingIntegrationTypeField.IntegrationMappingIntegrationTypeFieldDeserializer.class)
  @JsonSerialize(using = IntegrationMappingIntegrationTypeField.IntegrationMappingIntegrationTypeFieldSerializer.class)
  @JsonProperty("integration_type")
  protected EnumWrapper<IntegrationMappingIntegrationTypeField> integrationType;

  @JsonProperty("partner_item")
  protected final IntegrationMappingPartnerItemSlackUnion partnerItem;

  @JsonProperty("box_item")
  protected final FolderMini boxItem;

  @JsonProperty("is_manually_created")
  protected Boolean isManuallyCreated;

  protected IntegrationMappingSlackOptions options;

  @JsonProperty("created_by")
  protected UserIntegrationMappings createdBy;

  @JsonProperty("modified_by")
  protected UserIntegrationMappings modifiedBy;

  @JsonProperty("created_at")
  protected String createdAt;

  @JsonProperty("modified_at")
  protected String modifiedAt;

  public IntegrationMapping(@JsonProperty("id") String id, @JsonProperty("partner_item") IntegrationMappingPartnerItemSlackUnion partnerItem, @JsonProperty("box_item") FolderMini boxItem) {
    super(id);
    this.partnerItem = partnerItem;
    this.boxItem = boxItem;
  }

  protected IntegrationMapping(IntegrationMappingBuilder builder) {
    super(builder);
    this.integrationType = builder.integrationType;
    this.partnerItem = builder.partnerItem;
    this.boxItem = builder.boxItem;
    this.isManuallyCreated = builder.isManuallyCreated;
    this.options = builder.options;
    this.createdBy = builder.createdBy;
    this.modifiedBy = builder.modifiedBy;
    this.createdAt = builder.createdAt;
    this.modifiedAt = builder.modifiedAt;
  }

  public EnumWrapper<IntegrationMappingIntegrationTypeField> getIntegrationType() {
    return integrationType;
  }

  public IntegrationMappingPartnerItemSlackUnion getPartnerItem() {
    return partnerItem;
  }

  public FolderMini getBoxItem() {
    return boxItem;
  }

  public Boolean getIsManuallyCreated() {
    return isManuallyCreated;
  }

  public IntegrationMappingSlackOptions getOptions() {
    return options;
  }

  public UserIntegrationMappings getCreatedBy() {
    return createdBy;
  }

  public UserIntegrationMappings getModifiedBy() {
    return modifiedBy;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getModifiedAt() {
    return modifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMapping casted = (IntegrationMapping) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(integrationType, casted.integrationType) &&
      Objects.equals(partnerItem, casted.partnerItem) &&
      Objects.equals(boxItem, casted.boxItem) &&
      Objects.equals(isManuallyCreated, casted.isManuallyCreated) &&
      Objects.equals(options, casted.options) &&
      Objects.equals(createdBy, casted.createdBy) &&
      Objects.equals(modifiedBy, casted.modifiedBy) &&
      Objects.equals(createdAt, casted.createdAt) &&
      Objects.equals(modifiedAt, casted.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, integrationType, partnerItem, boxItem, isManuallyCreated, options, createdBy, modifiedBy, createdAt, modifiedAt
    );
  }

  @Override
  public String toString() {
    return "IntegrationMapping{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "integrationType='" + integrationType + '\'' + ", " + "partnerItem='" + partnerItem + '\'' + ", " + "boxItem='" + boxItem + '\'' + ", " + "isManuallyCreated='" + isManuallyCreated + '\'' + ", " + "options='" + options + '\'' + ", " + "createdBy='" + createdBy + '\'' + ", " + "modifiedBy='" + modifiedBy + '\'' + ", " + "createdAt='" + createdAt + '\'' + ", " + "modifiedAt='" + modifiedAt + '\'' + "}";
  }

  public static class IntegrationMappingBuilder extends IntegrationMappingBaseBuilder {

    protected EnumWrapper<IntegrationMappingIntegrationTypeField> integrationType;

    protected final IntegrationMappingPartnerItemSlackUnion partnerItem;

    protected final FolderMini boxItem;

    protected Boolean isManuallyCreated;

    protected IntegrationMappingSlackOptions options;

    protected UserIntegrationMappings createdBy;

    protected UserIntegrationMappings modifiedBy;

    protected String createdAt;

    protected String modifiedAt;

    public IntegrationMappingBuilder(String id, IntegrationMappingPartnerItemSlackUnion partnerItem, FolderMini boxItem) {
      super(id);
      this.partnerItem = partnerItem;
      this.boxItem = boxItem;
    }

    public IntegrationMappingBuilder integrationType(IntegrationMappingIntegrationTypeField integrationType) {
      this.integrationType = new EnumWrapper<IntegrationMappingIntegrationTypeField>(integrationType.getValue(), integrationType);
      return this;
    }

    public IntegrationMappingBuilder isManuallyCreated(Boolean isManuallyCreated) {
      this.isManuallyCreated = isManuallyCreated;
      return this;
    }

    public IntegrationMappingBuilder options(IntegrationMappingSlackOptions options) {
      this.options = options;
      return this;
    }

    public IntegrationMappingBuilder createdBy(UserIntegrationMappings createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public IntegrationMappingBuilder modifiedBy(UserIntegrationMappings modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    public IntegrationMappingBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public IntegrationMappingBuilder modifiedAt(String modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    @Override
    public IntegrationMappingBuilder type(IntegrationMappingBaseTypeField type) {
      this.type = new EnumWrapper<IntegrationMappingBaseTypeField>(type.getValue(), type);
      return this;
    }

    public IntegrationMapping build() {
      return new IntegrationMapping(this);
    }

  }

}
