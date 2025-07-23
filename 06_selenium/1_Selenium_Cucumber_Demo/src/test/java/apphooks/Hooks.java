package apphooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
  @BeforeAll
  public static void beforeAll() {
    System.out.println("@BeforeAll the Scenario");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("@AfterAll the Scenario");
  }

  @Before
  public void before() {
    System.out.println("@Before the Scenario");
  }

  @After
  public void after() {
    System.out.println("@After the Scenario");
  }

  @Before(order = 0)
  public void before0() {
    System.out.println("\n@Before 0 the Scenario");
  }

  @After(order = 0)
  public void after0() {
    System.out.println("@After 0 the Scenario\n");
  }

  @Before(order = 1)
  public void before1() {
    System.out.println("@Before 1 the Scenario");
  }

  @Before(order = 1, value="@First")
  public void before1First() {
    System.out.println("@Before 1 First the Scenario");
  }

  @Before(value="@First", order = 1)
  public void beforeFirst1() {
    System.out.println("@Before First 1 the Scenario");
  }

  @Before(order = 2)
  public void before2() {
    System.out.println("@Before 2 the Scenario");
  }

  @After(order = 1)
  public void after1() {
    System.out.println("@After 1 the Scenario");
  }

  @Before("@First")
  public void beforeFirst() {
    System.out.println("@Before @First the Scenario");
  }

  @After("@First")
  public void afterFirst() {
    System.out.println("@After @First the Scenario");
  }

  @Before("@Second")
  public void beforeSecond() {
    System.out.println("@Before @Second the Scenario");
  }

  @BeforeStep
  public void beforeStep0() {
    System.out.println("@BeforeStep the each Step");
  }

  @AfterStep
  public void afterStep() {
    System.out.println("@AfterStep the each Step");
  }

  @BeforeStep(order = 0)
  public void beforeStep() {
    System.out.println("@BeforeStep 0 the each Step");
  }

  @AfterStep(order = 0)
  public void afterStep0() {
    System.out.println("@AfterStep 0 the each Step");
  }

  @BeforeStep(order = 1)
  public void beforeStep1() {
    System.out.println("@BeforeStep 1 the each Step");
  }

  @AfterStep(order = 1)
  public void afterStep1() {
    System.out.println("@AfterStep1 the each Step");
  }
}
