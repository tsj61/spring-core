package org.example.homework.aop;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private String userName;
    private String userEmail;

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @NotNullArgs
    public void updateName(String newName) {
        setUserName(newName);
        System.out.println("New name: " + getUserName());
    }

    @NotNullArgs
    public void updateEmail(String newEmail) {
        setUserEmail(newEmail);
        System.out.println("New email: " + getUserEmail());
    }

}
