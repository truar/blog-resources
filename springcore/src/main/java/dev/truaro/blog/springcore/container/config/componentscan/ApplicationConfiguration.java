package dev.truaro.blog.springcore.container.config.componentscan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("dev.truaro.blog.springcore.container.application.componentscan")
public class ApplicationConfiguration {
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return beanFactory -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition("memberRepository");
            beanDefinition.setLazyInit(true);
        };
    }

    //    @Bean
    public static BeanFactoryPostProcessor propertyConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setPlaceholderSuffix("{{");
        configurer.setPlaceholderPrefix("}}");
        configurer.setFileEncoding("UTF-8");
        return configurer;
    }
}