package com.box.sdkgen.schemas.appitemassociation;

import com.box.sdkgen.schemas.appitem.AppItem;
import com.box.sdkgen.schemas.filebaseorfolderbaseorweblinkbase.FileBaseOrFolderBaseOrWebLinkBase;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class AppItemAssociation {

  protected final String id;

  @JsonDeserialize(
      using = AppItemAssociationTypeField.AppItemAssociationTypeFieldDeserializer.class)
  @JsonSerialize(using = AppItemAssociationTypeField.AppItemAssociationTypeFieldSerializer.class)
  protected EnumWrapper<AppItemAssociationTypeField> type;

  @JsonProperty("app_item")
  protected final AppItem appItem;

  protected final FileBaseOrFolderBaseOrWebLinkBase item;

  public AppItemAssociation(
      @JsonProperty("id") String id,
      @JsonProperty("app_item") AppItem appItem,
      @JsonProperty("item") FileBaseOrFolderBaseOrWebLinkBase item) {
    this.id = id;
    this.appItem = appItem;
    this.item = item;
    this.type =
        new EnumWrapper<AppItemAssociationTypeField>(
            AppItemAssociationTypeField.APP_ITEM_ASSOCIATION.getValue(),
            AppItemAssociationTypeField.APP_ITEM_ASSOCIATION);
  }

  protected AppItemAssociation(AppItemAssociationBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.appItem = builder.appItem;
    this.item = builder.item;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<AppItemAssociationTypeField> getType() {
    return type;
  }

  public AppItem getAppItem() {
    return appItem;
  }

  public FileBaseOrFolderBaseOrWebLinkBase getItem() {
    return item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppItemAssociation casted = (AppItemAssociation) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(appItem, casted.appItem)
        && Objects.equals(item, casted.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, appItem, item);
  }

  @Override
  public String toString() {
    return "AppItemAssociation{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "appItem='"
        + appItem
        + '\''
        + ", "
        + "item='"
        + item
        + '\''
        + "}";
  }

  public static class AppItemAssociationBuilder {

    protected final String id;

    protected EnumWrapper<AppItemAssociationTypeField> type;

    protected final AppItem appItem;

    protected final FileBaseOrFolderBaseOrWebLinkBase item;

    public AppItemAssociationBuilder(
        String id, AppItem appItem, FileBaseOrFolderBaseOrWebLinkBase item) {
      this.id = id;
      this.appItem = appItem;
      this.item = item;
      this.type =
          new EnumWrapper<AppItemAssociationTypeField>(
              AppItemAssociationTypeField.APP_ITEM_ASSOCIATION.getValue(),
              AppItemAssociationTypeField.APP_ITEM_ASSOCIATION);
    }

    public AppItemAssociationBuilder type(AppItemAssociationTypeField type) {
      this.type = new EnumWrapper<AppItemAssociationTypeField>(type.getValue(), type);
      return this;
    }

    public AppItemAssociation build() {
      return new AppItemAssociation(this);
    }
  }
}
