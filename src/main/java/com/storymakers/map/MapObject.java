package com.storymakers.map;

import com.storymakers.map.Location;
import com.storymakers.world.Object;

//represents any object on map (not global)
public class MapObject {
    private Object object;

    private Location location;

    public MapObject(Object object, Location location) {
        this.object = object;
        this.location = location;
    }

    public Object getObject() {
        return object;
    }

    public Location getLocation() {
        return location;
    }
}
