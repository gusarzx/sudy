package ABasics;

import java.util.Scanner;// Scanner находится в пакете java.util

public class BComputeAreaWithConsoleInputMany {
    public static void main(String[] args) {
        double number1, number2, number3, average; // объявление переменных

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить три числа
        System.out.print("Введите три числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        // Вычислить среднее арифметическое трех чисел
        average = (number1 + number2 + number3) / 3;

        // Отобразить среднее арифметическое трех чисел
        System.out.println("Среднее арифметическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
    }

}
/*
Здесь предложения для импорта класса Scanner (строчка №1) и создания объекта типа Scanner (строчка №7) те же, что и в предыдущей программе
ComputeAreaWithConsoleInput, а также во всех новых программах, которые вы будете писать для считывания входных данных с клавиатуры.
В строчке №10 пользователю предлагается ввести три числа. Введенные числа считываются в строчках №11–13.
Необходимо ввести три числа, разделенных пробелами, и только затем нажать клавишу Enter.
При вводе значения, отличного от числового, возникнет ошибка во время выполнения. В следующих курсах вы узнаете, как
обрабатывать исключения, чтобы программа могла продолжать работать.
 */