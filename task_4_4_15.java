package HW_7;

import java.util.Scanner;

public class task_4_4_15 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of vectors: ");
        int m = scan.nextInt();
//        Vector  v1 = new Vector(-1, 2, 3),
//                v2 = new Vector(-3, 1, 1),
//                v3 = new Vector(5, 0, 1),
//                v4 = new Vector(3, 3, 3);
        Vector[] vectors = new Vector[m];

        for (int k=0; k<m;k++) {
            System.out.println("Input vector #"+(k+1));
            vectors[k] = new Vector();
            vectors[k].input();
        }

        for (int i=0; i<m;i++) {
            for (int j=i+1; j<m;j++) {
                for (int k=j+1; k<m;k++) {
                    if (vectors[i].complanarityCheck(vectors[j], vectors[k]))
                        System.out.println("Vectors " + vectors[i] + ", " + vectors[j] + ", " + vectors[k] + " are complanar!");
                }
            }
        }
    }
}
