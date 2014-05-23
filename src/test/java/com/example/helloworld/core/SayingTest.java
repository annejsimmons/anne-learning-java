package com.example.helloworld.core;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SayingTest {

    @Test
    public void shouldSaySomething()
    {
        Saying something = new Saying(1, "something");
        assertThat(something.getContent()).isEqualTo("something");
    }
}