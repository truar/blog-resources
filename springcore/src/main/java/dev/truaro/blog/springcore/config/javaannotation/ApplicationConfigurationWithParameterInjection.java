package dev.truaro.blog.springcore.config.javaannotation;

import dev.truaro.blog.springcore.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.application.javaannotation.MemberService;
import dev.truaro.blog.springcore.config.CustomBeanFactoryBeanPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfigurationWithParameterInjection {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryBeanPostProcessor();
    }

    @Bean(initMethod = "init")
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
//    @Scope("prototype")
    @Scope("singleton")
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }
}
