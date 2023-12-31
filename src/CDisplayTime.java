import java.util.Scanner

public class CDisplayTime {
    public static void main(String[] args) {
        int seconds, minutes, remainingSeconds;

        Scanner input = new Scanner(System.in);

        // Получить общее время в секундах
        System.out.print("Введите общее время в секундах: ");
        seconds = input.nextInt();

        // Вычислить время в минутах
        minutes = seconds / 60;

        // Вычислить оставшееся кол-во секунд в минуте
        remainingSeconds = seconds % 60;

        // Отобразить время в минутах и оставшихся секундах
        System.out.println(seconds + " сек. содержит " + minutes +
                " мин. и " + remainingSeconds + " сек.");
    }
}
/*
Метод nextInt() (строчка №11) считывает целое число в переменную seconds. В строчке №14 вычисляются минуты с помощью выражения seconds / 60.
 В строчке №17 (seconds % 60) вычисляется кол-во секунд, оставшихся в минуте.
Операторы + и - могут быть как унарными, так и бинарными. Унарный оператор имеет только один операнд, а бинарный оператор имеет два операнда.
Например, оператор - в -5 является унарным оператором для отрицания числа 5, тогда как оператор - в 4 - 5 является бинарным оператором
для вычитания 5 из 4.
 */