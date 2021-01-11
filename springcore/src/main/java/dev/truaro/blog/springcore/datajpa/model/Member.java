package dev.truaro.blog.springcore.datajpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    private Long id;

    private String email;

    public Member() {
    }
}
