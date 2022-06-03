package core;

import pojo.Item;
import pojo.User;

import java.util.Scanner;

/**
 * логика консоли
 */
public class ConsoleLogic {
    private final Scanner scanner = new Scanner(System.in);
    /**
     * экхемпляр пользователя
     */
    private User user;

    /**
     * показать список товаров
     */

    private void showItems(){
        DataBase.getItems().forEach(System.out::println);
    }

    /**
     * показать историю заказов
     */
    private void showOrdersHistory(){
        user.getOrders().forEach(System.out::println);
    }

    /**
     * товары в карзине
     */

    private void showBasketItems(){
        user.getBasket().forEach(System.out::println);
    }

    /**
     * авотризация
     */
    public void auth(){
        user = new Authorization().auth(scanner);
        if(user==null){
            System.out.println("Not authed, bye!");
            return;
        }
        System.out.println("Welcome");
        showMenu();
    }

    /**
     * добавление в корзину
     */
    private void addItemToBasket(){
        showItems();
        System.out.println("Enter item name: ");
        String name =  scanner.next();;
        Item item = DataBase.getItems().stream().filter(x->x.getName().contains(name)).findFirst()
                .orElseThrow(() -> new RuntimeException("No items"));
        user.getBasket().add(item);
    }

    /**
     * удаление из корзины
     */
    private void deleteItemFromBasket(){
        showBasketItems();
        System.out.println("Enter item name: ");
        String name =  scanner.next();
        Item item = user.getBasket().stream().filter(x->x.getName().contains(name)).findFirst()
                .orElseThrow(() -> new RuntimeException("No items"));
        user.getBasket().remove(item);
    }

    /**
     * просмотр меню
     */
    private void showMenu(){
        System.out.println("1 - посмотреть товары в магазине\n2 - посмотреть товары в корзине" +
                "\n3 - историй покупок\n4 - добавить товар в корзину\n5 - удалить товар из корзины\n6 - выход");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                showItems();
                break;
            case 2:
                showBasketItems();
                break;
            case 3:
                showOrdersHistory();
                break;
            case 4:
                addItemToBasket();
                break;
            case 5:
                deleteItemFromBasket();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("need to type number");
                break;
        }
        showMenu();
    }
}
