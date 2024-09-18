package com.box.sdkgen.schemas.event;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.appitemeventsourceoreventsourceorfileorfolderorgenericsourceoruser.AppItemEventSourceOrEventSourceOrFileOrFolderOrGenericSourceOrUser;

public class EventAdditionalDetailsField {

  @Override
  public String toString() {
    return "EventAdditionalDetailsField{" +   "}";
  }

}
