package guru.springframework.Spring5WebbApp.springframwork.model.model.repositories;

import guru.springframework.Spring5WebbApp.springframwork.model.model.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book , Long > {
}
