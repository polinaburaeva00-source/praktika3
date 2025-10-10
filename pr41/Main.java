package pr41;

public class Main {
    public static void main(String[] args) {
        // Создание массива с различной одеждой
        Clothes[] wardrobe = {
                new TShirt(Size.M, 1500, "Красный"),
                new Pants(Size.L, 2000, "Синий"),
                new Skirt(Size.S, 1200, "Черный"),
                new Tie(Size.M, 800, "Серый"),
        };

        // Создание объекта ателье
        Atelier atelier = new Atelier();

        // Одеваем женщин
        System.out.println("Женская одежда:");
        atelier.dressWomen(wardrobe);

        // Одеваем мужчин
        System.out.println("Мужская одежда:");
        atelier.dressMan(wardrobe);
    }
}
