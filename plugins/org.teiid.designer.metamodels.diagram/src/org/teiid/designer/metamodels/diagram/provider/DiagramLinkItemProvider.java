/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.diagram.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.teiid.designer.metamodels.diagram.DiagramFactory;
import org.teiid.designer.metamodels.diagram.DiagramLink;
import org.teiid.designer.metamodels.diagram.DiagramPackage;

/**
 * This is the item provider adapter for a {@link org.teiid.designer.metamodels.diagram.DiagramLink} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 *
 * @since 8.0
 */
public class DiagramLinkItemProvider extends AbstractDiagramEntityItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DiagramLinkItemProvider( AdapterFactory adapterFactory ) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List getPropertyDescriptors( Object object ) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Type feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                                                 getResourceLocator(),
                                                                 getString("_UI_DiagramLink_type_feature"), //$NON-NLS-1$
                                                                 getString("_UI_PropertyDescriptor_description", "_UI_DiagramLink_type_feature", "_UI_DiagramLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                                 DiagramPackage.eINSTANCE.getDiagramLink_Type(),
                                                                 true,
                                                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                                                 null,
                                                                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Collection getChildrenFeatures( Object object ) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(DiagramPackage.eINSTANCE.getDiagramLink_RoutePoints());
        }
        return childrenFeatures;
    }

    /**
     * This returns DiagramLink.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return getResourceLocator().getImage("full/obj16/DiagramLink"); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ((DiagramLink)object).getName();
        return label == null || label.length() == 0 ? getString("_UI_DiagramLink_type") : //$NON-NLS-1$
        getString("_UI_DiagramLink_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a viewer
     * notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren(notification);

        switch (notification.getFeatureID(DiagramLink.class)) {
            case DiagramPackage.DIAGRAM_LINK__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case DiagramPackage.DIAGRAM_LINK__ROUTE_POINTS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s describing all of the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection newChildDescriptors,
                                               Object object ) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(DiagramPackage.eINSTANCE.getDiagramLink_RoutePoints(),
                                                     DiagramFactory.eINSTANCE.createDiagramPosition()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return DiagramEditPlugin.INSTANCE;
    }

}
