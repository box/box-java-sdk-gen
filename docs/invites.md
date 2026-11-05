# InvitesManager

<!-- box-java-sdk-gen deprecation banner -->
> [!CAUTION]
> **`box-java-sdk-gen` is deprecated and no longer maintained.** As of September 17, 2025, it receives no new features, bug fixes, or security patches. Do not use it for new projects.
>
> Use [`box-java-sdk`](https://github.com/box/box-java-sdk) v10+ instead: `com.box:box-java-sdk` from Maven Central.
> The equivalent of this page is [box-java-sdk/docs/invites.md](https://github.com/box/box-java-sdk/blob/main/docs/invites.md). To migrate existing code, see the [migration guide](https://github.com/box/box-java-sdk/blob/main/migration-guides/from-box-java-sdk-gen-v0-to-box-java-sdk.md).


- [Create user invite](#create-user-invite)
- [Get user invite status](#get-user-invite-status)

## Create user invite

Invites an existing external user to join an enterprise.

The existing user can not be part of another enterprise and
must already have a Box account. Once invited, the user will receive an
email and are prompted to accept the invitation within the
Box web application.

This method requires the "Manage An Enterprise" scope enabled for
the application, which can be enabled within the developer console.

This operation is performed by calling function `createInvite`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/post-invites/).

<!-- sample post_invites -->
```
client.getInvites().createInvite(new CreateInviteRequestBody(new CreateInviteRequestBodyEnterpriseField(currentUser.getEnterprise().getId()), new CreateInviteRequestBodyActionableByField.Builder().login(email).build()))
```

### Arguments

- requestBody `CreateInviteRequestBody`
  - Request body of createInvite method
- queryParams `CreateInviteQueryParams`
  - Query parameters of createInvite method
- headers `CreateInviteHeaders`
  - Headers of createInvite method


### Returns

This function returns a value of type `Invite`.

Returns a new invite object.


## Get user invite status

Returns the status of a user invite.

This operation is performed by calling function `getInviteById`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-invites-id/).

<!-- sample get_invites_id -->
```
client.getInvites().getInviteById(invitation.getId())
```

### Arguments

- inviteId `String`
  - The ID of an invite. Example: "213723"
- queryParams `GetInviteByIdQueryParams`
  - Query parameters of getInviteById method
- headers `GetInviteByIdHeaders`
  - Headers of getInviteById method


### Returns

This function returns a value of type `Invite`.

Returns an invite object.


