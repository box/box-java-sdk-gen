# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

## [0.4.0](https://github.com/box/box-java-sdk-gen/compare/v0.3.0...v0.4.0) (2025-01-28)


### Bug Fixes

* Add missing token scope (box/box-openapi[#490](https://github.com/box/box-java-sdk-gen/issues/490)) ([#122](https://github.com/box/box-java-sdk-gen/issues/122)) ([83073a7](https://github.com/box/box-java-sdk-gen/commit/83073a7061744b97d685faa809cf6a96a6aa61a4))
* Correct types of `paged` and `thumb` properties in File representation (box/box-openapi[#503](https://github.com/box/box-java-sdk-gen/issues/503)) ([#161](https://github.com/box/box-java-sdk-gen/issues/161)) ([b603242](https://github.com/box/box-java-sdk-gen/commit/b60324274f9d74454ea93bb4ac418b2eea3a61e4))
* Fix handling list of enums and nested list of enums (box/box-codegen[#649](https://github.com/box/box-java-sdk-gen/issues/649)) ([#165](https://github.com/box/box-java-sdk-gen/issues/165)) ([45021c2](https://github.com/box/box-java-sdk-gen/commit/45021c26610c1427e86bbc8e277ac8f315a06837))
* Fix invalid variant config for Integration mapping Slack (box/box-openapi[#492](https://github.com/box/box-java-sdk-gen/issues/492)) ([#127](https://github.com/box/box-java-sdk-gen/issues/127)) ([c86142b](https://github.com/box/box-java-sdk-gen/commit/c86142b8c141e418f7b4fc1b64dd46adfb862f4e))
* Fix Java `NPE` in case of null body (box/box-codegen[#645](https://github.com/box/box-java-sdk-gen/issues/645)) ([#149](https://github.com/box/box-java-sdk-gen/issues/149)) ([25dee92](https://github.com/box/box-java-sdk-gen/commit/25dee9268ce16c8ef8909aefcdbf90a3f11d7ea2))
* order of fields in the `IntegrationMapping` schema (box/box-openapi[#497](https://github.com/box/box-java-sdk-gen/issues/497)) ([#145](https://github.com/box/box-java-sdk-gen/issues/145)) ([d3ce60c](https://github.com/box/box-java-sdk-gen/commit/d3ce60c7afa621e8dec5f7087497f0a4c60ba898))
* Remove auth when cross origin redirect (box/box-codegen[#648](https://github.com/box/box-java-sdk-gen/issues/648)) ([#158](https://github.com/box/box-java-sdk-gen/issues/158)) ([6136dac](https://github.com/box/box-java-sdk-gen/commit/6136dac05ba7215d2d7d6b68eac12910f1a4c06b))


### New Features and Enhancements

* Add Box Sign shared requests (box/box-openapi[#504](https://github.com/box/box-java-sdk-gen/issues/504)) ([#163](https://github.com/box/box-java-sdk-gen/issues/163)) ([b32f336](https://github.com/box/box-java-sdk-gen/commit/b32f33605b383f0bad987df6c5168e12acde90f6))
* Support Box Doc Gen API (box/box-codegen[#644](https://github.com/box/box-java-sdk-gen/issues/644)) ([#156](https://github.com/box/box-java-sdk-gen/issues/156)) ([81cb583](https://github.com/box/box-java-sdk-gen/commit/81cb583ea52e741a3c4597316d010521c30ae138))
* Support chunked upload in Java (box/box-codegen[#640](https://github.com/box/box-java-sdk-gen/issues/640)) ([#137](https://github.com/box/box-java-sdk-gen/issues/137)) ([012aaa0](https://github.com/box/box-java-sdk-gen/commit/012aaa0adf575865051156b7746ed4d50cb63a93))

## [0.3.0](https://github.com/box/box-java-sdk-gen/compare/v0.2.0...v0.3.0) (2024-12-30)


### Bug Fixes

* Remove unused parameter from `SignRequest` (box/box-openapi[#489](https://github.com/box/box-java-sdk-gen/issues/489)) ([#107](https://github.com/box/box-java-sdk-gen/issues/107)) ([77bf54d](https://github.com/box/box-java-sdk-gen/commit/77bf54d27f48dc2752b95d43a4f65488de2c4d21))


### New Features and Enhancements

* Add `aiAgent` info to `AiResponse` (box/box-openapi[#485](https://github.com/box/box-java-sdk-gen/issues/485)) ([#93](https://github.com/box/box-java-sdk-gen/issues/93)) ([a7fe95f](https://github.com/box/box-java-sdk-gen/commit/a7fe95f6f264ec834f28b16c57ccb7ac11b98554))
* Add support for replacing the network client implementation (box/box-codegen[#629](https://github.com/box/box-java-sdk-gen/issues/629)) ([#115](https://github.com/box/box-java-sdk-gen/issues/115)) ([1bfa6ef](https://github.com/box/box-java-sdk-gen/commit/1bfa6efdff2da6af670f5841fefc7f9e51a3b804))
* Allow for customizing retry strategy (box/box-codegen[#635](https://github.com/box/box-java-sdk-gen/issues/635)) ([#120](https://github.com/box/box-java-sdk-gen/issues/120)) ([78946c0](https://github.com/box/box-java-sdk-gen/commit/78946c08c37834462a2fb700dd587a353b26052d))
* Support get download URL in Java (box/box-codegen[#634](https://github.com/box/box-java-sdk-gen/issues/634)) ([#119](https://github.com/box/box-java-sdk-gen/issues/119)) ([d62645e](https://github.com/box/box-java-sdk-gen/commit/d62645eaf7d4a5b4c1ab92fc602bd8bbcb4b253a))
* Support optional `userId` parameter for updating files, folders and web links ([#106](https://github.com/box/box-java-sdk-gen/issues/106)) ([50f7521](https://github.com/box/box-java-sdk-gen/commit/50f7521427f6019e588286eb9e9be20a8e28c3c1))

## 0.2.0 (2024-12-03)


### Bug Fixes

* add Dict import to the derived type when used in base type (box/box-codegen[#584](https://github.com/box/box-java-sdk-gen/issues/584)) ([#32](https://github.com/box/box-java-sdk-gen/issues/32)) ([d6212c8](https://github.com/box/box-java-sdk-gen/commit/d6212c80dcaf5f02040ad0a6f0e5a8622c69d463))
* fix additionalProperties (box/box-openapi[#477](https://github.com/box/box-java-sdk-gen/issues/477)) ([#31](https://github.com/box/box-java-sdk-gen/issues/31)) ([996944c](https://github.com/box/box-java-sdk-gen/commit/996944cf39e4925c6f346755d20c60a1a6665234))
* Support status codes with no content (box/box-codegen[#604](https://github.com/box/box-java-sdk-gen/issues/604)) ([#58](https://github.com/box/box-java-sdk-gen/issues/58)) ([cfc66b9](https://github.com/box/box-java-sdk-gen/commit/cfc66b9802f220865d3d403a6d0c51adae0d30d2))
* update client error schema to support schema errors (box/box-openapi[#467](https://github.com/box/box-java-sdk-gen/issues/467)) ([#23](https://github.com/box/box-java-sdk-gen/issues/23)) ([b5c018d](https://github.com/box/box-java-sdk-gen/commit/b5c018d94d52f9f47156b2a3e8a16c899ce5052c))
* use raw docstrings when comments contain backslash (box/box-codegen[#571](https://github.com/box/box-java-sdk-gen/issues/571)) ([8bedc09](https://github.com/box/box-java-sdk-gen/commit/8bedc096815817c2f83594956fa9fe5b663d3ab9))


### New Features and Enhancements

* Add optional URL parameter to `FetchResponse` (box/box-codegen[#617](https://github.com/box/box-java-sdk-gen/issues/617)) ([#89](https://github.com/box/box-java-sdk-gen/issues/89)) ([e50745c](https://github.com/box/box-java-sdk-gen/commit/e50745cfcec658157defb0925537d1d59210425a))
* Expose method for making custom HTTP requests (box/box-codegen[#610](https://github.com/box/box-java-sdk-gen/issues/610)) ([#84](https://github.com/box/box-java-sdk-gen/issues/84)) ([7476b1b](https://github.com/box/box-java-sdk-gen/commit/7476b1b67aafdbec83a068be526a50a56535db5e))
* Generate initial SDK (box/box-codegen[#570](https://github.com/box/box-java-sdk-gen/issues/570)) ([#3](https://github.com/box/box-java-sdk-gen/issues/3)) ([8750f1c](https://github.com/box/box-java-sdk-gen/commit/8750f1ce0742d77ebe57678478f52bd2c52c228b))
* include `rawData` in serialisable objects (box/box-codegen[#608](https://github.com/box/box-java-sdk-gen/issues/608)) ([#73](https://github.com/box/box-java-sdk-gen/issues/73)) ([56f8efd](https://github.com/box/box-java-sdk-gen/commit/56f8efdca04a0bb1dbd03ab5f7e06a7990275154))
* Introduce enum `Valuable` interface (box/box-codegen[#594](https://github.com/box/box-java-sdk-gen/issues/594)) ([#47](https://github.com/box/box-java-sdk-gen/issues/47)) ([3d7b227](https://github.com/box/box-java-sdk-gen/commit/3d7b2278b29fe490eda26463ceb843b0cbc37c7d))
* Modify schema for teams for integration mapping api (box/box-openapi[#463](https://github.com/box/box-java-sdk-gen/issues/463)) ([#21](https://github.com/box/box-java-sdk-gen/issues/21)) ([e5cb636](https://github.com/box/box-java-sdk-gen/commit/e5cb63695b7544fa14ee3da5a2f6a3a3d9ff50a0))
* Support `CCGAuth` and `OAuth` (box/box-openapi[#478](https://github.com/box/box-java-sdk-gen/issues/478)) ([#33](https://github.com/box/box-java-sdk-gen/issues/33)) ([d592498](https://github.com/box/box-java-sdk-gen/commit/d59249837578ba2eff78a503a0d4a0d5d29ff460))
* Support get collection by ID endpoint ([#46](https://github.com/box/box-java-sdk-gen/issues/46)) ([372cc5f](https://github.com/box/box-java-sdk-gen/commit/372cc5f7f97b308c33bbffc0aad26c01b6be6b2b))
* Support interceptors (box/box-codegen[#621](https://github.com/box/box-java-sdk-gen/issues/621)) ([#87](https://github.com/box/box-java-sdk-gen/issues/87)) ([8c1bbc3](https://github.com/box/box-java-sdk-gen/commit/8c1bbc3288e5742cd62df894553f24fc7a3ebd75))
* Support JWT Auth in Java (box/box-codegen[#590](https://github.com/box/box-java-sdk-gen/issues/590)) ([#36](https://github.com/box/box-java-sdk-gen/issues/36)) ([09a62d7](https://github.com/box/box-java-sdk-gen/commit/09a62d7ccf04017b9b8d2c4f940dde8bcd8c7e03))
* Support tests in Java (box/box-codegen[#580](https://github.com/box/box-java-sdk-gen/issues/580)) ([#30](https://github.com/box/box-java-sdk-gen/issues/30)) ([9c867c8](https://github.com/box/box-java-sdk-gen/commit/9c867c8aac977c75420ab07ac173eb3c7af3259e))
* Support Try, Throw tags and some build-in functions in Java (box/box-codegen[#579](https://github.com/box/box-java-sdk-gen/issues/579)) ([#20](https://github.com/box/box-java-sdk-gen/issues/20)) ([8b49f52](https://github.com/box/box-java-sdk-gen/commit/8b49f5295e3d19c4dd2272c451e441e73c54e13e))
* Support uploads and downloads (box/box-codegen[#572](https://github.com/box/box-java-sdk-gen/issues/572)) ([9528060](https://github.com/box/box-java-sdk-gen/commit/95280609434e693f6ee62116b40a8a37735a6237))
* Support uploads and downloads in Java (box/box-codegen[#572](https://github.com/box/box-java-sdk-gen/issues/572)) ([e02111b](https://github.com/box/box-java-sdk-gen/commit/e02111bb21d01448d46dca1cc607b79b5cd9d09a))

### 0.1.1 (2024-11-04)


### New Features and Enhancements

* Generate initial SDK (box/box-codegen[#570](https://github.com/box/box-codegen/issues/570)) ([#3](https://github.com/box/box-codegen/issues/3)) ([8750f1c](https://github.com/box/box-codegen/commit/8750f1ce0742d77ebe57678478f52bd2c52c228b))
