package stuctural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing SQUARE!");
    }
}
