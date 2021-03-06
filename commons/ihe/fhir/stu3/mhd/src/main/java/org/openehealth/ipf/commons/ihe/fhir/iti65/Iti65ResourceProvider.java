/*
 * Copyright 2016 the original author or authors.
 *
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
 */

package org.openehealth.ipf.commons.ihe.fhir.iti65;

import ca.uhn.fhir.rest.annotation.Transaction;
import ca.uhn.fhir.rest.annotation.TransactionParam;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import org.hl7.fhir.dstu3.model.Bundle;
import org.openehealth.ipf.commons.ihe.fhir.SharedFhirProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Resource Provider for MHD (ITI-65)
 *
 * @author Christian Ohr
 * @since 3.4
 * @deprecated use BatchTransactionResourceProvider.INSTANCE
 */
public class Iti65ResourceProvider extends SharedFhirProvider {

    public Iti65ResourceProvider() {
        super();
    }

    @Transaction
    public Bundle provideDocumentBundle(@TransactionParam Bundle bundle,
                                     RequestDetails requestDetails,
                                     HttpServletRequest httpServletRequest,
                                     HttpServletResponse httpServletResponse) {

        return requestTransaction(bundle, Bundle.class, httpServletRequest, httpServletResponse, requestDetails);
    }
}
