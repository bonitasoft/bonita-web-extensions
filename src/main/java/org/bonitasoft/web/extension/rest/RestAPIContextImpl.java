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
package org.bonitasoft.web.extension.rest;

import java.util.Locale;

import org.bonitasoft.engine.bdm.BusinessObjectDAOFactory;
import org.bonitasoft.engine.bdm.BusinessObjectDaoCreationException;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;
import org.bonitasoft.engine.session.APISession;
import org.bonitasoft.web.extension.page.PageResourceProvider;


public class RestAPIContextImpl implements RestAPIContext {

    private final APISession apiSession;
    private final Locale locale;
    private final BusinessObjectDAOFactory daoFactory;
    private final PageResourceProvider resourceProvider;

    protected RestAPIContextImpl(final APISession apiSession, final Locale locale, PageResourceProvider resourceProvider, BusinessObjectDAOFactory daoFactory) {
        this.apiSession = apiSession;
        this.locale = locale;
        this.daoFactory = daoFactory;
        this.resourceProvider = resourceProvider;
    }

    /* (non-Javadoc)
     * @see org.bonitasoft.console.common.server.page.RestAPIContext#getApiSession()
     */
    @Override
    public APISession getApiSession() {
        return apiSession;
    }

    /* (non-Javadoc)
     * @see org.bonitasoft.console.common.server.page.RestAPIContext#getLocale()
     */
    @Override
    public Locale getLocale() {
        return locale;
    }

    /* (non-Javadoc)
     * @see org.bonitasoft.console.common.server.page.RestAPIContext#createBusinessObjectDAO(java.lang.Class)
     */
    @Override
    public <T extends BusinessObjectDAO> T createBusinessObjectDAO(Class<T> daoInterface) throws BusinessObjectDaoCreationException {
        return daoFactory.createDAO(apiSession, daoInterface);
    }

    /*
     * (non-Javadoc)
     * @see org.bonitasoft.console.common.server.page.RestAPIContext#getResourceProvider()
     */
    @Override
    public PageResourceProvider getResourceProvider() {
        return resourceProvider;
    }

}
