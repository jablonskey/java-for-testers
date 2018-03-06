package com.javafortesters.chap016randomdata.examples;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RandomDataTest {
  @Test
  public void testRandomBoolStats() {
    Random generate = new Random();
    int[] boolStats = {0, 0};

    for (int i = 0; i < 1000; i++) {
      if (generate.nextBoolean()) {
        boolStats[0]++;
      } else boolStats[1]++;
    }

    System.out.println("true: " + boolStats[0] + " false: " + boolStats[1]);
  }

  @Test
  public void checkMathRandom() {
    double rnd;
    for (int i = 0; i < 10; i++) {
      rnd = Math.random();
      System.out.println(String.format("generated %f as random number: ", rnd));
      assertThat(rnd < 1.0d, is(true));
      assertThat(rnd >= 0.0d, is(true));
    }
  }

  @Test
  public void checkJavaUtilRandom() {
    Random generate = new Random();

    boolean randomBool = generate.nextBoolean();
    int randomInt = generate.nextInt();
    int randomIntRange = generate.nextInt(10);
    long randomLong = generate.nextLong();
    double randomDouble = generate.nextDouble();
    double randomGaussian = generate.nextGaussian();
    byte[] bytes = new byte[generate.nextInt(100)];
    generate.nextBytes(bytes);

    System.out.println("randomBool " + randomBool);
    System.out.println("randomInt " + randomInt);
    System.out.println("randomIntRange " + randomIntRange);
    System.out.println("randomLong " + randomLong);
    System.out.println("randomDouble " + randomDouble);
    System.out.println("randomGaussian " + randomGaussian);
    System.out.println("bytes " + bytes);
  }

  @Test
  public void shouldRandomIntInRangeGenerateCorrectValues() {
    Random generate = new Random();
    int minValue, maxValue;
    for (int i = 0; i < 10; i++) {

      do {
        minValue = generate.nextInt();
        maxValue = generate.nextInt();
      } while ((maxValue - minValue) < 0);

      System.out.println(
          "minValue outside: "
              + minValue
              + " maxValue outside: "
              + maxValue
              + " range outside: "
              + (maxValue - minValue));
      int rand = nextIntInRange(minValue, maxValue);
      assertThat(String.format("FAILED %d > %d", rand, minValue), rand > minValue, is(true));
      assertThat(String.format("FAILED %d < %d", rand, maxValue), rand < maxValue, is(true));
    }
  }

  private int nextIntInRange(int minValue, int maxValue) {
    Random generate = new Random();
    Integer randomInt = null;
    Integer range = null;
    try {
      range = (maxValue - minValue + 1);
      randomInt = generate.nextInt(range) + minValue;
    } catch (IllegalArgumentException e) {
      System.out.println(
          "minValue: "
              + minValue
              + " maxValue : "
              + maxValue
              + " range: "
              + maxValue
              + " - "
              + minValue
              + " + 1 = "
              + range);
      throw e;
    }
    return randomInt;
  }
}
