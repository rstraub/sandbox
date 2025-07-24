package com.rstraub.sandbox;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void canaryTest() {
        assertThat("hello").isEqualTo("Hello");
    }
}
