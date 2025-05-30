package com.box.sdkgen.managers.legalholdpolicies;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.internal.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.Objects;

public class CreateLegalHoldPolicyRequestBody extends SerializableObject {

  @JsonProperty("policy_name")
  protected final String policyName;

  protected String description;

  @JsonProperty("filter_started_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date filterStartedAt;

  @JsonProperty("filter_ended_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date filterEndedAt;

  @JsonProperty("is_ongoing")
  protected Boolean isOngoing;

  public CreateLegalHoldPolicyRequestBody(@JsonProperty("policy_name") String policyName) {
    super();
    this.policyName = policyName;
  }

  protected CreateLegalHoldPolicyRequestBody(CreateLegalHoldPolicyRequestBodyBuilder builder) {
    super();
    this.policyName = builder.policyName;
    this.description = builder.description;
    this.filterStartedAt = builder.filterStartedAt;
    this.filterEndedAt = builder.filterEndedAt;
    this.isOngoing = builder.isOngoing;
  }

  public String getPolicyName() {
    return policyName;
  }

  public String getDescription() {
    return description;
  }

  public Date getFilterStartedAt() {
    return filterStartedAt;
  }

  public Date getFilterEndedAt() {
    return filterEndedAt;
  }

  public Boolean getIsOngoing() {
    return isOngoing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLegalHoldPolicyRequestBody casted = (CreateLegalHoldPolicyRequestBody) o;
    return Objects.equals(policyName, casted.policyName)
        && Objects.equals(description, casted.description)
        && Objects.equals(filterStartedAt, casted.filterStartedAt)
        && Objects.equals(filterEndedAt, casted.filterEndedAt)
        && Objects.equals(isOngoing, casted.isOngoing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, description, filterStartedAt, filterEndedAt, isOngoing);
  }

  @Override
  public String toString() {
    return "CreateLegalHoldPolicyRequestBody{"
        + "policyName='"
        + policyName
        + '\''
        + ", "
        + "description='"
        + description
        + '\''
        + ", "
        + "filterStartedAt='"
        + filterStartedAt
        + '\''
        + ", "
        + "filterEndedAt='"
        + filterEndedAt
        + '\''
        + ", "
        + "isOngoing='"
        + isOngoing
        + '\''
        + "}";
  }

  public static class CreateLegalHoldPolicyRequestBodyBuilder {

    protected final String policyName;

    protected String description;

    protected Date filterStartedAt;

    protected Date filterEndedAt;

    protected Boolean isOngoing;

    public CreateLegalHoldPolicyRequestBodyBuilder(String policyName) {
      this.policyName = policyName;
    }

    public CreateLegalHoldPolicyRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public CreateLegalHoldPolicyRequestBodyBuilder filterStartedAt(Date filterStartedAt) {
      this.filterStartedAt = filterStartedAt;
      return this;
    }

    public CreateLegalHoldPolicyRequestBodyBuilder filterEndedAt(Date filterEndedAt) {
      this.filterEndedAt = filterEndedAt;
      return this;
    }

    public CreateLegalHoldPolicyRequestBodyBuilder isOngoing(Boolean isOngoing) {
      this.isOngoing = isOngoing;
      return this;
    }

    public CreateLegalHoldPolicyRequestBody build() {
      return new CreateLegalHoldPolicyRequestBody(this);
    }
  }
}
