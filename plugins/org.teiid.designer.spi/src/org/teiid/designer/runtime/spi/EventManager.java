/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.runtime.spi;


/**
 *
 *
 * @since 8.0
 */
public interface EventManager {

    /**
     * Listeners already registered will not be added again. The new listener will receive events for all existing servers.
     * 
     * @param listener the listener being register to receive events (never <code>null</code>)
     * @return <code>true</code> if listener was added
     */
    boolean addListener( IExecutionConfigurationListener listener );

    /**
     * @param event the event the registry listeners are to process
     */
    void notifyListeners( ExecutionConfigurationEvent event );

    /**
     * @param listener the listener being unregistered and will no longer receive events (never <code>null</code>)
     * @return <code>true</code> if listener was removed
     */
    boolean removeListener( IExecutionConfigurationListener listener );
    
    /**
     * An <code>EventManager</code> that does not do anything.
     */
    EventManager EVENT_MANAGER_ADAPTER = new EventManager() {

        @Override
        public boolean addListener( IExecutionConfigurationListener listener ) {
            return true;
        }

        @Override
        public void notifyListeners( ExecutionConfigurationEvent event ) {
            // nothing to do
        }

        @Override
        public boolean removeListener( IExecutionConfigurationListener listener ) {
            return true;
        }
        
    };

}
