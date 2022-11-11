package HW_8;

import java.util.Scanner;

public class task_4_6_8 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Train t = new Train();
        t.addWagon(new LuggageWagon(75));
        t.addWagon(new PassengerWagon(70, 2,20));
        t.addWagon(new LuggageWagon(90));
        t.addWagon(new PassengerWagon(20,4,5));
        t.addWagon(new TechnicalWagon());
        t.addWagon(new PassengerWagon(50,3,15));
        t.addWagon(new TechnicalWagon());
        t.addWagon(new DriversWagon());
        t.print();
        System.out.println("\nSorted by comfort:");
        t.sortByComfort();
        t.print();

        System.out.print("\nGetting wagons with number of passengers from: ");
        int from = scan.nextInt();
        System.out.print("to: ");
        int to = scan.nextInt();
        t.printWagonWithPassengers(from, to);

    }
}
