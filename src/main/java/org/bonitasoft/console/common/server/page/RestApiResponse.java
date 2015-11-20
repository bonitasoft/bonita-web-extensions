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
