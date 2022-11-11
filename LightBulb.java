package HW_8;

public class LightBulb implements LightSource{

    boolean position;

    LightBulb() {
        position = false;
    }

    @Override
    public boolean turnOn() {
        if (position) {
            System.out.println("Bulb is already ON!");
            return false;
        }
        position = true;
        System.out.println("Bulb has been turned ON!");
        return true;
    }

    @Override
    public boolean turnOff() {
        if (!position) {
            System.out.println("Bulb is already OFF!");
            return false;
        }
        position = false;
        System.out.println("Bulb has been turned OFF!");
        return true;
    }
}
