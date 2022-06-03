package pojo;

import java.util.List;

public class User {
    private String name;
    private String phone;
    private String email;
    private String login;
    private String pass;
    private List<Item> orders;
    private List<Item> basket;

    public User(String name, String phone, String email, String login, String pass, List<Item> orders, List<Item> basket) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.pass = pass;
        this.orders = orders;
        this.basket = basket;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Item> getOrders() {
        return orders;
    }

    public void setOrders(List<Item> orders) {
        this.orders = orders;
    }
}
