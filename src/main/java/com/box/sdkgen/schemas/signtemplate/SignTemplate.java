package com.box.sdkgen.schemas.signtemplate;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.templatesigner.TemplateSigner;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class SignTemplate extends SerializableObject {

  @JsonDeserialize(using = SignTemplateTypeField.SignTemplateTypeFieldDeserializer.class)
  @JsonSerialize(using = SignTemplateTypeField.SignTemplateTypeFieldSerializer.class)
  protected EnumWrapper<SignTemplateTypeField> type;

  protected String id;

  protected String name;

  @JsonProperty("email_subject")
  protected String emailSubject;

  @JsonProperty("email_message")
  protected String emailMessage;

  @JsonProperty("days_valid")
  protected Long daysValid;

  @JsonProperty("parent_folder")
  protected FolderMini parentFolder;

  @JsonProperty("source_files")
  protected List<FileMini> sourceFiles;

  @JsonProperty("are_fields_locked")
  protected Boolean areFieldsLocked;

  @JsonProperty("are_options_locked")
  protected Boolean areOptionsLocked;

  @JsonProperty("are_recipients_locked")
  protected Boolean areRecipientsLocked;

  @JsonProperty("are_email_settings_locked")
  protected Boolean areEmailSettingsLocked;

  @JsonProperty("are_files_locked")
  protected Boolean areFilesLocked;

  protected List<TemplateSigner> signers;

  @JsonProperty("additional_info")
  protected SignTemplateAdditionalInfoField additionalInfo;

  @JsonProperty("ready_sign_link")
  protected SignTemplateReadySignLinkField readySignLink;

  @JsonProperty("custom_branding")
  protected SignTemplateCustomBrandingField customBranding;

  public SignTemplate() {
    super();
  }

  protected SignTemplate(SignTemplateBuilder builder) {
    super();
    this.type = builder.type;
    this.id = builder.id;
    this.name = builder.name;
    this.emailSubject = builder.emailSubject;
    this.emailMessage = builder.emailMessage;
    this.daysValid = builder.daysValid;
    this.parentFolder = builder.parentFolder;
    this.sourceFiles = builder.sourceFiles;
    this.areFieldsLocked = builder.areFieldsLocked;
    this.areOptionsLocked = builder.areOptionsLocked;
    this.areRecipientsLocked = builder.areRecipientsLocked;
    this.areEmailSettingsLocked = builder.areEmailSettingsLocked;
    this.areFilesLocked = builder.areFilesLocked;
    this.signers = builder.signers;
    this.additionalInfo = builder.additionalInfo;
    this.readySignLink = builder.readySignLink;
    this.customBranding = builder.customBranding;
  }

  public EnumWrapper<SignTemplateTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmailSubject() {
    return emailSubject;
  }

  public String getEmailMessage() {
    return emailMessage;
  }

  public Long getDaysValid() {
    return daysValid;
  }

  public FolderMini getParentFolder() {
    return parentFolder;
  }

  public List<FileMini> getSourceFiles() {
    return sourceFiles;
  }

  public Boolean getAreFieldsLocked() {
    return areFieldsLocked;
  }

  public Boolean getAreOptionsLocked() {
    return areOptionsLocked;
  }

  public Boolean getAreRecipientsLocked() {
    return areRecipientsLocked;
  }

  public Boolean getAreEmailSettingsLocked() {
    return areEmailSettingsLocked;
  }

  public Boolean getAreFilesLocked() {
    return areFilesLocked;
  }

  public List<TemplateSigner> getSigners() {
    return signers;
  }

  public SignTemplateAdditionalInfoField getAdditionalInfo() {
    return additionalInfo;
  }

  public SignTemplateReadySignLinkField getReadySignLink() {
    return readySignLink;
  }

  public SignTemplateCustomBrandingField getCustomBranding() {
    return customBranding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignTemplate casted = (SignTemplate) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(id, casted.id)
        && Objects.equals(name, casted.name)
        && Objects.equals(emailSubject, casted.emailSubject)
        && Objects.equals(emailMessage, casted.emailMessage)
        && Objects.equals(daysValid, casted.daysValid)
        && Objects.equals(parentFolder, casted.parentFolder)
        && Objects.equals(sourceFiles, casted.sourceFiles)
        && Objects.equals(areFieldsLocked, casted.areFieldsLocked)
        && Objects.equals(areOptionsLocked, casted.areOptionsLocked)
        && Objects.equals(areRecipientsLocked, casted.areRecipientsLocked)
        && Objects.equals(areEmailSettingsLocked, casted.areEmailSettingsLocked)
        && Objects.equals(areFilesLocked, casted.areFilesLocked)
        && Objects.equals(signers, casted.signers)
        && Objects.equals(additionalInfo, casted.additionalInfo)
        && Objects.equals(readySignLink, casted.readySignLink)
        && Objects.equals(customBranding, casted.customBranding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type,
        id,
        name,
        emailSubject,
        emailMessage,
        daysValid,
        parentFolder,
        sourceFiles,
        areFieldsLocked,
        areOptionsLocked,
        areRecipientsLocked,
        areEmailSettingsLocked,
        areFilesLocked,
        signers,
        additionalInfo,
        readySignLink,
        customBranding);
  }

  @Override
  public String toString() {
    return "SignTemplate{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "emailSubject='"
        + emailSubject
        + '\''
        + ", "
        + "emailMessage='"
        + emailMessage
        + '\''
        + ", "
        + "daysValid='"
        + daysValid
        + '\''
        + ", "
        + "parentFolder='"
        + parentFolder
        + '\''
        + ", "
        + "sourceFiles='"
        + sourceFiles
        + '\''
        + ", "
        + "areFieldsLocked='"
        + areFieldsLocked
        + '\''
        + ", "
        + "areOptionsLocked='"
        + areOptionsLocked
        + '\''
        + ", "
        + "areRecipientsLocked='"
        + areRecipientsLocked
        + '\''
        + ", "
        + "areEmailSettingsLocked='"
        + areEmailSettingsLocked
        + '\''
        + ", "
        + "areFilesLocked='"
        + areFilesLocked
        + '\''
        + ", "
        + "signers='"
        + signers
        + '\''
        + ", "
        + "additionalInfo='"
        + additionalInfo
        + '\''
        + ", "
        + "readySignLink='"
        + readySignLink
        + '\''
        + ", "
        + "customBranding='"
        + customBranding
        + '\''
        + "}";
  }

  public static class SignTemplateBuilder {

    protected EnumWrapper<SignTemplateTypeField> type;

    protected String id;

    protected String name;

    protected String emailSubject;

    protected String emailMessage;

    protected Long daysValid;

    protected FolderMini parentFolder;

    protected List<FileMini> sourceFiles;

    protected Boolean areFieldsLocked;

    protected Boolean areOptionsLocked;

    protected Boolean areRecipientsLocked;

    protected Boolean areEmailSettingsLocked;

    protected Boolean areFilesLocked;

    protected List<TemplateSigner> signers;

    protected SignTemplateAdditionalInfoField additionalInfo;

    protected SignTemplateReadySignLinkField readySignLink;

    protected SignTemplateCustomBrandingField customBranding;

    public SignTemplateBuilder type(SignTemplateTypeField type) {
      this.type = new EnumWrapper<SignTemplateTypeField>(type);
      return this;
    }

    public SignTemplateBuilder type(EnumWrapper<SignTemplateTypeField> type) {
      this.type = type;
      return this;
    }

    public SignTemplateBuilder id(String id) {
      this.id = id;
      return this;
    }

    public SignTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public SignTemplateBuilder emailSubject(String emailSubject) {
      this.emailSubject = emailSubject;
      return this;
    }

    public SignTemplateBuilder emailMessage(String emailMessage) {
      this.emailMessage = emailMessage;
      return this;
    }

    public SignTemplateBuilder daysValid(Long daysValid) {
      this.daysValid = daysValid;
      return this;
    }

    public SignTemplateBuilder parentFolder(FolderMini parentFolder) {
      this.parentFolder = parentFolder;
      return this;
    }

    public SignTemplateBuilder sourceFiles(List<FileMini> sourceFiles) {
      this.sourceFiles = sourceFiles;
      return this;
    }

    public SignTemplateBuilder areFieldsLocked(Boolean areFieldsLocked) {
      this.areFieldsLocked = areFieldsLocked;
      return this;
    }

    public SignTemplateBuilder areOptionsLocked(Boolean areOptionsLocked) {
      this.areOptionsLocked = areOptionsLocked;
      return this;
    }

    public SignTemplateBuilder areRecipientsLocked(Boolean areRecipientsLocked) {
      this.areRecipientsLocked = areRecipientsLocked;
      return this;
    }

    public SignTemplateBuilder areEmailSettingsLocked(Boolean areEmailSettingsLocked) {
      this.areEmailSettingsLocked = areEmailSettingsLocked;
      return this;
    }

    public SignTemplateBuilder areFilesLocked(Boolean areFilesLocked) {
      this.areFilesLocked = areFilesLocked;
      return this;
    }

    public SignTemplateBuilder signers(List<TemplateSigner> signers) {
      this.signers = signers;
      return this;
    }

    public SignTemplateBuilder additionalInfo(SignTemplateAdditionalInfoField additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }

    public SignTemplateBuilder readySignLink(SignTemplateReadySignLinkField readySignLink) {
      this.readySignLink = readySignLink;
      return this;
    }

    public SignTemplateBuilder customBranding(SignTemplateCustomBrandingField customBranding) {
      this.customBranding = customBranding;
      return this;
    }

    public SignTemplate build() {
      return new SignTemplate(this);
    }
  }
}
