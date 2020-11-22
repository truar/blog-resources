package dev.truaro.blog.springcore;

import dev.truaro.blog.springcore.config.javaannotation.ApplicationConfigurationWithParameterInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigurationWithParameterInjection.class);
    }
}
