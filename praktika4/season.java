package praktika4;

public enum season {
    WINTER(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemperature;

    season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}