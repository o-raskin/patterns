package creational.builder.simple;

public class Car {

    private String model;

    private String color;

    private Car() {
    }

    public Car(Builder builder) {
        this.color = builder.getColor();
        this.model = builder.getModel();
    }

    public static class Builder {

        private String model;

        private String color = "green";

        public Builder(String model) {
            this.model = model;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
