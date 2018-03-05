package com.javafortesters.domainentities;

public class User {

  public String publikStatik = "dupa";
  protected String username;
  private String password;

  public User() {
    this("user", "password", false);
  }

  public User(String username, String password, boolean b) {
    this.username = username;
    try {
      setPassword(password);
    } catch (InvalidPassword e) {
      throw new IllegalArgumentException("Default password incorrect", e);
    }
  }

  public User(String username, String password) throws InvalidPassword {
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

  public void setPassword(String password) throws InvalidPassword {

    if (password != null && password.length() < 7) {
      throw new InvalidPassword("Password must be longer than 6 chars");
    }
    this.password = password;
  }

  public String getPermission() {
    return "Normal";
  }

  public class InvalidPassword extends Exception {
    public InvalidPassword(String message) {
      super(message);
    }
  }
}
