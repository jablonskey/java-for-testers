package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsExampleClassTest {

  @Test
  public void throwNullPointerExceptionAndHandleIt() {
    Integer age = null;
    //    Integer age = 18;

    String ageAsString;

    try {
      ageAsString = age.toString();
    } catch (NullPointerException e) {
      System.out.println("getMessage: " + e.getMessage());
      System.out.println("getStacktracke: " + e.getStackTrace());
      System.out.println("printStacktrace:");
      e.printStackTrace();

      age = 18;
      ageAsString = age.toString();
    } catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException: " + e.getMessage());
      ageAsString = age.toString();
    }

    String yourAge = "You are " + ageAsString + " years old";

    assertEquals("You are 18 years old", yourAge);
  }

  @Test(expected = NullPointerException.class)
  public void throwNullPointerAndNotHandle() {
    Integer age = null;
    //    Integer age = 18;
    String ageAsString = age.toString();
  }

  @Test
  public void tryCatchFinallyANullPointerException() {
    Integer age = null;
    String ageAsString;
    String yourAge = "";

    try {
      ageAsString = age.toString();

    } catch (NullPointerException e) {
      age = 18;
      ageAsString = age.toString();
    } finally {
      yourAge = "You are " + age.toString() + " years old";
    }
    assertEquals("You are 18 years old", yourAge);
  }

  @Test(expected = IllegalArgumentException.class)
  public void exampleTryCatchFinally() {
    Integer age = null;

    try {
      System.out.println("1. generate a null pointer exception");
      System.out.println(age.toString());
    } catch (NullPointerException e) {
      System.out.println("2. handle null pointer exception");
      throw new IllegalArgumentException("Null pointer became Illegal", e);
    } finally {
      System.out.println("3. run code in finally section");
    }
  }
}
