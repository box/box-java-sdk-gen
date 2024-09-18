package com.box.sdkgen.schemas.folderfull;

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
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.folderbase.FolderBase;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.folder.FolderPathCollectionField;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.folder.FolderSharedLinkField;
import com.box.sdkgen.schemas.folder.FolderFolderUploadEmailField;
import com.box.sdkgen.schemas.folder.FolderItemStatusField;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.schemas.folder.Folder;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;

public enum FolderFullSyncStateField {
  SYNCED("synced"),
  NOT_SYNCED("not_synced"),
  PARTIALLY_SYNCED("partially_synced");

  private final String value;

  FolderFullSyncStateField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FolderFullSyncStateFieldDeserializer extends JsonDeserializer<EnumWrapper<FolderFullSyncStateField>> {

    public FolderFullSyncStateFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FolderFullSyncStateField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FolderFullSyncStateField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FolderFullSyncStateField>(value, v)).orElse(new EnumWrapper<FolderFullSyncStateField>(value));
    }

  }

  public static class FolderFullSyncStateFieldSerializer extends JsonSerializer<EnumWrapper<FolderFullSyncStateField>> {

    public FolderFullSyncStateFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FolderFullSyncStateField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
