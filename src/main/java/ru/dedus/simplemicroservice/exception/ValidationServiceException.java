package ru.dedus.simplemicroservice.exception;

/**
 * Ошибки возникшие в процессе валидации данных
 */
public class ValidationServiceException extends ServiceException {
    /**
     * Исключения валидации данных
     */
    public ValidationServiceException() {
        super();
    }

    /**
     * Исключения валидации данных
     * @param message Сообщение
     */
    public ValidationServiceException(String message) {
        super(message);
    }
}
