import java.util.Scanner;
public class Task13 {

    public static void main(String args[]) {
        //Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
        //в [] Например: “Hello” -> [H][e][l][l][o]

        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printin(str);
    }

    public static void printin(String str) {
        int i;
        int result=0;
        for (i = 0; i < str.length(); i++) {
            System.out.print("["+str.charAt(i)+"]");
            }
        }
    }


