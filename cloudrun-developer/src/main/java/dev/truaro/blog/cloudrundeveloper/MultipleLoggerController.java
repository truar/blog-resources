package dev.truaro.blog.cloudrundeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipleLoggerController {

    @GetMapping("/")
    public String log() {

        return "Logged data. Check Cloud Logging";
    }

}
