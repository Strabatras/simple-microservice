package ru.dedus.simplemicroservice.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ru.dedus.simplemicroservice.model.BookDTO;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Repository
public class BookRepository {
    @Getter
    @Setter
    private Long id = 0L;
    private Map<Long, BookDTO> books = new HashMap<>();

    public boolean hasId(Long id){
        return (books.get(id) != null);
    }

    private Long nextId(){
        return (++id);
    }

    public void create(BookDTO book) {
        book.setId(nextId());
        books.put(book.getId(), book);
    }

    public BookDTO read(Long id) {
        return books.get(id);
    }

    public void update(BookDTO book){
        books.put(id,book);
    }

    public void delete(Long id){
        books.remove(id);
    }
}
