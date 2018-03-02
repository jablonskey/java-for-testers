package com.javafortesters.chap10.examples;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CollectionTests {

  @Rule public ErrorCollector collector = new ErrorCollector();

  @Test
  public void loopsExample() {
    String[] someDays = {
      "Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"
    };

    List<String> days = Arrays.asList(someDays);

    int forCount = 0;
    for (String day : days) {
      if (day.equals("Monday")) {
        break;
      }
      forCount++;
    }
    assertEquals("FOR EACH. Monday is at 3", 3, forCount);

    forCount = 0;
    while (!days.get(forCount).equals("Monday")) {
      forCount++;
    }
    assertEquals("WHILE. Monday is at 3", 3, forCount);

    forCount = 0;
    do {
      forCount++;
    } while (!days.get(forCount).equals("Monday"));
    assertEquals("WHILE. Monday is at 3", 3, forCount);
  }

  @Test
  public void collectionsExamples() {

    Collection<String> workdays = new ArrayList<String>();
    Collection<String> daysOfWeek = new ArrayList<String>();

    workdays.add("Monday");
    workdays.add("Tuesday");
    workdays.add("Wednesday");
    workdays.add("Thursday");
    workdays.add("Friday");

    assertEquals(5, workdays.size());

    daysOfWeek.addAll(workdays);
    daysOfWeek.add("Saturday");
    daysOfWeek.add("Sunday");

    //    collector.checkThat(workdays.size(), equalTo(daysOfWeek.size() - 1));
    daysOfWeek.addAll(workdays);
    //    collector.checkThat(true, equalTo(workdays.equals(daysOfWeek)));
    assertTrue(daysOfWeek.containsAll(workdays));

    daysOfWeek.removeAll(workdays);
    assertEquals(2, daysOfWeek.size());

    String[] daysOfWeekArray = new String[daysOfWeek.size()];
    daysOfWeek.toArray(daysOfWeekArray);
    assertEquals(2, daysOfWeekArray.length);


    daysOfWeek.retainAll(workdays);
    assertTrue(daysOfWeek.isEmpty());

    workdays.clear();
    assertTrue(workdays.isEmpty());


  }
}
