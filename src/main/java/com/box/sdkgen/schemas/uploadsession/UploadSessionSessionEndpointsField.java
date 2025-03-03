package com.box.sdkgen.schemas.uploadsession;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UploadSessionSessionEndpointsField extends SerializableObject {

  @JsonProperty("upload_part")
  protected String uploadPart;

  protected String commit;

  protected String abort;

  @JsonProperty("list_parts")
  protected String listParts;

  protected String status;

  @JsonProperty("log_event")
  protected String logEvent;

  public UploadSessionSessionEndpointsField() {
    super();
  }

  protected UploadSessionSessionEndpointsField(UploadSessionSessionEndpointsFieldBuilder builder) {
    super();
    this.uploadPart = builder.uploadPart;
    this.commit = builder.commit;
    this.abort = builder.abort;
    this.listParts = builder.listParts;
    this.status = builder.status;
    this.logEvent = builder.logEvent;
  }

  public String getUploadPart() {
    return uploadPart;
  }

  public String getCommit() {
    return commit;
  }

  public String getAbort() {
    return abort;
  }

  public String getListParts() {
    return listParts;
  }

  public String getStatus() {
    return status;
  }

  public String getLogEvent() {
    return logEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSessionSessionEndpointsField casted = (UploadSessionSessionEndpointsField) o;
    return Objects.equals(uploadPart, casted.uploadPart)
        && Objects.equals(commit, casted.commit)
        && Objects.equals(abort, casted.abort)
        && Objects.equals(listParts, casted.listParts)
        && Objects.equals(status, casted.status)
        && Objects.equals(logEvent, casted.logEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadPart, commit, abort, listParts, status, logEvent);
  }

  @Override
  public String toString() {
    return "UploadSessionSessionEndpointsField{"
        + "uploadPart='"
        + uploadPart
        + '\''
        + ", "
        + "commit='"
        + commit
        + '\''
        + ", "
        + "abort='"
        + abort
        + '\''
        + ", "
        + "listParts='"
        + listParts
        + '\''
        + ", "
        + "status='"
        + status
        + '\''
        + ", "
        + "logEvent='"
        + logEvent
        + '\''
        + "}";
  }

  public static class UploadSessionSessionEndpointsFieldBuilder {

    protected String uploadPart;

    protected String commit;

    protected String abort;

    protected String listParts;

    protected String status;

    protected String logEvent;

    public UploadSessionSessionEndpointsFieldBuilder uploadPart(String uploadPart) {
      this.uploadPart = uploadPart;
      return this;
    }

    public UploadSessionSessionEndpointsFieldBuilder commit(String commit) {
      this.commit = commit;
      return this;
    }

    public UploadSessionSessionEndpointsFieldBuilder abort(String abort) {
      this.abort = abort;
      return this;
    }

    public UploadSessionSessionEndpointsFieldBuilder listParts(String listParts) {
      this.listParts = listParts;
      return this;
    }

    public UploadSessionSessionEndpointsFieldBuilder status(String status) {
      this.status = status;
      return this;
    }

    public UploadSessionSessionEndpointsFieldBuilder logEvent(String logEvent) {
      this.logEvent = logEvent;
      return this;
    }

    public UploadSessionSessionEndpointsField build() {
      return new UploadSessionSessionEndpointsField(this);
    }
  }
}
