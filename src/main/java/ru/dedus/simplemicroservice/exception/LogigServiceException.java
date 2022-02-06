package ru.dedus.simplemicroservice.exception;

/**
 * Ошибки возникшие в бизнес логике сервиса
 */
public class LogigServiceException extends ServiceException {
    /**
     * Исключения бизнес логики
     */
    public LogigServiceException() {
        super();
    }

    /**
     * Исключения бизнес логики
     * @param message Сообщение
     */
    public LogigServiceException(String message) {
        super(message);
    }
}
