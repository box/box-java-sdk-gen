package com.box.sdkgen.managers.avatars;

import java.io.InputStream;

public class CreateUserAvatarRequestBody {

  public final InputStream pic;

  public String picFileName;

  public String picContentType;

  public CreateUserAvatarRequestBody(InputStream pic) {
    this.pic = pic;
  }

  protected CreateUserAvatarRequestBody(CreateUserAvatarRequestBodyBuilder builder) {
    this.pic = builder.pic;
    this.picFileName = builder.picFileName;
    this.picContentType = builder.picContentType;
  }

  public InputStream getPic() {
    return pic;
  }

  public String getPicFileName() {
    return picFileName;
  }

  public String getPicContentType() {
    return picContentType;
  }

  public static class CreateUserAvatarRequestBodyBuilder {

    protected final InputStream pic;

    protected String picFileName;

    protected String picContentType;

    public CreateUserAvatarRequestBodyBuilder(InputStream pic) {
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
