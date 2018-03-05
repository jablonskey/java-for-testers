package com.javafortesters.domainentities;

public class EmptyUser extends User {

  public EmptyUser() throws InvalidPassword {
    this.username = null;
    this.setPassword(null);
  }
}
