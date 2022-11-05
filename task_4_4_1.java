package CW_7;

import java.util.Scanner;

public class task_4_4_1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Number of polynoms = ");
        int n = scan.nextInt();
        Polynom[] polys = new Polynom[n];
        for (int i=0; i<n; i++) {
            polys[i] = new Polynom();
            polys[i].input();
        }
        Polynom res = new Polynom(polys[0].rank);
        System.out.println("Polynoms: ");
        for (int i=0; i<n; i++) {
            System.out.println(polys[i]);
            res = res.add(polys[i]);
        }
        System.out.print("Sum: " + res);
    }
}
