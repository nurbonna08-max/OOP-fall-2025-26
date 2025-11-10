package Lab;

import java.util.Scanner;

public class TaslOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberofStudent = 3;
        float num1, num2, num3, result, averageScore;

        System.out.println("Enter the score of 1st student:");
        num1 = input.nextFloat();
        System.out.println("Enter the score of 2nd student:");
        num2 = input.nextFloat();
        System.out.println("Enter the score of 3rd student:");
        num3 = input.nextFloat();
        result = num1 + num2 + num3;
        averageScore = result / numberofStudent;
        System.out.println("The average score is: " + averageScore);
    }

}
