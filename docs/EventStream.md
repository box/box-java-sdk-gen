# Event Stream

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/eventstream.md](https://github.com/box/box-java-sdk/blob/main/docs/eventstream.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).

The Event Stream class utilizes long-polling to receive real-time events from Box. The SDK provides an easy way to set up and manage the event stream which returns an iterable object and yields events as they are received.

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Event Stream](#event-stream)
  - [Listening to the Event Stream](#listening-to-the-event-stream)
  - [Deduplication](#deduplication)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Listening to the Event Stream

When the `EventStream` is started, it will begin long-polling asynchronously. Events received from the API are then yielded to the caller.

```java
EventStream stream = client.getEvents().getEventStream();
for (Event event : stream) {
  System.out.printf(
    "Received event: ID=%s, Type=%s, CreatedAt=%s%n\n",event.getEventId(),event.getEventType(),event.getCreatedAt());
}

```

## Deduplication

The `EventStream` class automatically deduplicates events based on their `eventId`. This means that if the same event is received multiple times, it will only be emitted once to the listeners.
