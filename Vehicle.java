public class Vehicle {
    private final String engineType;
    private final String transmission;
    private final String color;
    private final boolean hasSunroof;
    private final int numberOfDoors;

    private Vehicle(Builder builder) {
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }

    public static class Builder {
        // Fields matching Vehicle class
        private String engineType;
        private String transmission;
        private String color;
        private boolean hasSunroof;
        private int numberOfDoors;


        public Builder withEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    @Override
    public String toString() {
        return "Vehicle [engineType=" + engineType + ", transmission=" + transmission +
                ", color=" + color + ", hasSunroof=" + hasSunroof +
                ", numberOfDoors=" + numberOfDoors + "]";
    }
}

