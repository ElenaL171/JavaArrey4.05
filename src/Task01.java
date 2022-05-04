import java.util.Scanner;
public class Task01 {
    public static void main(String args[]) {
        //Реализовать метод boolean isEven(int number) который возвращает true если переданное
        //число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
        //number, boolean result) который выводит на экран строку вида «10 это четное число» или
        //“15 это не четное число»
        //Подсказка: Используем конструкцию if и оператор % modulo
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag;
        flag = isEven(number);
        printCheckResultMessage(number, flag);
    }
    public static boolean isEven(int number){
        boolean flag= true;
        if (number%2!=0) {
            flag =false;
        }
        return flag;
    }
    public static void printCheckResultMessage(int number, boolean result){
        if (result==true){
            System.out.println(number+" это четное число");
        }
        else System.out.println(number+ " это нечетное число");
    }


}