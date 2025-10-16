package praktika43;

public class Monitor {
    private String resolution; // разрешение экрана

    public Monitor(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Монитор с разрешением: " + resolution;
    }
}

