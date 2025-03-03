package com.box.sdkgen.managers.uploads;

import java.io.InputStream;

public class UploadFileRequestBody {

  public final UploadFileRequestBodyAttributesField attributes;

  public final InputStream file;

  public String fileFileName;

  public String fileContentType;

  public UploadFileRequestBody(UploadFileRequestBodyAttributesField attributes, InputStream file) {
    this.attributes = attributes;
    this.file = file;
  }

  protected UploadFileRequestBody(UploadFileRequestBodyBuilder builder) {
    this.attributes = builder.attributes;
    this.file = builder.file;
    this.fileFileName = builder.fileFileName;
    this.fileContentType = builder.fileContentType;
  }

  public UploadFileRequestBodyAttributesField getAttributes() {
    return attributes;
  }

  public InputStream getFile() {
    return file;
  }

  public String getFileFileName() {
    return fileFileName;
  }

  public String getFileContentType() {
    return fileContentType;
  }

  public static class UploadFileRequestBodyBuilder {

    protected final UploadFileRequestBodyAttributesField attributes;

    protected final InputStream file;

    protected String fileFileName;

    protected String fileContentType;

    public UploadFileRequestBodyBuilder(
        UploadFileRequestBodyAttributesField attributes, InputStream file) {
      this.attributes = attributes;
      this.file = file;
    }

    public UploadFileRequestBodyBuilder fileFileName(String fileFileName) {
      this.fileFileName = fileFileName;
      return this;
    }

    public UploadFileRequestBodyBuilder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    public UploadFileRequestBody build() {
      return new UploadFileRequestBody(this);
    }
  }
}
