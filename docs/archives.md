# ArchivesManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/archives.md](https://github.com/box/box-java-sdk/blob/main/docs/archives.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [List archives](#list-archives)
- [Create archive](#create-archive)
- [Delete archive](#delete-archive)

## List archives

Retrieves archives for an enterprise.

This operation is performed by calling function `getArchivesV2025R0`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/v2025.0/get-archives/).

<!-- sample get_archives_v2025.0 -->
```
client.getArchives().getArchivesV2025R0(new GetArchivesV2025R0QueryParams.Builder().limit(100L).build())
```

### Arguments

- queryParams `GetArchivesV2025R0QueryParams`
  - Query parameters of getArchivesV2025R0 method
- headers `GetArchivesV2025R0Headers`
  - Headers of getArchivesV2025R0 method


### Returns

This function returns a value of type `ArchivesV2025R0`.

Returns a list of archives in the enterprise.


## Create archive

Creates an archive.

This operation is performed by calling function `createArchiveV2025R0`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/v2025.0/post-archives/).

<!-- sample post_archives_v2025.0 -->
```
client.getArchives().createArchiveV2025R0(new CreateArchiveV2025R0RequestBody(archiveName))
```

### Arguments

- requestBody `CreateArchiveV2025R0RequestBody`
  - Request body of createArchiveV2025R0 method
- headers `CreateArchiveV2025R0Headers`
  - Headers of createArchiveV2025R0 method


### Returns

This function returns a value of type `ArchiveV2025R0`.

Returns a new archive object.


## Delete archive

Permanently deletes an archive.

This operation is performed by calling function `deleteArchiveByIdV2025R0`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/v2025.0/delete-archives-id/).

<!-- sample delete_archives_id_v2025.0 -->
```
client.getArchives().deleteArchiveByIdV2025R0(archive.getId())
```

### Arguments

- archiveId `String`
  - The ID of the archive. Example: "982312"
- headers `DeleteArchiveByIdV2025R0Headers`
  - Headers of deleteArchiveByIdV2025R0 method


### Returns

This function returns a value of type `void`.

Returns an empty response when the archive has been deleted.


