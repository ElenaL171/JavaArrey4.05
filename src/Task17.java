public class Task17 {
    public static void main(String args[]) {
//Дан массив целых чисел. Реализовать метод, который возвращает индекс минимальнго
//значение в данном массиве.
//Например: {1,3,6,-1,4,-3,1} -> 5
        int min1;
        int[] arrey= new int[]{1,3,6,-1,4,-3,1};
        System.out.println(min(arrey));
    }
    public static int min(int arrey[]) {
        int minindex=0;
        for(int i=0;i<arrey.length; i++)
        {
            if(arrey[minindex]>arrey[i])
                minindex=i;
        }
        return minindex;
    }
}




