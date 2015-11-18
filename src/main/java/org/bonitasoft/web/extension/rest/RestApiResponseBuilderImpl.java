package org.bonitasoft.web.extension.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

public class RestApiResponseBuilderImpl implements RestApiResponseBuilder {

    private Serializable response;
    private int httpStatus;
    private final Map<String, String> additionalHeaders;
    private final List<Cookie> additionalCookies;
    private String characterSet;
    private String mediaType;

    public RestApiResponseBuilderImpl() {
        this.httpStatus = RestApiResponse.DEFAULT_STATUS;
        this.additionalHeaders = new HashMap<>();
        this.additionalCookies = new ArrayList<>();
        this.characterSet = RestApiResponse.DEFAULT_CHARACTER_SET;
        this.mediaType = RestApiResponse.DEFAULT_MEDIA_TYPE;
    }

    @Override
    public RestApiResponseBuilderImpl withResponse(Serializable response) {
        this.response = response;
        return this;
    }

    @Override
    public RestApiResponseBuilderImpl withResponseStatus(int httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    @Override
    public RestApiResponseBuilderImpl withAdditionalHeader(String headerName, String headerValue) {
        additionalHeaders.put(headerName, headerValue);
        return this;
    }

    @Override
    public RestApiResponseBuilderImpl withAdditionalCookie(Cookie cookie) {
        additionalCookies.add(cookie);
        return this;
    }

    @Override
    public RestApiResponseBuilderImpl withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    @Override
    public RestApiResponseBuilderImpl withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RestApiResponse build() {
        return new RestApiResponseImpl(response, httpStatus, additionalHeaders, additionalCookies, mediaType, characterSet);
    }
}
