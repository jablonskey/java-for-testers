package com.javafortesters.chap013moreaboutexceptions.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.User.InvalidPassword;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Chapter13Tests {

  @Test
  public void canCreateDefaultUserWithoutHandlingException() {
    User aUser = new User();
    assertEquals("user", aUser.getUsername());
    assertEquals("password", aUser.getPassword());
  }

  @Test
  public void haveToCatchIllegalPasswordForParamConstructor() {
    try {
      User aUser = new User("u", "pass");
      fail("An exception should have been thrown");
    } catch (InvalidPassword invalidPassword) {
      assertTrue("The exception was thrown", true);
      invalidPassword.printStackTrace();
    }
  }
}
