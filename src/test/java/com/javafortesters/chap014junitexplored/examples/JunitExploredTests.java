package com.javafortesters.chap014junitexplored.examples;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.User.InvalidPassword;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class JunitExploredTests {

  @Rule public ExpectedException expected = ExpectedException.none();
  @Rule public TestName testName = new TestName();

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

  @Test
  public void checkUsageOfAssertNotSame() throws InvalidPassword {
    User user = new User("user", "dupadupa");
    assertNotEquals("Username and password [not equals]", user.getUsername(), user.getPassword());
  }

  @Test
  public void checkUsageForAssertThat() {
    assertThat(3 + 3, is(6));
    assertThat("", is(not(nullValue())));
  }

  @Test
  public void checkUsageOfAllAsserts() {
    int a = 3;
    int b = 5;
    Integer c = null;
    int[] arr = {1, 2, 3};

    assertEquals(3, a);
    assertFalse(a < 3);
    assertTrue(a > 2);
    assertArrayEquals(new int[] {1, 2, 3}, arr);
    assertNotNull(a);
    assertNotSame(a, b);
    assertNull(c);
    c = a;
    assertSame(a, c);
  }

  @Test
  public void checkUsageOfAllAssertsWithAssertThat() {
    int a = 3;
    int b = 5;
    Integer c = null;
    int[] arr = {1, 2, 3};

    assertThat(3, equalTo(a));
    assertThat(false, is(a < 3));
    assertThat(true, is(a > 2));
    assertThat(new int[] {1, 2, 3}, equalTo(arr));
    assertThat(a, is(not(equalTo(null))));
    assertThat(a, is(not(b)));
    assertThat(c, equalTo(null));
    c = a;
    assertThat(a, is(c));
  }

  @Test(expected = AssertionError.class)
  public void shouldAlwaysFail() {
    fail("will always fail");
  }

  @Test
  public void shoudlAlwaysPass() {
    return;
  }

  @Ignore("Ignored for no reason")
  @Test
  public void ignoredTest() {}
}
