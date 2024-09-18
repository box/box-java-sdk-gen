package com.box.sdkgen.managers.fileversionretentions;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversionretentions.FileVersionRetentions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionretention.FileVersionRetention;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class GetFileVersionRetentionsQueryParams {

  public String fileId;

  public String fileVersionId;

  public String policyId;

  public EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField> dispositionAction;

  public String dispositionBefore;

  public String dispositionAfter;

  public Long limit;

  public String marker;

  public GetFileVersionRetentionsQueryParams() {
  }

  protected GetFileVersionRetentionsQueryParams(GetFileVersionRetentionsQueryParamsBuilder builder) {
    this.fileId = builder.fileId;
    this.fileVersionId = builder.fileVersionId;
    this.policyId = builder.policyId;
    this.dispositionAction = builder.dispositionAction;
    this.dispositionBefore = builder.dispositionBefore;
    this.dispositionAfter = builder.dispositionAfter;
    this.limit = builder.limit;
    this.marker = builder.marker;
  }

  public String getFileId() {
    return fileId;
  }

  public String getFileVersionId() {
    return fileVersionId;
  }

  public String getPolicyId() {
    return policyId;
  }

  public EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField> getDispositionAction() {
    return dispositionAction;
  }

  public String getDispositionBefore() {
    return dispositionBefore;
  }

  public String getDispositionAfter() {
    return dispositionAfter;
  }

  public Long getLimit() {
    return limit;
  }

  public String getMarker() {
    return marker;
  }

  public static class GetFileVersionRetentionsQueryParamsBuilder {

    protected String fileId;

    protected String fileVersionId;

    protected String policyId;

    protected EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField> dispositionAction;

    protected String dispositionBefore;

    protected String dispositionAfter;

    protected Long limit;

    protected String marker;

    public GetFileVersionRetentionsQueryParamsBuilder fileId(String fileId) {
      this.fileId = fileId;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder fileVersionId(String fileVersionId) {
      this.fileVersionId = fileVersionId;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder dispositionAction(GetFileVersionRetentionsQueryParamsDispositionActionField dispositionAction) {
      this.dispositionAction = new EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField>(dispositionAction.getValue(), dispositionAction);
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder dispositionBefore(String dispositionBefore) {
      this.dispositionBefore = dispositionBefore;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder dispositionAfter(String dispositionAfter) {
      this.dispositionAfter = dispositionAfter;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFileVersionRetentionsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetFileVersionRetentionsQueryParams build() {
      return new GetFileVersionRetentionsQueryParams(this);
    }

  }

}
