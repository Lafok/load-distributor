package com.gmail.pavelvdotsenko;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Machine {
    private final int id;
    private final int capacity;
    private final Map<Integer, Integer> applications;

    public void addApplication(int id, int loadUse){
        applications.put(id, loadUse);
    }
    public Machine(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        applications = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Integer> getApplications() {
        return List.copyOf(this.applications.keySet());
    }
}
