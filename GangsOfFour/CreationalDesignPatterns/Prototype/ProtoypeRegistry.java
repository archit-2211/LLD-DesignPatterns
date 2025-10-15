package GangsOfFour.CreationalDesignPatterns.Prototype ;

import java.util.HashMap;
import java.util.Map;

class PrototypeRegistry {
    private Map<String, Prototype> registry = new HashMap<>();

    public void register(String key, Prototype prototype) {
        registry.put(key, prototype);
    }

    public Prototype getClone(String key) {
        return registry.get(key).clone();
    }
}