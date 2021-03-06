/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.webservice.util;

import org.eclipse.emf.ecore.EObject;
import org.teiid.designer.metamodels.webservice.Interface;

/**
 * @since 8.0
 */
public class InterfaceFinder extends WebServiceComponentFinder {

    /**
     * @since 4.2
     */
    public InterfaceFinder() {
        super();
    }

    /**
     * This method accumulates the {@link Interface} instances. The implementation takes as many shortcuts as possible to prevent
     * unnecessarily visiting unrelated objects.
     * 
     * @see org.teiid.designer.core.util.ModelVisitor#visit(org.eclipse.emf.ecore.EObject)
     */
    @Override
	public boolean visit( final EObject object ) {
        // Interface are contained by Resources
        if (object instanceof Interface) {
            found((Interface)object);
        }
        return false;
    }

}
