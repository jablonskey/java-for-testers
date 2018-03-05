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

    assertEquals("default username expected", "user", user.getUsername());
    assertEquals("default password expected", "password", user.getPassword());
  }

  @Test
  public void canSetPasswordAfterConstructed() throws User.InvalidPassword {
    User user = new User();

    user.setPassword("qwerty123");
    assertEquals("setter password expected", "qwerty123", user.getPassword());
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
