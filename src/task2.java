/*
Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
*/
public class task2 {
    public static void main(String[] args) {

        // Нужно задать массив, длинной не менее 9
        int[] intArray = {67, -98, 5, 34, 74, 57, 6, 10, 42, 18, 779};
        try {
            // int d = 0; - на 0 делить нельзя
            int d = 6;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя " + e);
        }

    }
}