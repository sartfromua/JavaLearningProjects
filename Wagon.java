package HW_8;

public class Wagon {
    int passengers, comfortLevel, baggage;

    public Wagon() {
    }

    public Wagon(int passengersNumber, int comfortLevel, int baggage) {
        this.passengers = passengersNumber;
        this.comfortLevel = comfortLevel;
        this.baggage = baggage;
    }

    public Wagon copy() {
        return new Wagon(passengers, comfortLevel, baggage);
    }

    @Override
    public String toString() {
        return "passengers - "+passengers+
                ", comfort level - "+comfortLevel +
                ", baggage - "+baggage;
    }
}
