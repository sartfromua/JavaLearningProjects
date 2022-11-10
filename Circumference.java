package HW_7;

public class Circumference extends Point{
    double radius;

    public Circumference(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Radius = ");
        radius = scan.nextDouble();
    }

    public Circumference() {}

    public void setRadius(double r) {
        radius = r;
    }
}
