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
package org.bonitasoft.console.common.server.page;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.http.HttpStatus;

/**
 * @author Laurent Leseigneur
 * @deprecated As of Release 7.2.0, replaced by {@link org.bonitasoft.web.extension.rest.RestApiResponse}
 */
@Deprecated
public interface RestApiResponse {

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
    Serializable getResponse();

    /**
     * @return http status code default value is DEFAULT_STATUS
     */
    int getHttpStatus();

    /**
     * @return a map of additional headers
     */
    Map<String, String> getAdditionalHeaders();

    /**
     * @return a list of cookies
     */
    List<Cookie> getAdditionalCookies();

    /**
     * @return characterSet default to "UTF-8"
     */
    String getCharacterSet();

    /**
     * @return media type default to "application/json"
     */
    String getMediaType();
}
