package praktika3;

public class main {
    public static void main(String[] args){
        square s1 = new square();
        s1.setSide(5);
        s1.setColor("red");
        s1.setFilled(true);
        System.out.println("Периметр квадрата = " + s1.getPerimeter());
        System.out.println("Площадь квадрата  = " + s1.getArea());
        rectangle r1 = new rectangle();
        r1.setWidth(5);
        r1.setLength(10);
        r1.setColor("black");
        r1.setFilled(true);
        System.out.println("Периметр прямоугольника = " + r1.getPerimeter());
        System.out.println("Площадь прямоугольника = " + r1.getArea());
        circle c1 = new circle();
        c1.setRadius(5);
        c1.setColor("green");
        c1.setFilled(true);
        System.out.println("Периметр круга = " + c1.getPerimeter());
        System.out.println("Площадь круга = " + c1.getArea());
    }
}
