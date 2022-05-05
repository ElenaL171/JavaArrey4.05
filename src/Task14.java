import java.util.Scanner;
public class Task14 {

    public static void main(String args[]) {
        //Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
        //заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
        //Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”
        int sum;
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите первое число");
        int start = sc.nextInt();
        System.out.println("Введите второе число");
        int finish = sc.nextInt();
        String result= String.valueOf(find(str, start, finish));
        System.out.println(result);
    }

    public static char[] find(String str, int start, int finish) {
        int index=0;
        char [] result = new char[finish-start];
        for (int i = start; i < finish; i++) {
            result [index]=str.charAt(i);
            index++;
        }
        return result;
    }
}
