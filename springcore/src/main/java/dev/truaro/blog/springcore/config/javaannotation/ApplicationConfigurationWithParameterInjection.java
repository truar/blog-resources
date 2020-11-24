package dev.truaro.blog.springcore.config.javaannotation;

import dev.truaro.blog.springcore.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.application.javaannotation.MemberService;
import dev.truaro.blog.springcore.config.CustomBeanFactoryBeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:database.properties")
public class ApplicationConfigurationWithParameterInjection {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryBeanPostProcessor();
    }

    @Bean(initMethod = "initWithInitMethod", destroyMethod = "cleanUpWithDestroyMethod")
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
//    @Scope("prototype")
    @Scope("singleton")
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }

    @Bean
    public BeanPostProcessor custom() {
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
