package ru.dedus.simplemicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import ru.dedus.simplemicroservice.entity.BookEntity;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long id;
    private String isbn;
    private String name;

    public static BookDTO toBookDTO(BookEntity entity) {
        BookDTO book = BookDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .isbn(entity.getIsbn())
                .build();
        return book;
    }
}