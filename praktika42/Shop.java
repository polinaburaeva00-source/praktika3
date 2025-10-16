package praktika42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Catalog> catalogs = new ArrayList<>();
    private Cart cart = new Cart();
    private User currentUser;

    public Shop() {
        initializeCatalogs();
    }

    private void initializeCatalogs() {
        Catalog electronics = new Catalog("Электроника");
        electronics.addProduct(new Product("Телевизор", 30000));
        electronics.addProduct(new Product("Смартфон", 25000));

        Catalog clothing = new Catalog("Одежда");
        clothing.addProduct(new Product("Футболка", 1000));
        clothing.addProduct(new Product("Джинсы", 2500));

        catalogs.add(electronics);
        catalogs.add(clothing);
    }

    public void start() {
        authenticateUser();
        showCatalogs();
    }

    private void authenticateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        currentUser = new User(username, password);
        System.out.println("Добро пожаловать, " + username + "!");
    }

    private void showCatalogs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nКаталоги:");
            for (int i = 0; i < catalogs.size(); i++) {
                System.out.println(i + 1 + ". " + catalogs.get(i));
            }
            System.out.println("Введите номер каталога для просмотра товаров или 0 для выхода:");
            int choice = scanner.nextInt();
            if (choice == 0) break;
            if (choice > 0 && choice <= catalogs.size()) {
                showProducts(catalogs.get(choice - 1));
            } else {
                System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private void showProducts(Catalog catalog) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nТовары в категории: " + catalog.getName());
        List<Product> products = catalog.getProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i));
        }
        System.out.println("Введите номер товара для добавления в корзину или 0 для возврата:");

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= products.size()) {
            cart.addProduct(products.get(choice - 1));
            System.out.println("Товар добавлен в корзину!");
        } else if (choice == 0) {
            return;
        } else {
            System.out.println("Некорректный выбор. Попробуйте снова.");
        }

        showCart();
    }

    private void showCart() {
        Scanner scanner = new Scanner(System.in);
        if (cart.getItems().isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("\nТовары в корзине:");
            for (Product product : cart.getItems()) {
                System.out.println(product);
            }
            System.out.printf("Итого: %.2f руб.\n", cart.getTotalPrice());
            System.out.println("1. Купить товары");
            System.out.println("2. Очистить корзину");
            System.out.println("0. Вернуться к каталогам");

            int choice = scanner.nextInt();
            if (choice == 1) {
                completePurchase();
            } else if (choice == 2) {
                cart.clear();
                System.out.println("Корзина очищена.");
            }
        }
    }

    private void completePurchase() {
        System.out.printf("Вы купили следующие товары на сумму %.2f руб.\n", cart.getTotalPrice());
        cart.clear(); // очищаем корзину после покупки
    }
}


