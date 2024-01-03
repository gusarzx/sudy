package Bboolean;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        double pay, score, num;



        Scanner input = new Scanner(System.in);

        System.out.print("Введите значние pay: ");
        pay = input.nextDouble();
        System.out.print("Введите значние score: ");
        score = input.nextDouble();

        if (score > 90) {
            System.out.println("Pay = " + (pay + pay * 3 / 100)); // or pay *= 1.03;
        } else {
            System.out.println("Pay = " + pay + (pay * 1 / 100)); // or pay *= 1.01
        }

        System.out.print("Введите значние pay: ");
        num = input.nextDouble();

        if (num > 1 && num < 100) {
            System.out.println();
        }

    }

}
