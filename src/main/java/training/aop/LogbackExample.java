package training.aop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogbackExample {
    private static final Logger log = LoggerFactory.getLogger(LogbackExample.class);
    public static void main(String[] args) {
        log.debug("Logback is the implementation of SLF4J");
    }
}
