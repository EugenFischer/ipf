/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.ihe.xds.commons.requests;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Association;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.DocumentEntry;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Folder;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.SubmissionSet;

/**
 * The data required for the register document set request.
 * @author Jens Riemschneider
 */
public class RegisterDocumentSet {
    private SubmissionSet submissionSet;
    private final List<Folder> folders = new ArrayList<Folder>();
    private final List<DocumentEntry> documentEntries = new ArrayList<DocumentEntry>();
    private final List<Association> associations = new ArrayList<Association>();

    public SubmissionSet getSubmissionSet() {
        return submissionSet;
    }
    
    public void setSubmissionSet(SubmissionSet submissionSet) {
        this.submissionSet = submissionSet;
    }
    
    public List<Folder> getFolders() {
        return folders;
    }

    public List<DocumentEntry> getDocumentEntries() {
        return documentEntries;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((associations == null) ? 0 : associations.hashCode());
        result = prime * result + ((documentEntries == null) ? 0 : documentEntries.hashCode());
        result = prime * result + ((folders == null) ? 0 : folders.hashCode());
        result = prime * result + ((submissionSet == null) ? 0 : submissionSet.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RegisterDocumentSet other = (RegisterDocumentSet) obj;
        if (associations == null) {
            if (other.associations != null)
                return false;
        } else if (!associations.equals(other.associations))
            return false;
        if (documentEntries == null) {
            if (other.documentEntries != null)
                return false;
        } else if (!documentEntries.equals(other.documentEntries))
            return false;
        if (folders == null) {
            if (other.folders != null)
                return false;
        } else if (!folders.equals(other.folders))
            return false;
        if (submissionSet == null) {
            if (other.submissionSet != null)
                return false;
        } else if (!submissionSet.equals(other.submissionSet))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
