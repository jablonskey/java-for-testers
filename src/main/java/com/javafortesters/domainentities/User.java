package com.javafortesters.domainentities;

public class User {

  public String publikStatik = "dupa";
  protected String username;
  private String password;

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
