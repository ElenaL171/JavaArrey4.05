import java.util.Scanner;
public class Task07 {

    public static void main(String args[]) {
        //Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
        //всех чисел от start до finish включительно.
        //Например: sum(10,15) -> 75
        int sum;
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Введите второе число");
        int finish = sc.nextInt();
        sum=sum(start, finish);
        System.out.println(sum);
    }

    public static int sum(int start, int finish) {
        int sum=0;
        for (int i = start; i <= finish; i++) {
            sum=sum+i;
        }
    return sum;
    }
}
