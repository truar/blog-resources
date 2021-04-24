package dev.truaro.blog.cloudrundeveloper;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface DatastoreTodoRepository extends DatastoreRepository<Todo, Long> {
}
