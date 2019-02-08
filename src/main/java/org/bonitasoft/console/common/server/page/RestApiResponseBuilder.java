/**
 * Copyright (C) 2015-2019 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.console.common.server.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

/**
 * @deprecated use {@link org.bonitasoft.web.extension.rest.RestApiResponseBuilder} instead
 */
@Deprecated
public class RestApiResponseBuilder {

    protected Serializable response;
    protected int httpStatus;
    protected final Map<String, String> additionalHeaders;
    protected final List<Cookie> additionalCookies;
    protected String characterSet;
    protected String mediaType;

    public RestApiResponseBuilder() {
        this.httpStatus = RestApiResponse.DEFAULT_STATUS;
        this.additionalHeaders = new HashMap<>();
        this.additionalCookies = new ArrayList<>();
        this.characterSet = RestApiResponse.DEFAULT_CHARACTER_SET;
        this.mediaType = RestApiResponse.DEFAULT_MEDIA_TYPE;
    }

    public RestApiResponseBuilder withResponse(Serializable response) {
        this.response = response;
        return this;
    }

    public RestApiResponseBuilder withResponseStatus(int httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }


    public RestApiResponseBuilder withAdditionalHeader(String headerName, String headerValue) {
        additionalHeaders.put(headerName, headerValue);
        return this;
    }

    public RestApiResponseBuilder withAdditionalCookie(Cookie cookie) {
        additionalCookies.add(cookie);
        return this;
    }

    public RestApiResponseBuilder withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public RestApiResponseBuilder withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public RestApiResponse build() {
        return new RestApiResponse(response, httpStatus, additionalHeaders, additionalCookies, mediaType,
                characterSet);
    }
}
