package ZProject;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        int dollars;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в долларах: ");
        dollars = input.nextInt();

        roubles = ROUBLES_PER_DOLLAR * dollars;


        System.out.print(dollars + "американских доллара, это " + (int) (roubles * 100) / 100.0 + " рублей.");
    }
}

/*
Постановка задачи.
Напишите программу, которая конвертирует сумму денег из американских долларов в российские рубли по курсу покупки 72.12.

Анализ задачи.
Константы задачи:
final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки

Входные данные задачи:
int dollars; // сумма денег в американских долларах

Выходные данные задачи:
double roubles; // сумма денег в российских рублях

Соответствующие формулы:
roubles = ROUBLES_PER_DOLLAR * dollars;

Проектирование.
Алгоритм решения задачи с уточнениями:
1. Получить сумму денег в американских долларах.
2. Конвертировать сумму денег в российские рубли.
  2.1. roubles = ROUBLES_PER_DOLLAR * dollars;
3. Отобразить сумму денег в российских рублях в пользу покупателя.
 */