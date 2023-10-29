import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 10; //primitive data type                 [10]
        int[] numbers = new int[10];                               // numbers ->[array] - Reference data type
        //System.out.println(numbers[0]); // 0 1 2
        //System.out.println(numbers[0]); // Error
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+10;
        }
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3};
        for(int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}