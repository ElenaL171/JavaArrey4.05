public class Task06 {

    public static void main(String args[]) {
        //Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
        // делятся на 4
        int k = 4;
        funk(k);
    }

    public static void funk(int k) {
        for (int i = 0; i <= 100; i++) {
            if (i % k != 0)
                System.out.println(i);
        }


    }
}
