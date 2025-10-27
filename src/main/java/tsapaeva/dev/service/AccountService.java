package tsapaeva.dev.service;

public interface AccountService {
    /**
     * Создание счета
     *
     * @return Id счета
     */
    Long createAccount();

    /**
     * Закрыть счет
     *
     * @return успешно/нет
     */
    boolean closeAccount();

    /**
     * Пополнить счет
     *
     * @param id  id аккаунта
     * @param sum сумма пополнения
     * @return успешно/нет
     */
    boolean depositAccount(Long id, Double sum);

    /**
     * Отправить сумму другому пользователю
     *
     * @param senderId    id отправителя
     * @param recipientId id получателя
     * @param sum         сумма
     * @return успешно/нет
     */
    boolean transferAccount(Long senderId, Long recipientId, Double sum);

    /**
     * Снять деньги со счета
     *
     * @param id  id счета
     * @param sum сумма снятия
     * @return успешно/нет
     */
    boolean withdrawAccount(Long id, Double sum);
}
