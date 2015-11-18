package org.bonitasoft.web.extension.rest;

import java.io.Serializable;

import javax.servlet.http.Cookie;

public interface RestApiResponseBuilder extends org.bonitasoft.console.common.server.page.RestApiResponseBuilder {

    @Override
    RestApiResponseBuilder withResponse(Serializable response);

    @Override
    RestApiResponseBuilder withResponseStatus(int httpStatus);

    @Override
    RestApiResponseBuilder withAdditionalHeader(String headerName, String headerValue);

    @Override
    RestApiResponseBuilder withAdditionalCookie(Cookie cookie);

    @Override
    RestApiResponseBuilder withCharacterSet(String characterSet);

    @Override
    RestApiResponseBuilder withMediaType(String mediaType);

    @Override
    RestApiResponse build();

}
