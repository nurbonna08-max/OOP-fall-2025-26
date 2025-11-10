package Lab;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Enter the temperature in celsius:");
        celsius = input.nextDouble();
        fahrenheit = 1.8 * celsius + 32;
        System.out.println("Fahrenheit temperature: " + fahrenheit);
    }

}
