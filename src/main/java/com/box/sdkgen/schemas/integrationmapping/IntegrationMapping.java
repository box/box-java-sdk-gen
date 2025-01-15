package com.box.sdkgen.schemas.integrationmapping;

import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.integrationmappingbase.IntegrationMappingBase;
import com.box.sdkgen.schemas.integrationmappingbase.IntegrationMappingBaseTypeField;
import com.box.sdkgen.schemas.integrationmappingpartneritemslackunion.IntegrationMappingPartnerItemSlackUnion;
import com.box.sdkgen.schemas.integrationmappingslackoptions.IntegrationMappingSlackOptions;
import com.box.sdkgen.schemas.userintegrationmappings.UserIntegrationMappings;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class IntegrationMapping extends IntegrationMappingBase {

  @JsonProperty("box_item")
  protected final FolderMini boxItem;

  @JsonProperty("created_at")
  protected String createdAt;

  @JsonProperty("modified_at")
  protected String modifiedAt;

  @JsonDeserialize(
      using =
          IntegrationMappingIntegrationTypeField.IntegrationMappingIntegrationTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          IntegrationMappingIntegrationTypeField.IntegrationMappingIntegrationTypeFieldSerializer
              .class)
  @JsonProperty("integration_type")
  protected EnumWrapper<IntegrationMappingIntegrationTypeField> integrationType;

  @JsonProperty("is_manually_created")
  protected Boolean isManuallyCreated;

  protected IntegrationMappingSlackOptions options;

  @JsonProperty("created_by")
  protected UserIntegrationMappings createdBy;

  @JsonProperty("modified_by")
  protected UserIntegrationMappings modifiedBy;

  @JsonProperty("partner_item")
  protected final IntegrationMappingPartnerItemSlackUnion partnerItem;

  public IntegrationMapping(
      @JsonProperty("id") String id,
      @JsonProperty("box_item") FolderMini boxItem,
      @JsonProperty("partner_item") IntegrationMappingPartnerItemSlackUnion partnerItem) {
    super(id);
    this.boxItem = boxItem;
    this.partnerItem = partnerItem;
  }

  protected IntegrationMapping(IntegrationMappingBuilder builder) {
    super(builder);
    this.boxItem = builder.boxItem;
    this.createdAt = builder.createdAt;
    this.modifiedAt = builder.modifiedAt;
    this.integrationType = builder.integrationType;
    this.isManuallyCreated = builder.isManuallyCreated;
    this.options = builder.options;
    this.createdBy = builder.createdBy;
    this.modifiedBy = builder.modifiedBy;
    this.partnerItem = builder.partnerItem;
  }

  public FolderMini getBoxItem() {
    return boxItem;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getModifiedAt() {
    return modifiedAt;
  }

  public EnumWrapper<IntegrationMappingIntegrationTypeField> getIntegrationType() {
    return integrationType;
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

  public IntegrationMappingPartnerItemSlackUnion getPartnerItem() {
    return partnerItem;
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
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(boxItem, casted.boxItem)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(modifiedAt, casted.modifiedAt)
        && Objects.equals(integrationType, casted.integrationType)
        && Objects.equals(isManuallyCreated, casted.isManuallyCreated)
        && Objects.equals(options, casted.options)
        && Objects.equals(createdBy, casted.createdBy)
        && Objects.equals(modifiedBy, casted.modifiedBy)
        && Objects.equals(partnerItem, casted.partnerItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        type,
        boxItem,
        createdAt,
        modifiedAt,
        integrationType,
        isManuallyCreated,
        options,
        createdBy,
        modifiedBy,
        partnerItem);
  }

  @Override
  public String toString() {
    return "IntegrationMapping{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "boxItem='"
        + boxItem
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "modifiedAt='"
        + modifiedAt
        + '\''
        + ", "
        + "integrationType='"
        + integrationType
        + '\''
        + ", "
        + "isManuallyCreated='"
        + isManuallyCreated
        + '\''
        + ", "
        + "options='"
        + options
        + '\''
        + ", "
        + "createdBy='"
        + createdBy
        + '\''
        + ", "
        + "modifiedBy='"
        + modifiedBy
        + '\''
        + ", "
        + "partnerItem='"
        + partnerItem
        + '\''
        + "}";
  }

  public static class IntegrationMappingBuilder extends IntegrationMappingBaseBuilder {

    protected final FolderMini boxItem;

    protected String createdAt;

    protected String modifiedAt;

    protected EnumWrapper<IntegrationMappingIntegrationTypeField> integrationType;

    protected Boolean isManuallyCreated;

    protected IntegrationMappingSlackOptions options;

    protected UserIntegrationMappings createdBy;

    protected UserIntegrationMappings modifiedBy;

    protected final IntegrationMappingPartnerItemSlackUnion partnerItem;

    public IntegrationMappingBuilder(
        String id, FolderMini boxItem, IntegrationMappingPartnerItemSlackUnion partnerItem) {
      super(id);
      this.boxItem = boxItem;
      this.partnerItem = partnerItem;
    }

    public IntegrationMappingBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public IntegrationMappingBuilder modifiedAt(String modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    public IntegrationMappingBuilder integrationType(
        EnumWrapper<IntegrationMappingIntegrationTypeField> integrationType) {
      this.integrationType = integrationType;
      return this;
    }

    public IntegrationMappingBuilder integrationType(
        IntegrationMappingIntegrationTypeField integrationType) {
      this.integrationType =
          new EnumWrapper<IntegrationMappingIntegrationTypeField>(
              integrationType.getValue(), integrationType);
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

    @Override
    public IntegrationMappingBuilder type(EnumWrapper<IntegrationMappingBaseTypeField> type) {
      this.type = type;
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
