package dev.truaro.blog.cloudrundeveloper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodosController {

    private static final Logger logger = LoggerFactory.getLogger(TodosController.class);
    private final DatastoreTodoRepository todosRepository;

    public TodosController(DatastoreTodoRepository todosRepository) {
        this.todosRepository = todosRepository;
    }

    @PostMapping
    public void createTodo(@RequestBody CreateTodoDTO createTodoDTO) {
        logger.info(createTodoDTO.toString());
        Todo todo = new Todo(createTodoDTO.task, createTodoDTO.dueDate);
        todosRepository.save(todo);
        logger.info("New Todo created :" + todo.getId());
    }

    @GetMapping
    public Iterable<Todo> getTodos() {
        logger.info("Fetching all Todos");
        return todosRepository.findAll();
    }
}
