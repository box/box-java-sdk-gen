package com.box.sdkgen.managers.avatars;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import java.util.Arrays;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.useravatar.UserAvatar;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.MultipartItem;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateUserAvatarRequestBody {

  public final ByteStream pic;

  public String picFileName;

  public String picContentType;

  public CreateUserAvatarRequestBody(ByteStream pic) {
    this.pic = pic;
  }

  protected CreateUserAvatarRequestBody(CreateUserAvatarRequestBodyBuilder builder) {
    this.pic = builder.pic;
    this.picFileName = builder.picFileName;
    this.picContentType = builder.picContentType;
  }

  public ByteStream getPic() {
    return pic;
  }

  public String getPicFileName() {
    return picFileName;
  }

  public String getPicContentType() {
    return picContentType;
  }

  public static class CreateUserAvatarRequestBodyBuilder {

    protected final ByteStream pic;

    protected String picFileName;

    protected String picContentType;

    public CreateUserAvatarRequestBodyBuilder(ByteStream pic) {
      this.pic = pic;
    }

    public CreateUserAvatarRequestBodyBuilder picFileName(String picFileName) {
      this.picFileName = picFileName;
      return this;
    }

    public CreateUserAvatarRequestBodyBuilder picContentType(String picContentType) {
      this.picContentType = picContentType;
      return this;
    }

    public CreateUserAvatarRequestBody build() {
      return new CreateUserAvatarRequestBody(this);
    }

  }

}
