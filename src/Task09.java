import java.util.Scanner;
public class Task09 {

    public static void main(String args[]) {
        //Реализовать метод, int findFirstCharIndex(String str, char ch) который возвращает
        //позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
        //возвращаем -1.
        //Например: find(“let’s talk about java”,’t’) -> 2
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите символ");
        String ch = sc.nextLine();
        char ch1 = ch.charAt(0);
        System.out.println(findFirstCharIndex(str, ch1));}


   public static int findFirstCharIndex(String str, char ch) {
        int i;
        for (i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" "+ i+" "+ch);
            if(str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
