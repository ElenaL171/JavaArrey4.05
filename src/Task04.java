import java.util.Scanner;
public class Task04 {
    public static void main(String args[]) {
//Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
//наибольшее из трех переданных чисел:
//Например: max3(10,19,0) -> 19

        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        max3(num1, num2, num3);

    }

    public static void max3(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("Максимальное число " + num1);
        } else {
            if (num2 > num3)
                System.out.println("Максимальное число " + num2);

            else System.out.println("Максимальное число " + num3);
        }
    }
}



