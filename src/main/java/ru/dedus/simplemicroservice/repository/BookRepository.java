package ru.dedus.simplemicroservice.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ru.dedus.simplemicroservice.entity.BookEntity;
import ru.dedus.simplemicroservice.model.BookDTO;

import java.util.HashMap;
import java.util.Map;

import static ru.dedus.simplemicroservice.entity.BookEntity.toBookEntity;
import static ru.dedus.simplemicroservice.model.BookDTO.toBookDTO;

@NoArgsConstructor
@Repository
public class BookRepository {
    @Getter
    @Setter
    private Long id = 0L;
    private Map<Long, BookEntity> repository = new HashMap<>();

    public boolean hasId(Long id) {
        return (repository.get(id) != null);
    }

    private Long nextId() {
        return (++id);
    }

    public void create(BookDTO book) {
        book.setId(nextId());
        repository.put(book.getId(), toBookEntity(book));
    }

    public BookDTO read(Long id) {
        return toBookDTO(repository.get(id));
    }

    public void update(BookDTO book) {
        repository.put(book.getId(), toBookEntity(book));
    }

    public void delete(Long id) {
        repository.remove(id);
    }
}