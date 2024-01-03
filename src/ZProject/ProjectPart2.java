package ZProject;

import java.util.Scanner;

public class ProjectPart2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        int dollars, digit;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в долларах: ");
        dollars = input.nextInt();

        System.out.print(dollars);

        if (5 <= dollars && dollars <=20) {
            System.out.print(" американских долларов равны ");
        } else {
            digit = dollars % 10; // формула для определения последней цифры

            if(digit == 1)
                System.out.print(" американский доллар равен ");
            else if (2 <= digit && digit <= 4)
                System.out.print(" американских доллара равны ");
            else
                System.out.print(" американских долларов равны ");
        }

        roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.println((int) (roubles * 100) / 100.0 + " рублей.");
    }
}

/*
Постановка задачи.
Перепишите программу, которая конвертирует сумму денег из американских долларов в российские рубли по курсу покупки
72.12, добавив структуру выбора для принятия решений об окончаниях входной валюты в зависимости от ее значения.

Анализ задачи.
Для того чтобы определить окончание, например, для американских долларов (американский доллар / американских доллара
/ американских долларов) в зависимости от их суммы, необходимо вычислить последнюю цифру входной суммы. Это можно
выполнить с помощью арифметической операции целочисленного остатка от деления суммы в американских долларах на 10.
В случае, если последняя цифра равна 1, то окончание – американский доллар; если последняя цифра находится в диапазоне
от 2 до 4 включительно, то окончание – американских доллара; если последняя цифра находится в диапазоне от 5 до 9 или
является 0, то окончание – американских долларов. Но у этого правила есть исключения, когда для всех сумм в американских
долларах в диапазоне от 11 до 14, от 111 до 114, от 211 до 214 и т.д., окончание – американских долларов. Мы рассмотрим
исключения только из диапазона от 11 до 14, чтобы не усложнять алгоритм решения задачи.
Константы задачи:
final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки

Входные данные задачи:
int dollars; // сумма денег в американских долларах

Переменные программы:
int digit; // последняя цифра dollars

Выходные данные задачи:
double roubles; // сумма денег в российских рублях

Соответствующие формулы:
roubles = ROUBLES_PER_DOLLAR * dollars;
digit = dollars % 10;

Проектирование.
Алгоритм решения задачи с уточнениями:
1. Получить сумму денег в американских долларах.
2. Отобразить сумму денег в американских долларах с правильным окончанием.
   2.1. Отобразить сумму денег в американских долларах.
   2.2. Если сумма денег в американских долларах >= 5 и <= 20, то отобразить «американских долларов равны».
   2.3. Иначе
      2.3.1. Определить последнюю цифру суммы денег в американских долларах.
         2.3.1.1. digit = dollars % 10;
      2.3.2. Если последняя цифра == 1, то отобразить «американский доллар равен».
      2.3.3. Иначе если последняя цифра >= 2 и <= 4, то отобразить «американских доллара равны».
      2.3.4. Иначе отобразить «американских долларов равны».
3. Конвертировать сумму денег в российские рубли.
   3.1. roubles = ROUBLES_PER_DOLLAR * dollars;
4. Отобразить сумму денег в российских рублях в пользу покупателя.
 */
