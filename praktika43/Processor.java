package praktika43;

public class Processor {
    private String model;
    private double speed; // в гигагерцах

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Скорость: " + speed + " ГГц";
    }
}

