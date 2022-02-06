package ru.dedus.simplemicroservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dedus.simplemicroservice.exception.LogigServiceException;
import ru.dedus.simplemicroservice.model.BookDTO;
import ru.dedus.simplemicroservice.repository.BookRepository;
import ru.dedus.simplemicroservice.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    private static final String OBJECT_BY_ID_NOT_FOUND = "Oбъект с идентификатором '%s' не найден";


    @Override
    public void create(BookDTO book) {
        bookRepository.create(book);
    }

    @Override
    public BookDTO read(Long id) throws LogigServiceException {
        if (!bookRepository.hasId(id)){
            throw new LogigServiceException(String.format(OBJECT_BY_ID_NOT_FOUND, id));
        }
        return bookRepository.read(id);
    }

    @Override
    public void update(BookDTO book) throws LogigServiceException {
        if (!bookRepository.hasId(book.getId())){
            throw new LogigServiceException(String.format(OBJECT_BY_ID_NOT_FOUND, book.getId()));
        }
        bookRepository.update(book);
    }

    @Override
    public void delete(Long id) throws LogigServiceException {
        if (!bookRepository.hasId(id)){
            throw new LogigServiceException(String.format(OBJECT_BY_ID_NOT_FOUND, id));
        }
        bookRepository.delete(id);
    }
}
