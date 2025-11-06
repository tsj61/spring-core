package tsapaeva.dev.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Long id;
    private Long userId;
    private Double moneyAccount;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(userId, account.userId) &&
                Objects.equals(moneyAccount, account.moneyAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, moneyAccount);
    }
}
