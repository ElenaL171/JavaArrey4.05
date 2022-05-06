public class Task20 {
    public static void main(String args[]) {
//Дано два массива char одинаковой длинны. Написать метод, который выводит все
//совпадающие символы и имеющие одинаковые индексы и в первом, и во втором массиве.
//Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc

        char [] array1 = new char[] {'a','b','c','d'};
        char [] array2 = new char[] {'d','b','c','f'};
        for (int i=0; i<array1.length; i++)
        {
            if (array1[i]==array2[i])
                System.out.print(array1[i]+" ");
        }

    }
}