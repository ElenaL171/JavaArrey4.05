public class Task18 {
    public static void main(String args[]) {
//Дан массив целых чисел. Реализовать метод, который возвращает сумму всех
//положительных элементов данного массива
//Например: {1,3,6,-1,4,-3,1} -> 15
        int min1;
        int[] arrey= new int[]{1,3,6,-1,4,-3,1};
        System.out.println(sum(arrey));
    }
    public static int sum(int arrey[]) {
        int sum=0;
        for(int i=0;i<arrey.length; i++)
        {
            if(arrey[i]>0)
                sum=sum+arrey[i];
        }
        return sum;
    }
}