package com.gmail.pavelvdotsenko;

import java.util.List;

public final class DCLoadBalancer implements LoadDistributorInterface {
    @Override
    public void addMachine(int machineId, int capacity) {

    }

    @Override
    public void removeMachine(int machineId) {

    }

    @Override
    public int addApplication(int appId, int loadUse) {
        return 0;
    }

    @Override
    public void stopApplication(int appId) {

    }

    @Override
    public List<Integer> getApplications(int machineId) {
        return null;
    }
}
