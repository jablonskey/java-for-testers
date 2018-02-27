package com.javafortesters.chap007.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Chapter07Tests {

  @Test
  public void IntegerTypes() {
    byte aByte;
    short aShort;
    int anInt;
    long aLong;

    System.out.printf("BYTE range: %s : %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
    System.out.printf("SHORT range: %s : %s%n", Short.MIN_VALUE, Short.MAX_VALUE);
    System.out.printf("INT range: %s : %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
    System.out.printf("LONG range: %s : %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

    System.out.printf("FLOAT range: %s : %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
    System.out.printf("LONG range: %s : %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

    aByte = 0b0010;
    assertEquals(2, aByte);
  }

  @Test
  public void CharacterType() {
    char aChar = '\u0026';
    assertEquals('&', aChar);
  }

  @Test
  public void incrementDecrementOperatorsExplored() {
    int num = 10;
    assertEquals("variable should be incremented AFTER operation", 10, num++);
    assertEquals("variable should be incremented BEFORE operation", 12, ++num);
  }

  @Test
  public void logicalOperatorsExplored() {
    assertTrue(true && true);
    assertTrue(true || false);
    assertTrue(false || true);
    assertFalse(false || false);
    assertFalse(true && false);
  }

  @Test
  public void ternaryOperatorsExplored() {
    int x;
    x = 4 > 3 ? 2 : 1;
    assertEquals(2, x);
    assertTrue(5 >= 4);
  }

  @Test
  public void bitwiseOperatorsExplored() {

    assertEquals(0b001, 0b1001 & 0b0101);
  }
}
