/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.identity.user.pre.update.password.action.internal.component;

import org.wso2.carbon.identity.action.execution.api.service.ActionExecutorService;
import org.wso2.carbon.identity.certificate.management.service.CertificateManagementService;
import org.wso2.carbon.identity.claim.metadata.mgt.ClaimMetadataManagementService;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * Service component Holder for the Pre Update Password Action Service.
 */
public class PreUpdatePasswordActionServiceComponentHolder {

    private CertificateManagementService certificateManagementService;
    private ActionExecutorService actionExecutorService;
    private RealmService realmService;
    private ClaimMetadataManagementService claimManagementService;

    public static final PreUpdatePasswordActionServiceComponentHolder INSTANCE =
            new PreUpdatePasswordActionServiceComponentHolder();

    private PreUpdatePasswordActionServiceComponentHolder() {

    }

    /**
     * Get the instance of PreUpdatePasswordActionActionServiceComponentHolder.
     *
     * @return ActionMgtServiceComponentHolder instance.
     */
    public static PreUpdatePasswordActionServiceComponentHolder getInstance() {

        return INSTANCE;
    }

    /**
     * Get the CertificateManagementService.
     *
     * @return CertificateManagementService instance.
     */
    public CertificateManagementService getCertificateManagementService() {

        return certificateManagementService;
    }

    /**
     * Set the CertificateManagementService.
     *
     * @param certificateManagementService CertificateManagementService instance.
     */
    public void setCertificateManagementService(CertificateManagementService certificateManagementService) {

        this.certificateManagementService = certificateManagementService;
    }

    /**
     * Get the ActionExecutorService.
     *
     * @return ActionExecutorService instance.
     */
    public ActionExecutorService getActionExecutorService() {

        return actionExecutorService;
    }

    /**
     * Set the ActionExecutorService.
     *
     * @param actionExecutorService ActionExecutorService instance.
     */
    public void setActionExecutorService(ActionExecutorService actionExecutorService) {

        this.actionExecutorService = actionExecutorService;
    }

    /**
     * Get the RealmService.
     *
     * @return RealmService instance.
     */
    public RealmService getRealmService() {

        return realmService;
    }

    /**
     * Set the RealmService.
     *
     * @param realmService RealmService instance.
     */
    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    /**
     * Get the ClaimMetadataManagementService.
     *
     * @return ClaimMetadataManagementService instance.
     */
    public ClaimMetadataManagementService getClaimManagementService() {

        return claimManagementService;
    }

    /**
     * Set the ClaimMetadataManagementService.
     *
     * @param claimManagementService ClaimMetadataManagementService instance.
     */
    public void setClaimManagementService(ClaimMetadataManagementService claimManagementService) {

        this.claimManagementService = claimManagementService;
    }
}
