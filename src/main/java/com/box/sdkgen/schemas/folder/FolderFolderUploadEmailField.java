package com.box.sdkgen.schemas.folder;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class FolderFolderUploadEmailField {

  @JsonDeserialize(
      using =
          FolderFolderUploadEmailAccessField.FolderFolderUploadEmailAccessFieldDeserializer.class)
  @JsonSerialize(
      using = FolderFolderUploadEmailAccessField.FolderFolderUploadEmailAccessFieldSerializer.class)
  protected EnumWrapper<FolderFolderUploadEmailAccessField> access;

  protected String email;

  public FolderFolderUploadEmailField() {}

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
    return Objects.equals(access, casted.access) && Objects.equals(email, casted.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, email);
  }

  @Override
  public String toString() {
    return "FolderFolderUploadEmailField{"
        + "access='"
        + access
        + '\''
        + ", "
        + "email='"
        + email
        + '\''
        + "}";
  }

  public static class FolderFolderUploadEmailFieldBuilder {

    protected EnumWrapper<FolderFolderUploadEmailAccessField> access;

    protected String email;

    public FolderFolderUploadEmailFieldBuilder access(
        EnumWrapper<FolderFolderUploadEmailAccessField> access) {
      this.access = access;
      return this;
    }

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
