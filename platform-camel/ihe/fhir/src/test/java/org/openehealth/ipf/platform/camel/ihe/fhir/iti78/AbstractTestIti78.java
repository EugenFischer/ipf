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

package org.openehealth.ipf.platform.camel.ihe.fhir.iti78;

import ca.uhn.fhir.rest.gclient.ICriterion;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import org.hl7.fhir.instance.model.Bundle;
import org.hl7.fhir.instance.model.OperationOutcome;
import org.hl7.fhir.instance.model.Patient;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.openehealth.ipf.commons.ihe.core.atna.MockedSender;
import org.openehealth.ipf.commons.ihe.fhir.CamelFhirServlet;
import org.openehealth.ipf.commons.ihe.fhir.iti78.PdqPatient;
import org.openehealth.ipf.platform.camel.ihe.fhir.core.FhirTestContainer;
import org.openhealthtools.ihe.atna.auditor.codes.rfc3881.RFC3881EventCodes;
import org.openhealthtools.ihe.atna.auditor.models.rfc3881.AuditMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;

import static org.junit.Assert.assertEquals;

/**
 *
 */
abstract class AbstractTestIti78 extends FhirTestContainer {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractTestIti78.class);

    public static void startServer(String contextDescriptor) throws ServletException {
        CamelFhirServlet servlet = new CamelFhirServlet();
        startServer(servlet, contextDescriptor, false, DEMO_APP_PORT, new MockedSender(), "FhirServlet");
        /*
        startServer(servlet, contextDescriptor, false, DEMO_APP_PORT,
                new FhirMockedSender(servlet.getFhirContext(), true), "FhirServlet");
        */
        startClient(String.format("http://localhost:%d/", DEMO_APP_PORT));
    }

    protected ICriterion<?> familyParameters() {
        return PdqPatient.FAMILY.matches().value("Test");
    }

    protected Bundle sendManually(ICriterion<?> requestData) {
        return client.search()
                .forResource(PdqPatient.class)
                .where(requestData)
                .returnBundle(Bundle.class)
                .execute();
    }

    protected void printAsXML(IBaseResource resource) {
        LOG.info(context.newXmlParser().setPrettyPrint(true).encodeResourceToString(resource));
    }


}