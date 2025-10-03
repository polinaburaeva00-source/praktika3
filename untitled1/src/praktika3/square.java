package praktika3;

public class square extends shape{
    protected double side;
    public square(){}
    @Override
    double getArea(){
        return (side*side);
    }

    @Override
    double getPerimeter(){
        return (side*4);
    }

    @Override
    public String toString() {
        return "square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public square(double side){
        this.side = side;
    }
    public square(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
