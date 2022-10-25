package HW_5;

public class task_3_3_9 {
    static class someClass{
        static int i = 0;
        void method1(){
            System.out.println("Using \"method2()\"");
            method2();
            System.out.println("Using \"this.method2()\"");
            this.method2();
        }

        void method2(){
            i++;
            System.out.println("Calling method2! i = " + i);
        }
    }

    public static void main(String[] args) {
        someClass cl1 = new someClass();
        cl1.method2();
        cl1.method1();
    }
}
