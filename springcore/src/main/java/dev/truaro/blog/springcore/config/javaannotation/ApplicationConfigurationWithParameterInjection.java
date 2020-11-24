package dev.truaro.blog.springcore.config.javaannotation;

import dev.truaro.blog.springcore.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.application.javaannotation.MemberService;
import dev.truaro.blog.springcore.config.CustomBeanFactoryBeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:database.properties")
public class ApplicationConfigurationWithParameterInjection {

    @Bean(name = "namedAfterTheAttribute",
            initMethod = "initWithInitMethod",
            destroyMethod = "cleanUpWithDestroyMethod")
    @Primary
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public MemberRepository namedAfterFromTheMethod() {
        return new MemberRepository();
    }

    @Bean
    @Scope("singleton")
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }
}
