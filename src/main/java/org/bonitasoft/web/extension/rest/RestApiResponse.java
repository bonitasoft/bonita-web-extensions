package org.bonitasoft.web.extension.rest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.commons.io.Charsets;
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
    String DEFAULT_CHARACTER_SET = Charsets.UTF_8.name();

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
