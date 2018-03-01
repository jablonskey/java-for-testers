package com.javafortesters.domainentities;

public class User {

  protected String username;
  private String password;

  public String publikStatik = "dupa";

  public User() {
    this("admin", "root");
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  /**
   * Gets username
   *
   * @return username as String
   */
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPermission() {
    return "Normal";
  }
}
