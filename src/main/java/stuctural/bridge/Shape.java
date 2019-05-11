package stuctural.bridge;

public abstract class Shape {

    protected Color color;

    public abstract void draw();

    public Color getColor() {
        return color;
    }
}
