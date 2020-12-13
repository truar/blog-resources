package dev.truaro.blog.springcore.datamanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    private String name;
    private String id;

    public Member(String name) {
        this.name = name;
    }

    public Member() {

    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
