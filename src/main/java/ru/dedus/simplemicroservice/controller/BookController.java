package ru.dedus.simplemicroservice.controller;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dedus.simplemicroservice.model.BookDTO;
import ru.dedus.simplemicroservice.service.BookService;

@AllArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @SneakyThrows
    @PostMapping("/")
    public void create(@RequestBody BookDTO book) {
        bookService.create(book);
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public BookDTO read(@PathVariable Long id) {
        return bookService.read(id);
    }

    @SneakyThrows
    @PutMapping("/")
    public void update(@RequestBody BookDTO book) {
        bookService.update(book);
    }

    @SneakyThrows
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }
}
