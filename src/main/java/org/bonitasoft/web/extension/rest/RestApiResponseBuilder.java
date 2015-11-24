package org.bonitasoft.web.extension.rest;

import java.io.Serializable;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Build a RestApiResponse specifying response body, status and other HTTP attributes.
 */
public class RestApiResponseBuilder extends org.bonitasoft.console.common.server.page.RestApiResponseBuilder {

    /**
     * Set the body of the response
     * 
     * @param response the response body
     */
    @Override
    public RestApiResponseBuilder withResponse(Serializable response) {
        this.response = response;
        return this;
    }

    /**
     * Set the HTTP status of the response. By default, OK status (200) is set.
     * 
     * @param httpStatus the HTTP status of the response
     * @see HttpServletResponse
     */
    @Override
    public RestApiResponseBuilder withResponseStatus(int httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    /**
     * Adds a header in the HTTP response
     * 
     * @param name the name of the header to add in the response.
     * @param value the value for this header
     * @see org.apache.http.HttpHeaders
     */
    @Override
    public RestApiResponseBuilder withAdditionalHeader(String name, String value) {
        additionalHeaders.put(name, value);
        return this;
    }

    /**
     * Adds a cookie to the HTTP response
     * 
     * @param cookie the {@link javax.servlet.http.Cookie} to add to the response
     */
    @Override
    public RestApiResponseBuilder withAdditionalCookie(Cookie cookie) {
        additionalCookies.add(cookie);
        return this;
    }

    /**
     * Set the character set of the HTTP response. By default UTF-8 is set.
     * 
     * @param characterSet the name of the character set
     * @see java.nio.charset.Charset
     */
    @Override
    public RestApiResponseBuilder withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * Set the media type of the HTTP response body. By default "application/json" is set.
     * 
     * @param mediaType the media type to set.
     * @see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">Registered media types</a>
     */
    @Override
    public RestApiResponseBuilder withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * @return the RestApiResponse response
     */
    @Override
    public org.bonitasoft.web.extension.rest.RestApiResponse build() {
        return new org.bonitasoft.web.extension.rest.RestApiResponse(response, httpStatus, additionalHeaders, additionalCookies, mediaType,
                characterSet);
    }

}
