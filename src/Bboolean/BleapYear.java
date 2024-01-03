package Bboolean;
import java.util.Scanner;
public class BleapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;

        Scanner input = new Scanner(System.in);

        // Получить год
        System.out.print("Введите год: ");
        year = input.nextInt();

        // Определить, является ли год високосным
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Отобразить, является ли год високосным
        System.out.println(year + " год - високосный? " + isLeapYear);
    }
}
/*
Проектирование
1. Получить год.

2. Определить, является ли год високосным.

   2.1. Если год кратен 4, но не кратен 100 или кратен 400, то он является високосным, иначе — не является високосным.

          isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

3. Отобразить, является ли год високосным.
 */
