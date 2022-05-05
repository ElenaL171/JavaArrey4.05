public class Task16 {
    public static void main(String args[]) {
//Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение
//в данном массиве.
//Например: {1,3,6,-1,4,-5,9} -> -5
        int min1;
        int[] arrey= new int[]{1, 3, 6, -1, 4, -5, 9};
        System.out.println(min(arrey));
    }
    public static int min(int arrey[]) {
        int min=arrey[0];
        for(int i=0;i<arrey.length; i++)
        {
            if(min>arrey[i])
                min=arrey[i];
        }
        return min;
        }
    }




