package test_package;

// + на паре сделал


public class TestClass {
    public double d;
    int t;
    protected String line;
    private int s;

    public void setD(double d) {
        this.d = d;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    protected void setT(int t) {
        this.t = t;
    }
}

class second {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.line = "smth";
        test.setS(1);
        System.out.print(test.line + test.getS());
    }
}
