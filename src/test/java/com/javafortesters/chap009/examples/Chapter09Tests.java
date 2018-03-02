package com.javafortesters.chap009.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Chapter09Tests {

  @Test
  public void simpleArrayExample() {
    String[] numbers0123 = {"zero", "one", "two", "three"};

    for (String numberText : numbers0123) {
      System.out.println(numberText);
    }

    assertEquals("zero", numbers0123[0]);
    assertEquals("three", numbers0123[3]);
  }

  @Test
  public void shouldCreateArrayOfUsers() {

    User[] users = {new User(), new User(), new User()};

    for (User user : users) {
      assertTrue(user instanceof User);
      System.out.println(user.getUsername());
    }

  }

  @Test
  public void shouldCreateArrayOfHundredUsers() {
    User[] users = new User[100];

    for (int i = 0; i < 100; i++) {
      users[i] = new User("username" + i, "password" + i);
    }

    assertEquals(100, users.length);
    int index = 0;
    for (User user : users) {
      assertEquals("username" + index, user.getUsername());
      index++;
    }
  }

  @Test
  public void shouldArraysBeFun() {
    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    String[] weekDays;

    weekDays = Arrays.copyOf(workdays, 7);
    assertEquals(null, weekDays[5]);
    assertEquals(null, weekDays[6]);

    String[] shortWorkDays;
    shortWorkDays = Arrays.copyOfRange(workdays, 2, 5);

    assertEquals(3, shortWorkDays.length);
    assertEquals("Friday", shortWorkDays[2]);

    int[] minusOne = new int[30];
    Arrays.fill(minusOne, -1);


  }
}
