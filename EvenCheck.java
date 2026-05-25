import java.util.Scanner;

public class EvenCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number form user: ");
        int number = input.nextInt();
        
        // This evaluates directly to true or false without a conditional statement
        boolean isEven = (number % 2 == 0);
        
        System.out.println("Is the number even? " + isEven);
        
        input.close();
    }
}