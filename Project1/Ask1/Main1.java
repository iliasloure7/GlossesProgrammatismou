import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int num;
        Sum s = new Sum();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number: ");    
        num = input.nextInt();
        s.calculateSum(num);
        System.out.println("Sum: " + s.getSum()); // εκτύπωσει του sum με την μέθοδο getSum
        s.printSum();  // εκτύπωσει του sum με την μέθοδο printSum
    }
}