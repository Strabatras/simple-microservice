package ru.dedus.simplemicroservice.exception;

/**
 * Ошибки возникшие в бизнес логике сервиса
 */
public class LogicServiceException extends ServiceException {
    /**
     * Исключения бизнес логики
     */
    public LogicServiceException() {
        super();
    }

    /**
     * Исключения бизнес логики
     * @param message Сообщение
     */
    public LogicServiceException(String message) {
        super(message);
    }
}
