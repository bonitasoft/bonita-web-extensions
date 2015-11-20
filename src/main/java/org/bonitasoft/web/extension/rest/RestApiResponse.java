package org.bonitasoft.web.extension.rest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

public class RestApiResponse extends org.bonitasoft.console.common.server.page.RestApiResponse {

    public RestApiResponse(Serializable response, int httpStatus, Map<String, String> additionalHeaders, List<Cookie> additionalCookies, String mediaType,
            String characterSet) {
        super(response, httpStatus, additionalHeaders, additionalCookies, mediaType, characterSet);
    }

}
