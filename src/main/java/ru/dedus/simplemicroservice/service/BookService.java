package ru.dedus.simplemicroservice.service;

import ru.dedus.simplemicroservice.exception.LogicServiceException;
import ru.dedus.simplemicroservice.model.BookDTO;

public interface BookService {
    public void create(BookDTO book);
    public BookDTO read(Long id) throws LogicServiceException;
    public void update(BookDTO book) throws LogicServiceException;
    public void delete(Long id) throws LogicServiceException;
}
