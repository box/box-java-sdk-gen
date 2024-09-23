package com.box.sdkgen.managers.folders;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateFolderRequestBodyFolderUploadEmailField {

  @JsonDeserialize(
      using =
          CreateFolderRequestBodyFolderUploadEmailAccessField
              .CreateFolderRequestBodyFolderUploadEmailAccessFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateFolderRequestBodyFolderUploadEmailAccessField
              .CreateFolderRequestBodyFolderUploadEmailAccessFieldSerializer.class)
  protected EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> access;

  public CreateFolderRequestBodyFolderUploadEmailField() {}

  protected CreateFolderRequestBodyFolderUploadEmailField(
      CreateFolderRequestBodyFolderUploadEmailFieldBuilder builder) {
    this.access = builder.access;
  }

  public EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> getAccess() {
    return access;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFolderRequestBodyFolderUploadEmailField casted =
        (CreateFolderRequestBodyFolderUploadEmailField) o;
    return Objects.equals(access, casted.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access);
  }

  @Override
  public String toString() {
    return "CreateFolderRequestBodyFolderUploadEmailField{" + "access='" + access + '\'' + "}";
  }

  public static class CreateFolderRequestBodyFolderUploadEmailFieldBuilder {

    protected EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> access;

    public CreateFolderRequestBodyFolderUploadEmailFieldBuilder access(
        CreateFolderRequestBodyFolderUploadEmailAccessField access) {
      this.access =
          new EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>(
              access.getValue(), access);
      return this;
    }

    public CreateFolderRequestBodyFolderUploadEmailField build() {
      return new CreateFolderRequestBodyFolderUploadEmailField(this);
    }
  }
}
