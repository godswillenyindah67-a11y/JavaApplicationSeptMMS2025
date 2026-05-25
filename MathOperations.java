import java.util.Scanner;

public class MathOperations{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.in);
        
        System.out.println("Enter five numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();
        
        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;
        double product = num1 * num2 * num3 * num4 * num5;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        
        input.close();
    }
}