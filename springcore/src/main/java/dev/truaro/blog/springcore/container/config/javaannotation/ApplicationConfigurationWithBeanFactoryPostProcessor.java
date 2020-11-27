package dev.truaro.blog.springcore.container.config.javaannotation;

import dev.truaro.blog.springcore.container.config.CustomBeanFactoryBeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:database.properties")
public class ApplicationConfigurationWithBeanFactoryPostProcessor {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryBeanPostProcessor();
    }
    @Bean
    public BeanPostProcessor customBeanPostProcessor() {
        return new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                // if bean needs to be proxied
                // then return Proxy(bean)
                // else
                // return bean
                return bean;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return bean;
            }
        };
    }
}
