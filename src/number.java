//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        if (num > 7)
            System.out.println("Привет");
    }
}