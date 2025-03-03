package com.box.sdkgen.test.uploads;

import static com.box.sdkgen.internal.utils.UtilsManager.generateByteStream;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.uploads.PreflightFileUploadCheckRequestBody;
import com.box.sdkgen.managers.uploads.PreflightFileUploadCheckRequestBodyParentField;
import com.box.sdkgen.managers.uploads.UploadFileRequestBody;
import com.box.sdkgen.managers.uploads.UploadFileRequestBodyAttributesField;
import com.box.sdkgen.managers.uploads.UploadFileRequestBodyAttributesParentField;
import com.box.sdkgen.managers.uploads.UploadFileVersionRequestBody;
import com.box.sdkgen.managers.uploads.UploadFileVersionRequestBodyAttributesField;
import com.box.sdkgen.schemas.filefull.FileFull;
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.uploadurl.UploadUrl;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

public class UploadsITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testUploadFileAndFileVersion() {
    String newFileName = getUuid();
    InputStream fileContentStream = generateByteStream(1024 * 1024);
    Files uploadedFiles =
        client
            .getUploads()
            .uploadFile(
                new UploadFileRequestBody(
                    new UploadFileRequestBodyAttributesField(
                        newFileName, new UploadFileRequestBodyAttributesParentField("0")),
                    fileContentStream));
    FileFull uploadedFile = uploadedFiles.getEntries().get(0);
    assert uploadedFile.getName().equals(newFileName);
    String newFileVersionName = getUuid();
    InputStream newFileContentStream = generateByteStream(1024 * 1024);
    Files uploadedFilesVersion =
        client
            .getUploads()
            .uploadFileVersion(
                uploadedFile.getId(),
                new UploadFileVersionRequestBody(
                    new UploadFileVersionRequestBodyAttributesField(newFileVersionName),
                    newFileContentStream));
    FileFull newFileVersion = uploadedFilesVersion.getEntries().get(0);
    assert newFileVersion.getName().equals(newFileVersionName);
    client.getFiles().deleteFileById(newFileVersion.getId());
  }

  @Test
  public void testPreflightCheck() {
    String newFileName = getUuid();
    UploadUrl preflightCheckResult =
        client
            .getUploads()
            .preflightFileUploadCheck(
                new PreflightFileUploadCheckRequestBody.PreflightFileUploadCheckRequestBodyBuilder()
                    .name(newFileName)
                    .size(1024 * 1024)
                    .parent(
                        new PreflightFileUploadCheckRequestBodyParentField
                                .PreflightFileUploadCheckRequestBodyParentFieldBuilder()
                            .id("0")
                            .build())
                    .build());
    assert !(preflightCheckResult.getUploadUrl().equals(""));
  }
}
