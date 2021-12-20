package java.livrariadoprogramador.livrariadoprogramador.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.livrariadoprogramador.livrariadoprogramador.model.dto.Book;
import java.livrariadoprogramador.livrariadoprogramador.model.dto.Linguagens;
import java.livrariadoprogramador.livrariadoprogramador.repository.LivRepository;

@Service
public class LivService {
    @Autowired
    private LivRepository repository;

    public Book insertOrUpdate(Book book) {
        return repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public boolean delete(int id) {
        var book = repository.findById(id);

        if (book.isPresent()) {
            repository.deleteById(id);
            book = repository.findById(id);
            return book.isEmpty();
        }
        return false;
    }

    public Book findByName(String name) {
        var book = repository.findByNameContains(name);
        if (book.isPresent()) {
            return book.get();
        }
        return new Book();
    }

    public List<Book> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public List<Book> findByPublishing(String name) {
        return repository.findByPublishing(name);
    }

    public List<Book> findByYearOfPublication(int year) {
        return repository.findByYearOfPublication(year);
    }

    public Optional<Book> findById(int id) {
        return repository.findById(id);
    }
}