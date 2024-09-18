package com.box.sdkgen.schemas.airesponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AiResponse {

  protected final String answer;

  @JsonProperty("created_at")
  protected final String createdAt;

  @JsonProperty("completion_reason")
  protected String completionReason;

  public AiResponse(@JsonProperty("answer") String answer, @JsonProperty("created_at") String createdAt) {
    this.answer = answer;
    this.createdAt = createdAt;
  }

  protected AiResponse(AiResponseBuilder builder) {
    this.answer = builder.answer;
    this.createdAt = builder.createdAt;
    this.completionReason = builder.completionReason;
  }

  public String getAnswer() {
    return answer;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getCompletionReason() {
    return completionReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiResponse casted = (AiResponse) o;
    return Objects.equals(answer, casted.answer) &&
      Objects.equals(createdAt, casted.createdAt) &&
      Objects.equals(completionReason, casted.completionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      answer, createdAt, completionReason
    );
  }

  @Override
  public String toString() {
    return "AiResponse{" + "answer='" + answer + '\'' + ", " + "createdAt='" + createdAt + '\'' + ", " + "completionReason='" + completionReason + '\'' + "}";
  }

  public static class AiResponseBuilder {

    protected final String answer;

    protected final String createdAt;

    protected String completionReason;

    public AiResponseBuilder(String answer, String createdAt) {
      this.answer = answer;
      this.createdAt = createdAt;
    }

    public AiResponseBuilder completionReason(String completionReason) {
      this.completionReason = completionReason;
      return this;
    }

    public AiResponse build() {
      return new AiResponse(this);
    }

  }

}
