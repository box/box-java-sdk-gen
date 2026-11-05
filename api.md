# API Reference

> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central. `box-java-sdk` v10 includes every manager listed below, plus newer ones.
> To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).

This file lists every manager and method exposed on `BoxClient`. For setup, authentication, and usage examples, see [README.md](README.md). Each section links to a page in [docs/](docs/README.md) with code samples. Parameters marked `?` are optional.

# Client

See [docs/Client.md](docs/Client.md) and [docs/Configuration.md](docs/Configuration.md).

Methods:

- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">makeRequest</a>(fetchOptions) -> FetchResponse</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withAsUserHeader</a>(userId) -> BoxClient</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withSuppressedNotifications</a>() -> BoxClient</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withExtraHeaders</a>(extraHeaders?) -> BoxClient</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withCustomBaseUrls</a>(baseUrls) -> BoxClient</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withProxy</a>(config) -> BoxClient</code>
- <code>client.<a href="./src/main/java/com/box/sdkgen/client/BoxClient.java">withInterceptors</a>(interceptors) -> BoxClient</code>

# Authorization

Examples: [docs/authorization.md](docs/authorization.md)

Methods:

- <code title="get /authorize">client.authorization.<a href="./src/main/java/com/box/sdkgen/managers/authorization/AuthorizationManager.java">authorizeUser</a>(queryParams, headers?) -> void</code>
- <code title="post /oauth2/token">client.authorization.<a href="./src/main/java/com/box/sdkgen/managers/authorization/AuthorizationManager.java">requestAccessToken</a>(requestBody, headers?) -> AccessToken</code>
- <code title="post /oauth2/token">client.authorization.<a href="./src/main/java/com/box/sdkgen/managers/authorization/AuthorizationManager.java">refreshAccessToken</a>(requestBody, headers?) -> AccessToken</code>
- <code title="post /oauth2/revoke">client.authorization.<a href="./src/main/java/com/box/sdkgen/managers/authorization/AuthorizationManager.java">revokeAccessToken</a>(requestBody, headers?) -> void</code>

# Files

Examples: [docs/files.md](docs/files.md)

Methods:

- <code title="get /2.0/files/{fileId}">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">getFileById</a>(fileId, queryParams?, headers?) -> FileFull</code>
- <code title="put /2.0/files/{fileId}">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">updateFileById</a>(fileId, requestBody?, queryParams?, headers?) -> FileFull</code>
- <code title="delete /2.0/files/{fileId}">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">deleteFileById</a>(fileId, headers?) -> void</code>
- <code title="post /2.0/files/{fileId}/copy">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">copyFile</a>(fileId, requestBody, queryParams?, headers?) -> FileFull</code>
- <code title="get /2.0/files/{fileId}/thumbnail.{extension}">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">getFileThumbnailUrl</a>(fileId, extension, queryParams?, headers?) -> String</code>
- <code title="get /2.0/files/{fileId}/thumbnail.{extension}">client.files.<a href="./src/main/java/com/box/sdkgen/managers/files/FilesManager.java">getFileThumbnailById</a>(fileId, extension, queryParams?, headers?) -> InputStream</code>

# Trashed files

Examples: [docs/trashedfiles.md](docs/trashedfiles.md)

Methods:

- <code title="post /2.0/files/{fileId}">client.trashedFiles.<a href="./src/main/java/com/box/sdkgen/managers/trashedfiles/TrashedFilesManager.java">restoreFileFromTrash</a>(fileId, requestBody?, queryParams?, headers?) -> TrashFileRestored</code>
- <code title="get /2.0/files/{fileId}/trash">client.trashedFiles.<a href="./src/main/java/com/box/sdkgen/managers/trashedfiles/TrashedFilesManager.java">getTrashedFileById</a>(fileId, queryParams?, headers?) -> TrashFile</code>
- <code title="delete /2.0/files/{fileId}/trash">client.trashedFiles.<a href="./src/main/java/com/box/sdkgen/managers/trashedfiles/TrashedFilesManager.java">deleteTrashedFileById</a>(fileId, headers?) -> void</code>

# App item associations

Examples: [docs/appitemassociations.md](docs/appitemassociations.md)

Methods:

- <code title="get /2.0/files/{fileId}/app_item_associations">client.appItemAssociations.<a href="./src/main/java/com/box/sdkgen/managers/appitemassociations/AppItemAssociationsManager.java">getFileAppItemAssociations</a>(fileId, queryParams?, headers?) -> AppItemAssociations</code>
- <code title="get /2.0/folders/{folderId}/app_item_associations">client.appItemAssociations.<a href="./src/main/java/com/box/sdkgen/managers/appitemassociations/AppItemAssociationsManager.java">getFolderAppItemAssociations</a>(folderId, queryParams?, headers?) -> AppItemAssociations</code>

# Downloads

Examples: [docs/downloads.md](docs/downloads.md)

Methods:

- <code title="get /2.0/files/{fileId}/content">client.downloads.<a href="./src/main/java/com/box/sdkgen/managers/downloads/DownloadsManager.java">getDownloadFileUrl</a>(fileId, queryParams?, headers?) -> String</code>
- <code title="get /2.0/files/{fileId}/content">client.downloads.<a href="./src/main/java/com/box/sdkgen/managers/downloads/DownloadsManager.java">downloadFile</a>(fileId, queryParams?, headers?) -> InputStream</code>
- <code>client.downloads.<a href="./src/main/java/com/box/sdkgen/managers/downloads/DownloadsManager.java">downloadFileToOutputStream</a>(fileId, outputStream, queryParams?, headers?) -> void</code>

# Uploads

Examples: [docs/uploads.md](docs/uploads.md)

Methods:

- <code title="post /2.0/files/{fileId}/content">client.uploads.<a href="./src/main/java/com/box/sdkgen/managers/uploads/UploadsManager.java">uploadFileVersion</a>(fileId, requestBody, queryParams?, headers?) -> Files</code>
- <code title="options /2.0/files/content">client.uploads.<a href="./src/main/java/com/box/sdkgen/managers/uploads/UploadsManager.java">preflightFileUploadCheck</a>(requestBody?, headers?) -> UploadUrl</code>
- <code title="post /2.0/files/content">client.uploads.<a href="./src/main/java/com/box/sdkgen/managers/uploads/UploadsManager.java">uploadFile</a>(requestBody, queryParams?, headers?) -> Files</code>
- <code>client.uploads.<a href="./src/main/java/com/box/sdkgen/managers/uploads/UploadsManager.java">uploadWithPreflightCheck</a>(requestBody, queryParams?, headers?) -> Files</code>

# Chunked uploads

Examples: [docs/chunkeduploads.md](docs/chunkeduploads.md)

Methods:

- <code title="post /2.0/files/upload_sessions">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">createFileUploadSession</a>(requestBody, headers?) -> UploadSession</code>
- <code title="post /2.0/files/{fileId}/upload_sessions">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">createFileUploadSessionForExistingFile</a>(fileId, requestBody, headers?) -> UploadSession</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">getFileUploadSessionByUrl</a>(url, headers?) -> UploadSession</code>
- <code title="get /2.0/files/upload_sessions/{uploadSessionId}">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">getFileUploadSessionById</a>(uploadSessionId, headers?) -> UploadSession</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">uploadFilePartByUrl</a>(url, requestBody, headers) -> UploadedPart</code>
- <code title="put /2.0/files/upload_sessions/{uploadSessionId}">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">uploadFilePart</a>(uploadSessionId, requestBody, headers) -> UploadedPart</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">deleteFileUploadSessionByUrl</a>(url, headers?) -> void</code>
- <code title="delete /2.0/files/upload_sessions/{uploadSessionId}">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">deleteFileUploadSessionById</a>(uploadSessionId, headers?) -> void</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">getFileUploadSessionPartsByUrl</a>(url, queryParams?, headers?) -> UploadParts</code>
- <code title="get /2.0/files/upload_sessions/{uploadSessionId}/parts">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">getFileUploadSessionParts</a>(uploadSessionId, queryParams?, headers?) -> UploadParts</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">createFileUploadSessionCommitByUrl</a>(url, requestBody, headers) -> Files</code>
- <code title="post /2.0/files/upload_sessions/{uploadSessionId}/commit">client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">createFileUploadSessionCommit</a>(uploadSessionId, requestBody, headers) -> Files</code>
- <code>client.chunkedUploads.<a href="./src/main/java/com/box/sdkgen/managers/chunkeduploads/ChunkedUploadsManager.java">uploadBigFile</a>(file, fileName, fileSize, parentFolderId) -> FileFull</code>

# List collaborations

Examples: [docs/listcollaborations.md](docs/listcollaborations.md)

Methods:

- <code title="get /2.0/files/{fileId}/collaborations">client.listCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/listcollaborations/ListCollaborationsManager.java">getFileCollaborations</a>(fileId, queryParams?, headers?) -> Collaborations</code>
- <code title="get /2.0/folders/{folderId}/collaborations">client.listCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/listcollaborations/ListCollaborationsManager.java">getFolderCollaborations</a>(folderId, queryParams?, headers?) -> Collaborations</code>
- <code title="get /2.0/collaborations">client.listCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/listcollaborations/ListCollaborationsManager.java">getCollaborations</a>(queryParams, headers?) -> CollaborationsOffsetPaginated</code>
- <code title="get /2.0/groups/{groupId}/collaborations">client.listCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/listcollaborations/ListCollaborationsManager.java">getGroupCollaborations</a>(groupId, queryParams?, headers?) -> CollaborationsOffsetPaginated</code>

# Comments

Examples: [docs/comments.md](docs/comments.md)

Methods:

- <code title="get /2.0/files/{fileId}/comments">client.comments.<a href="./src/main/java/com/box/sdkgen/managers/comments/CommentsManager.java">getFileComments</a>(fileId, queryParams?, headers?) -> Comments</code>
- <code title="get /2.0/comments/{commentId}">client.comments.<a href="./src/main/java/com/box/sdkgen/managers/comments/CommentsManager.java">getCommentById</a>(commentId, queryParams?, headers?) -> CommentFull</code>
- <code title="put /2.0/comments/{commentId}">client.comments.<a href="./src/main/java/com/box/sdkgen/managers/comments/CommentsManager.java">updateCommentById</a>(commentId, requestBody?, queryParams?, headers?) -> CommentFull</code>
- <code title="delete /2.0/comments/{commentId}">client.comments.<a href="./src/main/java/com/box/sdkgen/managers/comments/CommentsManager.java">deleteCommentById</a>(commentId, headers?) -> void</code>
- <code title="post /2.0/comments">client.comments.<a href="./src/main/java/com/box/sdkgen/managers/comments/CommentsManager.java">createComment</a>(requestBody, queryParams?, headers?) -> CommentFull</code>

# Tasks

Examples: [docs/tasks.md](docs/tasks.md)

Methods:

- <code title="get /2.0/files/{fileId}/tasks">client.tasks.<a href="./src/main/java/com/box/sdkgen/managers/tasks/TasksManager.java">getFileTasks</a>(fileId, headers?) -> Tasks</code>
- <code title="post /2.0/tasks">client.tasks.<a href="./src/main/java/com/box/sdkgen/managers/tasks/TasksManager.java">createTask</a>(requestBody, headers?) -> Task</code>
- <code title="get /2.0/tasks/{taskId}">client.tasks.<a href="./src/main/java/com/box/sdkgen/managers/tasks/TasksManager.java">getTaskById</a>(taskId, headers?) -> Task</code>
- <code title="put /2.0/tasks/{taskId}">client.tasks.<a href="./src/main/java/com/box/sdkgen/managers/tasks/TasksManager.java">updateTaskById</a>(taskId, requestBody?, headers?) -> Task</code>
- <code title="delete /2.0/tasks/{taskId}">client.tasks.<a href="./src/main/java/com/box/sdkgen/managers/tasks/TasksManager.java">deleteTaskById</a>(taskId, headers?) -> void</code>

# File versions

Examples: [docs/fileversions.md](docs/fileversions.md)

Methods:

- <code title="get /2.0/files/{fileId}/versions">client.fileVersions.<a href="./src/main/java/com/box/sdkgen/managers/fileversions/FileVersionsManager.java">getFileVersions</a>(fileId, queryParams?, headers?) -> FileVersions</code>
- <code title="get /2.0/files/{fileId}/versions/{fileVersionId}">client.fileVersions.<a href="./src/main/java/com/box/sdkgen/managers/fileversions/FileVersionsManager.java">getFileVersionById</a>(fileId, fileVersionId, queryParams?, headers?) -> FileVersionFull</code>
- <code title="delete /2.0/files/{fileId}/versions/{fileVersionId}">client.fileVersions.<a href="./src/main/java/com/box/sdkgen/managers/fileversions/FileVersionsManager.java">deleteFileVersionById</a>(fileId, fileVersionId, headers?) -> void</code>
- <code title="put /2.0/files/{fileId}/versions/{fileVersionId}">client.fileVersions.<a href="./src/main/java/com/box/sdkgen/managers/fileversions/FileVersionsManager.java">updateFileVersionById</a>(fileId, fileVersionId, requestBody?, headers?) -> FileVersionFull</code>
- <code title="post /2.0/files/{fileId}/versions/current">client.fileVersions.<a href="./src/main/java/com/box/sdkgen/managers/fileversions/FileVersionsManager.java">promoteFileVersion</a>(fileId, requestBody?, queryParams?, headers?) -> FileVersionFull</code>

# File metadata

Examples: [docs/filemetadata.md](docs/filemetadata.md)

Methods:

- <code title="get /2.0/files/{fileId}/metadata">client.fileMetadata.<a href="./src/main/java/com/box/sdkgen/managers/filemetadata/FileMetadataManager.java">getFileMetadata</a>(fileId, headers?) -> Metadatas</code>
- <code title="get /2.0/files/{fileId}/metadata/{scope}/{templateKey}">client.fileMetadata.<a href="./src/main/java/com/box/sdkgen/managers/filemetadata/FileMetadataManager.java">getFileMetadataById</a>(fileId, scope, templateKey, headers?) -> MetadataFull</code>
- <code title="post /2.0/files/{fileId}/metadata/{scope}/{templateKey}">client.fileMetadata.<a href="./src/main/java/com/box/sdkgen/managers/filemetadata/FileMetadataManager.java">createFileMetadataById</a>(fileId, scope, templateKey, requestBody, headers?) -> MetadataFull</code>
- <code title="put /2.0/files/{fileId}/metadata/{scope}/{templateKey}">client.fileMetadata.<a href="./src/main/java/com/box/sdkgen/managers/filemetadata/FileMetadataManager.java">updateFileMetadataById</a>(fileId, scope, templateKey, requestBody, headers?) -> MetadataFull</code>
- <code title="delete /2.0/files/{fileId}/metadata/{scope}/{templateKey}">client.fileMetadata.<a href="./src/main/java/com/box/sdkgen/managers/filemetadata/FileMetadataManager.java">deleteFileMetadataById</a>(fileId, scope, templateKey, headers?) -> void</code>

# File classifications

Examples: [docs/fileclassifications.md](docs/fileclassifications.md)

Methods:

- <code title="get /2.0/files/{fileId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.fileClassifications.<a href="./src/main/java/com/box/sdkgen/managers/fileclassifications/FileClassificationsManager.java">getClassificationOnFile</a>(fileId, headers?) -> Classification</code>
- <code title="post /2.0/files/{fileId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.fileClassifications.<a href="./src/main/java/com/box/sdkgen/managers/fileclassifications/FileClassificationsManager.java">addClassificationToFile</a>(fileId, requestBody?, headers?) -> Classification</code>
- <code title="put /2.0/files/{fileId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.fileClassifications.<a href="./src/main/java/com/box/sdkgen/managers/fileclassifications/FileClassificationsManager.java">updateClassificationOnFile</a>(fileId, requestBody, headers?) -> Classification</code>
- <code title="delete /2.0/files/{fileId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.fileClassifications.<a href="./src/main/java/com/box/sdkgen/managers/fileclassifications/FileClassificationsManager.java">deleteClassificationFromFile</a>(fileId, headers?) -> void</code>

# Skills

Examples: [docs/skills.md](docs/skills.md)

Methods:

- <code title="get /2.0/files/{fileId}/metadata/global/boxSkillsCards">client.skills.<a href="./src/main/java/com/box/sdkgen/managers/skills/SkillsManager.java">getBoxSkillCardsOnFile</a>(fileId, headers?) -> SkillCardsMetadata</code>
- <code title="post /2.0/files/{fileId}/metadata/global/boxSkillsCards">client.skills.<a href="./src/main/java/com/box/sdkgen/managers/skills/SkillsManager.java">createBoxSkillCardsOnFile</a>(fileId, requestBody, headers?) -> SkillCardsMetadata</code>
- <code title="put /2.0/files/{fileId}/metadata/global/boxSkillsCards">client.skills.<a href="./src/main/java/com/box/sdkgen/managers/skills/SkillsManager.java">updateBoxSkillCardsOnFile</a>(fileId, requestBody, headers?) -> SkillCardsMetadata</code>
- <code title="delete /2.0/files/{fileId}/metadata/global/boxSkillsCards">client.skills.<a href="./src/main/java/com/box/sdkgen/managers/skills/SkillsManager.java">deleteBoxSkillCardsFromFile</a>(fileId, headers?) -> void</code>
- <code title="put /2.0/skill_invocations/{skillId}">client.skills.<a href="./src/main/java/com/box/sdkgen/managers/skills/SkillsManager.java">updateAllSkillCardsOnFile</a>(skillId, requestBody, headers?) -> void</code>

# File watermarks

Examples: [docs/filewatermarks.md](docs/filewatermarks.md)

Methods:

- <code title="get /2.0/files/{fileId}/watermark">client.fileWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/filewatermarks/FileWatermarksManager.java">getFileWatermark</a>(fileId, headers?) -> Watermark</code>
- <code title="put /2.0/files/{fileId}/watermark">client.fileWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/filewatermarks/FileWatermarksManager.java">updateFileWatermark</a>(fileId, requestBody, headers?) -> Watermark</code>
- <code title="delete /2.0/files/{fileId}/watermark">client.fileWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/filewatermarks/FileWatermarksManager.java">deleteFileWatermark</a>(fileId, headers?) -> void</code>

# File requests

Examples: [docs/filerequests.md](docs/filerequests.md)

Methods:

- <code title="get /2.0/file_requests/{fileRequestId}">client.fileRequests.<a href="./src/main/java/com/box/sdkgen/managers/filerequests/FileRequestsManager.java">getFileRequestById</a>(fileRequestId, headers?) -> FileRequest</code>
- <code title="put /2.0/file_requests/{fileRequestId}">client.fileRequests.<a href="./src/main/java/com/box/sdkgen/managers/filerequests/FileRequestsManager.java">updateFileRequestById</a>(fileRequestId, requestBody, headers?) -> FileRequest</code>
- <code title="delete /2.0/file_requests/{fileRequestId}">client.fileRequests.<a href="./src/main/java/com/box/sdkgen/managers/filerequests/FileRequestsManager.java">deleteFileRequestById</a>(fileRequestId, headers?) -> void</code>
- <code title="post /2.0/file_requests/{fileRequestId}/copy">client.fileRequests.<a href="./src/main/java/com/box/sdkgen/managers/filerequests/FileRequestsManager.java">createFileRequestCopy</a>(fileRequestId, requestBody, headers?) -> FileRequest</code>

# Folders

Examples: [docs/folders.md](docs/folders.md)

Methods:

- <code title="get /2.0/folders/{folderId}">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">getFolderById</a>(folderId, queryParams?, headers?) -> FolderFull</code>
- <code title="put /2.0/folders/{folderId}">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">updateFolderById</a>(folderId, requestBody?, queryParams?, headers?) -> FolderFull</code>
- <code title="delete /2.0/folders/{folderId}">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">deleteFolderById</a>(folderId, queryParams?, headers?) -> void</code>
- <code title="get /2.0/folders/{folderId}/items">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">getFolderItems</a>(folderId, queryParams?, headers?) -> Items</code>
- <code title="post /2.0/folders">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">createFolder</a>(requestBody, queryParams?, headers?) -> FolderFull</code>
- <code title="post /2.0/folders/{folderId}/copy">client.folders.<a href="./src/main/java/com/box/sdkgen/managers/folders/FoldersManager.java">copyFolder</a>(folderId, requestBody, queryParams?, headers?) -> FolderFull</code>

# Trashed folders

Examples: [docs/trashedfolders.md](docs/trashedfolders.md)

Methods:

- <code title="post /2.0/folders/{folderId}">client.trashedFolders.<a href="./src/main/java/com/box/sdkgen/managers/trashedfolders/TrashedFoldersManager.java">restoreFolderFromTrash</a>(folderId, requestBody?, queryParams?, headers?) -> TrashFolderRestored</code>
- <code title="get /2.0/folders/{folderId}/trash">client.trashedFolders.<a href="./src/main/java/com/box/sdkgen/managers/trashedfolders/TrashedFoldersManager.java">getTrashedFolderById</a>(folderId, queryParams?, headers?) -> TrashFolder</code>
- <code title="delete /2.0/folders/{folderId}/trash">client.trashedFolders.<a href="./src/main/java/com/box/sdkgen/managers/trashedfolders/TrashedFoldersManager.java">deleteTrashedFolderById</a>(folderId, headers?) -> void</code>

# Folder metadata

Examples: [docs/foldermetadata.md](docs/foldermetadata.md)

Methods:

- <code title="get /2.0/folders/{folderId}/metadata">client.folderMetadata.<a href="./src/main/java/com/box/sdkgen/managers/foldermetadata/FolderMetadataManager.java">getFolderMetadata</a>(folderId, headers?) -> Metadatas</code>
- <code title="get /2.0/folders/{folderId}/metadata/{scope}/{templateKey}">client.folderMetadata.<a href="./src/main/java/com/box/sdkgen/managers/foldermetadata/FolderMetadataManager.java">getFolderMetadataById</a>(folderId, scope, templateKey, headers?) -> MetadataFull</code>
- <code title="post /2.0/folders/{folderId}/metadata/{scope}/{templateKey}">client.folderMetadata.<a href="./src/main/java/com/box/sdkgen/managers/foldermetadata/FolderMetadataManager.java">createFolderMetadataById</a>(folderId, scope, templateKey, requestBody, headers?) -> MetadataFull</code>
- <code title="put /2.0/folders/{folderId}/metadata/{scope}/{templateKey}">client.folderMetadata.<a href="./src/main/java/com/box/sdkgen/managers/foldermetadata/FolderMetadataManager.java">updateFolderMetadataById</a>(folderId, scope, templateKey, requestBody, headers?) -> MetadataFull</code>
- <code title="delete /2.0/folders/{folderId}/metadata/{scope}/{templateKey}">client.folderMetadata.<a href="./src/main/java/com/box/sdkgen/managers/foldermetadata/FolderMetadataManager.java">deleteFolderMetadataById</a>(folderId, scope, templateKey, headers?) -> void</code>

# Folder classifications

Examples: [docs/folderclassifications.md](docs/folderclassifications.md)

Methods:

- <code title="get /2.0/folders/{folderId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.folderClassifications.<a href="./src/main/java/com/box/sdkgen/managers/folderclassifications/FolderClassificationsManager.java">getClassificationOnFolder</a>(folderId, headers?) -> Classification</code>
- <code title="post /2.0/folders/{folderId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.folderClassifications.<a href="./src/main/java/com/box/sdkgen/managers/folderclassifications/FolderClassificationsManager.java">addClassificationToFolder</a>(folderId, requestBody?, headers?) -> Classification</code>
- <code title="put /2.0/folders/{folderId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.folderClassifications.<a href="./src/main/java/com/box/sdkgen/managers/folderclassifications/FolderClassificationsManager.java">updateClassificationOnFolder</a>(folderId, requestBody, headers?) -> Classification</code>
- <code title="delete /2.0/folders/{folderId}/metadata/enterprise/securityClassification-6VMVochwUWo">client.folderClassifications.<a href="./src/main/java/com/box/sdkgen/managers/folderclassifications/FolderClassificationsManager.java">deleteClassificationFromFolder</a>(folderId, headers?) -> void</code>

# Trashed items

Examples: [docs/trasheditems.md](docs/trasheditems.md)

Methods:

- <code title="get /2.0/folders/trash/items">client.trashedItems.<a href="./src/main/java/com/box/sdkgen/managers/trasheditems/TrashedItemsManager.java">getTrashedItems</a>(queryParams?, headers?) -> Items</code>

# Folder watermarks

Examples: [docs/folderwatermarks.md](docs/folderwatermarks.md)

Methods:

- <code title="get /2.0/folders/{folderId}/watermark">client.folderWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/folderwatermarks/FolderWatermarksManager.java">getFolderWatermark</a>(folderId, headers?) -> Watermark</code>
- <code title="put /2.0/folders/{folderId}/watermark">client.folderWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/folderwatermarks/FolderWatermarksManager.java">updateFolderWatermark</a>(folderId, requestBody, headers?) -> Watermark</code>
- <code title="delete /2.0/folders/{folderId}/watermark">client.folderWatermarks.<a href="./src/main/java/com/box/sdkgen/managers/folderwatermarks/FolderWatermarksManager.java">deleteFolderWatermark</a>(folderId, headers?) -> void</code>

# Folder locks

Examples: [docs/folderlocks.md](docs/folderlocks.md)

Methods:

- <code title="get /2.0/folder_locks">client.folderLocks.<a href="./src/main/java/com/box/sdkgen/managers/folderlocks/FolderLocksManager.java">getFolderLocks</a>(queryParams, headers?) -> FolderLocks</code>
- <code title="post /2.0/folder_locks">client.folderLocks.<a href="./src/main/java/com/box/sdkgen/managers/folderlocks/FolderLocksManager.java">createFolderLock</a>(requestBody, headers?) -> FolderLock</code>
- <code title="delete /2.0/folder_locks/{folderLockId}">client.folderLocks.<a href="./src/main/java/com/box/sdkgen/managers/folderlocks/FolderLocksManager.java">deleteFolderLockById</a>(folderLockId, headers?) -> void</code>

# Metadata templates

Examples: [docs/metadatatemplates.md](docs/metadatatemplates.md)

Methods:

- <code title="get /2.0/metadata_templates">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">getMetadataTemplatesByInstanceId</a>(queryParams, headers?) -> MetadataTemplates</code>
- <code title="get /2.0/metadata_templates/{scope}/{templateKey}/schema">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">getMetadataTemplate</a>(scope, templateKey, headers?) -> MetadataTemplate</code>
- <code title="put /2.0/metadata_templates/{scope}/{templateKey}/schema">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">updateMetadataTemplate</a>(scope, templateKey, requestBody, headers?) -> MetadataTemplate</code>
- <code title="delete /2.0/metadata_templates/{scope}/{templateKey}/schema">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">deleteMetadataTemplate</a>(scope, templateKey, headers?) -> void</code>
- <code title="get /2.0/metadata_templates/{templateId}">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">getMetadataTemplateById</a>(templateId, headers?) -> MetadataTemplate</code>
- <code title="get /2.0/metadata_templates/global">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">getGlobalMetadataTemplates</a>(queryParams?, headers?) -> MetadataTemplates</code>
- <code title="get /2.0/metadata_templates/enterprise">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">getEnterpriseMetadataTemplates</a>(queryParams?, headers?) -> MetadataTemplates</code>
- <code title="post /2.0/metadata_templates/schema">client.metadataTemplates.<a href="./src/main/java/com/box/sdkgen/managers/metadatatemplates/MetadataTemplatesManager.java">createMetadataTemplate</a>(requestBody, headers?) -> MetadataTemplate</code>

# Classifications

Examples: [docs/classifications.md](docs/classifications.md)

Methods:

- <code title="get /2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema">client.classifications.<a href="./src/main/java/com/box/sdkgen/managers/classifications/ClassificationsManager.java">getClassificationTemplate</a>(headers?) -> ClassificationTemplate</code>
- <code title="put /2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema">client.classifications.<a href="./src/main/java/com/box/sdkgen/managers/classifications/ClassificationsManager.java">addClassification</a>(requestBody, headers?) -> ClassificationTemplate</code>
- <code title="put /2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema">client.classifications.<a href="./src/main/java/com/box/sdkgen/managers/classifications/ClassificationsManager.java">updateClassification</a>(requestBody, headers?) -> ClassificationTemplate</code>
- <code title="post /2.0/metadata_templates/schema">client.classifications.<a href="./src/main/java/com/box/sdkgen/managers/classifications/ClassificationsManager.java">createClassificationTemplate</a>(requestBody, headers?) -> ClassificationTemplate</code>

# Metadata cascade policies

Examples: [docs/metadatacascadepolicies.md](docs/metadatacascadepolicies.md)

Methods:

- <code title="get /2.0/metadata_cascade_policies">client.metadataCascadePolicies.<a href="./src/main/java/com/box/sdkgen/managers/metadatacascadepolicies/MetadataCascadePoliciesManager.java">getMetadataCascadePolicies</a>(queryParams, headers?) -> MetadataCascadePolicies</code>
- <code title="post /2.0/metadata_cascade_policies">client.metadataCascadePolicies.<a href="./src/main/java/com/box/sdkgen/managers/metadatacascadepolicies/MetadataCascadePoliciesManager.java">createMetadataCascadePolicy</a>(requestBody, headers?) -> MetadataCascadePolicy</code>
- <code title="get /2.0/metadata_cascade_policies/{metadataCascadePolicyId}">client.metadataCascadePolicies.<a href="./src/main/java/com/box/sdkgen/managers/metadatacascadepolicies/MetadataCascadePoliciesManager.java">getMetadataCascadePolicyById</a>(metadataCascadePolicyId, headers?) -> MetadataCascadePolicy</code>
- <code title="delete /2.0/metadata_cascade_policies/{metadataCascadePolicyId}">client.metadataCascadePolicies.<a href="./src/main/java/com/box/sdkgen/managers/metadatacascadepolicies/MetadataCascadePoliciesManager.java">deleteMetadataCascadePolicyById</a>(metadataCascadePolicyId, headers?) -> void</code>
- <code title="post /2.0/metadata_cascade_policies/{metadataCascadePolicyId}/apply">client.metadataCascadePolicies.<a href="./src/main/java/com/box/sdkgen/managers/metadatacascadepolicies/MetadataCascadePoliciesManager.java">applyMetadataCascadePolicy</a>(metadataCascadePolicyId, requestBody, headers?) -> void</code>

# Search

Examples: [docs/search.md](docs/search.md)

Methods:

- <code title="post /2.0/metadata_queries/execute_read">client.search.<a href="./src/main/java/com/box/sdkgen/managers/search/SearchManager.java">searchByMetadataQuery</a>(requestBody, headers?) -> MetadataQueryResults</code>
- <code title="get /2.0/search">client.search.<a href="./src/main/java/com/box/sdkgen/managers/search/SearchManager.java">searchForContent</a>(queryParams?, headers?) -> SearchResultsOrSearchResultsWithSharedLinks</code>

# User collaborations

Examples: [docs/usercollaborations.md](docs/usercollaborations.md)

Methods:

- <code title="get /2.0/collaborations/{collaborationId}">client.userCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/usercollaborations/UserCollaborationsManager.java">getCollaborationById</a>(collaborationId, queryParams?, headers?) -> Collaboration</code>
- <code title="put /2.0/collaborations/{collaborationId}">client.userCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/usercollaborations/UserCollaborationsManager.java">updateCollaborationById</a>(collaborationId, requestBody, headers?) -> Collaboration</code>
- <code title="delete /2.0/collaborations/{collaborationId}">client.userCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/usercollaborations/UserCollaborationsManager.java">deleteCollaborationById</a>(collaborationId, headers?) -> void</code>
- <code title="post /2.0/collaborations">client.userCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/usercollaborations/UserCollaborationsManager.java">createCollaboration</a>(requestBody, queryParams?, headers?) -> Collaboration</code>

# Task assignments

Examples: [docs/taskassignments.md](docs/taskassignments.md)

Methods:

- <code title="get /2.0/tasks/{taskId}/assignments">client.taskAssignments.<a href="./src/main/java/com/box/sdkgen/managers/taskassignments/TaskAssignmentsManager.java">getTaskAssignments</a>(taskId, headers?) -> TaskAssignments</code>
- <code title="post /2.0/task_assignments">client.taskAssignments.<a href="./src/main/java/com/box/sdkgen/managers/taskassignments/TaskAssignmentsManager.java">createTaskAssignment</a>(requestBody, headers?) -> TaskAssignment</code>
- <code title="get /2.0/task_assignments/{taskAssignmentId}">client.taskAssignments.<a href="./src/main/java/com/box/sdkgen/managers/taskassignments/TaskAssignmentsManager.java">getTaskAssignmentById</a>(taskAssignmentId, headers?) -> TaskAssignment</code>
- <code title="put /2.0/task_assignments/{taskAssignmentId}">client.taskAssignments.<a href="./src/main/java/com/box/sdkgen/managers/taskassignments/TaskAssignmentsManager.java">updateTaskAssignmentById</a>(taskAssignmentId, requestBody?, headers?) -> TaskAssignment</code>
- <code title="delete /2.0/task_assignments/{taskAssignmentId}">client.taskAssignments.<a href="./src/main/java/com/box/sdkgen/managers/taskassignments/TaskAssignmentsManager.java">deleteTaskAssignmentById</a>(taskAssignmentId, headers?) -> void</code>

# Shared links files

Examples: [docs/sharedlinksfiles.md](docs/sharedlinksfiles.md)

Methods:

- <code title="get /2.0/shared_items">client.sharedLinksFiles.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfiles/SharedLinksFilesManager.java">findFileForSharedLink</a>(queryParams?, headers) -> FileFull</code>
- <code title="get /2.0/files/{fileId}">client.sharedLinksFiles.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfiles/SharedLinksFilesManager.java">getSharedLinkForFile</a>(fileId, queryParams, headers?) -> FileFull</code>
- <code title="put /2.0/files/{fileId}">client.sharedLinksFiles.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfiles/SharedLinksFilesManager.java">addShareLinkToFile</a>(fileId, requestBody?, queryParams, headers?) -> FileFull</code>
- <code title="put /2.0/files/{fileId}">client.sharedLinksFiles.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfiles/SharedLinksFilesManager.java">updateSharedLinkOnFile</a>(fileId, requestBody?, queryParams, headers?) -> FileFull</code>
- <code title="put /2.0/files/{fileId}">client.sharedLinksFiles.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfiles/SharedLinksFilesManager.java">removeSharedLinkFromFile</a>(fileId, requestBody?, queryParams, headers?) -> FileFull</code>

# Shared links folders

Examples: [docs/sharedlinksfolders.md](docs/sharedlinksfolders.md)

Methods:

- <code title="get /2.0/shared_items">client.sharedLinksFolders.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfolders/SharedLinksFoldersManager.java">findFolderForSharedLink</a>(queryParams?, headers) -> FolderFull</code>
- <code title="get /2.0/folders/{folderId}">client.sharedLinksFolders.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfolders/SharedLinksFoldersManager.java">getSharedLinkForFolder</a>(folderId, queryParams, headers?) -> FolderFull</code>
- <code title="put /2.0/folders/{folderId}">client.sharedLinksFolders.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfolders/SharedLinksFoldersManager.java">addShareLinkToFolder</a>(folderId, requestBody?, queryParams, headers?) -> FolderFull</code>
- <code title="put /2.0/folders/{folderId}">client.sharedLinksFolders.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfolders/SharedLinksFoldersManager.java">updateSharedLinkOnFolder</a>(folderId, requestBody?, queryParams, headers?) -> FolderFull</code>
- <code title="put /2.0/folders/{folderId}">client.sharedLinksFolders.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksfolders/SharedLinksFoldersManager.java">removeSharedLinkFromFolder</a>(folderId, requestBody?, queryParams, headers?) -> FolderFull</code>

# Web links

Examples: [docs/weblinks.md](docs/weblinks.md)

Methods:

- <code title="post /2.0/web_links">client.webLinks.<a href="./src/main/java/com/box/sdkgen/managers/weblinks/WebLinksManager.java">createWebLink</a>(requestBody, headers?) -> WebLink</code>
- <code title="get /2.0/web_links/{webLinkId}">client.webLinks.<a href="./src/main/java/com/box/sdkgen/managers/weblinks/WebLinksManager.java">getWebLinkById</a>(webLinkId, headers?) -> WebLink</code>
- <code title="put /2.0/web_links/{webLinkId}">client.webLinks.<a href="./src/main/java/com/box/sdkgen/managers/weblinks/WebLinksManager.java">updateWebLinkById</a>(webLinkId, requestBody?, headers?) -> WebLink</code>
- <code title="delete /2.0/web_links/{webLinkId}">client.webLinks.<a href="./src/main/java/com/box/sdkgen/managers/weblinks/WebLinksManager.java">deleteWebLinkById</a>(webLinkId, headers?) -> void</code>

# Trashed web links

Examples: [docs/trashedweblinks.md](docs/trashedweblinks.md)

Methods:

- <code title="post /2.0/web_links/{webLinkId}">client.trashedWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/trashedweblinks/TrashedWebLinksManager.java">restoreWeblinkFromTrash</a>(webLinkId, requestBody?, queryParams?, headers?) -> TrashWebLinkRestored</code>
- <code title="get /2.0/web_links/{webLinkId}/trash">client.trashedWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/trashedweblinks/TrashedWebLinksManager.java">getTrashedWebLinkById</a>(webLinkId, queryParams?, headers?) -> TrashWebLink</code>
- <code title="delete /2.0/web_links/{webLinkId}/trash">client.trashedWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/trashedweblinks/TrashedWebLinksManager.java">deleteTrashedWebLinkById</a>(webLinkId, headers?) -> void</code>

# Shared links web links

Examples: [docs/sharedlinksweblinks.md](docs/sharedlinksweblinks.md)

Methods:

- <code title="get /2.0/shared_items">client.sharedLinksWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksweblinks/SharedLinksWebLinksManager.java">findWebLinkForSharedLink</a>(queryParams?, headers) -> WebLink</code>
- <code title="get /2.0/web_links/{webLinkId}">client.sharedLinksWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksweblinks/SharedLinksWebLinksManager.java">getSharedLinkForWebLink</a>(webLinkId, queryParams, headers?) -> WebLink</code>
- <code title="put /2.0/web_links/{webLinkId}">client.sharedLinksWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksweblinks/SharedLinksWebLinksManager.java">addShareLinkToWebLink</a>(webLinkId, requestBody?, queryParams, headers?) -> WebLink</code>
- <code title="put /2.0/web_links/{webLinkId}">client.sharedLinksWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksweblinks/SharedLinksWebLinksManager.java">updateSharedLinkOnWebLink</a>(webLinkId, requestBody?, queryParams, headers?) -> WebLink</code>
- <code title="put /2.0/web_links/{webLinkId}">client.sharedLinksWebLinks.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksweblinks/SharedLinksWebLinksManager.java">removeSharedLinkFromWebLink</a>(webLinkId, requestBody?, queryParams, headers?) -> WebLink</code>

# Shared links app items

Examples: [docs/sharedlinksappitems.md](docs/sharedlinksappitems.md)

Methods:

- <code title="get /2.0/shared_items">client.sharedLinksAppItems.<a href="./src/main/java/com/box/sdkgen/managers/sharedlinksappitems/SharedLinksAppItemsManager.java">findAppItemForSharedLink</a>(headers) -> AppItem</code>

# Users

Examples: [docs/users.md](docs/users.md)

Methods:

- <code title="get /2.0/users">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">getUsers</a>(queryParams?, headers?) -> Users</code>
- <code title="post /2.0/users">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">createUser</a>(requestBody, queryParams?, headers?) -> UserFull</code>
- <code title="get /2.0/users/me">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">getUserMe</a>(queryParams?, headers?) -> UserFull</code>
- <code title="get /2.0/users/{userId}">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">getUserById</a>(userId, queryParams?, headers?) -> UserFull</code>
- <code title="put /2.0/users/{userId}">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">updateUserById</a>(userId, requestBody?, queryParams?, headers?) -> UserFull</code>
- <code title="delete /2.0/users/{userId}">client.users.<a href="./src/main/java/com/box/sdkgen/managers/users/UsersManager.java">deleteUserById</a>(userId, queryParams?, headers?) -> void</code>

# Session termination

Examples: [docs/sessiontermination.md](docs/sessiontermination.md)

Methods:

- <code title="post /2.0/users/terminate_sessions">client.sessionTermination.<a href="./src/main/java/com/box/sdkgen/managers/sessiontermination/SessionTerminationManager.java">terminateUsersSessions</a>(requestBody, headers?) -> SessionTerminationMessage</code>
- <code title="post /2.0/groups/terminate_sessions">client.sessionTermination.<a href="./src/main/java/com/box/sdkgen/managers/sessiontermination/SessionTerminationManager.java">terminateGroupsSessions</a>(requestBody, headers?) -> SessionTerminationMessage</code>

# Avatars

Examples: [docs/avatars.md](docs/avatars.md)

Methods:

- <code title="get /2.0/users/{userId}/avatar">client.avatars.<a href="./src/main/java/com/box/sdkgen/managers/avatars/AvatarsManager.java">getUserAvatar</a>(userId, headers?) -> InputStream</code>
- <code title="post /2.0/users/{userId}/avatar">client.avatars.<a href="./src/main/java/com/box/sdkgen/managers/avatars/AvatarsManager.java">createUserAvatar</a>(userId, requestBody, headers?) -> UserAvatar</code>
- <code title="delete /2.0/users/{userId}/avatar">client.avatars.<a href="./src/main/java/com/box/sdkgen/managers/avatars/AvatarsManager.java">deleteUserAvatar</a>(userId, headers?) -> void</code>

# Transfer

Examples: [docs/transfer.md](docs/transfer.md)

Methods:

- <code title="put /2.0/users/{userId}/folders/0">client.transfer.<a href="./src/main/java/com/box/sdkgen/managers/transfer/TransferManager.java">transferOwnedFolder</a>(userId, requestBody, queryParams?, headers?) -> FolderFull</code>

# Email aliases

Examples: [docs/emailaliases.md](docs/emailaliases.md)

Methods:

- <code title="get /2.0/users/{userId}/email_aliases">client.emailAliases.<a href="./src/main/java/com/box/sdkgen/managers/emailaliases/EmailAliasesManager.java">getUserEmailAliases</a>(userId, headers?) -> EmailAliases</code>
- <code title="post /2.0/users/{userId}/email_aliases">client.emailAliases.<a href="./src/main/java/com/box/sdkgen/managers/emailaliases/EmailAliasesManager.java">createUserEmailAlias</a>(userId, requestBody, headers?) -> EmailAlias</code>
- <code title="delete /2.0/users/{userId}/email_aliases/{emailAliasId}">client.emailAliases.<a href="./src/main/java/com/box/sdkgen/managers/emailaliases/EmailAliasesManager.java">deleteUserEmailAliasById</a>(userId, emailAliasId, headers?) -> void</code>

# Memberships

Examples: [docs/memberships.md](docs/memberships.md)

Methods:

- <code title="get /2.0/users/{userId}/memberships">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">getUserMemberships</a>(userId, queryParams?, headers?) -> GroupMemberships</code>
- <code title="get /2.0/groups/{groupId}/memberships">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">getGroupMemberships</a>(groupId, queryParams?, headers?) -> GroupMemberships</code>
- <code title="post /2.0/group_memberships">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">createGroupMembership</a>(requestBody, queryParams?, headers?) -> GroupMembership</code>
- <code title="get /2.0/group_memberships/{groupMembershipId}">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">getGroupMembershipById</a>(groupMembershipId, queryParams?, headers?) -> GroupMembership</code>
- <code title="put /2.0/group_memberships/{groupMembershipId}">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">updateGroupMembershipById</a>(groupMembershipId, requestBody?, queryParams?, headers?) -> GroupMembership</code>
- <code title="delete /2.0/group_memberships/{groupMembershipId}">client.memberships.<a href="./src/main/java/com/box/sdkgen/managers/memberships/MembershipsManager.java">deleteGroupMembershipById</a>(groupMembershipId, headers?) -> void</code>

# Invites

Examples: [docs/invites.md](docs/invites.md)

Methods:

- <code title="post /2.0/invites">client.invites.<a href="./src/main/java/com/box/sdkgen/managers/invites/InvitesManager.java">createInvite</a>(requestBody, queryParams?, headers?) -> Invite</code>
- <code title="get /2.0/invites/{inviteId}">client.invites.<a href="./src/main/java/com/box/sdkgen/managers/invites/InvitesManager.java">getInviteById</a>(inviteId, queryParams?, headers?) -> Invite</code>

# Groups

Examples: [docs/groups.md](docs/groups.md)

Methods:

- <code title="get /2.0/groups">client.groups.<a href="./src/main/java/com/box/sdkgen/managers/groups/GroupsManager.java">getGroups</a>(queryParams?, headers?) -> Groups</code>
- <code title="post /2.0/groups">client.groups.<a href="./src/main/java/com/box/sdkgen/managers/groups/GroupsManager.java">createGroup</a>(requestBody, queryParams?, headers?) -> GroupFull</code>
- <code title="get /2.0/groups/{groupId}">client.groups.<a href="./src/main/java/com/box/sdkgen/managers/groups/GroupsManager.java">getGroupById</a>(groupId, queryParams?, headers?) -> GroupFull</code>
- <code title="put /2.0/groups/{groupId}">client.groups.<a href="./src/main/java/com/box/sdkgen/managers/groups/GroupsManager.java">updateGroupById</a>(groupId, requestBody?, queryParams?, headers?) -> GroupFull</code>
- <code title="delete /2.0/groups/{groupId}">client.groups.<a href="./src/main/java/com/box/sdkgen/managers/groups/GroupsManager.java">deleteGroupById</a>(groupId, headers?) -> void</code>

# Webhooks

Examples: [docs/webhooks.md](docs/webhooks.md)

Methods:

- <code title="get /2.0/webhooks">client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">getWebhooks</a>(queryParams?, headers?) -> Webhooks</code>
- <code title="post /2.0/webhooks">client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">createWebhook</a>(requestBody, headers?) -> Webhook</code>
- <code title="get /2.0/webhooks/{webhookId}">client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">getWebhookById</a>(webhookId, headers?) -> Webhook</code>
- <code title="put /2.0/webhooks/{webhookId}">client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">updateWebhookById</a>(webhookId, requestBody?, headers?) -> Webhook</code>
- <code title="delete /2.0/webhooks/{webhookId}">client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">deleteWebhookById</a>(webhookId, headers?) -> void</code>
- <code>client.webhooks.<a href="./src/main/java/com/box/sdkgen/managers/webhooks/WebhooksManager.java">validateMessage</a>(body, headers, primaryKey, secondaryKey?, maxAge?) -> boolean</code>

# Events

Examples: [docs/events.md](docs/events.md)

Methods:

- <code title="options /2.0/events">client.events.<a href="./src/main/java/com/box/sdkgen/managers/events/EventsManager.java">getEventsWithLongPolling</a>(headers?) -> RealtimeServers</code>
- <code title="get /2.0/events">client.events.<a href="./src/main/java/com/box/sdkgen/managers/events/EventsManager.java">getEvents</a>(queryParams?, headers?) -> Events</code>
- <code>client.events.<a href="./src/main/java/com/box/sdkgen/managers/events/EventsManager.java">getEventStream</a>(queryParams?, headers?) -> EventStream</code>

# Collections

Examples: [docs/collections.md](docs/collections.md)

Methods:

- <code title="get /2.0/collections">client.collections.<a href="./src/main/java/com/box/sdkgen/managers/collections/CollectionsManager.java">getCollections</a>(queryParams?, headers?) -> Collections</code>
- <code title="get /2.0/collections/{collectionId}/items">client.collections.<a href="./src/main/java/com/box/sdkgen/managers/collections/CollectionsManager.java">getCollectionItems</a>(collectionId, queryParams?, headers?) -> ItemsOffsetPaginated</code>
- <code title="get /2.0/collections/{collectionId}">client.collections.<a href="./src/main/java/com/box/sdkgen/managers/collections/CollectionsManager.java">getCollectionById</a>(collectionId, headers?) -> Collection</code>

# Recent items

Examples: [docs/recentitems.md](docs/recentitems.md)

Methods:

- <code title="get /2.0/recent_items">client.recentItems.<a href="./src/main/java/com/box/sdkgen/managers/recentitems/RecentItemsManager.java">getRecentItems</a>(queryParams?, headers?) -> RecentItems</code>

# Retention policies

Examples: [docs/retentionpolicies.md](docs/retentionpolicies.md)

Methods:

- <code title="get /2.0/retention_policies">client.retentionPolicies.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicies/RetentionPoliciesManager.java">getRetentionPolicies</a>(queryParams?, headers?) -> RetentionPolicies</code>
- <code title="post /2.0/retention_policies">client.retentionPolicies.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicies/RetentionPoliciesManager.java">createRetentionPolicy</a>(requestBody, headers?) -> RetentionPolicy</code>
- <code title="get /2.0/retention_policies/{retentionPolicyId}">client.retentionPolicies.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicies/RetentionPoliciesManager.java">getRetentionPolicyById</a>(retentionPolicyId, queryParams?, headers?) -> RetentionPolicy</code>
- <code title="put /2.0/retention_policies/{retentionPolicyId}">client.retentionPolicies.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicies/RetentionPoliciesManager.java">updateRetentionPolicyById</a>(retentionPolicyId, requestBody?, headers?) -> RetentionPolicy</code>
- <code title="delete /2.0/retention_policies/{retentionPolicyId}">client.retentionPolicies.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicies/RetentionPoliciesManager.java">deleteRetentionPolicyById</a>(retentionPolicyId, headers?) -> void</code>

# Retention policy assignments

Examples: [docs/retentionpolicyassignments.md](docs/retentionpolicyassignments.md)

Methods:

- <code title="get /2.0/retention_policies/{retentionPolicyId}/assignments">client.retentionPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicyassignments/RetentionPolicyAssignmentsManager.java">getRetentionPolicyAssignments</a>(retentionPolicyId, queryParams?, headers?) -> RetentionPolicyAssignments</code>
- <code title="post /2.0/retention_policy_assignments">client.retentionPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicyassignments/RetentionPolicyAssignmentsManager.java">createRetentionPolicyAssignment</a>(requestBody, headers?) -> RetentionPolicyAssignment</code>
- <code title="get /2.0/retention_policy_assignments/{retentionPolicyAssignmentId}">client.retentionPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicyassignments/RetentionPolicyAssignmentsManager.java">getRetentionPolicyAssignmentById</a>(retentionPolicyAssignmentId, queryParams?, headers?) -> RetentionPolicyAssignment</code>
- <code title="delete /2.0/retention_policy_assignments/{retentionPolicyAssignmentId}">client.retentionPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicyassignments/RetentionPolicyAssignmentsManager.java">deleteRetentionPolicyAssignmentById</a>(retentionPolicyAssignmentId, headers?) -> void</code>
- <code title="get /2.0/retention_policy_assignments/{retentionPolicyAssignmentId}/files_under_retention">client.retentionPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/retentionpolicyassignments/RetentionPolicyAssignmentsManager.java">getFilesUnderRetentionPolicyAssignment</a>(retentionPolicyAssignmentId, queryParams?, headers?) -> FilesUnderRetention</code>

# Legal hold policies

Examples: [docs/legalholdpolicies.md](docs/legalholdpolicies.md)

Methods:

- <code title="get /2.0/legal_hold_policies">client.legalHoldPolicies.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicies/LegalHoldPoliciesManager.java">getLegalHoldPolicies</a>(queryParams?, headers?) -> LegalHoldPolicies</code>
- <code title="post /2.0/legal_hold_policies">client.legalHoldPolicies.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicies/LegalHoldPoliciesManager.java">createLegalHoldPolicy</a>(requestBody, headers?) -> LegalHoldPolicy</code>
- <code title="get /2.0/legal_hold_policies/{legalHoldPolicyId}">client.legalHoldPolicies.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicies/LegalHoldPoliciesManager.java">getLegalHoldPolicyById</a>(legalHoldPolicyId, headers?) -> LegalHoldPolicy</code>
- <code title="put /2.0/legal_hold_policies/{legalHoldPolicyId}">client.legalHoldPolicies.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicies/LegalHoldPoliciesManager.java">updateLegalHoldPolicyById</a>(legalHoldPolicyId, requestBody?, headers?) -> LegalHoldPolicy</code>
- <code title="delete /2.0/legal_hold_policies/{legalHoldPolicyId}">client.legalHoldPolicies.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicies/LegalHoldPoliciesManager.java">deleteLegalHoldPolicyById</a>(legalHoldPolicyId, headers?) -> void</code>

# Legal hold policy assignments

Examples: [docs/legalholdpolicyassignments.md](docs/legalholdpolicyassignments.md)

Methods:

- <code title="get /2.0/legal_hold_policy_assignments">client.legalHoldPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicyassignments/LegalHoldPolicyAssignmentsManager.java">getLegalHoldPolicyAssignments</a>(queryParams, headers?) -> LegalHoldPolicyAssignments</code>
- <code title="post /2.0/legal_hold_policy_assignments">client.legalHoldPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicyassignments/LegalHoldPolicyAssignmentsManager.java">createLegalHoldPolicyAssignment</a>(requestBody, headers?) -> LegalHoldPolicyAssignment</code>
- <code title="get /2.0/legal_hold_policy_assignments/{legalHoldPolicyAssignmentId}">client.legalHoldPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicyassignments/LegalHoldPolicyAssignmentsManager.java">getLegalHoldPolicyAssignmentById</a>(legalHoldPolicyAssignmentId, headers?) -> LegalHoldPolicyAssignment</code>
- <code title="delete /2.0/legal_hold_policy_assignments/{legalHoldPolicyAssignmentId}">client.legalHoldPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicyassignments/LegalHoldPolicyAssignmentsManager.java">deleteLegalHoldPolicyAssignmentById</a>(legalHoldPolicyAssignmentId, headers?) -> void</code>
- <code title="get /2.0/legal_hold_policy_assignments/{legalHoldPolicyAssignmentId}/files_on_hold">client.legalHoldPolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/legalholdpolicyassignments/LegalHoldPolicyAssignmentsManager.java">getLegalHoldPolicyAssignmentFileOnHold</a>(legalHoldPolicyAssignmentId, queryParams?, headers?) -> FilesOnHold</code>

# File version retentions

Examples: [docs/fileversionretentions.md](docs/fileversionretentions.md)

Methods:

- <code title="get /2.0/file_version_retentions">client.fileVersionRetentions.<a href="./src/main/java/com/box/sdkgen/managers/fileversionretentions/FileVersionRetentionsManager.java">getFileVersionRetentions</a>(queryParams?, headers?) -> FileVersionRetentions</code>
- <code title="get /2.0/file_version_retentions/{fileVersionRetentionId}">client.fileVersionRetentions.<a href="./src/main/java/com/box/sdkgen/managers/fileversionretentions/FileVersionRetentionsManager.java">getFileVersionRetentionById</a>(fileVersionRetentionId, headers?) -> FileVersionRetention</code>

# File version legal holds

Examples: [docs/fileversionlegalholds.md](docs/fileversionlegalholds.md)

Methods:

- <code title="get /2.0/file_version_legal_holds/{fileVersionLegalHoldId}">client.fileVersionLegalHolds.<a href="./src/main/java/com/box/sdkgen/managers/fileversionlegalholds/FileVersionLegalHoldsManager.java">getFileVersionLegalHoldById</a>(fileVersionLegalHoldId, headers?) -> FileVersionLegalHold</code>
- <code title="get /2.0/file_version_legal_holds">client.fileVersionLegalHolds.<a href="./src/main/java/com/box/sdkgen/managers/fileversionlegalholds/FileVersionLegalHoldsManager.java">getFileVersionLegalHolds</a>(queryParams, headers?) -> FileVersionLegalHolds</code>

# Shield information barriers

Examples: [docs/shieldinformationbarriers.md](docs/shieldinformationbarriers.md)

Methods:

- <code title="get /2.0/shield_information_barriers/{shieldInformationBarrierId}">client.shieldInformationBarriers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriers/ShieldInformationBarriersManager.java">getShieldInformationBarrierById</a>(shieldInformationBarrierId, headers?) -> ShieldInformationBarrier</code>
- <code title="post /2.0/shield_information_barriers/change_status">client.shieldInformationBarriers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriers/ShieldInformationBarriersManager.java">updateShieldInformationBarrierStatus</a>(requestBody, headers?) -> ShieldInformationBarrier</code>
- <code title="get /2.0/shield_information_barriers">client.shieldInformationBarriers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriers/ShieldInformationBarriersManager.java">getShieldInformationBarriers</a>(queryParams?, headers?) -> ShieldInformationBarriers</code>
- <code title="post /2.0/shield_information_barriers">client.shieldInformationBarriers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriers/ShieldInformationBarriersManager.java">createShieldInformationBarrier</a>(requestBody, headers?) -> ShieldInformationBarrier</code>

# Shield information barrier reports

Examples: [docs/shieldinformationbarrierreports.md](docs/shieldinformationbarrierreports.md)

Methods:

- <code title="get /2.0/shield_information_barrier_reports">client.shieldInformationBarrierReports.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarrierreports/ShieldInformationBarrierReportsManager.java">getShieldInformationBarrierReports</a>(queryParams, headers?) -> ShieldInformationBarrierReports</code>
- <code title="post /2.0/shield_information_barrier_reports">client.shieldInformationBarrierReports.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarrierreports/ShieldInformationBarrierReportsManager.java">createShieldInformationBarrierReport</a>(requestBody, headers?) -> ShieldInformationBarrierReport</code>
- <code title="get /2.0/shield_information_barrier_reports/{shieldInformationBarrierReportId}">client.shieldInformationBarrierReports.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarrierreports/ShieldInformationBarrierReportsManager.java">getShieldInformationBarrierReportById</a>(shieldInformationBarrierReportId, headers?) -> ShieldInformationBarrierReport</code>

# Shield information barrier segments

Examples: [docs/shieldinformationbarriersegments.md](docs/shieldinformationbarriersegments.md)

Methods:

- <code title="get /2.0/shield_information_barrier_segments/{shieldInformationBarrierSegmentId}">client.shieldInformationBarrierSegments.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegments/ShieldInformationBarrierSegmentsManager.java">getShieldInformationBarrierSegmentById</a>(shieldInformationBarrierSegmentId, headers?) -> ShieldInformationBarrierSegment</code>
- <code title="delete /2.0/shield_information_barrier_segments/{shieldInformationBarrierSegmentId}">client.shieldInformationBarrierSegments.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegments/ShieldInformationBarrierSegmentsManager.java">deleteShieldInformationBarrierSegmentById</a>(shieldInformationBarrierSegmentId, headers?) -> void</code>
- <code title="put /2.0/shield_information_barrier_segments/{shieldInformationBarrierSegmentId}">client.shieldInformationBarrierSegments.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegments/ShieldInformationBarrierSegmentsManager.java">updateShieldInformationBarrierSegmentById</a>(shieldInformationBarrierSegmentId, requestBody?, headers?) -> ShieldInformationBarrierSegment</code>
- <code title="get /2.0/shield_information_barrier_segments">client.shieldInformationBarrierSegments.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegments/ShieldInformationBarrierSegmentsManager.java">getShieldInformationBarrierSegments</a>(queryParams, headers?) -> ShieldInformationBarrierSegments</code>
- <code title="post /2.0/shield_information_barrier_segments">client.shieldInformationBarrierSegments.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegments/ShieldInformationBarrierSegmentsManager.java">createShieldInformationBarrierSegment</a>(requestBody, headers?) -> ShieldInformationBarrierSegment</code>

# Shield information barrier segment members

Examples: [docs/shieldinformationbarriersegmentmembers.md](docs/shieldinformationbarriersegmentmembers.md)

Methods:

- <code title="get /2.0/shield_information_barrier_segment_members/{shieldInformationBarrierSegmentMemberId}">client.shieldInformationBarrierSegmentMembers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentmembers/ShieldInformationBarrierSegmentMembersManager.java">getShieldInformationBarrierSegmentMemberById</a>(shieldInformationBarrierSegmentMemberId, headers?) -> ShieldInformationBarrierSegmentMember</code>
- <code title="delete /2.0/shield_information_barrier_segment_members/{shieldInformationBarrierSegmentMemberId}">client.shieldInformationBarrierSegmentMembers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentmembers/ShieldInformationBarrierSegmentMembersManager.java">deleteShieldInformationBarrierSegmentMemberById</a>(shieldInformationBarrierSegmentMemberId, headers?) -> void</code>
- <code title="get /2.0/shield_information_barrier_segment_members">client.shieldInformationBarrierSegmentMembers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentmembers/ShieldInformationBarrierSegmentMembersManager.java">getShieldInformationBarrierSegmentMembers</a>(queryParams, headers?) -> ShieldInformationBarrierSegmentMembers</code>
- <code title="post /2.0/shield_information_barrier_segment_members">client.shieldInformationBarrierSegmentMembers.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentmembers/ShieldInformationBarrierSegmentMembersManager.java">createShieldInformationBarrierSegmentMember</a>(requestBody, headers?) -> ShieldInformationBarrierSegmentMember</code>

# Shield information barrier segment restrictions

Examples: [docs/shieldinformationbarriersegmentrestrictions.md](docs/shieldinformationbarriersegmentrestrictions.md)

Methods:

- <code title="delete /2.0/shield_information_barrier_segment_restrictions/{shieldInformationBarrierSegmentRestrictionId}">client.shieldInformationBarrierSegmentRestrictions.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentrestrictions/ShieldInformationBarrierSegmentRestrictionsManager.java">deleteShieldInformationBarrierSegmentRestrictionById</a>(shieldInformationBarrierSegmentRestrictionId, headers?) -> void</code>
- <code title="get /2.0/shield_information_barrier_segment_restrictions">client.shieldInformationBarrierSegmentRestrictions.<a href="./src/main/java/com/box/sdkgen/managers/shieldinformationbarriersegmentrestrictions/ShieldInformationBarrierSegmentRestrictionsManager.java">getShieldInformationBarrierSegmentRestrictions</a>(queryParams, headers?) -> ShieldInformationBarrierSegmentRestrictions</code>

# Device pinners

Examples: [docs/devicepinners.md](docs/devicepinners.md)

Methods:

- <code title="get /2.0/device_pinners/{devicePinnerId}">client.devicePinners.<a href="./src/main/java/com/box/sdkgen/managers/devicepinners/DevicePinnersManager.java">getDevicePinnerById</a>(devicePinnerId, headers?) -> DevicePinner</code>
- <code title="delete /2.0/device_pinners/{devicePinnerId}">client.devicePinners.<a href="./src/main/java/com/box/sdkgen/managers/devicepinners/DevicePinnersManager.java">deleteDevicePinnerById</a>(devicePinnerId, headers?) -> void</code>
- <code title="get /2.0/enterprises/{enterpriseId}/device_pinners">client.devicePinners.<a href="./src/main/java/com/box/sdkgen/managers/devicepinners/DevicePinnersManager.java">getEnterpriseDevicePinners</a>(enterpriseId, queryParams?, headers?) -> DevicePinners</code>

# Terms of services

Examples: [docs/termsofservices.md](docs/termsofservices.md)

Methods:

- <code title="get /2.0/terms_of_services">client.termsOfServices.<a href="./src/main/java/com/box/sdkgen/managers/termsofservices/TermsOfServicesManager.java">getTermsOfService</a>(queryParams?, headers?) -> TermsOfServices</code>
- <code title="post /2.0/terms_of_services">client.termsOfServices.<a href="./src/main/java/com/box/sdkgen/managers/termsofservices/TermsOfServicesManager.java">createTermsOfService</a>(requestBody, headers?) -> TermsOfService</code>
- <code title="get /2.0/terms_of_services/{termsOfServiceId}">client.termsOfServices.<a href="./src/main/java/com/box/sdkgen/managers/termsofservices/TermsOfServicesManager.java">getTermsOfServiceById</a>(termsOfServiceId, headers?) -> TermsOfService</code>
- <code title="put /2.0/terms_of_services/{termsOfServiceId}">client.termsOfServices.<a href="./src/main/java/com/box/sdkgen/managers/termsofservices/TermsOfServicesManager.java">updateTermsOfServiceById</a>(termsOfServiceId, requestBody, headers?) -> TermsOfService</code>

# Terms of service user statuses

Examples: [docs/termsofserviceuserstatuses.md](docs/termsofserviceuserstatuses.md)

Methods:

- <code title="get /2.0/terms_of_service_user_statuses">client.termsOfServiceUserStatuses.<a href="./src/main/java/com/box/sdkgen/managers/termsofserviceuserstatuses/TermsOfServiceUserStatusesManager.java">getTermsOfServiceUserStatuses</a>(queryParams, headers?) -> TermsOfServiceUserStatuses</code>
- <code title="post /2.0/terms_of_service_user_statuses">client.termsOfServiceUserStatuses.<a href="./src/main/java/com/box/sdkgen/managers/termsofserviceuserstatuses/TermsOfServiceUserStatusesManager.java">createTermsOfServiceStatusForUser</a>(requestBody, headers?) -> TermsOfServiceUserStatus</code>
- <code title="put /2.0/terms_of_service_user_statuses/{termsOfServiceUserStatusId}">client.termsOfServiceUserStatuses.<a href="./src/main/java/com/box/sdkgen/managers/termsofserviceuserstatuses/TermsOfServiceUserStatusesManager.java">updateTermsOfServiceStatusForUserById</a>(termsOfServiceUserStatusId, requestBody, headers?) -> TermsOfServiceUserStatus</code>

# Collaboration allowlist entries

Examples: [docs/collaborationallowlistentries.md](docs/collaborationallowlistentries.md)

Methods:

- <code title="get /2.0/collaboration_whitelist_entries">client.collaborationAllowlistEntries.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistentries/CollaborationAllowlistEntriesManager.java">getCollaborationWhitelistEntries</a>(queryParams?, headers?) -> CollaborationAllowlistEntries</code>
- <code title="post /2.0/collaboration_whitelist_entries">client.collaborationAllowlistEntries.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistentries/CollaborationAllowlistEntriesManager.java">createCollaborationWhitelistEntry</a>(requestBody, headers?) -> CollaborationAllowlistEntry</code>
- <code title="get /2.0/collaboration_whitelist_entries/{collaborationWhitelistEntryId}">client.collaborationAllowlistEntries.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistentries/CollaborationAllowlistEntriesManager.java">getCollaborationWhitelistEntryById</a>(collaborationWhitelistEntryId, headers?) -> CollaborationAllowlistEntry</code>
- <code title="delete /2.0/collaboration_whitelist_entries/{collaborationWhitelistEntryId}">client.collaborationAllowlistEntries.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistentries/CollaborationAllowlistEntriesManager.java">deleteCollaborationWhitelistEntryById</a>(collaborationWhitelistEntryId, headers?) -> void</code>

# Collaboration allowlist exempt targets

Examples: [docs/collaborationallowlistexempttargets.md](docs/collaborationallowlistexempttargets.md)

Methods:

- <code title="get /2.0/collaboration_whitelist_exempt_targets">client.collaborationAllowlistExemptTargets.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistexempttargets/CollaborationAllowlistExemptTargetsManager.java">getCollaborationWhitelistExemptTargets</a>(queryParams?, headers?) -> CollaborationAllowlistExemptTargets</code>
- <code title="post /2.0/collaboration_whitelist_exempt_targets">client.collaborationAllowlistExemptTargets.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistexempttargets/CollaborationAllowlistExemptTargetsManager.java">createCollaborationWhitelistExemptTarget</a>(requestBody, headers?) -> CollaborationAllowlistExemptTarget</code>
- <code title="get /2.0/collaboration_whitelist_exempt_targets/{collaborationWhitelistExemptTargetId}">client.collaborationAllowlistExemptTargets.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistexempttargets/CollaborationAllowlistExemptTargetsManager.java">getCollaborationWhitelistExemptTargetById</a>(collaborationWhitelistExemptTargetId, headers?) -> CollaborationAllowlistExemptTarget</code>
- <code title="delete /2.0/collaboration_whitelist_exempt_targets/{collaborationWhitelistExemptTargetId}">client.collaborationAllowlistExemptTargets.<a href="./src/main/java/com/box/sdkgen/managers/collaborationallowlistexempttargets/CollaborationAllowlistExemptTargetsManager.java">deleteCollaborationWhitelistExemptTargetById</a>(collaborationWhitelistExemptTargetId, headers?) -> void</code>

# Storage policies

Examples: [docs/storagepolicies.md](docs/storagepolicies.md)

Methods:

- <code title="get /2.0/storage_policies">client.storagePolicies.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicies/StoragePoliciesManager.java">getStoragePolicies</a>(queryParams?, headers?) -> StoragePolicies</code>
- <code title="get /2.0/storage_policies/{storagePolicyId}">client.storagePolicies.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicies/StoragePoliciesManager.java">getStoragePolicyById</a>(storagePolicyId, headers?) -> StoragePolicy</code>

# Storage policy assignments

Examples: [docs/storagepolicyassignments.md](docs/storagepolicyassignments.md)

Methods:

- <code title="get /2.0/storage_policy_assignments">client.storagePolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicyassignments/StoragePolicyAssignmentsManager.java">getStoragePolicyAssignments</a>(queryParams, headers?) -> StoragePolicyAssignments</code>
- <code title="post /2.0/storage_policy_assignments">client.storagePolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicyassignments/StoragePolicyAssignmentsManager.java">createStoragePolicyAssignment</a>(requestBody, headers?) -> StoragePolicyAssignment</code>
- <code title="get /2.0/storage_policy_assignments/{storagePolicyAssignmentId}">client.storagePolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicyassignments/StoragePolicyAssignmentsManager.java">getStoragePolicyAssignmentById</a>(storagePolicyAssignmentId, headers?) -> StoragePolicyAssignment</code>
- <code title="put /2.0/storage_policy_assignments/{storagePolicyAssignmentId}">client.storagePolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicyassignments/StoragePolicyAssignmentsManager.java">updateStoragePolicyAssignmentById</a>(storagePolicyAssignmentId, requestBody, headers?) -> StoragePolicyAssignment</code>
- <code title="delete /2.0/storage_policy_assignments/{storagePolicyAssignmentId}">client.storagePolicyAssignments.<a href="./src/main/java/com/box/sdkgen/managers/storagepolicyassignments/StoragePolicyAssignmentsManager.java">deleteStoragePolicyAssignmentById</a>(storagePolicyAssignmentId, headers?) -> void</code>

# Zip downloads

Examples: [docs/zipdownloads.md](docs/zipdownloads.md)

Methods:

- <code title="post /2.0/zip_downloads">client.zipDownloads.<a href="./src/main/java/com/box/sdkgen/managers/zipdownloads/ZipDownloadsManager.java">createZipDownload</a>(requestBody, headers?) -> ZipDownload</code>
- <code>client.zipDownloads.<a href="./src/main/java/com/box/sdkgen/managers/zipdownloads/ZipDownloadsManager.java">getZipDownloadContent</a>(downloadUrl, headers?) -> InputStream</code>
- <code>client.zipDownloads.<a href="./src/main/java/com/box/sdkgen/managers/zipdownloads/ZipDownloadsManager.java">getZipDownloadStatus</a>(statusUrl, headers?) -> ZipDownloadStatus</code>
- <code>client.zipDownloads.<a href="./src/main/java/com/box/sdkgen/managers/zipdownloads/ZipDownloadsManager.java">downloadZip</a>(requestBody, headers?) -> InputStream</code>

# Sign requests

Examples: [docs/signrequests.md](docs/signrequests.md)

Methods:

- <code title="post /2.0/sign_requests/{signRequestId}/cancel">client.signRequests.<a href="./src/main/java/com/box/sdkgen/managers/signrequests/SignRequestsManager.java">cancelSignRequest</a>(signRequestId, headers?) -> SignRequest</code>
- <code title="post /2.0/sign_requests/{signRequestId}/resend">client.signRequests.<a href="./src/main/java/com/box/sdkgen/managers/signrequests/SignRequestsManager.java">resendSignRequest</a>(signRequestId, headers?) -> void</code>
- <code title="get /2.0/sign_requests/{signRequestId}">client.signRequests.<a href="./src/main/java/com/box/sdkgen/managers/signrequests/SignRequestsManager.java">getSignRequestById</a>(signRequestId, headers?) -> SignRequest</code>
- <code title="get /2.0/sign_requests">client.signRequests.<a href="./src/main/java/com/box/sdkgen/managers/signrequests/SignRequestsManager.java">getSignRequests</a>(queryParams?, headers?) -> SignRequests</code>
- <code title="post /2.0/sign_requests">client.signRequests.<a href="./src/main/java/com/box/sdkgen/managers/signrequests/SignRequestsManager.java">createSignRequest</a>(requestBody, headers?) -> SignRequest</code>

# Workflows

Examples: [docs/workflows.md](docs/workflows.md)

Methods:

- <code title="get /2.0/workflows">client.workflows.<a href="./src/main/java/com/box/sdkgen/managers/workflows/WorkflowsManager.java">getWorkflows</a>(queryParams, headers?) -> Workflows</code>
- <code title="post /2.0/workflows/{workflowId}/start">client.workflows.<a href="./src/main/java/com/box/sdkgen/managers/workflows/WorkflowsManager.java">startWorkflow</a>(workflowId, requestBody, headers?) -> void</code>

# Sign templates

Examples: [docs/signtemplates.md](docs/signtemplates.md)

Methods:

- <code title="get /2.0/sign_templates">client.signTemplates.<a href="./src/main/java/com/box/sdkgen/managers/signtemplates/SignTemplatesManager.java">getSignTemplates</a>(queryParams?, headers?) -> SignTemplates</code>
- <code title="get /2.0/sign_templates/{templateId}">client.signTemplates.<a href="./src/main/java/com/box/sdkgen/managers/signtemplates/SignTemplatesManager.java">getSignTemplateById</a>(templateId, headers?) -> SignTemplate</code>

# Integration mappings

Examples: [docs/integrationmappings.md](docs/integrationmappings.md)

Methods:

- <code title="get /2.0/integration_mappings/slack">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">getSlackIntegrationMapping</a>(queryParams?, headers?) -> IntegrationMappings</code>
- <code title="post /2.0/integration_mappings/slack">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">createSlackIntegrationMapping</a>(requestBody, headers?) -> IntegrationMapping</code>
- <code title="put /2.0/integration_mappings/slack/{integrationMappingId}">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">updateSlackIntegrationMappingById</a>(integrationMappingId, requestBody?, headers?) -> IntegrationMapping</code>
- <code title="delete /2.0/integration_mappings/slack/{integrationMappingId}">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">deleteSlackIntegrationMappingById</a>(integrationMappingId, headers?) -> void</code>
- <code title="get /2.0/integration_mappings/teams">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">getTeamsIntegrationMapping</a>(queryParams?, headers?) -> IntegrationMappingsTeams</code>
- <code title="post /2.0/integration_mappings/teams">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">createTeamsIntegrationMapping</a>(requestBody, headers?) -> IntegrationMappingTeams</code>
- <code title="put /2.0/integration_mappings/teams/{integrationMappingId}">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">updateTeamsIntegrationMappingById</a>(integrationMappingId, requestBody?, headers?) -> IntegrationMappingTeams</code>
- <code title="delete /2.0/integration_mappings/teams/{integrationMappingId}">client.integrationMappings.<a href="./src/main/java/com/box/sdkgen/managers/integrationmappings/IntegrationMappingsManager.java">deleteTeamsIntegrationMappingById</a>(integrationMappingId, headers?) -> void</code>

# Ai

Examples: [docs/ai.md](docs/ai.md)

Methods:

- <code title="post /2.0/ai/ask">client.ai.<a href="./src/main/java/com/box/sdkgen/managers/ai/AiManager.java">createAiAsk</a>(requestBody, headers?) -> AiResponseFull</code>
- <code title="post /2.0/ai/text_gen">client.ai.<a href="./src/main/java/com/box/sdkgen/managers/ai/AiManager.java">createAiTextGen</a>(requestBody, headers?) -> AiResponse</code>
- <code title="post /2.0/ai/extract">client.ai.<a href="./src/main/java/com/box/sdkgen/managers/ai/AiManager.java">createAiExtract</a>(requestBody, headers?) -> AiResponse</code>
- <code title="post /2.0/ai/extract_structured">client.ai.<a href="./src/main/java/com/box/sdkgen/managers/ai/AiManager.java">createAiExtractStructured</a>(requestBody, headers?) -> AiExtractStructuredResponse</code>

# Ai studio

Examples: [docs/aistudio.md](docs/aistudio.md)

Methods:

- <code title="get /2.0/ai_agents">client.aiStudio.<a href="./src/main/java/com/box/sdkgen/managers/aistudio/AiStudioManager.java">getAiAgents</a>(queryParams?, headers?) -> AiMultipleAgentResponse</code>
- <code title="post /2.0/ai_agents">client.aiStudio.<a href="./src/main/java/com/box/sdkgen/managers/aistudio/AiStudioManager.java">createAiAgent</a>(requestBody, headers?) -> AiSingleAgentResponseFull</code>
- <code title="put /2.0/ai_agents/{agentId}">client.aiStudio.<a href="./src/main/java/com/box/sdkgen/managers/aistudio/AiStudioManager.java">updateAiAgentById</a>(agentId, requestBody, headers?) -> AiSingleAgentResponseFull</code>
- <code title="get /2.0/ai_agents/{agentId}">client.aiStudio.<a href="./src/main/java/com/box/sdkgen/managers/aistudio/AiStudioManager.java">getAiAgentById</a>(agentId, queryParams?, headers?) -> AiSingleAgentResponseFull</code>
- <code title="delete /2.0/ai_agents/{agentId}">client.aiStudio.<a href="./src/main/java/com/box/sdkgen/managers/aistudio/AiStudioManager.java">deleteAiAgentById</a>(agentId, headers?) -> void</code>

# Docgen template

Examples: [docs/docgentemplate.md](docs/docgentemplate.md)

Methods:

- <code title="post /2.0/docgen_templates">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">createDocgenTemplateV2025R0</a>(requestBody, headers?) -> DocGenTemplateBaseV2025R0</code>
- <code title="get /2.0/docgen_templates">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">getDocgenTemplatesV2025R0</a>(queryParams?, headers?) -> DocGenTemplatesV2025R0</code>
- <code title="delete /2.0/docgen_templates/{templateId}">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">deleteDocgenTemplateByIdV2025R0</a>(templateId, headers?) -> void</code>
- <code title="get /2.0/docgen_templates/{templateId}">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">getDocgenTemplateByIdV2025R0</a>(templateId, headers?) -> DocGenTemplateV2025R0</code>
- <code title="get /2.0/docgen_templates/{templateId}/tags">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">getDocgenTemplateTagsV2025R0</a>(templateId, queryParams?, headers?) -> DocGenTagsV2025R0</code>
- <code title="get /2.0/docgen_template_jobs/{templateId}">client.docgenTemplate.<a href="./src/main/java/com/box/sdkgen/managers/docgentemplate/DocgenTemplateManager.java">getDocgenTemplateJobByIdV2025R0</a>(templateId, queryParams?, headers?) -> DocGenJobsV2025R0</code>

# Docgen

Examples: [docs/docgen.md](docs/docgen.md)

Methods:

- <code title="get /2.0/docgen_jobs/{jobId}">client.docgen.<a href="./src/main/java/com/box/sdkgen/managers/docgen/DocgenManager.java">getDocgenJobByIdV2025R0</a>(jobId, headers?) -> DocGenJobV2025R0</code>
- <code title="get /2.0/docgen_jobs">client.docgen.<a href="./src/main/java/com/box/sdkgen/managers/docgen/DocgenManager.java">getDocgenJobsV2025R0</a>(queryParams?, headers?) -> DocGenJobsFullV2025R0</code>
- <code title="get /2.0/docgen_batch_jobs/{batchId}">client.docgen.<a href="./src/main/java/com/box/sdkgen/managers/docgen/DocgenManager.java">getDocgenBatchJobByIdV2025R0</a>(batchId, queryParams?, headers?) -> DocGenJobsV2025R0</code>
- <code title="post /2.0/docgen_batches">client.docgen.<a href="./src/main/java/com/box/sdkgen/managers/docgen/DocgenManager.java">createDocgenBatchV2025R0</a>(requestBody, headers?) -> DocGenBatchBaseV2025R0</code>

# Hubs

Examples: [docs/hubs.md](docs/hubs.md)

Methods:

- <code title="get /2.0/hubs">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">getHubsV2025R0</a>(queryParams?, headers?) -> HubsV2025R0</code>
- <code title="post /2.0/hubs">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">createHubV2025R0</a>(requestBody, headers?) -> HubV2025R0</code>
- <code title="get /2.0/enterprise_hubs">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">getEnterpriseHubsV2025R0</a>(queryParams?, headers?) -> HubsV2025R0</code>
- <code title="get /2.0/hubs/{hubId}">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">getHubByIdV2025R0</a>(hubId, headers?) -> HubV2025R0</code>
- <code title="put /2.0/hubs/{hubId}">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">updateHubByIdV2025R0</a>(hubId, requestBody, headers?) -> HubV2025R0</code>
- <code title="delete /2.0/hubs/{hubId}">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">deleteHubByIdV2025R0</a>(hubId, headers?) -> void</code>
- <code title="post /2.0/hubs/{hubId}/copy">client.hubs.<a href="./src/main/java/com/box/sdkgen/managers/hubs/HubsManager.java">copyHubV2025R0</a>(hubId, requestBody, headers?) -> HubV2025R0</code>

# Hub collaborations

Examples: [docs/hubcollaborations.md](docs/hubcollaborations.md)

Methods:

- <code title="get /2.0/hub_collaborations">client.hubCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/hubcollaborations/HubCollaborationsManager.java">getHubCollaborationsV2025R0</a>(queryParams, headers?) -> HubCollaborationsV2025R0</code>
- <code title="post /2.0/hub_collaborations">client.hubCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/hubcollaborations/HubCollaborationsManager.java">createHubCollaborationV2025R0</a>(requestBody, headers?) -> HubCollaborationV2025R0</code>
- <code title="get /2.0/hub_collaborations/{hubCollaborationId}">client.hubCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/hubcollaborations/HubCollaborationsManager.java">getHubCollaborationByIdV2025R0</a>(hubCollaborationId, headers?) -> HubCollaborationV2025R0</code>
- <code title="put /2.0/hub_collaborations/{hubCollaborationId}">client.hubCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/hubcollaborations/HubCollaborationsManager.java">updateHubCollaborationByIdV2025R0</a>(hubCollaborationId, requestBody, headers?) -> HubCollaborationV2025R0</code>
- <code title="delete /2.0/hub_collaborations/{hubCollaborationId}">client.hubCollaborations.<a href="./src/main/java/com/box/sdkgen/managers/hubcollaborations/HubCollaborationsManager.java">deleteHubCollaborationByIdV2025R0</a>(hubCollaborationId, headers?) -> void</code>

# Hub items

Examples: [docs/hubitems.md](docs/hubitems.md)

Methods:

- <code title="get /2.0/hub_items">client.hubItems.<a href="./src/main/java/com/box/sdkgen/managers/hubitems/HubItemsManager.java">getHubItemsV2025R0</a>(queryParams, headers?) -> HubItemsV2025R0</code>
- <code title="post /2.0/hubs/{hubId}/manage_items">client.hubItems.<a href="./src/main/java/com/box/sdkgen/managers/hubitems/HubItemsManager.java">manageHubItemsV2025R0</a>(hubId, requestBody, headers?) -> HubItemsManageResponseV2025R0</code>

# Shield lists

Examples: [docs/shieldlists.md](docs/shieldlists.md)

Methods:

- <code title="get /2.0/shield_lists">client.shieldLists.<a href="./src/main/java/com/box/sdkgen/managers/shieldlists/ShieldListsManager.java">getShieldListsV2025R0</a>(headers?) -> ShieldListsV2025R0</code>
- <code title="post /2.0/shield_lists">client.shieldLists.<a href="./src/main/java/com/box/sdkgen/managers/shieldlists/ShieldListsManager.java">createShieldListV2025R0</a>(requestBody, headers?) -> ShieldListV2025R0</code>
- <code title="get /2.0/shield_lists/{shieldListId}">client.shieldLists.<a href="./src/main/java/com/box/sdkgen/managers/shieldlists/ShieldListsManager.java">getShieldListByIdV2025R0</a>(shieldListId, headers?) -> ShieldListV2025R0</code>
- <code title="delete /2.0/shield_lists/{shieldListId}">client.shieldLists.<a href="./src/main/java/com/box/sdkgen/managers/shieldlists/ShieldListsManager.java">deleteShieldListByIdV2025R0</a>(shieldListId, headers?) -> void</code>
- <code title="put /2.0/shield_lists/{shieldListId}">client.shieldLists.<a href="./src/main/java/com/box/sdkgen/managers/shieldlists/ShieldListsManager.java">updateShieldListByIdV2025R0</a>(shieldListId, requestBody, headers?) -> ShieldListV2025R0</code>

# Archives

Examples: [docs/archives.md](docs/archives.md)

Methods:

- <code title="get /2.0/archives">client.archives.<a href="./src/main/java/com/box/sdkgen/managers/archives/ArchivesManager.java">getArchivesV2025R0</a>(queryParams?, headers?) -> ArchivesV2025R0</code>
- <code title="post /2.0/archives">client.archives.<a href="./src/main/java/com/box/sdkgen/managers/archives/ArchivesManager.java">createArchiveV2025R0</a>(requestBody, headers?) -> ArchiveV2025R0</code>
- <code title="delete /2.0/archives/{archiveId}">client.archives.<a href="./src/main/java/com/box/sdkgen/managers/archives/ArchivesManager.java">deleteArchiveByIdV2025R0</a>(archiveId, headers?) -> void</code>
