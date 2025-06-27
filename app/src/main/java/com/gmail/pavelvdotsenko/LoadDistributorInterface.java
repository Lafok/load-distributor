package com.gmail.pavelvdotsenko;

import java.util.List;

public interface LoadDistributorInterface {
    /**
     * Registers a machine with the given machineId and maximum capacity.
     */
    void addMachine(int machineId, int capacity);


    /**
     * Retrieves the maximum capacity of the machine with the given machineId.
     */
    int getMachineCapacity(int machineId);

    /**
     * Removes the machine with the given machineId.
     * All applications running on this machine are automatically reallocated to other machines in the same order
     * as they were added to this machine.
     * The applications should be reallocated in the same manner as addApplication.
     */
    void removeMachine(int machineId);

    /**
     * Allocates an application with the given appId and loadUse to the machine
     * with the largest remaining capacity that can handle the additional request.
     * <p>
     * If there is a tie, the machine with the lowest ID is used.
     * Returns the machine ID that the application is allocated to.
     * If no machine can handle the request, return -1.
     */
    int addApplication(int appId, int loadUse);

    /**
     * Stops and removes the application with the given appId from the machine it is running on,
     * freeing up the machine's capacity by its corresponding loadUse.
     * If the application does not exist, nothing happens.
     */
    void stopApplication(int appId);

    /**
     * Returns a list of application IDs running on a machine with the given machineId in the order in which they were added.
     * If there are more than 10 applications, return only the first 10 IDs.
     */
    List<Integer> getApplications(int machineId);

}
