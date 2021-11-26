package com.igor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EchoTest {
  @Test
  void shouldSendTheSameMessage() {
    // given
    var echo = new Echo();

    // when
    String actual = echo.say("Hello World");

    // then
    assertEquals("Hello World", actual);
  }
}
