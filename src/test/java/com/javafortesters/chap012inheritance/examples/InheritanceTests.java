package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.EmptyUser;
import com.javafortesters.domainentities.EmptyUserWithUrl;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class InheritanceTests {

  @Test
  public void testEmptyUserShouldHaveEmptyUsernameAndPassword() throws User.InvalidPassword {
    EmptyUser emptyUser = new EmptyUser();
    assertNull(emptyUser.getUsername());
    assertNull(emptyUser.getPassword());
  }

  @Test
  public void testEmptyUserWithUrlShouldHaveNoUsernameAndPasswordAndCorrectUrl()
      throws User.InvalidPassword {
    EmptyUserWithUrl emptyUserWithUrl = new EmptyUserWithUrl();
    System.out.println(emptyUserWithUrl.getUrl());
    assertNotNull(emptyUserWithUrl.getUrl());
  }

  @Test
  public void aUserHasNormalPermission() {
    User aUser = new User();
    assertEquals("Normal", aUser.getPermission());
  }

  @Test
  public void anAdminUserDefaultConstructor() {
    AdminUser adminUser = new AdminUser();
    assertEquals("adminuser", adminUser.getUsername());
    assertEquals("password", adminUser.getPassword());
    assertEquals("Elevated", adminUser.getPermission());
  }
}
