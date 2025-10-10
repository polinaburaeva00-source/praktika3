package pr4;

public class Main {
    public static void main(String[] args) {
        // 1) Ваше любимое время года
        season favoriteSeason = season.SUMMER;
        System.out.println("Ваше любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());
        // 2) Метод с оператором switch
        seasonDescription.describeSeason(favoriteSeason);
        // 3) Цикл для вывода информации о всех сезонах
        seasonDescription.printAllSeasons();
    }
}
