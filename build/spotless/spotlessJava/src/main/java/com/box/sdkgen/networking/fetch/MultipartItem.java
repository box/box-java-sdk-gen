package com.box.sdkgen.networking.fetch;

import com.box.sdkgen.internal.utils.ByteStream;
import com.fasterxml.jackson.databind.JsonNode;

public class MultipartItem {

  protected final String partName;

  protected JsonNode data;

  protected ByteStream fileStream;

  protected String fileName;

  protected String contentType;

  public MultipartItem(String partName) {
    this.partName = partName;
  }

  protected MultipartItem(MultipartItemBuilder builder) {
    this.partName = builder.partName;
    this.data = builder.data;
    this.fileStream = builder.fileStream;
    this.fileName = builder.fileName;
    this.contentType = builder.contentType;
  }

  public String getPartName() {
    return partName;
  }

  public JsonNode getData() {
    return data;
  }

  public ByteStream getFileStream() {
    return fileStream;
  }

  public String getFileName() {
    return fileName;
  }

  public String getContentType() {
    return contentType;
  }

  public static class MultipartItemBuilder {

    protected final String partName;

    protected JsonNode data;

    protected ByteStream fileStream;

    protected String fileName;

    protected String contentType;

    public MultipartItemBuilder(String partName) {
      this.partName = partName;
    }

    public MultipartItemBuilder data(JsonNode data) {
      this.data = data;
      return this;
    }

    public MultipartItemBuilder fileStream(ByteStream fileStream) {
      this.fileStream = fileStream;
      return this;
    }

    public MultipartItemBuilder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public MultipartItemBuilder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    public MultipartItem build() {
      return new MultipartItem(this);
    }
  }
}
