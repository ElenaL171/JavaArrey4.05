import java.util.Scanner;
public class Task12 {

    public static void main(String args[]) {
        //Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
        //символов начиная с конца одинаковые у обеих строк.

        System.out.println("Введите первую строку");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        int result=findCharIndex(str1, str2);
        System.out.println(result);}

    public static int findCharIndex(String str1, String str2) {
        int i;
        int result=0;
        for (i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}

