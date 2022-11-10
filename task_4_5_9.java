package HW_7;

import java.util.Scanner;

public class task_4_5_9 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input your circle: ");
        Circle cir = new Circle();
        cir.input();

        System.out.print("Input number of points: ");
        int n = scan.nextInt();
        Point[] points = new Point[n];

        for (int i=0; i<n; i++) {
            System.out.print("Input point #"+(i+1)+": \n");
            points[i] = new Point();
            points[i].input();
        }

        for (int i=0; i<n; i++) {
            if (cir.hasPoint(points[i])) System.out.println("Point "+points[i]+" belongs to your Cirle!");
        }

    }
}
