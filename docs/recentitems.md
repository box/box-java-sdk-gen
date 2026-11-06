# RecentItemsManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/recentitems.md](https://github.com/box/box-java-sdk/blob/main/docs/recentitems.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [List recently accessed items](#list-recently-accessed-items)

## List recently accessed items

Returns information about the recent items accessed
by a user, either in the last 90 days or up to the last
1000 items accessed.

This operation is performed by calling function `getRecentItems`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-recent-items/).

<!-- sample get_recent_items -->
```
client.getRecentItems().getRecentItems()
```

### Arguments

- queryParams `GetRecentItemsQueryParams`
  - Query parameters of getRecentItems method
- headers `GetRecentItemsHeaders`
  - Headers of getRecentItems method


### Returns

This function returns a value of type `RecentItems`.

Returns a list recent items access by a user.


