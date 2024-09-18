package com.box.sdkgen.managers.retentionpolicies;

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
import com.box.sdkgen.schemas.retentionpolicies.RetentionPolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.retentionpolicy.RetentionPolicy;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.userbase.UserBase;
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

public class UpdateRetentionPolicyByIdRequestBody {

  @JsonProperty("policy_name")
  protected String policyName;

  protected String description;

  @JsonProperty("disposition_action")
  protected String dispositionAction;

  @JsonProperty("retention_type")
  protected String retentionType;

  @JsonProperty("retention_length")
  protected String retentionLength;

  protected String status;

  @JsonProperty("can_owner_extend_retention")
  protected Boolean canOwnerExtendRetention;

  @JsonProperty("are_owners_notified")
  protected Boolean areOwnersNotified;

  @JsonProperty("custom_notification_recipients")
  protected List<UserBase> customNotificationRecipients;

  public UpdateRetentionPolicyByIdRequestBody() {
  }

  protected UpdateRetentionPolicyByIdRequestBody(UpdateRetentionPolicyByIdRequestBodyBuilder builder) {
    this.policyName = builder.policyName;
    this.description = builder.description;
    this.dispositionAction = builder.dispositionAction;
    this.retentionType = builder.retentionType;
    this.retentionLength = builder.retentionLength;
    this.status = builder.status;
    this.canOwnerExtendRetention = builder.canOwnerExtendRetention;
    this.areOwnersNotified = builder.areOwnersNotified;
    this.customNotificationRecipients = builder.customNotificationRecipients;
  }

  public String getPolicyName() {
    return policyName;
  }

  public String getDescription() {
    return description;
  }

  public String getDispositionAction() {
    return dispositionAction;
  }

  public String getRetentionType() {
    return retentionType;
  }

  public String getRetentionLength() {
    return retentionLength;
  }

  public String getStatus() {
    return status;
  }

  public Boolean getCanOwnerExtendRetention() {
    return canOwnerExtendRetention;
  }

  public Boolean getAreOwnersNotified() {
    return areOwnersNotified;
  }

  public List<UserBase> getCustomNotificationRecipients() {
    return customNotificationRecipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRetentionPolicyByIdRequestBody casted = (UpdateRetentionPolicyByIdRequestBody) o;
    return Objects.equals(policyName, casted.policyName) &&
      Objects.equals(description, casted.description) &&
      Objects.equals(dispositionAction, casted.dispositionAction) &&
      Objects.equals(retentionType, casted.retentionType) &&
      Objects.equals(retentionLength, casted.retentionLength) &&
      Objects.equals(status, casted.status) &&
      Objects.equals(canOwnerExtendRetention, casted.canOwnerExtendRetention) &&
      Objects.equals(areOwnersNotified, casted.areOwnersNotified) &&
      Objects.equals(customNotificationRecipients, casted.customNotificationRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      policyName, description, dispositionAction, retentionType, retentionLength, status, canOwnerExtendRetention, areOwnersNotified, customNotificationRecipients
    );
  }

  @Override
  public String toString() {
    return "UpdateRetentionPolicyByIdRequestBody{" + "policyName='" + policyName + '\'' + ", " + "description='" + description + '\'' + ", " + "dispositionAction='" + dispositionAction + '\'' + ", " + "retentionType='" + retentionType + '\'' + ", " + "retentionLength='" + retentionLength + '\'' + ", " + "status='" + status + '\'' + ", " + "canOwnerExtendRetention='" + canOwnerExtendRetention + '\'' + ", " + "areOwnersNotified='" + areOwnersNotified + '\'' + ", " + "customNotificationRecipients='" + customNotificationRecipients + '\'' + "}";
  }

  public static class UpdateRetentionPolicyByIdRequestBodyBuilder {

    protected String policyName;

    protected String description;

    protected String dispositionAction;

    protected String retentionType;

    protected String retentionLength;

    protected String status;

    protected Boolean canOwnerExtendRetention;

    protected Boolean areOwnersNotified;

    protected List<UserBase> customNotificationRecipients;

    public UpdateRetentionPolicyByIdRequestBodyBuilder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder dispositionAction(String dispositionAction) {
      this.dispositionAction = dispositionAction;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder retentionType(String retentionType) {
      this.retentionType = retentionType;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder retentionLength(String retentionLength) {
      this.retentionLength = retentionLength;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder status(String status) {
      this.status = status;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder canOwnerExtendRetention(Boolean canOwnerExtendRetention) {
      this.canOwnerExtendRetention = canOwnerExtendRetention;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder areOwnersNotified(Boolean areOwnersNotified) {
      this.areOwnersNotified = areOwnersNotified;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBodyBuilder customNotificationRecipients(List<UserBase> customNotificationRecipients) {
      this.customNotificationRecipients = customNotificationRecipients;
      return this;
    }

    public UpdateRetentionPolicyByIdRequestBody build() {
      return new UpdateRetentionPolicyByIdRequestBody(this);
    }

  }

}
