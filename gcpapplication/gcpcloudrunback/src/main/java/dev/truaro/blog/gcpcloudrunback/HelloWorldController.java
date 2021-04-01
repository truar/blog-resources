package dev.truaro.blog.gcpcloudrunback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/")
    public String helloWorld() {
        logger.info("Hello World. I am deployed automatically");
        return "Hello World. I am deployed automatically";
    }

}
