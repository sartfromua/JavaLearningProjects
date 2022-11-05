package CW_7;

import java.util.Scanner;

public class Fraction {
    int n,m;

    public Fraction() {}

    public Fraction(int n, int m) {
        this.n = n;
        this.m = m;
        update();
    }

    void update() {
        int g = gcd(n, m);
        if (g > 1) {
            n /= g;
            m /= g;
        }
        if (m<0) {
            m *= -1;
            n *= -1;
        }
    }

    int gcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public Fraction add(Fraction other) {
        int n = this.n, m = this.m;
        m *= other.m;
        n = this.n*other.m + other.n*this.m;

        return new Fraction(n, m);
    }

    public Fraction multiply(Fraction other) {
        int n = this.n, m = this.m;
        n *= other.n;
        m *= other.m;
        return new Fraction(n, m);
    }

    public Fraction subtract(Fraction other){
        int n = this.n, m = this.m;
        if (this.m == other.m) n -= other.m;
        else {
            m *= other.m;
            n = n*other.m - other.n*m;
        }
        return new Fraction(n, m);
    }

    public Fraction division(Fraction other) {
        int n = this.n, m = this.m;
        n *= other.m;
        m *= other.n;
        return new Fraction(n, m);
    }

    @Override
    public String toString() {
        if (n==0) return "0";
        if (m==1) return Integer.toString(n);
        return Integer.toString(n) + "/" + Integer.toString(m);
    }

    static Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.print("\nn: ");
        n = scan.nextInt();
        System.out.print("m: ");
        m = scan.nextInt();
        update();
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.input();
        f2.input();
        System.out.print(f1.add(f2));

    }
}
