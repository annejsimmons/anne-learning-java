package com.example.helloworld.resources;

import com.example.helloworld.core.Saying;
import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldResourceTest {

    @Test
    public void shouldTakeDefaultNameIfNotNameProvided() throws Exception {
        HelloWorldResource resource = new HelloWorldResource("Hello, %s", "Anne");

        Saying saying = resource.sayHello(Optional.<String>absent());

        assertThat(saying.getContent()).isEqualTo("Hello, Anne");
    }

    @Test
    public void shouldSayHelloUsingTheNameSentInTheQuery() throws Exception {
        HelloWorldResource resource = new HelloWorldResource("Hello, %s", "Anne");

        String bob = "Bob";
        Saying saying = resource.sayHello(Optional.of(bob));

        assertThat(saying.getContent()).isEqualTo("Hello, Bob");
    }

}