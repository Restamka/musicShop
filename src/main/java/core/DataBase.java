package core;

import pojo.Item;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List<User> users = new ArrayList<>();
    private static List<Item> items = new ArrayList<>();

    private static void initItems(){
        Item guitar = new Item("guitar", "bass guitar", 600.99);
        Item ukulele = new Item("ukulele", "lil ukulele pink color", 900.99);
        Item piano = new Item("piano", "big piano old", 1000.0);
        Item royal = new Item("royal", "big red royal", 1005.0);
        items.add(guitar);
        items.add(ukulele);
        items.add(piano);
        items.add(royal);
    }

    static {
        initItems();
        Item guitar = new Item("guitar", "bass guitar", 600.99);
        Item ukulele = new Item("ukulele", "lil ukulele pink color", 900.99);
        List<Item> myOrders = new ArrayList<>();
        myOrders.add(guitar);
        myOrders.add(ukulele);

        List<Item> testBasketItems = new ArrayList<>();
        testBasketItems.add(new Item("violin", "white violin", 555.99));

        users.add(new User("Vlad", "+88005553535", "vlador@mail.ru",
                "vlad123", "123456",new ArrayList<>(), new ArrayList<>()));
        users.add(new User("Rustam", "+7589345123", "rust@gmail.ru",
                "rust666", "654321", myOrders, testBasketItems));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Item> getItems() {
        return items;
    }
}
