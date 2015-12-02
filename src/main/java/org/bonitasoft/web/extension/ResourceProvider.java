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
package org.bonitasoft.web.extension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Access to the extension resources
 */
public interface ResourceProvider {

    /**
     * Retrieve a resource as an {@link InputStream}
     * 
     * @param resourceName the name of the resource to retrieve. It can be a path.
     * @return a {@link InputStream} for this resource
     */
    InputStream getResourceAsStream(final String resourceName) throws FileNotFoundException;

    /**
     * Retrieve a resource as a {@link File}
     * 
     * @param resourceName the name of the resource to retrieve. It can be a path.
     * @return a {@link File} for this resource
     */
    File getResourceAsFile(final String resourceName);

    /**
     * Retrieve a resource URL
     * 
     * @param resourceName the name of the resource to retrieve. It can be a path.
     * @return the URL of where the resource is available.
     */
    String getResourceURL(final String resourceName);
    
    /**
     * Retrieve a {@link ResourceBundle} that can be used for localization.
     * 
     * @param name the name of the resource to retrieve (e.g. : messages for a resource named messages_fr.properties)
     * @param locale the {@link Locale} of the {@link ResourceBundle} to retrieve.(e.g. : Locale.FRENCH for a resource named messages_fr.properties)
     * @return the {@link ResourceBundle} for given name and {@link Locale}
     */
    ResourceBundle getResourceBundle(final String name, final Locale locale);

}
