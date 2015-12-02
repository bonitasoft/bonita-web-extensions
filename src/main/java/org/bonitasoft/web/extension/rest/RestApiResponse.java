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
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

/**
 * A Wrapper of an HTTP Response describe by its:
 * <ul>
 * <li>Status</li>
 * <li>Headers</li>
 * <li>Body</li>
 * <li>Charset</li>
 * <li>Media type</li>
 * <li>Cookies</li>
 * </ul>
 */
public class RestApiResponse extends org.bonitasoft.console.common.server.page.RestApiResponse {

    RestApiResponse(Serializable response, int httpStatus, Map<String, String> additionalHeaders, List<Cookie> additionalCookies, String mediaType,
            String characterSet) {
        super(response, httpStatus, additionalHeaders, additionalCookies, mediaType, characterSet);
    }

}
