/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите любой текст: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            try{
                if(str.isEmpty()) {
                    throw new Exception();
                }
                System.out.println("Вы напечатали текст: " + str + " Вы умеете пользоваться клавиатурой.");
                return;
            } catch (Exception e) {
                {
                    System.out.println("Нельзя вводить пустые строки! Попробуйте еще раз.");
                }
            }
        }
    }
}