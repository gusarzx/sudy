package Project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в долларах: ");
        dollars = input.nextInt();

        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.print(dollars + "$, " + "это " + roubles + " в рублях.");
    }
}
