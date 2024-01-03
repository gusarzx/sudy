package Bboolean;
import java.util.Scanner;

public class BcomputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 метр содержит 100 см
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        // Получить вес в килограммах
        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        // Получить рост в сантиметрах
        System.out.print("Введите рост в сантиметрах: ");
        height = input.nextDouble();

        // Вычислить BMI
        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        // Отобразить и интерпретировать BMI
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}
/*
Алгоритм с уточнениями:

1. Получить вес в килограммах.

2. Получить рост в сантиметрах.

3. Вычислить BMI.

   3.1. bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

4. Отобразить и интерпретировать BMI.

   4.1. Отобразить BMI.

   4.2. Если BMI < 18.5, то отобразить "Недостаточный вес".

   4.3. Иначе, если BMI < 25, то отобразить "Норма".

   4.4. Иначе, если BMI < 30, то отобразить "Избыточный вес".

   4.5. Иначе отобразить "Ожирение".
 */