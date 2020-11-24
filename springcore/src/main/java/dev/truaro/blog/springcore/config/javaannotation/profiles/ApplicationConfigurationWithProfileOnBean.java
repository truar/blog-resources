package dev.truaro.blog.springcore.config.javaannotation.profiles;

import dev.truaro.blog.springcore.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.application.javaannotation.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfigurationWithProfileOnBean {

    @Bean
    @Profile("jdbc") // Only this bean is linked to jdbc profile
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }
}
