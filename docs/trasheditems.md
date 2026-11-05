# TrashedItemsManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/trasheditems.md](https://github.com/box/box-java-sdk/blob/main/docs/trasheditems.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [List trashed items](#list-trashed-items)

## List trashed items

Retrieves the files and folders that have been moved
to the trash.

Any attribute in the full files or folders objects can be passed
in with the `fields` parameter to retrieve those specific
attributes that are not returned by default.

This endpoint defaults to use offset-based pagination, yet also supports
marker-based pagination using the `marker` parameter.

This operation is performed by calling function `getTrashedItems`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-folders-trash-items/).

<!-- sample get_folders_trash_items -->
```
client.getTrashedItems().getTrashedItems()
```

### Arguments

- queryParams `GetTrashedItemsQueryParams`
  - Query parameters of getTrashedItems method
- headers `GetTrashedItemsHeaders`
  - Headers of getTrashedItems method


### Returns

This function returns a value of type `Items`.

Returns a list of items that have been deleted.


