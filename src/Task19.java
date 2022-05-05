import java.util.Scanner;
public class Task19 {
    public static void main(String args[]) {
//Реализовать метод, который возвращает массив из первых n четных чисел, начиная с
//заданного числа start
//Например, для заданных n=4, start=21: {22,24,26,28,4}
        System.out.println("Введите количество чисел");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите стартовый индекс");
        int start = sc.nextInt();
        int[] sum = new int[n];
        print(summ(n, start));
    }
    public static int[] summ(int n, int start) {
        int[] sum = new int[n];
        int j= start + n;
        for (int i = 0; i < n; i++) {
            while ((i + start) % 2 != 0) {
                start++;
            }
            sum[i] = i + start;
        }
        return sum;
    }
    public static void print(int[] sum) {
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }
}

