/*******************************************************************************
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft is a trademark of Bonitasoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * Bonitasoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or Bonitasoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 *******************************************************************************/
package org.bonitasoft.web.extension.rest;

import javax.servlet.http.HttpServletRequest;

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
