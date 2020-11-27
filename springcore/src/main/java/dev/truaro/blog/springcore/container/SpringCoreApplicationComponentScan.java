package dev.truaro.blog.springcore.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.truaro.blog.springcore.container.config.componentscan")
public class SpringCoreApplicationComponentScan {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SpringApplication.run(SpringCoreApplicationComponentScan.class);
    }
}
