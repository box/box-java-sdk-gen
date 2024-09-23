package com.box.sdkgen.schemas.filefull;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class FileFullRepresentationsEntriesStatusField {

  @JsonDeserialize(
      using =
          FileFullRepresentationsEntriesStatusStateField
              .FileFullRepresentationsEntriesStatusStateFieldDeserializer.class)
  @JsonSerialize(
      using =
          FileFullRepresentationsEntriesStatusStateField
              .FileFullRepresentationsEntriesStatusStateFieldSerializer.class)
  protected EnumWrapper<FileFullRepresentationsEntriesStatusStateField> state;

  public FileFullRepresentationsEntriesStatusField() {}

  protected FileFullRepresentationsEntriesStatusField(
      FileFullRepresentationsEntriesStatusFieldBuilder builder) {
    this.state = builder.state;
  }

  public EnumWrapper<FileFullRepresentationsEntriesStatusStateField> getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesStatusField casted =
        (FileFullRepresentationsEntriesStatusField) o;
    return Objects.equals(state, casted.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesStatusField{" + "state='" + state + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesStatusFieldBuilder {

    protected EnumWrapper<FileFullRepresentationsEntriesStatusStateField> state;

    public FileFullRepresentationsEntriesStatusFieldBuilder state(
        FileFullRepresentationsEntriesStatusStateField state) {
      this.state =
          new EnumWrapper<FileFullRepresentationsEntriesStatusStateField>(state.getValue(), state);
      return this;
    }

    public FileFullRepresentationsEntriesStatusField build() {
      return new FileFullRepresentationsEntriesStatusField(this);
    }
  }
}
