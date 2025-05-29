package com.box.sdkgen.managers.docgen;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import com.box.sdkgen.parameters.v2025r0.boxversionheaderv2025r0.BoxVersionHeaderV2025R0;
import com.box.sdkgen.serialization.json.EnumWrapper;
import java.util.Map;

public class GetDocgenBatchJobByIdV2025R0Headers {

  public EnumWrapper<BoxVersionHeaderV2025R0> boxVersion;

  public Map<String, String> extraHeaders;

  public GetDocgenBatchJobByIdV2025R0Headers() {
    this.boxVersion = new EnumWrapper<BoxVersionHeaderV2025R0>(BoxVersionHeaderV2025R0._2025_0);
    this.extraHeaders = mapOf();
  }

  protected GetDocgenBatchJobByIdV2025R0Headers(
      GetDocgenBatchJobByIdV2025R0HeadersBuilder builder) {
    this.boxVersion = builder.boxVersion;
    this.extraHeaders = builder.extraHeaders;
  }

  public EnumWrapper<BoxVersionHeaderV2025R0> getBoxVersion() {
    return boxVersion;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetDocgenBatchJobByIdV2025R0HeadersBuilder {

    protected EnumWrapper<BoxVersionHeaderV2025R0> boxVersion;

    protected Map<String, String> extraHeaders;

    public GetDocgenBatchJobByIdV2025R0HeadersBuilder() {
      this.boxVersion = new EnumWrapper<BoxVersionHeaderV2025R0>(BoxVersionHeaderV2025R0._2025_0);
      this.extraHeaders = mapOf();
    }

    public GetDocgenBatchJobByIdV2025R0HeadersBuilder boxVersion(
        BoxVersionHeaderV2025R0 boxVersion) {
      this.boxVersion = new EnumWrapper<BoxVersionHeaderV2025R0>(boxVersion);
      return this;
    }

    public GetDocgenBatchJobByIdV2025R0HeadersBuilder boxVersion(
        EnumWrapper<BoxVersionHeaderV2025R0> boxVersion) {
      this.boxVersion = boxVersion;
      return this;
    }

    public GetDocgenBatchJobByIdV2025R0HeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetDocgenBatchJobByIdV2025R0Headers build() {
      return new GetDocgenBatchJobByIdV2025R0Headers(this);
    }
  }
}
