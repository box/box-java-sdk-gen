package com.box.sdkgen.schemas.shieldinformationbarriersegmentmembermini;

import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBase;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBaseTypeField;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.serialization.json.EnumWrapper;
import java.util.Objects;

public class ShieldInformationBarrierSegmentMemberMini
    extends ShieldInformationBarrierSegmentMemberBase {

  protected UserBase user;

  public ShieldInformationBarrierSegmentMemberMini() {
    super();
  }

  protected ShieldInformationBarrierSegmentMemberMini(
      ShieldInformationBarrierSegmentMemberMiniBuilder builder) {
    super(builder);
    this.user = builder.user;
  }

  public UserBase getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldInformationBarrierSegmentMemberMini casted =
        (ShieldInformationBarrierSegmentMemberMini) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(user, casted.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, user);
  }

  @Override
  public String toString() {
    return "ShieldInformationBarrierSegmentMemberMini{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "user='"
        + user
        + '\''
        + "}";
  }

  public static class ShieldInformationBarrierSegmentMemberMiniBuilder
      extends ShieldInformationBarrierSegmentMemberBaseBuilder {

    protected UserBase user;

    public ShieldInformationBarrierSegmentMemberMiniBuilder user(UserBase user) {
      this.user = user;
      return this;
    }

    @Override
    public ShieldInformationBarrierSegmentMemberMiniBuilder id(String id) {
      this.id = id;
      return this;
    }

    @Override
    public ShieldInformationBarrierSegmentMemberMiniBuilder type(
        ShieldInformationBarrierSegmentMemberBaseTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierSegmentMemberBaseTypeField>(type);
      return this;
    }

    @Override
    public ShieldInformationBarrierSegmentMemberMiniBuilder type(
        EnumWrapper<ShieldInformationBarrierSegmentMemberBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public ShieldInformationBarrierSegmentMemberMini build() {
      return new ShieldInformationBarrierSegmentMemberMini(this);
    }
  }
}
