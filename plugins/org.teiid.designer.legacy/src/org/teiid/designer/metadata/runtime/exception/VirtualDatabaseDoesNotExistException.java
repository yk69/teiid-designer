/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */

package org.teiid.designer.metadata.runtime.exception;

import org.teiid.core.BundleUtil;
import org.teiid.designer.metadata.runtime.api.VirtualDatabaseException;

/**
 * Thrown when the VirtualDatabase is not found.
 *
 * @since 8.0
 */
public class VirtualDatabaseDoesNotExistException extends VirtualDatabaseException {

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * No-arg costructor required by Externalizable semantics
     */
    public VirtualDatabaseDoesNotExistException() {
        super();
    }

    /**
     * Construct an instance with the message specified.
     * 
     * @param message A message describing the exception
     */
    public VirtualDatabaseDoesNotExistException( String message ) {
        super(message);
    }

    /**
     * Construct an instance with the message and error code specified.
     * 
     * @param message A message describing the exception
     * @param code The error code
     */
    public VirtualDatabaseDoesNotExistException( BundleUtil.Event code,
                                                 String message ) {
        super(code, message);
    }

    /**
     * Construct an instance from a message and an exception to chain to this one.
     * 
     * @param code A code denoting the exception
     * @param e An exception to nest within this one
     */
    public VirtualDatabaseDoesNotExistException( Exception e,
                                                 String message ) {
        super(e, message);
    }

    /**
     * Construct an instance from a message and a code and an exception to chain to this one.
     * 
     * @param e An exception to nest within this one
     * @param message A message describing the exception
     * @param code A code denoting the exception
     */
    public VirtualDatabaseDoesNotExistException( BundleUtil.Event code,
    											 Exception e,
                                                 String message ) {
        super(code, e, message);
    }
}