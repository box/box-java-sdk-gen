package com.box.sdkgen.schemas.userfull;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.userbase.UserBaseTypeField;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.user.UserStatusField;
import com.box.sdkgen.schemas.user.UserNotificationEmailField;
import com.box.sdkgen.schemas.user.User;
import com.box.sdkgen.schemas.trackingcode.TrackingCode;

public class UserFullEnterpriseField {

  protected String id;

  @JsonDeserialize(using = UserFullEnterpriseTypeField.UserFullEnterpriseTypeFieldDeserializer.class)
  @JsonSerialize(using = UserFullEnterpriseTypeField.UserFullEnterpriseTypeFieldSerializer.class)
  protected EnumWrapper<UserFullEnterpriseTypeField> type;

  protected String name;

  public UserFullEnterpriseField() {
  }

  protected UserFullEnterpriseField(UserFullEnterpriseFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<UserFullEnterpriseTypeField> getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFullEnterpriseField casted = (UserFullEnterpriseField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(name, casted.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, name
    );
  }

  @Override
  public String toString() {
    return "UserFullEnterpriseField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class UserFullEnterpriseFieldBuilder {

    protected String id;

    protected EnumWrapper<UserFullEnterpriseTypeField> type;

    protected String name;

    public UserFullEnterpriseFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UserFullEnterpriseFieldBuilder type(UserFullEnterpriseTypeField type) {
      this.type = new EnumWrapper<UserFullEnterpriseTypeField>(type.getValue(), type);
      return this;
    }

    public UserFullEnterpriseFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public UserFullEnterpriseField build() {
      return new UserFullEnterpriseField(this);
    }

  }

}
