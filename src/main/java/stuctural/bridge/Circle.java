package stuctural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing CIRCLE!");
    }
}
