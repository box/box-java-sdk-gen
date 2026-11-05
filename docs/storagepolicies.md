# StoragePoliciesManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/storagepolicies.md](https://github.com/box/box-java-sdk/blob/main/docs/storagepolicies.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [List storage policies](#list-storage-policies)
- [Get storage policy](#get-storage-policy)

## List storage policies

Fetches all the storage policies in the enterprise.

This operation is performed by calling function `getStoragePolicies`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-storage-policies/).

<!-- sample get_storage_policies -->
```
client.getStoragePolicies().getStoragePolicies()
```

### Arguments

- queryParams `GetStoragePoliciesQueryParams`
  - Query parameters of getStoragePolicies method
- headers `GetStoragePoliciesHeaders`
  - Headers of getStoragePolicies method


### Returns

This function returns a value of type `StoragePolicies`.

Returns a collection of storage policies.


## Get storage policy

Fetches a specific storage policy.

This operation is performed by calling function `getStoragePolicyById`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-storage-policies-id/).

<!-- sample get_storage_policies_id -->
```
client.getStoragePolicies().getStoragePolicyById(storagePolicy.getId())
```

### Arguments

- storagePolicyId `String`
  - The ID of the storage policy. Example: "34342"
- headers `GetStoragePolicyByIdHeaders`
  - Headers of getStoragePolicyById method


### Returns

This function returns a value of type `StoragePolicy`.

Returns a storage policy object.


