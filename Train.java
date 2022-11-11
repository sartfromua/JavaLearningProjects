package HW_8;

public class Train {
    int wagonNumber;
    final int WAGON_LIMIT = 100;
    Wagon[] wagons = new Wagon[WAGON_LIMIT];

    public int countPassengers() {
        int pass = 0;
        for (int i=0; i<wagonNumber; i++) {
            pass += wagons[i].passengers;
        }
        return pass;
    }

    public boolean addWagon(Wagon wagon) {
        if (wagonNumber >= WAGON_LIMIT-1) return false;
        wagons[wagonNumber++] = wagon;
        return true;
    }

    public void sortByComfort() {
        if (wagonNumber<=1) return;
        for (int i=wagonNumber-2; i>=0; i--) {
            while (wagons[i].comfortLevel > wagons[i+1].comfortLevel) {
                Wagon tmp = wagons[i].copy();
                wagons[i] = wagons[i+1].copy();
                wagons[i+1] = tmp;
                if (i+2 >= wagonNumber) continue;
                else i++;
            }
        }
    }

    public void printWagonWithPassengers(int from, int to) {
        for (int i=0; i<wagonNumber; i++) {
            if (wagons[i].passengers >= from && wagons[i].passengers <=to) System.out.println("Wagon-"+(i+1)+": "+wagons[i]);
        }
    }

    public void print() {
        for (int i=0; i<wagonNumber; i++) {
            System.out.println("Wagon-"+(i+1)+": "+wagons[i]);
        }
    }
}
