package tsapaeva.dev.listener;

import org.springframework.stereotype.Component;
import tsapaeva.dev.enums.OperationType;
import tsapaeva.dev.service.OperationSender;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class OperationsConsoleListener {

    private final Map<OperationType, OperationSender> operationSenders;

    public OperationsConsoleListener(List<OperationSender> operationSenders) {
        this.operationSenders = operationSenders.stream().collect(Collectors.toMap(OperationSender::getType, operationSender -> operationSender));
    }

    public void start() {
        System.out.println("""
                Please enter one of operation type:
                    -ACCOUNT_CREATE
                    -SHOW_ALL_USERS
                    -ACCOUNT_CLOSE
                    -ACCOUNT_WITHDRAW
                    -ACCOUNT_DEPOSIT
                    -ACCOUNT_TRANSFER
                    -USER_CREATE
                """);
        Scanner scanner = new Scanner(System.in);
    }

    public void sendOperation(OperationType operationType) {
        var sender = operationSenders.get(operationType);

        if (sender == null) throw new IllegalArgumentException("Operation not found: " + operationType);

        sender.execute();
    }

}
