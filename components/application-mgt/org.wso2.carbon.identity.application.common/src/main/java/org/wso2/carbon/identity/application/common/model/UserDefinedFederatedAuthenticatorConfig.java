/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.common.model;

import org.wso2.carbon.identity.base.AuthenticatorPropertyConstants.DefinedByType;

import static org.wso2.carbon.identity.base.AuthenticatorPropertyConstants.TAG_CUSTOM;

/**
 * The user defined federated authenticator configuration model.
 */
public class UserDefinedFederatedAuthenticatorConfig extends FederatedAuthenticatorConfig {

    private UserDefinedAuthenticatorEndpointConfig endpointConfig;

    public UserDefinedFederatedAuthenticatorConfig() {

        definedByType = DefinedByType.USER;
        setTags(new String[]{TAG_CUSTOM});
    }

    /**
     * Get the endpoint configurations of the user defined federated authenticator config.
     *
     * @return UserDefinedAuthenticatorEndpointConfig
     */
    public UserDefinedAuthenticatorEndpointConfig getEndpointConfig() {

        return endpointConfig;
    }

    /**
     * Set the endpoint configurations of the user defined federated authenticator config.
     *
     * @param endpointConfig    The endpoint config of the user defined federated authenticator config.
     */
    public void setEndpointConfig(UserDefinedAuthenticatorEndpointConfig endpointConfig) {

        this.endpointConfig = endpointConfig;
    }

    @Override
    public void setDisplayName(String displayName) {

        /* Since the displayName must be same as the authenticator name for user defined federated authenticators,
         we are ignoring the displayName setting here and instead setting the displayName when configuring the
         authenticator name. */
    }

    @Override
    public void setName(String name) {

        super.setName(name);
        displayName = name;
    }
}
