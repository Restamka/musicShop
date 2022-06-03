package core;

import pojo.User;

import java.util.Scanner;

public class Authorization {

    public User getAuthedUser(String login, String pass){
         return DataBase.getUsers().stream()
                .filter(x->x.getLogin().equals(login))
                 .filter(x->x.getPass().equals(pass))
                 .findFirst().orElse(null);
    }

    public User auth(Scanner scanner){
        System.out.println("Enter login: ");
        String loginType = scanner.nextLine();
        System.out.println("Enter pass: ");
        String passType = scanner.nextLine();
        return getAuthedUser(loginType, passType);
    }
}
