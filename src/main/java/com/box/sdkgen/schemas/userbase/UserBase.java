package com.box.sdkgen.schemas.userbase;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class UserBase {

  protected final String id;

  @JsonDeserialize(using = UserBaseTypeField.UserBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = UserBaseTypeField.UserBaseTypeFieldSerializer.class)
  protected EnumWrapper<UserBaseTypeField> type;

  public UserBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<UserBaseTypeField>(UserBaseTypeField.USER.getValue(), UserBaseTypeField.USER);
  }

  protected UserBase(UserBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<UserBaseTypeField> getType() {
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
    UserBase casted = (UserBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "UserBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class UserBaseBuilder {

    protected final String id;

    protected EnumWrapper<UserBaseTypeField> type;

    public UserBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<UserBaseTypeField>(UserBaseTypeField.USER.getValue(), UserBaseTypeField.USER);
    }

    public UserBaseBuilder type(UserBaseTypeField type) {
      this.type = new EnumWrapper<UserBaseTypeField>(type.getValue(), type);
      return this;
    }

    public UserBase build() {
      return new UserBase(this);
    }

  }

}
