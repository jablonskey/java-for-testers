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
    setPassword(password);
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
    if (password.length() < 7) {
      throw new IllegalArgumentException("Password mus be longer than 6 chars");
    }
    this.password = password;
  }

  public String getPermission() {
    return "Normal";
  }
}
