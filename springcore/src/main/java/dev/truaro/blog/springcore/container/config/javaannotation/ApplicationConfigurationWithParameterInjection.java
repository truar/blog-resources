package dev.truaro.blog.springcore.container.config.javaannotation;

import dev.truaro.blog.springcore.container.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.container.application.javaannotation.MemberService;
import dev.truaro.blog.springcore.container.config.CustomBeanFactoryBeanPostProcessor;
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
