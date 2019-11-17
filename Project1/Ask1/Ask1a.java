import java.util.Scanner;

public class Ask1a {
    public static void main(String[] args) {
        int n , sum = 0;

        System.out.println("Enter number: ");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Your sum is: " + sum);
    }
}