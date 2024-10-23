package com.box.sdkgen.test.filemetadata;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static com.box.sdkgen.test.commons.CommonsManager.uploadNewFile;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.filemetadata.CreateFileMetadataByIdScope;
import com.box.sdkgen.managers.filemetadata.DeleteFileMetadataByIdScope;
import com.box.sdkgen.managers.filemetadata.GetFileMetadataByIdScope;
import com.box.sdkgen.managers.filemetadata.UpdateFileMetadataByIdRequestBody;
import com.box.sdkgen.managers.filemetadata.UpdateFileMetadataByIdRequestBodyOpField;
import com.box.sdkgen.managers.filemetadata.UpdateFileMetadataByIdScope;
import com.box.sdkgen.schemas.filefull.FileFull;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
import com.box.sdkgen.schemas.metadatas.Metadatas;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class FileMetadataITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testGlobalFileMetadata() {
    FileFull file = uploadNewFile();
    Metadatas fileMetadata = client.getFileMetadata().getFileMetadata(file.getId());
    assert fileMetadata.getEntries().size() == 0;
    MetadataFull createdMetadata =
        client
            .getFileMetadata()
            .createFileMetadataById(
                file.getId(),
                CreateFileMetadataByIdScope.GLOBAL,
                "properties",
                mapOf(entryOf("abc", "xyz")));
    assert convertToString(createdMetadata.getTemplate()).equals("properties");
    assert convertToString(createdMetadata.getScope()).equals("global");
    assert createdMetadata.getVersion() == 0;
    MetadataFull receivedMetadata =
        client
            .getFileMetadata()
            .getFileMetadataById(file.getId(), GetFileMetadataByIdScope.GLOBAL, "properties");
    assert convertToString(receivedMetadata.getExtraData().get("abc")).equals("xyz");
    String newValue = "bar";
    client
        .getFileMetadata()
        .updateFileMetadataById(
            file.getId(),
            UpdateFileMetadataByIdScope.GLOBAL,
            "properties",
            Arrays.asList(
                new UpdateFileMetadataByIdRequestBody.UpdateFileMetadataByIdRequestBodyBuilder()
                    .op(UpdateFileMetadataByIdRequestBodyOpField.REPLACE)
                    .path("/abc")
                    .value(newValue)
                    .build()));
    MetadataFull receivedUpdatedMetadata =
        client
            .getFileMetadata()
            .getFileMetadataById(file.getId(), GetFileMetadataByIdScope.GLOBAL, "properties");
    assert convertToString(receivedUpdatedMetadata.getExtraData().get("abc")).equals(newValue);
    client
        .getFileMetadata()
        .deleteFileMetadataById(file.getId(), DeleteFileMetadataByIdScope.GLOBAL, "properties");
    assertThrows(
        RuntimeException.class,
        () ->
            client
                .getFileMetadata()
                .getFileMetadataById(file.getId(), GetFileMetadataByIdScope.GLOBAL, "properties"));
    client.getFiles().deleteFileById(file.getId());
  }
}
