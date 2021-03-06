/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.search.runtime;

import org.teiid.designer.core.index.IndexConstants;


/**
 * TypedObjectRecord
 * recordType|objectID|name|fullname|uri|datatypeName|datatypeID|runtimeType|modelPath|metaclassURI|
 *
 * @since 8.0
 */
public class TypedObjectRecordImpl extends ResourceObjectRecordImpl implements TypedObjectRecord {
    
    private String datatypeName;
    private String datatypeID;
    private String runtimeType;    
    
    /** 
     * @see org.teiid.designer.core.search.runtime.SearchRecord#getRecordType()
     * @since 4.2
     */
    @Override
    public char getRecordType() {
        return IndexConstants.SEARCH_RECORD_TYPE.TYPED_OBJECT;
    }
    
    /** 
     * @see org.teiid.designer.core.search.runtime.TypedObjectRecord#getDatatypeID()
     * @since 4.2
     */
    @Override
	public String getDatatypeID() {
        return this.datatypeID;
    }
    /** 
     * @see org.teiid.designer.core.search.runtime.TypedObjectRecord#getDatatypeName()
     * @since 4.2
     */
    @Override
	public String getDatatypeName() {
        return this.datatypeName;
    }
    /** 
     * @see org.teiid.designer.core.search.runtime.TypedObjectRecord#getRuntimeType()
     * @since 4.2
     */
    @Override
	public String getRuntimeType() {
        return this.runtimeType;
    }
    
    /** 
     * @param datatypeID The datatypeID to set.
     * @since 4.2
     */
    public void setDatatypeID(String datatypeID) {
        this.datatypeID = datatypeID;
    }
    
    /** 
     * @param datatypeName The datatypeName to set.
     * @since 4.2
     */
    public void setDatatypeName(String datatypeName) {
        this.datatypeName = datatypeName;
    }
    
    /** 
     * @param runtimeType The runtimeType to set.
     * @since 4.2
     */
    public void setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
    }
}
