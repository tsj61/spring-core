package tsapaeva.dev.service;

import tsapaeva.dev.entity.User;

import java.util.List;

public interface UserService {
    /**
     * Создание пользователя
     *
     * @return Id нового пользователя
     */
    Long createUser();

    /**
     * Поиск пользователя по Id
     *
     * @param id Id пользователя
     * @return Найденный пользователь
     */
    User findById(Long id);

    /**
     * Найти всех пользователей
     *
     * @return Список пользователей
     */
    List<User> findAll();
}
