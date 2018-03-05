package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class EmptyUserWithUrl extends EmptyUser {

  private String url;

  public EmptyUserWithUrl() throws InvalidPassword {
    this.url = TestAppEnv.getUrl();
  }

  public String getUrl() {
    return url;
  }
}
