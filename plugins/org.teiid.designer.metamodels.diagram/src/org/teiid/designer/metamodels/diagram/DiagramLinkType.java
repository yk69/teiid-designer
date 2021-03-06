/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Link Type</b></em>', and utility methods
 * for working with them. <!-- end-user-doc -->
 * 
 * @see org.teiid.designer.metamodels.diagram.DiagramPackage#getDiagramLinkType()
 * @model
 * @generated
 *
 * @since 8.0
 */
public final class DiagramLinkType extends AbstractEnumerator {

    /**
     * The '<em><b>ORTHOGONAL</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ORTHOGONAL_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int ORTHOGONAL = 0;

    /**
     * The '<em><b>DIRECTED</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #DIRECTED_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int DIRECTED = 1;

    /**
     * The '<em><b>MANUAL</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MANUAL_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int MANUAL = 2;

    /**
     * The '<em><b>ORTHOGONAL</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ORTHOGONAL</b></em>' literal object isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #ORTHOGONAL
     * @generated
     * @ordered
     */
    public static final DiagramLinkType ORTHOGONAL_LITERAL = new DiagramLinkType(ORTHOGONAL, "ORTHOGONAL"); //$NON-NLS-1$

    /**
     * The '<em><b>DIRECTED</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DIRECTED</b></em>' literal object isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #DIRECTED
     * @generated
     * @ordered
     */
    public static final DiagramLinkType DIRECTED_LITERAL = new DiagramLinkType(DIRECTED, "DIRECTED"); //$NON-NLS-1$

    /**
     * The '<em><b>MANUAL</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MANUAL</b></em>' literal object isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MANUAL
     * @generated
     * @ordered
     */
    public static final DiagramLinkType MANUAL_LITERAL = new DiagramLinkType(MANUAL, "MANUAL"); //$NON-NLS-1$

    /**
     * An array of all the '<em><b>Link Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final DiagramLinkType[] VALUES_ARRAY = new DiagramLinkType[] {ORTHOGONAL_LITERAL, DIRECTED_LITERAL,
        MANUAL_LITERAL,};

    /**
     * A public read-only list of all the '<em><b>Link Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY)); // NO_UCD

    /**
     * Returns the '<em><b>Link Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static DiagramLinkType get( String name ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DiagramLinkType result = VALUES_ARRAY[i];
            if (result.toString().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Link Type</b></em>' literal with the specified value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static DiagramLinkType get( int value ) {
        switch (value) {
            case ORTHOGONAL:
                return ORTHOGONAL_LITERAL;
            case DIRECTED:
                return DIRECTED_LITERAL;
            case MANUAL:
                return MANUAL_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private DiagramLinkType( int value,
                             String name ) {
        super(value, name);
    }

} // DiagramLinkType
