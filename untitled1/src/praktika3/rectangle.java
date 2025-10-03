package praktika3;

public class rectangle extends shape{
    protected double width;
    protected double length;
    public rectangle(){}

    @Override
    double getArea(){
        return (width*length);
    }

    @Override
    double getPerimeter(){
        return (width*2+length*2);
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
