import java.util.Scanner;
public class Task11 {

    public static void main(String args[]) {
        //Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
        //символов начиная с начала одинаковые у обеих строк.

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
        for (i = str1.length()-1; i >=0 ; i--) {
            if(str1.charAt(i) == str2.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
