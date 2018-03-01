package com.javafortesters.domainentities;

public class EmptyUser extends User {

  public EmptyUser() {
    this.username = null;
    this.setPassword(null);
  }
}
