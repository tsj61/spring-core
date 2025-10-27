package tsapaeva.dev.service;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public Long createAccount() {
        return 0L;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public boolean depositAccount(Long id, Double sum) {
        return false;
    }

    @Override
    public boolean transferAccount(Long senderId, Long recipientId, Double sum) {
        return false;
    }

    @Override
    public boolean withdrawAccount(Long id, Double sum) {
        return false;
    }
}
