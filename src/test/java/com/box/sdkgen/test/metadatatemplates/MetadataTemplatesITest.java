package com.box.sdkgen.test.metadatatemplates;

import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.getUuid;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.test.commons.CommonsManager.getDefaultClient;
import static com.box.sdkgen.test.commons.CommonsManager.uploadNewFile;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.box.sdkgen.client.BoxClient;
import com.box.sdkgen.managers.filemetadata.CreateFileMetadataByIdScope;
import com.box.sdkgen.managers.filemetadata.DeleteFileMetadataByIdScope;
import com.box.sdkgen.managers.metadatatemplates.CreateMetadataTemplateRequestBody;
import com.box.sdkgen.managers.metadatatemplates.CreateMetadataTemplateRequestBodyFieldsField;
import com.box.sdkgen.managers.metadatatemplates.CreateMetadataTemplateRequestBodyFieldsTypeField;
import com.box.sdkgen.managers.metadatatemplates.DeleteMetadataTemplateScope;
import com.box.sdkgen.managers.metadatatemplates.GetMetadataTemplateScope;
import com.box.sdkgen.managers.metadatatemplates.GetMetadataTemplatesByInstanceIdQueryParams;
import com.box.sdkgen.managers.metadatatemplates.UpdateMetadataTemplateRequestBody;
import com.box.sdkgen.managers.metadatatemplates.UpdateMetadataTemplateRequestBodyOpField;
import com.box.sdkgen.managers.metadatatemplates.UpdateMetadataTemplateScope;
import com.box.sdkgen.schemas.filefull.FileFull;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
import com.box.sdkgen.schemas.metadatatemplate.MetadataTemplate;
import com.box.sdkgen.schemas.metadatatemplates.MetadataTemplates;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MetadataTemplatesITest {

  private static final BoxClient client = getDefaultClient();

  @Test
  public void testMetadataTemplates() {
    String templateKey = String.join("", "key", getUuid());
    MetadataTemplate template =
        client
            .getMetadataTemplates()
            .createMetadataTemplate(
                new CreateMetadataTemplateRequestBody.CreateMetadataTemplateRequestBodyBuilder(
                        "enterprise", templateKey)
                    .templateKey(templateKey)
                    .fields(
                        Arrays.asList(
                            new CreateMetadataTemplateRequestBodyFieldsField(
                                CreateMetadataTemplateRequestBodyFieldsTypeField.STRING,
                                "testName",
                                "testName")))
                    .build());
    assert template.getTemplateKey().equals(templateKey);
    assert template.getDisplayName().equals(templateKey);
    assert template.getFields().size() == 1;
    assert template.getFields().get(0).getKey().equals("testName");
    assert template.getFields().get(0).getDisplayName().equals("testName");
    MetadataTemplate updatedTemplate =
        client
            .getMetadataTemplates()
            .updateMetadataTemplate(
                UpdateMetadataTemplateScope.ENTERPRISE,
                templateKey,
                Arrays.asList(
                    new UpdateMetadataTemplateRequestBody.UpdateMetadataTemplateRequestBodyBuilder(
                            UpdateMetadataTemplateRequestBodyOpField.ADDFIELD)
                        .data(
                            mapOf(
                                entryOf("type", "string"), entryOf("displayName", "newFieldName")))
                        .fieldKey("newfieldname")
                        .build()));
    assert updatedTemplate.getFields().size() == 2;
    assert updatedTemplate.getFields().get(1).getKey().equals("newfieldname");
    assert updatedTemplate.getFields().get(1).getDisplayName().equals("newFieldName");
    MetadataTemplate getMetadataTemplate =
        client.getMetadataTemplates().getMetadataTemplateById(template.getId());
    assert getMetadataTemplate.getId().equals(template.getId());
    MetadataTemplate getMetadataTemplateSchema =
        client
            .getMetadataTemplates()
            .getMetadataTemplate(GetMetadataTemplateScope.ENTERPRISE, template.getTemplateKey());
    assert getMetadataTemplateSchema.getId().equals(template.getId());
    MetadataTemplates enterpriseMetadataTemplates =
        client.getMetadataTemplates().getEnterpriseMetadataTemplates();
    assert enterpriseMetadataTemplates.getEntries().size() > 0;
    MetadataTemplates globalMetadataTemplates =
        client.getMetadataTemplates().getGlobalMetadataTemplates();
    assert globalMetadataTemplates.getEntries().size() > 0;
    client
        .getMetadataTemplates()
        .deleteMetadataTemplate(DeleteMetadataTemplateScope.ENTERPRISE, template.getTemplateKey());
    assertThrows(
        RuntimeException.class,
        () ->
            client
                .getMetadataTemplates()
                .deleteMetadataTemplate(
                    DeleteMetadataTemplateScope.ENTERPRISE, template.getTemplateKey()));
  }

  @Test
  public void testGetMetadataTemplateByInstance() {
    FileFull file = uploadNewFile();
    String templateKey = String.join("", "key", getUuid());
    MetadataTemplate template =
        client
            .getMetadataTemplates()
            .createMetadataTemplate(
                new CreateMetadataTemplateRequestBody.CreateMetadataTemplateRequestBodyBuilder(
                        "enterprise", templateKey)
                    .templateKey(templateKey)
                    .fields(
                        Arrays.asList(
                            new CreateMetadataTemplateRequestBodyFieldsField(
                                CreateMetadataTemplateRequestBodyFieldsTypeField.STRING,
                                "testName",
                                "testName")))
                    .build());
    MetadataFull createdMetadataInstance =
        client
            .getFileMetadata()
            .createFileMetadataById(
                file.getId(),
                CreateFileMetadataByIdScope.ENTERPRISE,
                templateKey,
                mapOf(entryOf("testName", "xyz")));
    MetadataTemplates metadataTemplates =
        client
            .getMetadataTemplates()
            .getMetadataTemplatesByInstanceId(
                new GetMetadataTemplatesByInstanceIdQueryParams(createdMetadataInstance.getId()));
    assert metadataTemplates.getEntries().size() == 1;
    assert metadataTemplates.getEntries().get(0).getDisplayName().equals(templateKey);
    assert metadataTemplates.getEntries().get(0).getTemplateKey().equals(templateKey);
    client
        .getFileMetadata()
        .deleteFileMetadataById(file.getId(), DeleteFileMetadataByIdScope.ENTERPRISE, templateKey);
    client
        .getMetadataTemplates()
        .deleteMetadataTemplate(DeleteMetadataTemplateScope.ENTERPRISE, template.getTemplateKey());
    client.getFiles().deleteFileById(file.getId());
  }
}
