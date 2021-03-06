/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.query.ui.sqleditor.component;

import org.teiid.designer.query.sql.lang.IOrderBy;

/**
 * The <code>OrderByDisplayNode</code> class is used to represent a Query's ORDERBY clause.
 *
 * @since 8.0
 */
public class OrderByDisplayNode extends DisplayNode {

    // /////////////////////////////////////////////////////////////////////////
    // CONSTRUCTOR
    // /////////////////////////////////////////////////////////////////////////

    /**
     * OrderByDisplayNode constructor
     * 
     * @param parentNode the parent DisplayNode of this.
     * @param orderBy the query language object used to construct this display node.
     */
    public OrderByDisplayNode( DisplayNode parentNode,
                               IOrderBy orderBy ) {
        this.parentNode = parentNode;
        this.languageObject = orderBy;
    }

    // /////////////////////////////////////////////////////////////////////////
    // PUBLIC METHODS
    // /////////////////////////////////////////////////////////////////////////

    /**
     * OrderBy Clause supports Elements
     */
    @Override
    public boolean supportsElement() {
        return true;
    }

}
