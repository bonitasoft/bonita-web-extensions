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
package org.bonitasoft.web.extension.page;

import java.io.File;

import org.bonitasoft.engine.api.PageAPI;
import org.bonitasoft.engine.page.Page;
import org.bonitasoft.engine.page.PageNotFoundException;
import org.bonitasoft.web.extension.ResourceProvider;

/**
 * This interface provide access to the resources contained in the extension archive
 * @since 7.2.0
 */
public interface PageResourceProvider extends ResourceProvider {

    /**
     * The URL of the CSS used as Bonita Theme.
     */
    String getBonitaThemeCSSURL();

    /**
     * The folder where the extension is deployed.
     */
    File getPageDirectory();

    /**
     * The page name. Set in the page.properties of the extension.
     */
    String getPageName();

    /**
     * The page name with the process definition ID as prefix (format = p%PROCESS_DEF_ID_%pageName).
     */
    String getFullPageName();

    /**
     * The deployed {@link Page} for this extension.
     */
    Page getPage(final PageAPI pageAPI) throws PageNotFoundException;

}
