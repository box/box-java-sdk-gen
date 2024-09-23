package com.box.sdkgen.managers.avatars;

import com.box.sdkgen.internal.utils.ByteStream;

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
