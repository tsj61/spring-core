package tsapaeva.dev.service;

import org.springframework.stereotype.Service;
import tsapaeva.dev.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Long createUser() {
        return 0L;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
