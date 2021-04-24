package dev.truaro.blog.cloudrundeveloper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipleLoggerController {

    private static final Logger logger = LoggerFactory.getLogger(MultipleLoggerController.class);

    @GetMapping("/")
    public String log() {
        logger.info("An info message");
        logger.error("An error message");
        logger.warn("A warn message");
        logger.debug("A debug message");
        return "Logged data. Check Cloud Logging";
    }
}
