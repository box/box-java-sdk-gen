package com.box.sdkgen.schemas.aisingleagentresponsefull;

import com.box.sdkgen.schemas.aiagentallowedentity.AiAgentAllowedEntity;
import com.box.sdkgen.schemas.aisingleagentresponse.AiSingleAgentResponse;
import com.box.sdkgen.schemas.aisingleagentresponse.AiSingleAgentResponseTypeField;
import com.box.sdkgen.schemas.aistudioagentask.AiStudioAgentAsk;
import com.box.sdkgen.schemas.aistudioagentextract.AiStudioAgentExtract;
import com.box.sdkgen.schemas.aistudioagenttextgen.AiStudioAgentTextGen;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class AiSingleAgentResponseFull extends AiSingleAgentResponse {

  protected AiStudioAgentAsk ask;

  @JsonProperty("text_gen")
  protected AiStudioAgentTextGen textGen;

  protected AiStudioAgentExtract extract;

  public AiSingleAgentResponseFull(
      @JsonProperty("id") String id,
      @JsonProperty("origin") String origin,
      @JsonProperty("name") String name,
      @JsonProperty("access_state") String accessState) {
    super(id, origin, name, accessState);
  }

  protected AiSingleAgentResponseFull(AiSingleAgentResponseFullBuilder builder) {
    super(builder);
    this.ask = builder.ask;
    this.textGen = builder.textGen;
    this.extract = builder.extract;
  }

  public AiStudioAgentAsk getAsk() {
    return ask;
  }

  public AiStudioAgentTextGen getTextGen() {
    return textGen;
  }

  public AiStudioAgentExtract getExtract() {
    return extract;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSingleAgentResponseFull casted = (AiSingleAgentResponseFull) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(origin, casted.origin)
        && Objects.equals(name, casted.name)
        && Objects.equals(accessState, casted.accessState)
        && Objects.equals(createdBy, casted.createdBy)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(modifiedBy, casted.modifiedBy)
        && Objects.equals(modifiedAt, casted.modifiedAt)
        && Objects.equals(iconReference, casted.iconReference)
        && Objects.equals(allowedEntities, casted.allowedEntities)
        && Objects.equals(ask, casted.ask)
        && Objects.equals(textGen, casted.textGen)
        && Objects.equals(extract, casted.extract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        type,
        origin,
        name,
        accessState,
        createdBy,
        createdAt,
        modifiedBy,
        modifiedAt,
        iconReference,
        allowedEntities,
        ask,
        textGen,
        extract);
  }

  @Override
  public String toString() {
    return "AiSingleAgentResponseFull{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "origin='"
        + origin
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "accessState='"
        + accessState
        + '\''
        + ", "
        + "createdBy='"
        + createdBy
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "modifiedBy='"
        + modifiedBy
        + '\''
        + ", "
        + "modifiedAt='"
        + modifiedAt
        + '\''
        + ", "
        + "iconReference='"
        + iconReference
        + '\''
        + ", "
        + "allowedEntities='"
        + allowedEntities
        + '\''
        + ", "
        + "ask='"
        + ask
        + '\''
        + ", "
        + "textGen='"
        + textGen
        + '\''
        + ", "
        + "extract='"
        + extract
        + '\''
        + "}";
  }

  public static class AiSingleAgentResponseFullBuilder extends AiSingleAgentResponseBuilder {

    protected AiStudioAgentAsk ask;

    protected AiStudioAgentTextGen textGen;

    protected AiStudioAgentExtract extract;

    public AiSingleAgentResponseFullBuilder(
        String id, String origin, String name, String accessState) {
      super(id, origin, name, accessState);
    }

    public AiSingleAgentResponseFullBuilder ask(AiStudioAgentAsk ask) {
      this.ask = ask;
      return this;
    }

    public AiSingleAgentResponseFullBuilder textGen(AiStudioAgentTextGen textGen) {
      this.textGen = textGen;
      return this;
    }

    public AiSingleAgentResponseFullBuilder extract(AiStudioAgentExtract extract) {
      this.extract = extract;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder type(AiSingleAgentResponseTypeField type) {
      this.type = new EnumWrapper<AiSingleAgentResponseTypeField>(type);
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder type(EnumWrapper<AiSingleAgentResponseTypeField> type) {
      this.type = type;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder createdBy(UserBase createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder modifiedBy(UserBase modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder modifiedAt(String modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder iconReference(String iconReference) {
      this.iconReference = iconReference;
      return this;
    }

    @Override
    public AiSingleAgentResponseFullBuilder allowedEntities(
        List<AiAgentAllowedEntity> allowedEntities) {
      this.allowedEntities = allowedEntities;
      return this;
    }

    public AiSingleAgentResponseFull build() {
      return new AiSingleAgentResponseFull(this);
    }
  }
}
