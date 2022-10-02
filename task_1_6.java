/**
 * Класс упражнения 1.6
 * @author Bogdan Bakun
 * @version 0.1
 */
public class task_1_6 {

    /** Пустое поле-пример */
    private String nothing;

    /**
     * Функция суммы чисел введеных через коммандный рядок
     * @param args - действительные числа
     */
    public static void main(String[] args) {
        double res = 0;
        for (String a: args) {
            res += Double.parseDouble(a);
        }
        System.out.printf("Sum = %f", res);
    }
}
