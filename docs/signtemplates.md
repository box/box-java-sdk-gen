# SignTemplatesManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/signtemplates.md](https://github.com/box/box-java-sdk/blob/main/docs/signtemplates.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [List Box Sign templates](#list-box-sign-templates)
- [Get Box Sign template by ID](#get-box-sign-template-by-id)

## List Box Sign templates

Gets Box Sign templates created by a user.

This operation is performed by calling function `getSignTemplates`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-sign-templates/).

<!-- sample get_sign_templates -->
```
client.getSignTemplates().getSignTemplates(new GetSignTemplatesQueryParams.Builder().limit(2L).build())
```

### Arguments

- queryParams `GetSignTemplatesQueryParams`
  - Query parameters of getSignTemplates method
- headers `GetSignTemplatesHeaders`
  - Headers of getSignTemplates method


### Returns

This function returns a value of type `SignTemplates`.

Returns a collection of templates.


## Get Box Sign template by ID

Fetches details of a specific Box Sign template.

This operation is performed by calling function `getSignTemplateById`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-sign-templates-id/).

<!-- sample get_sign_templates_id -->
```
client.getSignTemplates().getSignTemplateById(signTemplates.getEntries().get(0).getId())
```

### Arguments

- templateId `String`
  - The ID of a Box Sign template. Example: "123075213-7d117509-8f05-42e4-a5ef-5190a319d41d"
- headers `GetSignTemplateByIdHeaders`
  - Headers of getSignTemplateById method


### Returns

This function returns a value of type `SignTemplate`.

Returns details of a template.


