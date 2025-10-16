package praktika43;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor("1920x1080");

        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println(computer.toString());
    }
}

