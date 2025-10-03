package praktika3;

public class circle extends shape{
    protected double radius;
    public circle(){}

    @Override
    double getArea(){
        return (2*3.14*Math.pow(radius, 2));
    }

    @Override
    double getPerimeter(){
        return (2*3.14*radius);
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public circle(double radius){
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
