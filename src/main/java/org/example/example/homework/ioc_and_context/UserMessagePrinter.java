package org.example.example.homework.ioc_and_context;

public class UserMessagePrinter {

    private final UserMessageService userMessageService;

    public UserMessagePrinter(UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        System.out.println(userMessageService.createMessage(name));
    }
}
