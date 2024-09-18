package com.box.sdkgen.schemas.items;

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
import com.box.sdkgen.schemas.filefullorfolderminiorweblink.FileFullOrFolderMiniOrWebLink;

public class ItemsOrderField {

  protected String by;

  @JsonDeserialize(using = ItemsOrderDirectionField.ItemsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = ItemsOrderDirectionField.ItemsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<ItemsOrderDirectionField> direction;

  public ItemsOrderField() {
  }

  protected ItemsOrderField(ItemsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<ItemsOrderDirectionField> getDirection() {
    return direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsOrderField casted = (ItemsOrderField) o;
    return Objects.equals(by, casted.by) &&
      Objects.equals(direction, casted.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      by, direction
    );
  }

  @Override
  public String toString() {
    return "ItemsOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class ItemsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<ItemsOrderDirectionField> direction;

    public ItemsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public ItemsOrderFieldBuilder direction(ItemsOrderDirectionField direction) {
      this.direction = new EnumWrapper<ItemsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public ItemsOrderField build() {
      return new ItemsOrderField(this);
    }

  }

}
