package com.sebastian_daschner.coffee;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CoffeeIT {

    private final CoffeeSystem coffeeSystem = new CoffeeSystem();

    @Test
    void testHello() {
        assertThat(coffeeSystem.getCoffee()).isEqualTo("Coffee");
    }

}
