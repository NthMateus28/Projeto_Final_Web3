package java.livrariadoprogramador.livrariadoprogramador.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.livrariadoprogramador.livrariadoprogramador.model.dto.Book;
import java.livrariadoprogramador.livrariadoprogramador.model.dto.Linguagens;

@Repository
public interface LivRepository extends JpaRepository<Book, Integer> {

    public Optional<Book> findByNameContains(String name);

    public List<Book> findByAuthor(String author);

    public List<Book> findByYearOfPublication(int year);

    public List<Book> findByPublishing(String name);

}