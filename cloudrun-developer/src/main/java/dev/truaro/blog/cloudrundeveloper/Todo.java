package dev.truaro.blog.cloudrundeveloper;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    private Long id;

    private String task;

    private LocalDate dueDate;

    public Todo(String task, LocalDate dueDate) {
        this.task = task;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
