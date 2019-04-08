package br.inf.ufg.mddsm.controller.resource;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import br.inf.ufg.mddsm.controller.policy.metadata.Metadata;

public class ResourceManager implements Sensor, Executable {
	private String name;
    private Set<Resource> objects = new LinkedHashSet<Resource>();

    public void setName(String name)
    {
    	this.name = name;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public String toString()
    {
    	return this.name;
    }
    
    public synchronized void addObject(Resource obj) {
    	
        if (obj != null)
            doAddObject(obj);
    }

    private void doAddObject(Resource obj) {
        Resource prev = getObject(obj.getName());
        if (prev != null)
            objects.remove(prev);
        
        objects.add(obj);
    }

    public synchronized Resource getObject(String name) {
        for (Resource object : objects) {
        	
            if (object.getName().equals(name))
            {
                return object;
            }
        }

        return null;
    }

    public synchronized boolean removeObject(String name) {
        Resource fw = getObject(name);
        return fw != null && objects.remove(fw);
    }

    public TreeSet<Metadata> getAvailableObjects() {
        TreeSet<Metadata> availSet = new TreeSet<Metadata>();

        for (Resource object : objects) {
            if (object.getMetadata().isAvailable())
                availSet.add(object.getMetadata());
        }

        return availSet;
    }

    public synchronized void clearAllObjects() {
        objects.clear();
    }


    public Collection<Resource> getAll() {
        return objects;
    }

    public void setEventListener(EventListener eventListener) {
        for (Resource object : getAll()) {
            object.setEventListener(eventListener);
        }
    }

    public void start() {
        for (Resource object : getAll()) {
            object.start();
        }
    }

    public void stop() {
        for (Resource object : getAll()) {
            object.stop();
        }
    }
}
