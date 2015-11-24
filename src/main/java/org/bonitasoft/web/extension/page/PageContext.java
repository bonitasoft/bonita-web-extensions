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

import java.util.Locale;

import org.bonitasoft.engine.session.APISession;

/**
 * This class provide access to the data relative to the context in which the custom page is displayed
 * @since 7.2.0
 */
public interface PageContext {

    /**
     * @return the engine {@link APISession}
     */
    APISession getApiSession();

    /**
     * @return the user locale
     */
    Locale getLocale();

    /**
     * @return the ID of the profile in which the page is currently displayed
     */
    String getProfileID();

}
