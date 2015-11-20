package org.bonitasoft.console.common.server.page;

import java.io.Serializable;

import javax.servlet.http.Cookie;

/**
 * @deprecated As of Release 7.2.0, replaced by {@link org.bonitasoft.web.extension.rest.RestApiResponseBuilder}
 */
@Deprecated
public interface RestApiResponseBuilder {

    RestApiResponseBuilder withResponse(Serializable response);

    RestApiResponseBuilder withResponseStatus(int httpStatus);

    RestApiResponseBuilder withAdditionalHeader(String headerName, String headerValue);

    RestApiResponseBuilder withAdditionalCookie(Cookie cookie);

    RestApiResponseBuilder withCharacterSet(String characterSet);

    RestApiResponseBuilder withMediaType(String mediaType);

    RestApiResponse build();

}
