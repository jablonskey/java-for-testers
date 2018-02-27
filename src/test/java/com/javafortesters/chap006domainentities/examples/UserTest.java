package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

  @Test
  public void canConstructANewUser() {
    User user = new User();
  }

  @Test
  public void userHasDefaultUsernameAndPassword() {
    User user = new User();

    assertEquals("default username expected", "admin", user.getUsername());
    assertEquals("default password expected", "root", user.getPassword());
  }

  @Test
  public void canSetPasswordAfterConstructed() {
    User user = new User();

    user.setPassword("qwerty");
    assertEquals("setter password expected", "qwerty", user.getPassword());
  }

  @Test
  public void publikStatikHasCorrectValue() {
    //    assertEquals("publikStatik has default value", "dupa", User.publikStatik);
    User user = new User();
    user.publikStatik = "zbita";
    assertEquals("publikStatik change successful", "zbita", user.publikStatik);
    User newUser = new User();
    assertEquals("publikStatik for newUser has default value", "dupa", newUser.publikStatik);
  }
}
