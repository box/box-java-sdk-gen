package com.box.sdkgen.schemas.fileorfolderscope;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.fileminiorfoldermini.FileMiniOrFolderMini;

public class FileOrFolderScope {

  @JsonDeserialize(using = FileOrFolderScopeScopeField.FileOrFolderScopeScopeFieldDeserializer.class)
  @JsonSerialize(using = FileOrFolderScopeScopeField.FileOrFolderScopeScopeFieldSerializer.class)
  protected EnumWrapper<FileOrFolderScopeScopeField> scope;

  protected FileMiniOrFolderMini object;

  public FileOrFolderScope() {
  }

  protected FileOrFolderScope(FileOrFolderScopeBuilder builder) {
    this.scope = builder.scope;
    this.object = builder.object;
  }

  public EnumWrapper<FileOrFolderScopeScopeField> getScope() {
    return scope;
  }

  public FileMiniOrFolderMini getObject() {
    return object;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOrFolderScope casted = (FileOrFolderScope) o;
    return Objects.equals(scope, casted.scope) &&
      Objects.equals(object, casted.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      scope, object
    );
  }

  @Override
  public String toString() {
    return "FileOrFolderScope{" + "scope='" + scope + '\'' + ", " + "object='" + object + '\'' + "}";
  }

  public static class FileOrFolderScopeBuilder {

    protected EnumWrapper<FileOrFolderScopeScopeField> scope;

    protected FileMiniOrFolderMini object;

    public FileOrFolderScopeBuilder scope(FileOrFolderScopeScopeField scope) {
      this.scope = new EnumWrapper<FileOrFolderScopeScopeField>(scope.getValue(), scope);
      return this;
    }

    public FileOrFolderScopeBuilder object(FileMiniOrFolderMini object) {
      this.object = object;
      return this;
    }

    public FileOrFolderScope build() {
      return new FileOrFolderScope(this);
    }

  }

}
