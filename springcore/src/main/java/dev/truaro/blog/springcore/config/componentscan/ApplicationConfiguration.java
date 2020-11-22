package dev.truaro.blog.springcore.config.componentscan;

import dev.truaro.blog.springcore.config.CustomBeanFactoryBeanPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.truaro.blog.springcore.application.componentscan")
public class ApplicationConfiguration {
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryBeanPostProcessor();
    }
}
