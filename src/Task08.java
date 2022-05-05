import java.util.Scanner;
public class Task08 {

    public static void main(String args[]) {
        //*Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
        //находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
        //сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
        //Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
        //Число 13 не входит. )
        int sum;
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Введите второе число");
        int finish = sc.nextInt();
        System.out.println("Введите второе число");
        int digit = sc.nextInt();
        if(digit<0&&digit>=9)
        digit=0;
        sum=sum(start, finish, digit);
        System.out.println(sum);
    }

    public static int sum(int start, int finish, int digit) {
        int sum=0;
        for (int i = start; i <= finish; i++) {
            if(i%10!=digit)
            sum=sum+i;
        }
        return sum;
    }
}
