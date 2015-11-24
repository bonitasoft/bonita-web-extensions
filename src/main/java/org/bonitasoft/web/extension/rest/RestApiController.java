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

import javax.servlet.http.HttpServletRequest;

/**
 * The interface to implement for Rest API extension in Bonita BPM.
 */
public interface RestApiController {

    /**
     * Let the Rest API Extension parse request for specific attribute handling.
     * 
     * @param request the HTTP servlet request intended to be used as in a servlet
     * @param responseBuilder a builder for HTTP response
     * @param context to access the current execution context data like current session,locale...
     * @return a RestApiResponse with a body, an HTTP status and other optional http content
     * @since 7.2
     */
    RestApiResponse doHandle(HttpServletRequest request, RestApiResponseBuilder responseBuilder, RestAPIContext context);
    
}
