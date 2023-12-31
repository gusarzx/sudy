package ABasics;

import java.util.Scanner;

public class CComputeExchange {
    public static void main(String[] args) {
        int amount, numberOf5000Roubles, numberOf2000Roubles,
                numberOf1000Roubles, numberOf500Roubles, numberOf100Roubles,
                numberOf200Roubles, numberOf50Roubles;

        Scanner input = new Scanner(System.in);

        // Получить сумму в рублях
        System.out.print("Введите сумму в рублях, кратную 50: ");
        amount = input.nextInt();

        // Вычислить количество 5 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf5000Roubles = amount / 5000;
        amount %= 5000;

        // Вычислить количество 2 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf2000Roubles = amount / 2000;
        amount %= 2000;

        // Вычислить количество 1 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf1000Roubles = amount / 1000;
        amount %= 1000;

        // Вычислить количество 500 руб. купюр и обновить оставшуюся сумму
        numberOf500Roubles = amount / 500;
        amount %= 500;

        // Вычислить количество 200 руб. купюр и обновить оставшуюся сумму
        numberOf200Roubles = amount / 200;
        amount %= 200;

        // Вычислить количество 100 руб. купюр и обновить оставшуюся сумму
        numberOf100Roubles = amount / 100;
        amount %= 100;

        // Вычислить количество 50 руб. купюр
        numberOf50Roubles = amount / 50;

        // Отобразить количество купюр каждого достоинства
        System.out.println("Ваша сумма состоит из");
        System.out.println("    " + numberOf5000Roubles + " шт. 5-тыс. руб. купюр,");
        System.out.println("    " + numberOf2000Roubles + " шт. 2-тыс. руб. купюр,");
        System.out.println("    " + numberOf1000Roubles + " шт. 1-тыс. руб. купюр,");
        System.out.println("    " + numberOf500Roubles + " шт. 500-руб. купюр,");
        System.out.println("    " + numberOf200Roubles + " шт. 200-руб. купюр,");
        System.out.println("    " + numberOf100Roubles + " шт. 100-руб. купюр,");
        System.out.println("    " + numberOf50Roubles + " шт. 50-руб. купюр.");
    }
}
/*
1. Получить сумму в рублях.

2. Вычислить количество 5 тыс. руб. купюр и обновить оставшуюся сумму.

   2.1. numberOf5000Roubles = amount / 5000;

   2.2. amount %= 5000;

3. Вычислить количество 2 тыс. руб. купюр и обновить оставшуюся сумму.

   3.1. numberOf2000Roubles = amount / 2000;

   3.2. amount %= 2000;

4. Вычислить количество 1 тыс. руб. купюр и обновить оставшуюся сумму.

   4.1. numberOf1000Roubles = amount / 1000;

   4.2. amount %= 1000;

5. Вычислить количество 500 руб. купюр и обновить оставшуюся сумму.

   5.1. numberOf500Roubles = amount / 500;

   5.2. amount %= 500;

6. Вычислить количество 200 руб. купюр и обновить оставшуюся сумму.

   6.1. numberOf200Roubles = amount / 200;

   6.2. amount %= 200;

7. Вычислить количество 100 руб. купюр и обновить оставшуюся сумму.

   7.1. numberOf100Roubles = amount / 100;

   7.2. amount %= 100;

8. Вычислить количество 50 руб. купюр.

   8.1. numberOf50Roubles = amount / 50;

9. Отобразить количество купюр каждого достоинства.
 */