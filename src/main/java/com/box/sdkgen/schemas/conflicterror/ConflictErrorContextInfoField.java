package com.box.sdkgen.schemas.conflicterror;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.clienterror.ClientErrorTypeField;
import com.box.sdkgen.schemas.clienterror.ClientErrorCodeField;
import com.box.sdkgen.schemas.clienterror.ClientErrorContextInfoField;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileconflict.FileConflict;

public class ConflictErrorContextInfoField {

  protected List<FileConflict> conflicts;

  public ConflictErrorContextInfoField() {
  }

  protected ConflictErrorContextInfoField(ConflictErrorContextInfoFieldBuilder builder) {
    this.conflicts = builder.conflicts;
  }

  public List<FileConflict> getConflicts() {
    return conflicts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConflictErrorContextInfoField casted = (ConflictErrorContextInfoField) o;
    return Objects.equals(conflicts, casted.conflicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      conflicts
    );
  }

  @Override
  public String toString() {
    return "ConflictErrorContextInfoField{" + "conflicts='" + conflicts + '\'' + "}";
  }

  public static class ConflictErrorContextInfoFieldBuilder {

    protected List<FileConflict> conflicts;

    public ConflictErrorContextInfoFieldBuilder conflicts(List<FileConflict> conflicts) {
      this.conflicts = conflicts;
      return this;
    }

    public ConflictErrorContextInfoField build() {
      return new ConflictErrorContextInfoField(this);
    }

  }

}
