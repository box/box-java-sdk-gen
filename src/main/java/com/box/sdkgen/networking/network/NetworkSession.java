package com.box.sdkgen.networking.network;

import com.box.sdkgen.networking.baseurls.BaseUrls;
import okhttp3.OkHttpClient;
import sun.net.www.http.HttpClient;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.singletonList;
import static okhttp3.ConnectionSpec.MODERN_TLS;

public class NetworkSession {

    public static final int MAX_ATTEMPTS = 5;

    protected Map<String, String> additionalHeaders = new HashMap<>();

    protected BaseUrls baseUrls = new BaseUrls();

    protected OkHttpClient httpClient;

    public NetworkSession() {
        OkHttpClient.Builder builder =  new OkHttpClient.Builder()
                .followSslRedirects(true)
                .followRedirects(true)
                .connectionSpecs(singletonList(MODERN_TLS));
        httpClient = builder.build();
    }

    protected NetworkSession(NetworkSessionBuilder builder) {
        this.additionalHeaders = builder.additionalHeaders;
        this.baseUrls = builder.baseUrls;
        this.httpClient = builder.httpClient;
    }

    public NetworkSession withAdditionalHeaders() {
        return withAdditionalHeaders(new HashMap<>());
    }

    public NetworkSession withAdditionalHeaders(Map<String, String> additionalHeaders) {
        Map<String, String> newHeaders = new HashMap<>();
        newHeaders.putAll(this.additionalHeaders);
        newHeaders.putAll(additionalHeaders);
        return new NetworkSession.NetworkSessionBuilder().additionalHeaders(newHeaders).build();
    }

    public NetworkSession withCustomBaseUrls(BaseUrls baseUrls) {
        return new NetworkSession.NetworkSessionBuilder().additionalHeaders(this.additionalHeaders).baseUrls(baseUrls).build();
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public BaseUrls getBaseUrls() {
        return baseUrls;
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    public static class NetworkSessionBuilder {

        protected Map<String, String> additionalHeaders = new HashMap<>();

        protected BaseUrls baseUrls = new BaseUrls();

        protected OkHttpClient httpClient;

        public NetworkSessionBuilder() {
            OkHttpClient.Builder builder =  new OkHttpClient.Builder()
                    .followSslRedirects(true)
                    .followRedirects(true)
                    .connectionSpecs(singletonList(MODERN_TLS));
            httpClient = builder.build();
        }

        public NetworkSessionBuilder additionalHeaders(Map<String, String> additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public NetworkSessionBuilder baseUrls(BaseUrls baseUrls) {
            this.baseUrls = baseUrls;
            return this;
        }

        public NetworkSessionBuilder httpClient(OkHttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public NetworkSession build() {
            return new NetworkSession(this);
        }

    }
}
