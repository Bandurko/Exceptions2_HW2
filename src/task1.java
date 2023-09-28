/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println("Вы ввели число: " + number + ". Все верно.");
                return;
            } catch (Exception NumberFormat) {
                System.out.println("Текст вводить нельзя! Только числа! Попробуйте еще раз.");
            }
        }
    }
}