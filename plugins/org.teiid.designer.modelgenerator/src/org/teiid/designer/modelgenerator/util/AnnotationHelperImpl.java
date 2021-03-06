/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.modelgenerator.util;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.teiid.designer.compare.selector.ModelSelector;
import org.teiid.designer.core.util.ModelContents;
import org.teiid.designer.core.util.ModelResourceContainerFactory;
import org.teiid.designer.core.workspace.ModelWorkspaceException;
import org.teiid.designer.metamodels.core.Annotation;
import org.teiid.designer.metamodels.core.AnnotationContainer;
import org.teiid.designer.metamodels.core.CoreFactory;
import org.teiid.designer.modelgenerator.ModelGeneratorPlugin;


/**
 * AnnotationHelperImpl
 *
 * @since 8.0
 */
public class AnnotationHelperImpl implements AnnotationHelper {

    private final ModelSelector selector;

    private ModelContents contents;

    /**
     * Construct an instance of AnnotationHelperImpl.
     *
     */
    public AnnotationHelperImpl(final ModelSelector selector) {
        if (selector == null) {
            throw new IllegalArgumentException(ModelGeneratorPlugin.Util.getString("AnnotationHelperImpl.The_ModelSelector_instance_used_to_try_to_instantiate_a_AnnotationHelperImpl_was_Null._1")); //$NON-NLS-1$
        }

        this.selector = selector;

    }

    /* (non-Javadoc)
     * @See org.teiid.designer.modelgenerator.util.AnnotationHelper#createAnnotation(org.eclipse.emf.ecore.EObject, java.lang.String)
     */
    @Override
	public Annotation createAnnotation(final EObject targetObject, final String objectDescription)
        throws AnnotationHelperException {
        Annotation annotation = ModelResourceContainerFactory.createNewAnnotation(targetObject);
        if( annotation == null ) {
            // Let's just create one?
            annotation = CoreFactory.eINSTANCE.createAnnotation();
        }
        AnnotationContainer ac = getModelContents().getAnnotationContainer(false);
        if( ac != null )
            annotation.setAnnotationContainer(ac);

        annotation.setDescription(objectDescription);
        return annotation;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.modelgenerator.util.AnnotationHelper#setAnnotation(org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.Object)
     */
    @Override
	public void setAnnotation(final EObject targetObject, final String key, final Object value)
        throws AnnotationHelperException {
        ModelContents modelContents = getModelContents();

        Annotation annotation = modelContents.getAnnotation(targetObject);
        // If no annotation exists, create a new one
        if(annotation==null) {
            annotation = ModelResourceContainerFactory.createNewAnnotation(targetObject,
			                                                               ModelResourceContainerFactory.getAnnotationContainer(modelContents.getResource(),
			                                                                                                                    true));
            if(annotation==null)
                annotation = createAnnotation(targetObject, null);
        }
        // Set the Key-Value pair on the annotation Tags
        if(annotation!=null) {
            EMap annotationMap = annotation.getTags();
            annotationMap.put(key, value);
        }
    }

    private ModelContents getModelContents() throws AnnotationHelperException {
        if (contents == null) {

            try {
                contents = selector.getModelContents();
            } catch (ModelWorkspaceException e) {
                throw new AnnotationHelperException(e);
            }

        }
        return contents;
    }

}
