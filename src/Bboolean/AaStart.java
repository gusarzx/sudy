package Bboolean;

import java.util.Scanner; // Scanner находится в пакете java.util

public class AaStart {
    public static void main(String[] args) {
        double radius; // радиус круга
        double area; // площадь круга

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить (от пользователя) радиус круга
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Некорректные входные данные.");
        } else {
            area = 3.14159 * radius * radius;
            System.out.println("Площадь круга для радиуса " +
                    radius + " равна " + area + ".");
        }
        double radiusz = 1;
        System.out.println(radiusz > 0);
    }
}
/*
Java     Математический        Имя                 Пример
оператор      знак           оператора          (radius = 5)  Результат
   <	       <	        Меньше              radius < 0     false
   <=	       ≤	        Меньше или равно    radius <= 0    false
   >	       >	        Больше              radius > 0     true
   >=	       ≥	        Больше или равно    radius >= 0    true
   ==	       =	        Равно               radius == 0    false
   !=	       ≠	        Не равно            radius != 0    true
 */
