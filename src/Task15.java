import java.util.Scanner;
public class Task15 {

    public static void main(String args[]) {
        //Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
        //который вместо заданной строки с номером счета (например ”DE5128279087265”)
        //возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
        //засекреченных цифр)
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Введите символ");
        String str2 = sc.nextLine();
        System.out.println("Введите первое число");
        int start = sc.nextInt();
        System.out.println("Введите второе число");
        int finish = sc.nextInt();
        char s=str2.charAt(0);
        String result= String.valueOf(repl(str1, s, start, finish));
        System.out.println(result);
    }
    public static char[] repl(String str1, char s, int start, int finish) {
        char [] result = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            if(i<start||i>finish)
                result[i]=str1.charAt(i);
            else result[i]=s;
        }
        return result;
    }
}
