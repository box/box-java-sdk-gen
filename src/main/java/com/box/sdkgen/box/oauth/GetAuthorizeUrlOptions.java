package com.box.sdkgen.box.oauth;

public class GetAuthorizeUrlOptions {

  public String clientId;

  public String redirectUri;

  public String responseType;

  public String state;

  public String scope;

  public GetAuthorizeUrlOptions() {}

  protected GetAuthorizeUrlOptions(GetAuthorizeUrlOptionsBuilder builder) {
    this.clientId = builder.clientId;
    this.redirectUri = builder.redirectUri;
    this.responseType = builder.responseType;
    this.state = builder.state;
    this.scope = builder.scope;
  }

  public String getClientId() {
    return clientId;
  }

  public String getRedirectUri() {
    return redirectUri;
  }

  public String getResponseType() {
    return responseType;
  }

  public String getState() {
    return state;
  }

  public String getScope() {
    return scope;
  }

  public static class GetAuthorizeUrlOptionsBuilder {

    protected String clientId;

    protected String redirectUri;

    protected String responseType;

    protected String state;

    protected String scope;

    public GetAuthorizeUrlOptionsBuilder clientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public GetAuthorizeUrlOptionsBuilder redirectUri(String redirectUri) {
      this.redirectUri = redirectUri;
      return this;
    }

    public GetAuthorizeUrlOptionsBuilder responseType(String responseType) {
      this.responseType = responseType;
      return this;
    }

    public GetAuthorizeUrlOptionsBuilder state(String state) {
      this.state = state;
      return this;
    }

    public GetAuthorizeUrlOptionsBuilder scope(String scope) {
      this.scope = scope;
      return this;
    }

    public GetAuthorizeUrlOptions build() {
      return new GetAuthorizeUrlOptions(this);
    }
  }
}
