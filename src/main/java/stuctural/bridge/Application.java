package stuctural.bridge;


public class Application {
    /*
     *      Bridge - Client code
     *
     *      Separating one or more classes for 2 hierarchy: abstraction (SHAPE.CLASS) and implementation (COLOR.CLASS).
     *
     *      In result we see 2 hierarchy: Shape and Color
     *                    instead 1 with: BlackSquare, RedSquare, BlackCircle, RedCircle.
     *      where Shape figures gain Color inside.
     *
     */
    public static void main(String[] args) {

        Color black = new Black();

        Shape blackSquare = new Square(black);

        blackSquare.draw();

        blackSquare.getColor().show();
    }
}
