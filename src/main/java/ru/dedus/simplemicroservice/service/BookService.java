package ru.dedus.simplemicroservice.service;

import ru.dedus.simplemicroservice.exception.BusinessLogigServiceException;
import ru.dedus.simplemicroservice.model.BookDTO;

public interface BookService {
    public void create(BookDTO book);
    public BookDTO read(Long id) throws BusinessLogigServiceException;
    public void update(BookDTO book) throws BusinessLogigServiceException;
    public void delete(Long id) throws BusinessLogigServiceException;
}
