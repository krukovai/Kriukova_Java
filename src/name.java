//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

import java.util.Objects;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();

        if (Objects.equals(name, "Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
