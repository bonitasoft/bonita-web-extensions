/**
 * Copyright (C) 2015 Bonitasoft S.A.
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
package org.bonitasoft.web.extension.rest;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.http.HttpStatus;

/**
 * @since 7.2.0
 */
public interface RestApiResponse extends org.bonitasoft.console.common.server.page.RestApiResponse {

    /**
     * default http status code
     */
    int DEFAULT_STATUS = HttpStatus.SC_OK;

    /**
     * default character set
     */
    String DEFAULT_CHARACTER_SET = Charset.forName("UTF-8").name();

    /**
     * default media type
     */
    String DEFAULT_MEDIA_TYPE = "application/json";

    /**
     * @return the response content
     */
    @Override
    Serializable getResponse();

    /**
     * @return http status code default value is DEFAULT_STATUS
     */
    @Override
    int getHttpStatus();

    /**
     * @return a map of additional headers
     */
    @Override
    Map<String, String> getAdditionalHeaders();

    /**
     * @return a list of cookies
     */
    @Override
    List<Cookie> getAdditionalCookies();

    /**
     * @return characterSet default to "UTF-8"
     */
    @Override
    String getCharacterSet();

    /**
     * @return media type default to "application/json"
     */
    @Override
    String getMediaType();
}
