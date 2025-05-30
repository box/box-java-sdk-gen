package com.box.sdkgen.schemas.v2025r0.shieldlistminiv2025r0;

import com.box.sdkgen.internal.SerializableObject;
import java.util.Objects;

public class ShieldListMiniV2025R0ContentField extends SerializableObject {

  protected String type;

  public ShieldListMiniV2025R0ContentField() {
    super();
  }

  protected ShieldListMiniV2025R0ContentField(ShieldListMiniV2025R0ContentFieldBuilder builder) {
    super();
    this.type = builder.type;
  }

  public String getType() {
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
    ShieldListMiniV2025R0ContentField casted = (ShieldListMiniV2025R0ContentField) o;
    return Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    return "ShieldListMiniV2025R0ContentField{" + "type='" + type + '\'' + "}";
  }

  public static class ShieldListMiniV2025R0ContentFieldBuilder {

    protected String type;

    public ShieldListMiniV2025R0ContentFieldBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ShieldListMiniV2025R0ContentField build() {
      return new ShieldListMiniV2025R0ContentField(this);
    }
  }
}
