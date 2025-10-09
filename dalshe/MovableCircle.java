package praktika3.dalshe;

public class MovableCircle {
    private int radius;
    private MovablePoint center; // Правильное объявление переменной MovablePoint

    // Конструктор
    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    // Методы доступа (геттеры и сеттеры) для radius и center
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }
}

