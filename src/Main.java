import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = "It is raining all day!";
        String[] array = words.split(" ");
        String result = " ";
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            int size = words.length();
            String first = array[i].substring(0, 1);
            String result1 = first;
            sum += first;


            System.out.println(array[i]);
            System.out.println(first);
            System.out.println(result1);
            System.out.println(sum);


        }
    }
}









            //homework 04.05

            //1.
//Пользователь вводит строку
//Разделите строку на слова
//В каждом слове оставьте только первую букву// чар
//Сложите все первые буквы слов в одно слово
//Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова


