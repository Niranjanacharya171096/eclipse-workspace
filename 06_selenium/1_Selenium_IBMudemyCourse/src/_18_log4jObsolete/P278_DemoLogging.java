package _18_log4jObsolete;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class P278_DemoLogging {

  static Logger log = LogManager.getLogger(P278_DemoLogging.class);
  static Appender append;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    final PatternLayout layout = new PatternLayout();
    layout.setConversionPattern("%d{yyyy-MM-dd} --%-10p %c{1} -%m%n");
    append = new ConsoleAppender(layout);
    log.addAppender(append);
    log.setLevel(Level.INFO);

    log.info("Running before method");
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    log.debug("Running after method");
  }

  @Test
  public void test() {
    log.info("Running test method");
  }
}