package dev.truaro.blog.springcore.container;

import dev.truaro.blog.springcore.container.config.javaannotation.ApplicationConfigurationWithParameterInjection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplicationJavaConfiguration {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigurationWithParameterInjection.class);
        ctx.close();
    }
}
