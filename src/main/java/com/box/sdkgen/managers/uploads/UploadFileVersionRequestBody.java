package com.box.sdkgen.managers.uploads;

import java.io.InputStream;

public class UploadFileVersionRequestBody {

  public final UploadFileVersionRequestBodyAttributesField attributes;

  public final InputStream file;

  public String fileFileName;

  public String fileContentType;

  public UploadFileVersionRequestBody(
      UploadFileVersionRequestBodyAttributesField attributes, InputStream file) {
    this.attributes = attributes;
    this.file = file;
  }

  protected UploadFileVersionRequestBody(UploadFileVersionRequestBodyBuilder builder) {
    this.attributes = builder.attributes;
    this.file = builder.file;
    this.fileFileName = builder.fileFileName;
    this.fileContentType = builder.fileContentType;
  }

  public UploadFileVersionRequestBodyAttributesField getAttributes() {
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

  public static class UploadFileVersionRequestBodyBuilder {

    protected final UploadFileVersionRequestBodyAttributesField attributes;

    protected final InputStream file;

    protected String fileFileName;

    protected String fileContentType;

    public UploadFileVersionRequestBodyBuilder(
        UploadFileVersionRequestBodyAttributesField attributes, InputStream file) {
      this.attributes = attributes;
      this.file = file;
    }

    public UploadFileVersionRequestBodyBuilder fileFileName(String fileFileName) {
      this.fileFileName = fileFileName;
      return this;
    }

    public UploadFileVersionRequestBodyBuilder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    public UploadFileVersionRequestBody build() {
      return new UploadFileVersionRequestBody(this);
    }
  }
}
