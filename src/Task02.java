import java.util.Scanner;
public class Task02 {
    public static void main(String args[]) {
        //Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
        //true если number1 делится на number2 без остатка. Аналогично первой задаче
        //реализовать метод печати результата.

        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        boolean flag;
        flag=isDivisible(number1, number2);
        printCheckResultMessage(number1, number2, flag);
    }
        public static boolean isDivisible(int number1, int number2){
        boolean flag= true;
        if (number1%number2!=0) {
            flag =false;
        }
        return flag;
    }
    public static void printCheckResultMessage(int number1, int number2, boolean result){
        if (result==true){
            System.out.println(number1+" делится на "+number2 + " без остатка");
        }
        else System.out.println(number1+" делится на "+number2 + " с остатком");
    }
}