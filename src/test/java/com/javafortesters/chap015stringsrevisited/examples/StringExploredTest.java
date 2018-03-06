package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringExploredTest {
  @Test
  public void checkStringOptions() {
    System.out.println("That's a backspace: \b\b\b\b\b\ba");
  }

  @Test
  public void testStringConvertion() {
    char[] cArray = {'2', '3'};
    assertThat("23".toCharArray(), is(cArray));
  }
}
