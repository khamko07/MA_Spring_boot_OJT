package Java_Advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger log = LoggerFactory.getLogger(LoggingDemo.class);
    
    public static void main(String[] args) {
        log.info("App started");
        
        try {
            int x = 1 / 0;
        } catch (Exception e) {
            log.error("An error occurred", e);
        }
    }
}
