//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.Scanner;

public class mass {
    public static void main(String[] args) {
        System.out.println("Введите массив целых чисел, разделённых одним пробелом");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();

        String[] mass_input = numbers.split(" ");

        for (String num : mass_input) {
            int number = Integer.parseInt(num.trim());
            if (number % 3 == 0) {
                System.out.printf("%d ", number);
            }
        }
    }
}
