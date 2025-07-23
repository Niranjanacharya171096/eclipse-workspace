package _03_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class P135_LoggingFile {

  private static final Logger log = LogManager.getLogger(P135_LoggingFile.class.getName());

  public static void main(String[] args) {
    log.debug("Debug Message Logged");
    log.error("Error Message Logged");
    log.fatal("Fatal Message Logged");
  }
}