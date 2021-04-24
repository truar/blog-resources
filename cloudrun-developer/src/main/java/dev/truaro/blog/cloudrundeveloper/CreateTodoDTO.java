package dev.truaro.blog.cloudrundeveloper;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class CreateTodoDTO {

    public String task;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public LocalDate dueDate;

    @Override
    public String toString() {
        return "CreateTodoDTO{" +
                "task='" + task + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
