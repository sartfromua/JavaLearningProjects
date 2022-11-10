package HW_7;

import java.util.Scanner;

public class Vector {
    int x, y, z;

    static Scanner scan = new Scanner(System.in);

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Vector() {}

    public double weight() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public boolean greaterThen(Vector other) {
        return weight() > other.weight();
    }

    public boolean equalsTo(Vector other) {
        return Math.abs(weight() - other.weight()) < 0.000001;
    }

    public float scalarMult(Vector other) {
        return x*other.x + y*other.y + z*other.z;
    }

    public boolean isOrthogonalTo(Vector other) {
        return Math.abs(scalarMult(other)) <= 0.000001;
    }

    public Vector vectorMult(Vector other) {
        return new Vector(y*other.z - z*other.y, -x*other.z + z*other.x, x*other.y - y*other.x);
    }

    public double scalarMult(Vector v1, Vector v2) {
        return scalarMult(v1.vectorMult(v2));
    }

    public boolean complanarityCheck(Vector v1, Vector v2) {
        return Math.abs(scalarMult(v1, v2)) < 0.000001;
    }

    public void input() {
        System.out.print("x = ");
        x = scan.nextInt();
        System.out.print("y = ");
        y = scan.nextInt();
        System.out.print("z = ");
        z = scan.nextInt();
    }

    @Override
    public String toString() {
        return "("+x+"; "+y+"; "+z+")";
    }

}
