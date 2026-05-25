import java.util.Scanner;

public class UserInformation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the remaining newline character
        
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        
        // Formatting the output data cleanly on the screen
        System.out.println("\n========= USER PROFILE =========");
        System.out.printf("Name:    %s\n", name);
        System.out.printf("Age:     %d years old\n", age);
        System.out.printf("Address: %s\n", address);
        System.out.println("================================");
        
        input.close();
    }
}