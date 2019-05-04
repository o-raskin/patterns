package creational.abstractfactory.phone;

public class PorschePhone implements Phone {
    public void call(String number) {
        System.out.println("PorschePhone call + " + number);
    }
}
