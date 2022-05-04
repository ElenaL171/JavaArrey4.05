import java.util.Scanner;
public class Task03 {
    public static void main(String args[]) {
//Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
//должен возвращать true если и первое и второе число делятся без остатка на третье.
//Подсказка: Используйте метод, написанный в пункте 2

        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        System.out.println("Введите третье число");
        int number3 = sc.nextInt();
        boolean flag;
        flag=isDivisible(number1, number2, number3);
        System.out.println(flag);
        printCheckResultMessage(number1, number2, number3, flag);
    }
    public static boolean isDivisible(int number1, int number2, int number3){
        boolean flag;
        if (number1%number3==0&&number2%number3==0) {
            flag =true;

        }
        else flag=false;
        return flag;
    }
    public static void printCheckResultMessage(int number1, int number2, int number3, boolean result){
        if (result==true){
            System.out.println(number1+" и " + number2 + " делятся на "+number3 + " без остатка");
        }
        else System.out.println(number1+" и " + number2 + " не делятся на "+number3 + " без остатка");
    }
}