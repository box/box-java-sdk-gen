package com.box.sdkgen.schemas.signrequest;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.signrequestprefilltag.SignRequestPrefillTag;
import com.box.sdkgen.schemas.signrequestbase.SignRequestBase;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.signrequestsigner.SignRequestSigner;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public class SignRequestSignFilesField {

  protected List<FileMini> files;

  @JsonProperty("is_ready_for_download")
  protected Boolean isReadyForDownload;

  public SignRequestSignFilesField() {
  }

  protected SignRequestSignFilesField(SignRequestSignFilesFieldBuilder builder) {
    this.files = builder.files;
    this.isReadyForDownload = builder.isReadyForDownload;
  }

  public List<FileMini> getFiles() {
    return files;
  }

  public Boolean getIsReadyForDownload() {
    return isReadyForDownload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignRequestSignFilesField casted = (SignRequestSignFilesField) o;
    return Objects.equals(files, casted.files) &&
      Objects.equals(isReadyForDownload, casted.isReadyForDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      files, isReadyForDownload
    );
  }

  @Override
  public String toString() {
    return "SignRequestSignFilesField{" + "files='" + files + '\'' + ", " + "isReadyForDownload='" + isReadyForDownload + '\'' + "}";
  }

  public static class SignRequestSignFilesFieldBuilder {

    protected List<FileMini> files;

    protected Boolean isReadyForDownload;

    public SignRequestSignFilesFieldBuilder files(List<FileMini> files) {
      this.files = files;
      return this;
    }

    public SignRequestSignFilesFieldBuilder isReadyForDownload(Boolean isReadyForDownload) {
      this.isReadyForDownload = isReadyForDownload;
      return this;
    }

    public SignRequestSignFilesField build() {
      return new SignRequestSignFilesField(this);
    }

  }

}
