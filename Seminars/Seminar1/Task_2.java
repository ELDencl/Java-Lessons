package Seminars.Seminar1;
// 2) Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task_2 {
    public static void main(String[] args) {
        int[] binary = new int[] {1,1,0,1,1,1};
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1){
                count = count+=1;
                if (max_count < count){
                    max_count = count;
                }
            }
            else{
                count = 0;

            }
            
        }
        System.out.printf("Максимальное колличество подряд идущих 1 : " + max_count);


        
    }

}
