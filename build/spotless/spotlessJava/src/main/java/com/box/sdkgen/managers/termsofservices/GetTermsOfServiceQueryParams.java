package com.box.sdkgen.managers.termsofservices;

import com.box.sdkgen.serialization.json.EnumWrapper;

public class GetTermsOfServiceQueryParams {

  public EnumWrapper<GetTermsOfServiceQueryParamsTosTypeField> tosType;

  public GetTermsOfServiceQueryParams() {}

  protected GetTermsOfServiceQueryParams(GetTermsOfServiceQueryParamsBuilder builder) {
    this.tosType = builder.tosType;
  }

  public EnumWrapper<GetTermsOfServiceQueryParamsTosTypeField> getTosType() {
    return tosType;
  }

  public static class GetTermsOfServiceQueryParamsBuilder {

    protected EnumWrapper<GetTermsOfServiceQueryParamsTosTypeField> tosType;

    public GetTermsOfServiceQueryParamsBuilder tosType(
        GetTermsOfServiceQueryParamsTosTypeField tosType) {
      this.tosType =
          new EnumWrapper<GetTermsOfServiceQueryParamsTosTypeField>(tosType.getValue(), tosType);
      return this;
    }

    public GetTermsOfServiceQueryParams build() {
      return new GetTermsOfServiceQueryParams(this);
    }
  }
}
