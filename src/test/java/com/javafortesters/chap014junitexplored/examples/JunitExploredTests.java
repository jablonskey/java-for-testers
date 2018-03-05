package com.javafortesters.chap014junitexplored.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.User.InvalidPassword;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;

import static org.hamcrest.CoreMatchers.containsString;

public class JunitExploredTests {

  @BeforeClass
  public static void runOncePerClassBeforeAnyTests() {
    System.out.println("@BeforeClass method");
  }

  @Before
  public void runBeforeEveryTestMethod() {
    System.out.println("@Before method");
    System.out.println("Running " + testName.getMethodName());
  }

  @After
  public void runAfterEveryTestMethod() {
    System.out.println("@After method");
  }

  @Rule public ExpectedException expected = ExpectedException.none();

  @Rule public TestName testName = new TestName();

  @Test(expected = InvalidPassword.class)
  public void expectInvalidPasswordException() throws InvalidPassword {
    User user = new User("username", "<6");
  }

  @Test
  public void invalidPasswordThrown() throws InvalidPassword {
    expected.expect(InvalidPassword.class);
    expected.expectMessage(containsString("longer than 6 chars"));
    User user = new User("u", "<6");
  }

  @Ignore("Ignored for no reason")
  @Test
  public void ignoredTest() {}
}
