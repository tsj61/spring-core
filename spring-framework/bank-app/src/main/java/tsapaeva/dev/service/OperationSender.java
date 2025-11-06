package tsapaeva.dev.service;

import tsapaeva.dev.enums.OperationType;

public interface OperationSender {
    /**
     * Тип операции
     */
    OperationType getType();

    /**
     * Метод операции
     */
    void execute();
}
