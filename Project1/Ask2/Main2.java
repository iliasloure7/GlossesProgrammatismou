import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        final int numberOfPhones = 2;
        MobilePhone[] phone = new MobilePhone[numberOfPhones];
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        for(int i = 0; i < phone.length; i++) {
            System.out.println("Enter brand and price: ");
            phone[i] = new MobilePhone(input1.nextLine(), input2.nextDouble());
        }

        for(int i = 0; i < phone.length; i++) {
            System.out.println("phone no" + (i+1) + ": " + phone[i].getBrand() + " " + phone[i].getPrice());
        }
          
    }
}