/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.core.web.api.wrapper;

import org.broadleafcommerce.common.BroadleafEnumerationType;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is a JAXB wrapper around HibuProduct.

 */
@XmlRootElement(name = "BroadleafEnumerationTypeWrapper")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class BroadleafEnumerationTypeWrapper extends BaseWrapper implements APIWrapper<BroadleafEnumerationType> {


    @XmlElement
    protected String friendlyName;

    @XmlElement
    protected String type;

    @Override
    public void wrapDetails(BroadleafEnumerationType model, HttpServletRequest request) {
        if (model == null) return;
        this.friendlyName = model.getFriendlyType();
        this.type = model.getType();
    }

    @Override
    public void wrapSummary(BroadleafEnumerationType model, HttpServletRequest request) {
        wrapDetails(model, request);
    }

    
    /**
     * @return the friendlyName
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    
    /**
     * @param friendlyName the friendlyName to set
     */
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
