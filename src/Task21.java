public class Task21 {
    public static void main(String args[]) {
//*Дано два массива int. Написать метод, который считает сколько значений из первого
//массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3

        int [] array1 = new int [] {10, 14, 1, 4, 3};
        int [] array2 = new int [] {0, 1, 6, 10, 1, 4, 13};
        int j=0;
        for (int i=0; i<array1.length; i++) {
            for (int m = 0; m < array2.length; m++) {
                if (array1[i] == array2[m])
                {j++;
                    break;}
            }
        }
        System.out.println(j);
    }
}

