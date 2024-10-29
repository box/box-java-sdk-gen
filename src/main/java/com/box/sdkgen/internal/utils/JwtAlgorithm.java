package com.box.sdkgen.internal.utils;

public enum JwtAlgorithm {
  HS256("HS256"),
  HS384("HS384"),
  HS512("HS512"),
  RS256("RS256"),
  RS384("RS384"),
  RS512("RS512"),
  ES256("ES256"),
  ES384("ES384"),
  ES512("ES512"),
  PS256("PS256"),
  PS384("PS384"),
  PS512("PS512"),
  NONE("none");

  private final String value;

  JwtAlgorithm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
