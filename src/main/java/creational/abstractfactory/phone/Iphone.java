package creational.abstractfactory.phone;

public class Iphone implements Phone {
    public void call(String number) {
        System.out.println("Iphone call: " + number);
    }
}
