package br.inf.ufg.mddsm.broker.emf

import base.Instance
import base.InstanceResourceManager
import base.ResourceManager
import br.inf.ufg.mddsm.broker.manager.MainManager
import br.inf.ufg.mddsm.broker.resource.bridge.IBroker

class ResourceManagerFactory {
    ManagedResourceFactory objectFactory = new ManagedResourceFactory()

    public br.inf.ufg.mddsm.broker.resource.ResourceManager createObjectManager(ResourceManager resourceManager) {
        doCreateObjectManager(resourceManager)
    }

    private br.inf.ufg.mddsm.broker.resource.ResourceManager doCreateObjectManager(InstanceResourceManager resourceManager) {
        br.inf.ufg.mddsm.broker.resource.ResourceManager manager = new br.inf.ufg.mddsm.broker.resource.ResourceManager()
		manager.setName(resourceManager.name);

		resourceManager.instances.each {
			Instance instance -> manager.addObject(objectFactory.createManagedObject(instance)) 
		}
		
        manager
    }

    private br.inf.ufg.mddsm.broker.resource.ResourceManager doCreateObjectManager(ResourceManager resourceManager) {
        null
    }

}
