package dev.truaro.blog.springnativegcp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${K_SERVICE:Not Provided}")
    private String serviceName;

    @GetMapping("/")
    public String helloWorld() {
        String result = "Cloud Run with Spring Native running";
        result += "\n- Service Name = " + serviceName;
        return result;
    }

}
