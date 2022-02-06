package ru.dedus.simplemicroservice.exception;

/**
 * Ошибки возникшие в бизнес логике сервиса
 */
public class BusinessLogigServiceException extends ServiceException {
    /**
     * Исключения бизнес логики
     */
    public BusinessLogigServiceException() {
        super();
    }

    /**
     * Исключения бизнес логики
     * @param message Сообщение
     */
    public BusinessLogigServiceException(String message) {
        super(message);
    }
}
