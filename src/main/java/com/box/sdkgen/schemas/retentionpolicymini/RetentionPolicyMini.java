package com.box.sdkgen.schemas.retentionpolicymini;

import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBase;
import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBaseTypeField;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class RetentionPolicyMini extends RetentionPolicyBase {

  @JsonProperty("policy_name")
  protected String policyName;

  @JsonProperty("retention_length")
  protected String retentionLength;

  @JsonDeserialize(
      using =
          RetentionPolicyMiniDispositionActionField
              .RetentionPolicyMiniDispositionActionFieldDeserializer.class)
  @JsonSerialize(
      using =
          RetentionPolicyMiniDispositionActionField
              .RetentionPolicyMiniDispositionActionFieldSerializer.class)
  @JsonProperty("disposition_action")
  protected EnumWrapper<RetentionPolicyMiniDispositionActionField> dispositionAction;

  public RetentionPolicyMini(@JsonProperty("id") String id) {
    super(id);
  }

  protected RetentionPolicyMini(RetentionPolicyMiniBuilder builder) {
    super(builder);
    this.policyName = builder.policyName;
    this.retentionLength = builder.retentionLength;
    this.dispositionAction = builder.dispositionAction;
  }

  public String getPolicyName() {
    return policyName;
  }

  public String getRetentionLength() {
    return retentionLength;
  }

  public EnumWrapper<RetentionPolicyMiniDispositionActionField> getDispositionAction() {
    return dispositionAction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPolicyMini casted = (RetentionPolicyMini) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(policyName, casted.policyName)
        && Objects.equals(retentionLength, casted.retentionLength)
        && Objects.equals(dispositionAction, casted.dispositionAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, policyName, retentionLength, dispositionAction);
  }

  @Override
  public String toString() {
    return "RetentionPolicyMini{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "policyName='"
        + policyName
        + '\''
        + ", "
        + "retentionLength='"
        + retentionLength
        + '\''
        + ", "
        + "dispositionAction='"
        + dispositionAction
        + '\''
        + "}";
  }

  public static class RetentionPolicyMiniBuilder extends RetentionPolicyBaseBuilder {

    protected String policyName;

    protected String retentionLength;

    protected EnumWrapper<RetentionPolicyMiniDispositionActionField> dispositionAction;

    public RetentionPolicyMiniBuilder(String id) {
      super(id);
    }

    public RetentionPolicyMiniBuilder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    public RetentionPolicyMiniBuilder retentionLength(String retentionLength) {
      this.retentionLength = retentionLength;
      return this;
    }

    public RetentionPolicyMiniBuilder dispositionAction(
        RetentionPolicyMiniDispositionActionField dispositionAction) {
      this.dispositionAction =
          new EnumWrapper<RetentionPolicyMiniDispositionActionField>(dispositionAction);
      return this;
    }

    public RetentionPolicyMiniBuilder dispositionAction(
        EnumWrapper<RetentionPolicyMiniDispositionActionField> dispositionAction) {
      this.dispositionAction = dispositionAction;
      return this;
    }

    @Override
    public RetentionPolicyMiniBuilder type(RetentionPolicyBaseTypeField type) {
      this.type = new EnumWrapper<RetentionPolicyBaseTypeField>(type);
      return this;
    }

    @Override
    public RetentionPolicyMiniBuilder type(EnumWrapper<RetentionPolicyBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public RetentionPolicyMini build() {
      return new RetentionPolicyMini(this);
    }
  }
}
