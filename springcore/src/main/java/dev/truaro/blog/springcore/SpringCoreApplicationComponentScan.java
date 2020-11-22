package dev.truaro.blog.springcore;

import dev.truaro.blog.springcore.config.componentscan.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication(scanBasePackages = "dev.truaro.blog.springcore.config.componentscan")
public class SpringCoreApplicationComponentScan {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SpringApplication.run(SpringCoreApplicationComponentScan.class);
    }
}
