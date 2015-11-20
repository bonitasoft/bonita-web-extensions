/*******************************************************************************
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft is a trademark of Bonitasoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * Bonitasoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or Bonitasoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 *******************************************************************************/
package org.bonitasoft.web.extension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @since 7.2.0
 */
public interface ResourceProvider {

    InputStream getResourceAsStream(final String resourceName) throws FileNotFoundException;

    File getResourceAsFile(final String resourceName);

    String getResourceURL(final String resourceName);

    ResourceBundle getResourceBundle(final String name, final Locale locale);

}
