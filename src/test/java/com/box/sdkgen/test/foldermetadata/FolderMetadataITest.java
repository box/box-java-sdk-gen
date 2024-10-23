package com.box.sdkgen.test.foldermetadata;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.test.commons.CommonsManager.createNewFolder;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.foldermetadata.CreateFolderMetadataByIdScope;
import com.box.sdkgen.managers.foldermetadata.DeleteFolderMetadataByIdScope;
import com.box.sdkgen.managers.foldermetadata.GetFolderMetadataByIdScope;
import com.box.sdkgen.managers.foldermetadata.UpdateFolderMetadataByIdRequestBody;
import com.box.sdkgen.managers.foldermetadata.UpdateFolderMetadataByIdRequestBodyOpField;
import com.box.sdkgen.managers.foldermetadata.UpdateFolderMetadataByIdScope;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
import com.box.sdkgen.schemas.metadatas.Metadatas;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class FolderMetadataITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testGlobalFolderMetadata() {
    FolderFull folder = createNewFolder();
    Metadatas folderMetadata = client.getFolderMetadata().getFolderMetadata(folder.getId());
    assert folderMetadata.getEntries().size() == 0;
    MetadataFull createdMetadata =
        client
            .getFolderMetadata()
            .createFolderMetadataById(
                folder.getId(),
                CreateFolderMetadataByIdScope.GLOBAL,
                "properties",
                mapOf(entryOf("abc", "xyz")));
    assert convertToString(createdMetadata.getTemplate()).equals("properties");
    assert convertToString(createdMetadata.getScope()).equals("global");
    assert createdMetadata.getVersion() == 0;
    MetadataFull receivedMetadata =
        client
            .getFolderMetadata()
            .getFolderMetadataById(folder.getId(), GetFolderMetadataByIdScope.GLOBAL, "properties");
    assert convertToString(receivedMetadata.getExtraData().get("abc")).equals("xyz");
    String newValue = "bar";
    client
        .getFolderMetadata()
        .updateFolderMetadataById(
            folder.getId(),
            UpdateFolderMetadataByIdScope.GLOBAL,
            "properties",
            Arrays.asList(
                new UpdateFolderMetadataByIdRequestBody.UpdateFolderMetadataByIdRequestBodyBuilder()
                    .op(UpdateFolderMetadataByIdRequestBodyOpField.REPLACE)
                    .path("/abc")
                    .value(newValue)
                    .build()));
    MetadataFull receivedUpdatedMetadata =
        client
            .getFolderMetadata()
            .getFolderMetadataById(folder.getId(), GetFolderMetadataByIdScope.GLOBAL, "properties");
    assert convertToString(receivedUpdatedMetadata.getExtraData().get("abc")).equals(newValue);
    client
        .getFolderMetadata()
        .deleteFolderMetadataById(
            folder.getId(), DeleteFolderMetadataByIdScope.GLOBAL, "properties");
    assertThrows(
        RuntimeException.class,
        () ->
            client
                .getFolderMetadata()
                .getFolderMetadataById(
                    folder.getId(), GetFolderMetadataByIdScope.GLOBAL, "properties"));
    client.getFolders().deleteFolderById(folder.getId());
  }
}
