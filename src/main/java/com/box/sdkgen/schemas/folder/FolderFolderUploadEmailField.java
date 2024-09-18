package com.box.sdkgen.schemas.folder;

import java.util.List;
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
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.folderbase.FolderBase;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.items.Items;

public class FolderFolderUploadEmailField {

  @JsonDeserialize(using = FolderFolderUploadEmailAccessField.FolderFolderUploadEmailAccessFieldDeserializer.class)
  @JsonSerialize(using = FolderFolderUploadEmailAccessField.FolderFolderUploadEmailAccessFieldSerializer.class)
  protected EnumWrapper<FolderFolderUploadEmailAccessField> access;

  protected String email;

  public FolderFolderUploadEmailField() {
  }

  protected FolderFolderUploadEmailField(FolderFolderUploadEmailFieldBuilder builder) {
    this.access = builder.access;
    this.email = builder.email;
  }

  public EnumWrapper<FolderFolderUploadEmailAccessField> getAccess() {
    return access;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFolderUploadEmailField casted = (FolderFolderUploadEmailField) o;
    return Objects.equals(access, casted.access) &&
      Objects.equals(email, casted.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access, email
    );
  }

  @Override
  public String toString() {
    return "FolderFolderUploadEmailField{" + "access='" + access + '\'' + ", " + "email='" + email + '\'' + "}";
  }

  public static class FolderFolderUploadEmailFieldBuilder {

    protected EnumWrapper<FolderFolderUploadEmailAccessField> access;

    protected String email;

    public FolderFolderUploadEmailFieldBuilder access(FolderFolderUploadEmailAccessField access) {
      this.access = new EnumWrapper<FolderFolderUploadEmailAccessField>(access.getValue(), access);
      return this;
    }

    public FolderFolderUploadEmailFieldBuilder email(String email) {
      this.email = email;
      return this;
    }

    public FolderFolderUploadEmailField build() {
      return new FolderFolderUploadEmailField(this);
    }

  }

}
