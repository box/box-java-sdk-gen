package com.box.sdkgen.managers.comments;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.comments.Comments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.commentfull.CommentFull;
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

public class UpdateCommentByIdRequestBody {

  protected String message;

  public UpdateCommentByIdRequestBody() {
  }

  protected UpdateCommentByIdRequestBody(UpdateCommentByIdRequestBodyBuilder builder) {
    this.message = builder.message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCommentByIdRequestBody casted = (UpdateCommentByIdRequestBody) o;
    return Objects.equals(message, casted.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      message
    );
  }

  @Override
  public String toString() {
    return "UpdateCommentByIdRequestBody{" + "message='" + message + '\'' + "}";
  }

  public static class UpdateCommentByIdRequestBodyBuilder {

    protected String message;

    public UpdateCommentByIdRequestBodyBuilder message(String message) {
      this.message = message;
      return this;
    }

    public UpdateCommentByIdRequestBody build() {
      return new UpdateCommentByIdRequestBody(this);
    }

  }

}
