package com.box.sdkgen.schemas.filefull;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Map;
import com.box.sdkgen.schemas.filebase.FileBaseTypeField;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.file.FilePathCollectionField;
import com.box.sdkgen.schemas.file.FileSharedLinkField;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.file.FileItemStatusField;
import com.box.sdkgen.schemas.file.File;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.fileorfolderscope.FileOrFolderScope;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;

public class FileFullExpiringEmbedLinkField {

  @JsonProperty("access_token")
  protected String accessToken;

  @JsonProperty("expires_in")
  protected Long expiresIn;

  @JsonDeserialize(using = FileFullExpiringEmbedLinkTokenTypeField.FileFullExpiringEmbedLinkTokenTypeFieldDeserializer.class)
  @JsonSerialize(using = FileFullExpiringEmbedLinkTokenTypeField.FileFullExpiringEmbedLinkTokenTypeFieldSerializer.class)
  @JsonProperty("token_type")
  protected EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField> tokenType;

  @JsonProperty("restricted_to")
  protected List<FileOrFolderScope> restrictedTo;

  protected String url;

  public FileFullExpiringEmbedLinkField() {
  }

  protected FileFullExpiringEmbedLinkField(FileFullExpiringEmbedLinkFieldBuilder builder) {
    this.accessToken = builder.accessToken;
    this.expiresIn = builder.expiresIn;
    this.tokenType = builder.tokenType;
    this.restrictedTo = builder.restrictedTo;
    this.url = builder.url;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public Long getExpiresIn() {
    return expiresIn;
  }

  public EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField> getTokenType() {
    return tokenType;
  }

  public List<FileOrFolderScope> getRestrictedTo() {
    return restrictedTo;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullExpiringEmbedLinkField casted = (FileFullExpiringEmbedLinkField) o;
    return Objects.equals(accessToken, casted.accessToken) &&
      Objects.equals(expiresIn, casted.expiresIn) &&
      Objects.equals(tokenType, casted.tokenType) &&
      Objects.equals(restrictedTo, casted.restrictedTo) &&
      Objects.equals(url, casted.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      accessToken, expiresIn, tokenType, restrictedTo, url
    );
  }

  @Override
  public String toString() {
    return "FileFullExpiringEmbedLinkField{" + "accessToken='" + accessToken + '\'' + ", " + "expiresIn='" + expiresIn + '\'' + ", " + "tokenType='" + tokenType + '\'' + ", " + "restrictedTo='" + restrictedTo + '\'' + ", " + "url='" + url + '\'' + "}";
  }

  public static class FileFullExpiringEmbedLinkFieldBuilder {

    protected String accessToken;

    protected Long expiresIn;

    protected EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField> tokenType;

    protected List<FileOrFolderScope> restrictedTo;

    protected String url;

    public FileFullExpiringEmbedLinkFieldBuilder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    public FileFullExpiringEmbedLinkFieldBuilder expiresIn(Long expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }

    public FileFullExpiringEmbedLinkFieldBuilder tokenType(FileFullExpiringEmbedLinkTokenTypeField tokenType) {
      this.tokenType = new EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField>(tokenType.getValue(), tokenType);
      return this;
    }

    public FileFullExpiringEmbedLinkFieldBuilder restrictedTo(List<FileOrFolderScope> restrictedTo) {
      this.restrictedTo = restrictedTo;
      return this;
    }

    public FileFullExpiringEmbedLinkFieldBuilder url(String url) {
      this.url = url;
      return this;
    }

    public FileFullExpiringEmbedLinkField build() {
      return new FileFullExpiringEmbedLinkField(this);
    }

  }

}
