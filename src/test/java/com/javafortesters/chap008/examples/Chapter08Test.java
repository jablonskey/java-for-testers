package com.javafortesters.chap008.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class Chapter08Test {

  @Test
  public void moreTernary() {
    String url = "www.dupa.com";

    url = url.startsWith("http") ? url : addHttp(url);
  }

  @Test
  public void ifAddHttp() {
    String url = "www.seleniumsimplified.com";
    if (!url.startsWith("http")) {
      url = addHttp(url);
    }
  }

  private String addHttp(String url) {
    return "http://" + url;
  }

  @Test
  public void catOrCatsTest() {

    assertEquals("2 and more == cats", "cats", catOrCats(2));
    assertEquals("1 == cat", "cat", catOrCats(1));
  }

  private String catOrCats(int numberOfCats) {

    return (numberOfCats > 1 ? "cats" : "cat");
  }

  @Test
  public void ifTruthyTwo() {
    boolean truthy = true;

    if (truthy) {
      assertTrue(truthy);
      assertFalse(!truthy);
    }
  }

  @Test
  public void ifTruthyOne() {
    boolean truthy = true;

    if (truthy) {
      assertTrue(truthy);
    }
  }
}
