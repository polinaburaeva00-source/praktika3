package praktika43;

public class Memory {
    private int size; // в гигабайтах

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + size + " ГБ";
    }
}

