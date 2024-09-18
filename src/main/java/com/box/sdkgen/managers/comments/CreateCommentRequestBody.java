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

public class CreateCommentRequestBody {

  protected final String message;

  @JsonProperty("tagged_message")
  protected String taggedMessage;

  protected final CreateCommentRequestBodyItemField item;

  public CreateCommentRequestBody(@JsonProperty("message") String message, @JsonProperty("item") CreateCommentRequestBodyItemField item) {
    this.message = message;
    this.item = item;
  }

  protected CreateCommentRequestBody(CreateCommentRequestBodyBuilder builder) {
    this.message = builder.message;
    this.taggedMessage = builder.taggedMessage;
    this.item = builder.item;
  }

  public String getMessage() {
    return message;
  }

  public String getTaggedMessage() {
    return taggedMessage;
  }

  public CreateCommentRequestBodyItemField getItem() {
    return item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommentRequestBody casted = (CreateCommentRequestBody) o;
    return Objects.equals(message, casted.message) &&
      Objects.equals(taggedMessage, casted.taggedMessage) &&
      Objects.equals(item, casted.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      message, taggedMessage, item
    );
  }

  @Override
  public String toString() {
    return "CreateCommentRequestBody{" + "message='" + message + '\'' + ", " + "taggedMessage='" + taggedMessage + '\'' + ", " + "item='" + item + '\'' + "}";
  }

  public static class CreateCommentRequestBodyBuilder {

    protected final String message;

    protected String taggedMessage;

    protected final CreateCommentRequestBodyItemField item;

    public CreateCommentRequestBodyBuilder(String message, CreateCommentRequestBodyItemField item) {
      this.message = message;
      this.item = item;
    }

    public CreateCommentRequestBodyBuilder taggedMessage(String taggedMessage) {
      this.taggedMessage = taggedMessage;
      return this;
    }

    public CreateCommentRequestBody build() {
      return new CreateCommentRequestBody(this);
    }

  }

}
