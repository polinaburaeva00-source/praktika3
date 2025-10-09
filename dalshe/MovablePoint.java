package praktika3.dalshe;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.x = this.x+this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y+this.ySpeed;
    }
    @Override
    public void moveLeft() {
        this.x = this.x+this.xSpeed;
    }
    @Override
    public void moveRight() {
        this.x = this.x+this.xSpeed;
    }
}