package dev.truaro.blog.springcore.application.componentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service // Same as @Component
@Scope("prototype")
public class PrototypeMemberService {
}
