package org.bonitasoft.web.extension.rest;

import java.io.Serializable;

import javax.servlet.http.Cookie;

public class RestApiResponseBuilder extends org.bonitasoft.console.common.server.page.RestApiResponseBuilder {

    @Override
    public RestApiResponseBuilder withResponse(Serializable response) {
        this.response = response;
        return this;
    }

    @Override
    public RestApiResponseBuilder withResponseStatus(int httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    @Override
    public RestApiResponseBuilder withAdditionalHeader(String headerName, String headerValue) {
        additionalHeaders.put(headerName, headerValue);
        return this;
    }

    @Override
    public RestApiResponseBuilder withAdditionalCookie(Cookie cookie) {
        additionalCookies.add(cookie);
        return this;
    }

    @Override
    public RestApiResponseBuilder withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    @Override
    public RestApiResponseBuilder withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see org.bonitasoft.console.common.server.page.RestApiResponseBuilder#build()
     */
    @Override
    public org.bonitasoft.web.extension.rest.RestApiResponse build() {
        return new org.bonitasoft.web.extension.rest.RestApiResponse(response, httpStatus, additionalHeaders, additionalCookies, mediaType,
                characterSet);
    }

}
