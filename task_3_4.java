import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.Math;

public class task_3_4 {
    public static void main(String[] args) {
        float n1f = 10^(-4), n2f = 2.33E5F;
        /* Иначе выдает ошибку*/
        double n1d = 10^(-4), n2d = 2.33E5, n3d = Math.PI, n4d = Math.E, n5d = Math.log(100);
        System.out.printf("%f %f\n%f %f %f %f %f",n1f,n2f,n1d,n2d,n3d,n4d,n5d);
    }
}
