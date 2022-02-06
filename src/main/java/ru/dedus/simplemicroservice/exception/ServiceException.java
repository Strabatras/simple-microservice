package ru.dedus.simplemicroservice.exception;

/**
 * Исключения микросервиса
 */
public class ServiceException extends Exception {
    /**
     * Исключения микросервиса
     */
    public ServiceException() {
        super();
    }

    /**
     * Исключения микросервиса
     * @param message Сообщение
     */
    public ServiceException(String message) {
        super(message);
    }
}
