package HW_8;

public class task_4_7_16 {
    public static void main(String[] args) {
        DeskLamp deskLamp = new DeskLamp();
        deskLamp.turnOn();
        deskLamp.turnOff();
        if (!deskLamp.turnOff()) deskLamp.turnOn();
        deskLamp.colour = "blue";
        deskLamp.size = 10;
        deskLamp.price = 20;
        System.out.println();

        LightSource source = new DeskLamp();
        source.turnOn();
        if (!source.turnOff()) source.turnOn();
//        Низя
//        bulb.colour = "none";

    }
}
