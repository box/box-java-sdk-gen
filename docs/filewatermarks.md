# FileWatermarksManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/filewatermarks.md](https://github.com/box/box-java-sdk/blob/main/docs/filewatermarks.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [Get watermark on file](#get-watermark-on-file)
- [Apply watermark to file](#apply-watermark-to-file)
- [Remove watermark from file](#remove-watermark-from-file)

## Get watermark on file

Retrieve the watermark for a file.

This operation is performed by calling function `getFileWatermark`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-files-id-watermark/).

<!-- sample get_files_id_watermark -->
```
client.getFileWatermarks().getFileWatermark(file.getId())
```

### Arguments

- fileId `String`
  - The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://*.app.box.com/files/123` the `file_id` is `123`. Example: "12345"
- headers `GetFileWatermarkHeaders`
  - Headers of getFileWatermark method


### Returns

This function returns a value of type `Watermark`.

Returns an object containing information about the
watermark associated for to this file.


## Apply watermark to file

Applies or update a watermark on a file.

This operation is performed by calling function `updateFileWatermark`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/put-files-id-watermark/).

<!-- sample put_files_id_watermark -->
```
client.getFileWatermarks().updateFileWatermark(file.getId(), new UpdateFileWatermarkRequestBody(new UpdateFileWatermarkRequestBodyWatermarkField.Builder().imprint(UpdateFileWatermarkRequestBodyWatermarkImprintField.DEFAULT).build()))
```

### Arguments

- fileId `String`
  - The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://*.app.box.com/files/123` the `file_id` is `123`. Example: "12345"
- requestBody `UpdateFileWatermarkRequestBody`
  - Request body of updateFileWatermark method
- headers `UpdateFileWatermarkHeaders`
  - Headers of updateFileWatermark method


### Returns

This function returns a value of type `Watermark`.

Returns an updated watermark if a watermark already
existed on this file.Returns a new watermark if no watermark existed on
this file yet.


## Remove watermark from file

Removes the watermark from a file.

This operation is performed by calling function `deleteFileWatermark`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/delete-files-id-watermark/).

<!-- sample delete_files_id_watermark -->
```
client.getFileWatermarks().deleteFileWatermark(file.getId())
```

### Arguments

- fileId `String`
  - The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://*.app.box.com/files/123` the `file_id` is `123`. Example: "12345"
- headers `DeleteFileWatermarkHeaders`
  - Headers of deleteFileWatermark method


### Returns

This function returns a value of type `void`.

Removes the watermark and returns an empty response.


