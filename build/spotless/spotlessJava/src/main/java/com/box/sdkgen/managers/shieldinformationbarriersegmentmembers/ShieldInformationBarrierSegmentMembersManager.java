package com.box.sdkgen.managers.shieldinformationbarriersegmentmembers;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmembers.ShieldInformationBarrierSegmentMembers;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class ShieldInformationBarrierSegmentMembersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ShieldInformationBarrierSegmentMembersManager() {
    this.networkSession = new NetworkSession();
  }

  protected ShieldInformationBarrierSegmentMembersManager(
      ShieldInformationBarrierSegmentMembersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ShieldInformationBarrierSegmentMember getShieldInformationBarrierSegmentMemberById(
      String shieldInformationBarrierSegmentMemberId) {
    return getShieldInformationBarrierSegmentMemberById(
        shieldInformationBarrierSegmentMemberId,
        new GetShieldInformationBarrierSegmentMemberByIdHeaders());
  }

  public ShieldInformationBarrierSegmentMember getShieldInformationBarrierSegmentMemberById(
      String shieldInformationBarrierSegmentMemberId,
      GetShieldInformationBarrierSegmentMemberByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/shield_information_barrier_segment_members/",
                        convertToString(shieldInformationBarrierSegmentMemberId)))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrierSegmentMember.class);
  }

  public void deleteShieldInformationBarrierSegmentMemberById(
      String shieldInformationBarrierSegmentMemberId) {
    deleteShieldInformationBarrierSegmentMemberById(
        shieldInformationBarrierSegmentMemberId,
        new DeleteShieldInformationBarrierSegmentMemberByIdHeaders());
  }

  public void deleteShieldInformationBarrierSegmentMemberById(
      String shieldInformationBarrierSegmentMemberId,
      DeleteShieldInformationBarrierSegmentMemberByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/shield_information_barrier_segment_members/",
                        convertToString(shieldInformationBarrierSegmentMemberId)))
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public ShieldInformationBarrierSegmentMembers getShieldInformationBarrierSegmentMembers(
      GetShieldInformationBarrierSegmentMembersQueryParams queryParams) {
    return getShieldInformationBarrierSegmentMembers(
        queryParams, new GetShieldInformationBarrierSegmentMembersHeaders());
  }

  public ShieldInformationBarrierSegmentMembers getShieldInformationBarrierSegmentMembers(
      GetShieldInformationBarrierSegmentMembersQueryParams queryParams,
      GetShieldInformationBarrierSegmentMembersHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf(
                    "shield_information_barrier_segment_id",
                    convertToString(queryParams.getShieldInformationBarrierSegmentId())),
                entryOf("marker", convertToString(queryParams.getMarker())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/shield_information_barrier_segment_members"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(
        response.getData(), ShieldInformationBarrierSegmentMembers.class);
  }

  public ShieldInformationBarrierSegmentMember createShieldInformationBarrierSegmentMember(
      CreateShieldInformationBarrierSegmentMemberRequestBody requestBody) {
    return createShieldInformationBarrierSegmentMember(
        requestBody, new CreateShieldInformationBarrierSegmentMemberHeaders());
  }

  public ShieldInformationBarrierSegmentMember createShieldInformationBarrierSegmentMember(
      CreateShieldInformationBarrierSegmentMemberRequestBody requestBody,
      CreateShieldInformationBarrierSegmentMemberHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/shield_information_barrier_segment_members"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrierSegmentMember.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ShieldInformationBarrierSegmentMembersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ShieldInformationBarrierSegmentMembersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ShieldInformationBarrierSegmentMembersManagerBuilder networkSession(
        NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ShieldInformationBarrierSegmentMembersManager build() {
      return new ShieldInformationBarrierSegmentMembersManager(this);
    }
  }
}
