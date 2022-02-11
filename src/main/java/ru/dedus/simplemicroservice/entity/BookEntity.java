package ru.dedus.simplemicroservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.dedus.simplemicroservice.model.BookDTO;

import javax.persistence.Entity;

@Builder
@Getter
@Setter
@Entity
public class BookEntity {
    private Long id;
    private String isbn;
    private String name;

    public static BookEntity toBookEntity(BookDTO book) {
        BookEntity entity = BookEntity.builder()
                .id(book.getId())
                .name(book.getName())
                .isbn(book.getIsbn())
                .build();
        return entity;
    }
}