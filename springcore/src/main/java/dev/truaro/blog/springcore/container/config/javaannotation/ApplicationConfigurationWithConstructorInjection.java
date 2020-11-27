package dev.truaro.blog.springcore.container.config.javaannotation;

import dev.truaro.blog.springcore.container.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.container.application.javaannotation.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigurationWithConstructorInjection {

    private MemberRepository memberRepository;

    public ApplicationConfigurationWithConstructorInjection(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
