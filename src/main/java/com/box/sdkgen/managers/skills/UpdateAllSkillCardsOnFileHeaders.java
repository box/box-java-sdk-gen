package com.box.sdkgen.managers.skills;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class UpdateAllSkillCardsOnFileHeaders {

  public Map<String, String> extraHeaders;

  public UpdateAllSkillCardsOnFileHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateAllSkillCardsOnFileHeaders(UpdateAllSkillCardsOnFileHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateAllSkillCardsOnFileHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public UpdateAllSkillCardsOnFileHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateAllSkillCardsOnFileHeaders build() {
      return new UpdateAllSkillCardsOnFileHeaders(this);
    }
  }
}
