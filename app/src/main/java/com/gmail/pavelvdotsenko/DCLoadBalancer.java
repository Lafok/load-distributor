package com.gmail.pavelvdotsenko;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DCLoadBalancer implements LoadDistributorInterface {

    private final Map<Integer, Machine> machines = new HashMap<>();

    @Override
    public void addMachine(int machineId, int capacity) {
        machines.put(machineId, new Machine(machineId, capacity));
    }

    @Override
    public int getMachineCapacity(int machineId) {
        var machine = machines.get(machineId);
        if (machine == null) {
            return -1;
        }
        return machine.getCapacity();

    }

    @Override
    public void removeMachine(int machineId) {
        machines.remove(machineId);
    }

    @Override
    public int addApplication(int appId, int loadUse) {
        int max = 0;
        Machine machine = null;
        for (var map : machines.entrySet()) {
            if (map.getValue().getCapacity() > max) {
                max = map.getValue().getCapacity();
                machine = map.getValue();
            }
        }
        machine.addApplication(appId, loadUse);
        return machine.getId();
    }

    @Override
    public void stopApplication(int appId) {

    }

    @Override
    public List<Integer> getApplications(int machineId) {
        return machines.get(machineId).getApplications();
    }
}
