package dev.truaro.blog.springcore.container.config.javaannotation;

import dev.truaro.blog.springcore.container.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.container.application.javaannotation.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
