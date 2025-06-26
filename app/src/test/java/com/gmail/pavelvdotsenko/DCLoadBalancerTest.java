package com.gmail.pavelvdotsenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DCLoadBalancerTest {

    @Test
    void shouldAddNewMachine() {
        // Arrange (optional)
        var loadBalancer = new DCLoadBalancer();

        // Act (required)
        loadBalancer.addMachine(1,10);

        // Assert (required)

    }
}
