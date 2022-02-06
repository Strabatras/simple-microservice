package ru.dedus.simplemicroservice.service;

import ru.dedus.simplemicroservice.exception.LogigServiceException;
import ru.dedus.simplemicroservice.model.BookDTO;

public interface BookService {
    public void create(BookDTO book);
    public BookDTO read(Long id) throws LogigServiceException;
    public void update(BookDTO book) throws LogigServiceException;
    public void delete(Long id) throws LogigServiceException;
}
