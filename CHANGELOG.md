# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

## [0.8.0](https://github.com/box/box-java-sdk-gen/compare/v0.7.0...v0.8.0) (2025-08-05)


### Bug Fixes

* Fix `mergeMaps` function (box/box-codegen[#734](https://github.com/box/box-java-sdk-gen/issues/734)) ([#324](https://github.com/box/box-java-sdk-gen/issues/324)) ([37e5536](https://github.com/box/box-java-sdk-gen/commit/37e553661f2573306710922984ff47d94fa6abc6))
* Fix downscope token to use `retrieveToken` method for token retrieval (box/box-codegen[#731](https://github.com/box/box-java-sdk-gen/issues/731)) ([#320](https://github.com/box/box-java-sdk-gen/issues/320)) ([55711f7](https://github.com/box/box-java-sdk-gen/commit/55711f79b38ab2ee4cc36a1df5c01cac8a9fbf8a))
* Fix Locale Comparison for upperCase and lowerCase (box/box-codegen[#746](https://github.com/box/box-java-sdk-gen/issues/746)) ([#345](https://github.com/box/box-java-sdk-gen/issues/345)) ([d8480ee](https://github.com/box/box-java-sdk-gen/commit/d8480ee6c8793f7d1595690007bb3c0dcedc2bc5))
* Specify events `next_stream_position` property type as `long` (box/box-openapi[#535](https://github.com/box/box-java-sdk-gen/issues/535)) ([#364](https://github.com/box/box-java-sdk-gen/issues/364)) ([715ac24](https://github.com/box/box-java-sdk-gen/commit/715ac2415b18b6128fa628728ace0cf3c632f47d))


### New Features and Enhancements

* Add AI spreadsheet processor (box/box-openapi[#533](https://github.com/box/box-java-sdk-gen/issues/533)) ([#349](https://github.com/box/box-java-sdk-gen/issues/349)) ([b53b17c](https://github.com/box/box-java-sdk-gen/commit/b53b17cba1189c38b9d8dba2ad9d97ed7c9fb59b))
* Add Archive Public API (box/box-openapi[#540](https://github.com/box/box-java-sdk-gen/issues/540)) ([#372](https://github.com/box/box-java-sdk-gen/issues/372)) ([32c566d](https://github.com/box/box-java-sdk-gen/commit/32c566d3fef6c3377975ee1e0ffb83cfa858dd47))
* add hubs API beta endpoints (box/box-openapi[#531](https://github.com/box/box-java-sdk-gen/issues/531)) ([#341](https://github.com/box/box-java-sdk-gen/issues/341)) ([d895e58](https://github.com/box/box-java-sdk-gen/commit/d895e58e61c5fe31ceb9d98697f98f13fba89148))
* Add new Hubs APIs and Hubs items API (box/box-openapi[#538](https://github.com/box/box-java-sdk-gen/issues/538)) ([#365](https://github.com/box/box-java-sdk-gen/issues/365)) ([73c70b3](https://github.com/box/box-java-sdk-gen/commit/73c70b35aafc8f5212010fa9566cb49f28f41d95))
* Add new property for network exception retry strategy (box/box-codegen[#763](https://github.com/box/box-java-sdk-gen/issues/763)) ([#371](https://github.com/box/box-java-sdk-gen/issues/371)) ([57927e0](https://github.com/box/box-java-sdk-gen/commit/57927e0b39c14ca208de7bc96ef942b8ca51f4d2))
* Add new schema for `Metadata Error` (box/box-openapi[#539](https://github.com/box/box-java-sdk-gen/issues/539)) ([#366](https://github.com/box/box-java-sdk-gen/issues/366)) ([08fcb0f](https://github.com/box/box-java-sdk-gen/commit/08fcb0faeadb2981648ad46db7505a1503d029eb))
* add Shield Lists APIs (box/box-openapi[#528](https://github.com/box/box-java-sdk-gen/issues/528)) ([#323](https://github.com/box/box-java-sdk-gen/issues/323)) ([79a2b87](https://github.com/box/box-java-sdk-gen/commit/79a2b87a6aaa2c33b9c9de7b3265ea31c3f09d58))
* Add webhook validation(box/box-codegen[#745](https://github.com/box/box-java-sdk-gen/issues/745)) ([#347](https://github.com/box/box-java-sdk-gen/issues/347)) ([ca61a56](https://github.com/box/box-java-sdk-gen/commit/ca61a56c48a3be2042c2d2b1670d1023d37e5979))
* Allow injecting private key `decryptor` for JWT (box/box-codegen[#754](https://github.com/box/box-java-sdk-gen/issues/754)) ([#355](https://github.com/box/box-java-sdk-gen/issues/355)) ([31f3a2a](https://github.com/box/box-java-sdk-gen/commit/31f3a2a6bcb2311b0db026220af58372914def41))
* Shorten builder names in Java (box/box-codegen[#742](https://github.com/box/box-java-sdk-gen/issues/742)) ([#334](https://github.com/box/box-java-sdk-gen/issues/334)) ([cf87520](https://github.com/box/box-java-sdk-gen/commit/cf87520c948022432a8905628d232d8d9424cd62))
* Support common union fields and implicit union conversion (box/box-codegen[#758](https://github.com/box/box-java-sdk-gen/issues/758)) ([#361](https://github.com/box/box-java-sdk-gen/issues/361)) ([eb98236](https://github.com/box/box-java-sdk-gen/commit/eb982364db2915305421838a47112bdf24f3dba2))
* Support DateTime in Java (box/box-codegen[#726](https://github.com/box/box-java-sdk-gen/issues/726)) ([#314](https://github.com/box/box-java-sdk-gen/issues/314)) ([90389ec](https://github.com/box/box-java-sdk-gen/commit/90389ecd8023125f82cb5a538c00a1a153b5488e))
* Support new tools in AI Studio (box/box-openapi[#534](https://github.com/box/box-java-sdk-gen/issues/534))  ([#352](https://github.com/box/box-java-sdk-gen/issues/352)) ([b7374ec](https://github.com/box/box-java-sdk-gen/commit/b7374ec91396d79719f75d6fccf8ef15ed503278))
* Support sending `nullable` fields in Java (box/box-codegen[#748](https://github.com/box/box-java-sdk-gen/issues/748)) ([#346](https://github.com/box/box-java-sdk-gen/issues/346)) ([e4e31bb](https://github.com/box/box-java-sdk-gen/commit/e4e31bbb85ddf95f1d480b19ae03c639b0a6509e))
* Update legal holds and AI models (box/box-openapi[#526](https://github.com/box/box-java-sdk-gen/issues/526)) ([#321](https://github.com/box/box-java-sdk-gen/issues/321)) ([28f2ec7](https://github.com/box/box-java-sdk-gen/commit/28f2ec7f871221527d1d5b0b9b6fd9b47e295b48))

## [0.7.0](https://github.com/box/box-java-sdk-gen/compare/v0.6.2...v0.7.0) (2025-05-09)


### Bug Fixes

* Fix conversion of `mdfilters` into query parameters (box/box-codegen[#721](https://github.com/box/box-java-sdk-gen/issues/721)) ([#301](https://github.com/box/box-java-sdk-gen/issues/301)) ([8c2e1c6](https://github.com/box/box-java-sdk-gen/commit/8c2e1c6801502e3952dfbbe20e2e36d4ef42810f))


### New Features and Enhancements

* add support of IBM models to AI API (box/box-openapi[#522](https://github.com/box/box-java-sdk-gen/issues/522)) ([#298](https://github.com/box/box-java-sdk-gen/issues/298)) ([1444afc](https://github.com/box/box-java-sdk-gen/commit/1444afc629d0f99814842c5c881fb1a9b28c30fe))

### [0.6.2](https://github.com/box/box-java-sdk-gen/compare/v0.6.1...v0.6.2) (2025-05-02)


### Bug Fixes

* Fix possible `NullPointerException` if data sanitizer is null ([#284](https://github.com/box/box-java-sdk-gen/issues/284)) ([e238f83](https://github.com/box/box-java-sdk-gen/commit/e238f8366aa9189b14f9748082829ea6b221d8dc))
* handle `double` and `any` `Metadata` values properly (box/box-codegen[#716](https://github.com/box/box-java-sdk-gen/issues/716)) ([#291](https://github.com/box/box-java-sdk-gen/issues/291)) ([2acac62](https://github.com/box/box-java-sdk-gen/commit/2acac62e231fe3e3f2706833cb0acbfdc5e30d70))


### New Features and Enhancements

* add AI agents warnings and allow for more types of metadata value (box/box-openapi[#520](https://github.com/box/box-java-sdk-gen/issues/520)) ([#295](https://github.com/box/box-java-sdk-gen/issues/295)) ([b945f1b](https://github.com/box/box-java-sdk-gen/commit/b945f1b7ef181f84bc20cba5638a9760ad6e52dc))
* Add security settings properties on sign template schema (box/box-openapi[#518](https://github.com/box/box-java-sdk-gen/issues/518)) ([#281](https://github.com/box/box-java-sdk-gen/issues/281)) ([075a1bc](https://github.com/box/box-java-sdk-gen/commit/075a1bc6494a6b5ab23df91a8d5735532e8fcbbf))
* Support additional properties for metadata endpoints (box/box-codegen[#719](https://github.com/box/box-java-sdk-gen/issues/719)) ([#293](https://github.com/box/box-java-sdk-gen/issues/293)) ([a3fd033](https://github.com/box/box-java-sdk-gen/commit/a3fd033288e684e6b30450d6f01f2e6e6e4500e1))

### [0.6.1](https://github.com/box/box-java-sdk-gen/compare/v0.6.0...v0.6.1) (2025-04-10)


### Bug Fixes

* Fix sanitizing headers in Java (box/box-codegen[#698](https://github.com/box/box-java-sdk-gen/issues/698)) ([#271](https://github.com/box/box-java-sdk-gen/issues/271)) ([0cf84d2](https://github.com/box/box-java-sdk-gen/commit/0cf84d266fd72c59ce275e78c33bcb3778d9b3f6))

## [0.6.0](https://github.com/box/box-java-sdk-gen/compare/v0.5.2...v0.6.0) (2025-04-08)


### Bug Fixes

* Fix handling responses with invalid `json` (box/box-codegen[#693](https://github.com/box/box-java-sdk-gen/issues/693)) ([#264](https://github.com/box/box-java-sdk-gen/issues/264)) ([c93ae3b](https://github.com/box/box-java-sdk-gen/commit/c93ae3b21a6f69f2134fb44e9489aece90d59ca9))


### New Features and Enhancements

* Support sensitive data sanitization in errors (box/box-codegen[#695](https://github.com/box/box-java-sdk-gen/issues/695)) ([#267](https://github.com/box/box-java-sdk-gen/issues/267)) ([2dd715f](https://github.com/box/box-java-sdk-gen/commit/2dd715f5c06ef3af6c82780686b332ae1360279c))

### [0.5.2](https://github.com/box/box-java-sdk-gen/compare/v0.5.1...v0.5.2) (2025-03-25)


### Bug Fixes

* Add missing fields to `AuthManager` during initialization (box/box-codegen[#688](https://github.com/box/box-java-sdk-gen/issues/688)) ([#257](https://github.com/box/box-java-sdk-gen/issues/257)) ([d352820](https://github.com/box/box-java-sdk-gen/commit/d3528207feac09477abdecd7bceb627580329ab6))

### [0.5.1](https://github.com/box/box-java-sdk-gen/compare/v0.5.0...v0.5.1) (2025-03-18)


### Bug Fixes

* add `verification_phone_number` property to create sign request (box/box-openapi[#515](https://github.com/box/box-java-sdk-gen/issues/515)) ([#242](https://github.com/box/box-java-sdk-gen/issues/242)) ([d81c700](https://github.com/box/box-java-sdk-gen/commit/d81c70052f3eb9198645090169fde85ee7991d10))


### New Features and Enhancements

* add find app item for shared link endpoint (box/box-openapi[#514](https://github.com/box/box-java-sdk-gen/issues/514)) ([#241](https://github.com/box/box-java-sdk-gen/issues/241)) ([751e35f](https://github.com/box/box-java-sdk-gen/commit/751e35fdf7f4b2a1fc8ac0153496eb5fe730549b))
* add Integration Mappings Teams API (box/box-openapi[#517](https://github.com/box/box-java-sdk-gen/issues/517)) ([#244](https://github.com/box/box-java-sdk-gen/issues/244)) ([ba45671](https://github.com/box/box-java-sdk-gen/commit/ba45671f4de0d933969256f394a85560726112c4))
* Expose token storage for authentication classes (box/box-codegen[#682](https://github.com/box/box-java-sdk-gen/issues/682)) ([#250](https://github.com/box/box-java-sdk-gen/issues/250)) ([6ad373d](https://github.com/box/box-java-sdk-gen/commit/6ad373df9ccd6fdd2d4cf465b04d765be9738cd1))
* Support AI Studio API (box/box-codegen[#626](https://github.com/box/box-java-sdk-gen/issues/626)) ([#223](https://github.com/box/box-java-sdk-gen/issues/223)) ([f991efd](https://github.com/box/box-java-sdk-gen/commit/f991efda62faa6feb4b4f4aa80247c5f4f6b399d))
* Support upload with preflight check (box/box-codegen[#676](https://github.com/box/box-java-sdk-gen/issues/676)) ([#249](https://github.com/box/box-java-sdk-gen/issues/249)) ([3199e25](https://github.com/box/box-java-sdk-gen/commit/3199e25f57b893dc504a64c40add7501152bb27f))

## [0.5.0](https://github.com/box/box-java-sdk-gen/compare/v0.4.0...v0.5.0) (2025-02-10)


### Bug Fixes

* Fix type of `Items` entries field (box/box-codegen[#660](https://github.com/box/box-java-sdk-gen/issues/660)) ([#213](https://github.com/box/box-java-sdk-gen/issues/213)) ([7e1b743](https://github.com/box/box-java-sdk-gen/commit/7e1b74386b0ab7bff92d855a8b50a42645854839))


### New Features and Enhancements

* Add hubs support to `/ai/ask` (box/box-openapi[#506](https://github.com/box/box-java-sdk-gen/issues/506)) ([#202](https://github.com/box/box-java-sdk-gen/issues/202)) ([888ee7b](https://github.com/box/box-java-sdk-gen/commit/888ee7bf5df8f7425371a7c55d1289d70137e675))

## [0.4.0](https://github.com/box/box-java-sdk-gen/compare/v0.3.0...v0.4.0) (2025-02-03)


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
* Update `/ai/extract_structured` response schema (box/box-codegen[#641](https://github.com/box/box-java-sdk-gen/issues/641)) ([#196](https://github.com/box/box-java-sdk-gen/issues/196)) ([d42892a](https://github.com/box/box-java-sdk-gen/commit/d42892a5b2e40b8192e0630b8dea56509248bf3f))

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
