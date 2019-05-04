package creational.prototype;

public class Car implements Cloneable {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
