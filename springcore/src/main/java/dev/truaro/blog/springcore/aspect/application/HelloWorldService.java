package dev.truaro.blog.springcore.aspect.application;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public void sayHelloWithException() {
        throw new IllegalArgumentException("erreur");
    }

    public void sayHello() {
        System.out.println("Hello World !!");
    }

    public void sayHelloWithArgs(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + " !!");
    }

}
