package CW_7;

import java.util.Scanner;

public class Polynom {
    Fraction[] koefs;
    int rank;

    public Polynom() {rank =0;}

    public Polynom(int rank) {
        this.rank =rank;
        koefs = new Fraction[rank];
        for (int i=0; i<rank; i++) koefs[i] = new Fraction(0, 1);
    }

    public Polynom(Fraction[] koefs) {
        this.koefs = koefs;
        rank = koefs.length;
    }

    public Polynom add(Polynom other) {
        Polynom res = new Polynom();
        // Считать с конца

        if (other.rank <= rank) {
            res.rank = rank;
            res.koefs = new Fraction[rank];
            for (int i = 0; i < rank; i++) {
                res.koefs[i] = koefs[i];
            }
            for (int i = 0; i < other.rank; i++) {
                res.koefs[i] = res.koefs[i].add(other.koefs[i]);
            }
        } else {
            res.rank = other.rank;
            res.koefs = new Fraction[other.rank];
            for (int i = 0; i < other.rank; i++) {
                res.koefs[i] = other.koefs[i];
            }
            for (int i = 0; i < rank; i++) {
                res.koefs[i] = res.koefs[i].add(other.koefs[i]);
            }
        }
        return res;
    }
    static Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("Rank of polynom: ");
        rank = scan.nextInt()+1;
        koefs = new Fraction[rank];
        for (int i=rank-1; i>=0; i--) {
            for (int j=rank-1; j>=i; j--) {
                if (j!=rank-1) System.out.print("+ ");
                if (koefs[j] != null) System.out.print(koefs[j] + "*x^" + (j) + " ");
                else System.out.print("__*x^" + (j) + " ");
            }
            koefs[i] = new Fraction();
            koefs[i].input();
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i=rank-1; i>=0; i--) {
            res.append(koefs[i].toString());
            if (i!=0) res.append("*x^").append(Integer.toString(i)).append(" + ");
        }
        return res.toString();
    }


    public static void main(String[] args) {
        Polynom p = new Polynom();
        p.input();
        System.out.print(p);
    }
}
