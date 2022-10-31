package test_package;

import test_package.TestClass;

public class task_4_1_2 {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.setT(1);
        test.setD(1.3);
        test.line = "anything";
        System.out.print(test.t + test.d + " " + test.line);
    }
}
