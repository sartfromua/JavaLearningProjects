package HW_6;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4_3_3 {
    public static class quadraticEq {
        int a, b, c;

        quadraticEq(int[] koefs) {
            a = koefs[0];
            b = koefs[1];
            c = koefs[3];
        }

        quadraticEq() {}

        public quadraticEq(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double[] getRoots() {
            double D = b*b - 4*a*c;
            if (D < 0) return null;
            if (D == 0) return new double[]{-b/2.0/a, Double.MIN_VALUE};
            else return new double[]{(D-b)/2.0/a, (-D-b)/2.0/a};
        }

        public double[] getExtremum() {
            if (a == 0) return null;
            double x = -b / (2.0*a);
            double y = a*x*x + b*x + c;
            return new double[]{x, y};
        }

        public double[] getGrowthInterval() {
            if (a==0 && b<0) return null;
            if (a==0) return new double[]{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
            if (a<0) return new double[]{Double.NEGATIVE_INFINITY, getExtremum()[0]};
            else return new double[]{getExtremum()[0], Double.POSITIVE_INFINITY};
        }

        public double[] getDeclineInterval() {
            if (a==0 && b>0) return null;
            if (a==0) return new double[]{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
            if (a<0) return new double[]{getExtremum()[0], Double.POSITIVE_INFINITY};
            else return new double[]{Double.NEGATIVE_INFINITY, getExtremum()[0]};
        }

        @Override
        public String toString() {
            String res = "y = ";
            if (a != 0) res += a +"x^2 ";
            if (b > 0) res += "+";
            res +=  b + "x ";
            if (c > 0) res += "+";
            res += c;
            return res;
        }
    }

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scan.nextInt();
        quadraticEq[] examples = new quadraticEq[n];
        for (int i=0; i<n; i++) {
            examples[i] = new quadraticEq(rand.nextInt(-10,10), rand.nextInt(-10,10),
                    rand.nextInt(-10,10));
        }
        double minRoot = Double.MAX_VALUE, maxRoot = Double.MIN_VALUE;
        int minRootInd = 0, maxRootInd = 0;
        System.out.println("All roots: ");
        for (int i=0; i<n; i++) {
            if (examples[i].getRoots() != null) {
                double[] roots = examples[i].getRoots();
                for (double root: roots) {
                    if (root == Double.POSITIVE_INFINITY || root == Double.NEGATIVE_INFINITY) continue;
                    System.out.print(root+"; ");
                    if (root > maxRoot) {
                        maxRootInd = i;
                        maxRoot = root;
                    }
                    if (root < minRoot) {
                        minRootInd = i;
                        minRoot = root;
                    }
                }
            }
        }
        System.out.println("\nInfo of Equlity with MIN root:");
        System.out.println(examples[minRootInd]);
        System.out.println("Roots: " + Arrays.toString(examples[minRootInd].getRoots()));
        System.out.println("Extremum: " + Arrays.toString(examples[minRootInd].getExtremum()));
        System.out.println("Decline inerval: " + Arrays.toString(examples[minRootInd].getDeclineInterval()));
        System.out.println("Growth inerval: " + Arrays.toString(examples[minRootInd].getGrowthInterval()));

        System.out.println("\nInfo of Equlity with MAX root:");
        System.out.println(examples[maxRootInd]);
        System.out.println("Roots: " + Arrays.toString(examples[maxRootInd].getRoots()));
        System.out.println("Extremum: " + Arrays.toString(examples[maxRootInd].getExtremum()));
        System.out.println("Decline inerval: " + Arrays.toString(examples[maxRootInd].getDeclineInterval()));
        System.out.println("Growth inerval: " + Arrays.toString(examples[maxRootInd].getGrowthInterval()));
    }
}
