package dev.truaro.blog.springcore.config.javaannotation;

import dev.truaro.blog.springcore.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.application.javaannotation.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfigurationWithInternalMethodInvocationInjection {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
}
