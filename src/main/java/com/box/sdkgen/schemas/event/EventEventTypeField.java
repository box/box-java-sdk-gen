package com.box.sdkgen.schemas.event;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum EventEventTypeField implements Valuable {
  ACCESS_GRANTED("ACCESS_GRANTED"),
  ACCESS_REVOKED("ACCESS_REVOKED"),
  ADD_DEVICE_ASSOCIATION("ADD_DEVICE_ASSOCIATION"),
  ADD_LOGIN_ACTIVITY_DEVICE("ADD_LOGIN_ACTIVITY_DEVICE"),
  ADMIN_LOGIN("ADMIN_LOGIN"),
  APPLICATION_CREATED("APPLICATION_CREATED"),
  APPLICATION_PUBLIC_KEY_ADDED("APPLICATION_PUBLIC_KEY_ADDED"),
  APPLICATION_PUBLIC_KEY_DELETED("APPLICATION_PUBLIC_KEY_DELETED"),
  CHANGE_ADMIN_ROLE("CHANGE_ADMIN_ROLE"),
  CHANGE_FOLDER_PERMISSION("CHANGE_FOLDER_PERMISSION"),
  COLLABORATION_ACCEPT("COLLABORATION_ACCEPT"),
  COLLABORATION_EXPIRATION("COLLABORATION_EXPIRATION"),
  COLLABORATION_INVITE("COLLABORATION_INVITE"),
  COLLABORATION_REMOVE("COLLABORATION_REMOVE"),
  COLLABORATION_ROLE_CHANGE("COLLABORATION_ROLE_CHANGE"),
  COLLAB_ADD_COLLABORATOR("COLLAB_ADD_COLLABORATOR"),
  COLLAB_INVITE_COLLABORATOR("COLLAB_INVITE_COLLABORATOR"),
  COLLAB_REMOVE_COLLABORATOR("COLLAB_REMOVE_COLLABORATOR"),
  COLLAB_ROLE_CHANGE("COLLAB_ROLE_CHANGE"),
  COMMENT_CREATE("COMMENT_CREATE"),
  COMMENT_DELETE("COMMENT_DELETE"),
  CONTENT_ACCESS("CONTENT_ACCESS"),
  CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY("CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY"),
  CONTENT_WORKFLOW_AUTOMATION_ADD("CONTENT_WORKFLOW_AUTOMATION_ADD"),
  CONTENT_WORKFLOW_AUTOMATION_DELETE("CONTENT_WORKFLOW_AUTOMATION_DELETE"),
  CONTENT_WORKFLOW_POLICY_ADD("CONTENT_WORKFLOW_POLICY_ADD"),
  CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION("CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION"),
  CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION("CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION"),
  COPY("COPY"),
  DATA_RETENTION_CREATE_RETENTION("DATA_RETENTION_CREATE_RETENTION"),
  DATA_RETENTION_REMOVE_RETENTION("DATA_RETENTION_REMOVE_RETENTION"),
  DELETE("DELETE"),
  DELETE_USER("DELETE_USER"),
  DEVICE_TRUST_CHECK_FAILED("DEVICE_TRUST_CHECK_FAILED"),
  DOWNLOAD("DOWNLOAD"),
  EDIT("EDIT"),
  EDIT_USER("EDIT_USER"),
  EDR_CROWDSTRIKE_DEVICE_DETECTED("EDR_CROWDSTRIKE_DEVICE_DETECTED"),
  EDR_CROWDSTRIKE_NO_BOX_TOOLS("EDR_CROWDSTRIKE_NO_BOX_TOOLS"),
  EDR_CROWDSTRIKE_BOX_TOOLS_OUTDATED("EDR_CROWDSTRIKE_BOX_TOOLS_OUTDATED"),
  EDR_CROWDSTRIKE_DRIVE_OUTDATED("EDR_CROWDSTRIKE_DRIVE_OUTDATED"),
  EDR_CROWDSTRIKE_ACCESS_ALLOWED_NO_CROWDSTRIKE_DEVICE(
      "EDR_CROWDSTRIKE_ACCESS_ALLOWED_NO_CROWDSTRIKE_DEVICE"),
  EDR_CROWDSTRIKE_ACCESS_REVOKED("EDR_CROWDSTRIKE_ACCESS_REVOKED"),
  EMAIL_ALIAS_CONFIRM("EMAIL_ALIAS_CONFIRM"),
  EMAIL_ALIAS_REMOVE("EMAIL_ALIAS_REMOVE"),
  ENABLE_TWO_FACTOR_AUTH("ENABLE_TWO_FACTOR_AUTH"),
  ENTERPRISE_APP_AUTHORIZATION_UPDATE("ENTERPRISE_APP_AUTHORIZATION_UPDATE"),
  FAILED_LOGIN("FAILED_LOGIN"),
  FILE_MARKED_MALICIOUS("FILE_MARKED_MALICIOUS"),
  FILE_WATERMARKED_DOWNLOAD("FILE_WATERMARKED_DOWNLOAD"),
  GROUP_ADD_ITEM("GROUP_ADD_ITEM"),
  GROUP_ADD_USER("GROUP_ADD_USER"),
  GROUP_CREATION("GROUP_CREATION"),
  GROUP_DELETION("GROUP_DELETION"),
  GROUP_EDITED("GROUP_EDITED"),
  GROUP_REMOVE_ITEM("GROUP_REMOVE_ITEM"),
  GROUP_REMOVE_USER("GROUP_REMOVE_USER"),
  ITEM_COPY("ITEM_COPY"),
  ITEM_CREATE("ITEM_CREATE"),
  ITEM_DOWNLOAD("ITEM_DOWNLOAD"),
  ITEM_EMAIL_SEND("ITEM_EMAIL_SEND"),
  ITEM_MAKE_CURRENT_VERSION("ITEM_MAKE_CURRENT_VERSION"),
  ITEM_MODIFY("ITEM_MODIFY"),
  ITEM_MOVE("ITEM_MOVE"),
  ITEM_OPEN("ITEM_OPEN"),
  ITEM_PREVIEW("ITEM_PREVIEW"),
  ITEM_RENAME("ITEM_RENAME"),
  ITEM_SHARED("ITEM_SHARED"),
  ITEM_SHARED_CREATE("ITEM_SHARED_CREATE"),
  ITEM_SHARED_UNSHARE("ITEM_SHARED_UNSHARE"),
  ITEM_SHARED_UPDATE("ITEM_SHARED_UPDATE"),
  ITEM_SYNC("ITEM_SYNC"),
  ITEM_TRASH("ITEM_TRASH"),
  ITEM_UNDELETE_VIA_TRASH("ITEM_UNDELETE_VIA_TRASH"),
  ITEM_UNSYNC("ITEM_UNSYNC"),
  ITEM_UPLOAD("ITEM_UPLOAD"),
  LEGAL_HOLD_ASSIGNMENT_CREATE("LEGAL_HOLD_ASSIGNMENT_CREATE"),
  LEGAL_HOLD_ASSIGNMENT_DELETE("LEGAL_HOLD_ASSIGNMENT_DELETE"),
  LEGAL_HOLD_POLICY_CREATE("LEGAL_HOLD_POLICY_CREATE"),
  LEGAL_HOLD_POLICY_DELETE("LEGAL_HOLD_POLICY_DELETE"),
  LEGAL_HOLD_POLICY_UPDATE("LEGAL_HOLD_POLICY_UPDATE"),
  LOCK("LOCK"),
  LOCK_CREATE("LOCK_CREATE"),
  LOCK_DESTROY("LOCK_DESTROY"),
  LOGIN("LOGIN"),
  MASTER_INVITE_ACCEPT("MASTER_INVITE_ACCEPT"),
  MASTER_INVITE_REJECT("MASTER_INVITE_REJECT"),
  METADATA_INSTANCE_CREATE("METADATA_INSTANCE_CREATE"),
  METADATA_INSTANCE_DELETE("METADATA_INSTANCE_DELETE"),
  METADATA_INSTANCE_UPDATE("METADATA_INSTANCE_UPDATE"),
  METADATA_TEMPLATE_CREATE("METADATA_TEMPLATE_CREATE"),
  METADATA_TEMPLATE_DELETE("METADATA_TEMPLATE_DELETE"),
  METADATA_TEMPLATE_UPDATE("METADATA_TEMPLATE_UPDATE"),
  MOVE("MOVE"),
  NEW_USER("NEW_USER"),
  PREVIEW("PREVIEW"),
  REMOVE_DEVICE_ASSOCIATION("REMOVE_DEVICE_ASSOCIATION"),
  REMOVE_LOGIN_ACTIVITY_DEVICE("REMOVE_LOGIN_ACTIVITY_DEVICE"),
  RENAME("RENAME"),
  RETENTION_POLICY_ASSIGNMENT_ADD("RETENTION_POLICY_ASSIGNMENT_ADD"),
  SHARE("SHARE"),
  SHARED_LINK_SEND("SHARED_LINK_SEND"),
  SHARE_EXPIRATION("SHARE_EXPIRATION"),
  SHIELD_ALERT("SHIELD_ALERT"),
  SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED("SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED"),
  SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION(
      "SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION"),
  SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED("SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED"),
  SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION(
      "SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION"),
  SHIELD_JUSTIFICATION_APPROVAL("SHIELD_JUSTIFICATION_APPROVAL"),
  SHIELD_SHARED_LINK_ACCESS_BLOCKED("SHIELD_SHARED_LINK_ACCESS_BLOCKED"),
  SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_CREATE("SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_CREATE"),
  SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_UPDATE("SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_UPDATE"),
  SIGN_DOCUMENT_ASSIGNED("SIGN_DOCUMENT_ASSIGNED"),
  SIGN_DOCUMENT_CANCELLED("SIGN_DOCUMENT_CANCELLED"),
  SIGN_DOCUMENT_COMPLETED("SIGN_DOCUMENT_COMPLETED"),
  SIGN_DOCUMENT_CONVERTED("SIGN_DOCUMENT_CONVERTED"),
  SIGN_DOCUMENT_CREATED("SIGN_DOCUMENT_CREATED"),
  SIGN_DOCUMENT_DECLINED("SIGN_DOCUMENT_DECLINED"),
  SIGN_DOCUMENT_EXPIRED("SIGN_DOCUMENT_EXPIRED"),
  SIGN_DOCUMENT_SIGNED("SIGN_DOCUMENT_SIGNED"),
  SIGN_DOCUMENT_VIEWED_BY_SIGNED("SIGN_DOCUMENT_VIEWED_BY_SIGNED"),
  SIGNER_DOWNLOADED("SIGNER_DOWNLOADED"),
  SIGNER_FORWARDED("SIGNER_FORWARDED"),
  STORAGE_EXPIRATION("STORAGE_EXPIRATION"),
  TAG_ITEM_CREATE("TAG_ITEM_CREATE"),
  TASK_ASSIGNMENT_CREATE("TASK_ASSIGNMENT_CREATE"),
  TASK_ASSIGNMENT_DELETE("TASK_ASSIGNMENT_DELETE"),
  TASK_ASSIGNMENT_UPDATE("TASK_ASSIGNMENT_UPDATE"),
  TASK_CREATE("TASK_CREATE"),
  TASK_UPDATE("TASK_UPDATE"),
  TERMS_OF_SERVICE_ACCEPT("TERMS_OF_SERVICE_ACCEPT"),
  TERMS_OF_SERVICE_REJECT("TERMS_OF_SERVICE_REJECT"),
  UNDELETE("UNDELETE"),
  UNLOCK("UNLOCK"),
  UNSHARE("UNSHARE"),
  UPDATE_COLLABORATION_EXPIRATION("UPDATE_COLLABORATION_EXPIRATION"),
  UPDATE_SHARE_EXPIRATION("UPDATE_SHARE_EXPIRATION"),
  UPLOAD("UPLOAD"),
  USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE("USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE"),
  WATERMARK_LABEL_CREATE("WATERMARK_LABEL_CREATE"),
  WATERMARK_LABEL_DELETE("WATERMARK_LABEL_DELETE");

  private final String value;

  EventEventTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class EventEventTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<EventEventTypeField>> {

    public EventEventTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<EventEventTypeField> deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(EventEventTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(EnumWrapper::new)
          .orElse(new EnumWrapper<EventEventTypeField>(value));
    }
  }

  public static class EventEventTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<EventEventTypeField>> {

    public EventEventTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<EventEventTypeField> value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
