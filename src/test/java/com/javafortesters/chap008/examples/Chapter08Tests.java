package com.javafortesters.chap008.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Chapter08Tests {

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

  @Test
  public void switchExample() {
    assertEquals("M", likelyGenderIs("sir"));
    assertEquals("M", likelyGenderIs("mr"));
    assertEquals("M", likelyGenderIs("master"));
    assertEquals("F", likelyGenderIs("miss"));
    assertEquals("F", likelyGenderIs("mrs"));
  }

  private String likelyGenderIs(String title) {
    String likelyGender;

    switch (title)

    }
  }
}
