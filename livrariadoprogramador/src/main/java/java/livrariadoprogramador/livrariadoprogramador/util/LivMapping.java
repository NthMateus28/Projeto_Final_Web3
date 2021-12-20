package java.livrariadoprogramador.livrariadoprogramador.util;

import  java.livrariadoprogramador.livrariadoprogramador.model.dto.Book;
import  java.livrariadoprogramador.livrariadoprogramador.model.dto.BookDTO;

public class LivMapping {
    private LivMapping() {
    }

    public static BookDTO fromBook(Book book) {
        return new BookDTO(book.getId(), book.getName(), book.getAuthor(),
                book.getYearOfPublication());
      
    }

    public static Book toBook(BookDTO dto) {
        return new Book(dto.getId(), dto.getName(), dto.getAuthor(),null, dto.getYearOfPublication());
    }
}