package praktika3.dalshe;

public class Main {
    public static void main(String[] args) {
        MovablePoint points = new MovablePoint(0, 5, 3, 2);
        System.out.println(points);
        points.moveRight();
        points.moveUp();
        System.out.println(points);

        MovableCircle cur = new MovableCircle(5, new MovablePoint(0, 5, 1, 2));
    }
}

