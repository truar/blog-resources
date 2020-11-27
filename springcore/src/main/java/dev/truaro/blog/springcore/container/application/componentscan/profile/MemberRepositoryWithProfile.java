package dev.truaro.blog.springcore.container.application.componentscan.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jdbc") // this bean is linked to jdbc profile
public class MemberRepositoryWithProfile {

}
