package com.box.sdkgen.managers.events;

import com.box.sdkgen.serialization.json.EnumWrapper;
import java.util.List;

public class GetEventsQueryParams {

  public EnumWrapper<GetEventsQueryParamsStreamTypeField> streamType;

  public String streamPosition;

  public Long limit;

  public List<GetEventsQueryParamsEventTypeField> eventType;

  public String createdAfter;

  public String createdBefore;

  public GetEventsQueryParams() {}

  protected GetEventsQueryParams(GetEventsQueryParamsBuilder builder) {
    this.streamType = builder.streamType;
    this.streamPosition = builder.streamPosition;
    this.limit = builder.limit;
    this.eventType = builder.eventType;
    this.createdAfter = builder.createdAfter;
    this.createdBefore = builder.createdBefore;
  }

  public EnumWrapper<GetEventsQueryParamsStreamTypeField> getStreamType() {
    return streamType;
  }

  public String getStreamPosition() {
    return streamPosition;
  }

  public Long getLimit() {
    return limit;
  }

  public List<GetEventsQueryParamsEventTypeField> getEventType() {
    return eventType;
  }

  public String getCreatedAfter() {
    return createdAfter;
  }

  public String getCreatedBefore() {
    return createdBefore;
  }

  public static class GetEventsQueryParamsBuilder {

    protected EnumWrapper<GetEventsQueryParamsStreamTypeField> streamType;

    protected String streamPosition;

    protected Long limit;

    protected List<GetEventsQueryParamsEventTypeField> eventType;

    protected String createdAfter;

    protected String createdBefore;

    public GetEventsQueryParamsBuilder streamType(
        EnumWrapper<GetEventsQueryParamsStreamTypeField> streamType) {
      this.streamType = streamType;
      return this;
    }

    public GetEventsQueryParamsBuilder streamType(GetEventsQueryParamsStreamTypeField streamType) {
      this.streamType =
          new EnumWrapper<GetEventsQueryParamsStreamTypeField>(streamType.getValue(), streamType);
      return this;
    }

    public GetEventsQueryParamsBuilder streamPosition(String streamPosition) {
      this.streamPosition = streamPosition;
      return this;
    }

    public GetEventsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetEventsQueryParamsBuilder eventType(
        List<GetEventsQueryParamsEventTypeField> eventType) {
      this.eventType = eventType;
      return this;
    }

    public GetEventsQueryParamsBuilder createdAfter(String createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    public GetEventsQueryParamsBuilder createdBefore(String createdBefore) {
      this.createdBefore = createdBefore;
      return this;
    }

    public GetEventsQueryParams build() {
      return new GetEventsQueryParams(this);
    }
  }
}
