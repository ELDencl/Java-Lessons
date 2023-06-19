package Seminars.Seminar1;
// Задача 4. Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task_4 {
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        String[] revers = text.split(" ");
        for (int i = revers.length-1; i >= 0; i--) {
            System.out.printf("%s ", revers[i]);
            
        }


        
    }
    
}
