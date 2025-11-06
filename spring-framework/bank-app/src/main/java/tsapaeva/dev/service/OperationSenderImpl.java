package tsapaeva.dev.service;

import org.springframework.stereotype.Component;
import tsapaeva.dev.enums.OperationType;

public class OperationSenderImpl {
    /**
     * Создание нового пользователя.
     */
    @Component
    public class UserCreator implements OperationSender {

        @Override
        public OperationType getType() {
            return OperationType.USER_CREATE;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Отображение списка всех пользователей.
     */
    @Component
    public class UserShowing implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.SHOW_ALL_USERS;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Создание нового счета для пользователя.
     */
    @Component
    public class AccountCreator implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.ACCOUNT_CREATE;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Закрытие счета.
     */
    @Component
    public class AccountCloser implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.ACCOUNT_CLOSE;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Пополнение счета.
     */
    @Component
    public class AccountDepositor implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.ACCOUNT_DEPOSIT;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Перевод средств между счетами.
     */
    @Component
    public class AccountTransfer implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.ACCOUNT_TRANSFER;
        }

        @Override
        public void execute() {

        }
    }

    /**
     * Снятие средств со счета.
     */
    @Component
    public class AccountWithdrawer implements OperationSender {
        @Override
        public OperationType getType() {
            return OperationType.ACCOUNT_WITHDRAW;
        }

        @Override
        public void execute() {

        }
    }
}
