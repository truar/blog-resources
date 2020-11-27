package dev.truaro.blog.springcore.aspect;


import dev.truaro.blog.springcore.aspect.application.HelloWorldService;
import dev.truaro.blog.springcore.aspect.config.AspectConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class AspectLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AspectConfiguration.class);
        HelloWorldService service = ctx.getBean(HelloWorldService.class);
        
        service.sayHello();
        service.sayHelloWithArgs("Spring", "Core");
    }

}
