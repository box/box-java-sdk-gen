package com.box.sdkgen.schemas.commentbase;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CommentBase extends SerializableObject {

  protected String id;

  @JsonDeserialize(using = CommentBaseTypeField.CommentBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = CommentBaseTypeField.CommentBaseTypeFieldSerializer.class)
  protected EnumWrapper<CommentBaseTypeField> type;

  public CommentBase() {
    super();
  }

  protected CommentBase(CommentBaseBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CommentBaseTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentBase casted = (CommentBase) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "CommentBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class CommentBaseBuilder {

    protected String id;

    protected EnumWrapper<CommentBaseTypeField> type;

    public CommentBaseBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CommentBaseBuilder type(CommentBaseTypeField type) {
      this.type = new EnumWrapper<CommentBaseTypeField>(type);
      return this;
    }

    public CommentBaseBuilder type(EnumWrapper<CommentBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public CommentBase build() {
      return new CommentBase(this);
    }
  }
}
