package com.gmail.pavelvdotsenko;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DCLoadBalancerTest {

    @Test
    void shouldAddNewMachine() {
        // Arrange (optional)
        var loadBalancer = new DCLoadBalancer();

        // Act (required)
        loadBalancer.addMachine(1, 10);

        // Assert (required)
        assertThat(loadBalancer.getMachineCapacity(1)).isEqualTo(10);
    }
    @Test
    void shouldRemoveMachine() {
        // Arrange (optional)
        var loadBalancer = new DCLoadBalancer();
        loadBalancer.addMachine(1, 10);
        assertThat(loadBalancer.getMachineCapacity(1)).isEqualTo(10);

        // Act (required)
        loadBalancer.removeMachine(1);

        // Assert (required)
        assertThat(loadBalancer.getMachineCapacity(1)).isEqualTo(-1);
    }
    @Test
    void shouldAddApplication() {
        // Arrange (optional)
        var loadBalancer = new DCLoadBalancer();
        loadBalancer.addMachine(2, 10);
        assertThat(loadBalancer.getMachineCapacity(2)).isEqualTo(10);

        // Act (required)
        var machineId = loadBalancer.addApplication(3, 5);

        // Assert (required)
        assertThat(machineId).isEqualTo(2);
        assertThat(loadBalancer.getApplications(2)).isEqualTo(List.of(3));
    }
}
