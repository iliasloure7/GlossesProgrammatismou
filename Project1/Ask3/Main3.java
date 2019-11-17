import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
       int f, minYear = 0, place = 0;
       final int numberOfBooks = 3;
       Scanner input1 = new Scanner(System.in);
       Scanner input2 = new Scanner(System.in);
       Book[] bookArr = new Book[numberOfBooks];

       for(int i = 0; i < bookArr.length; i++) {
           System.out.println("Enter title,author and firstEdition: ");
            bookArr[i] = new Book(input1.nextLine() , input1.nextLine(), input2.nextInt());
            if(i == 0) {
                minYear = bookArr[i].getFirstEdition();
            }
            else {
                if(bookArr[i].getFirstEdition() < minYear) {
                    minYear = bookArr[i].getFirstEdition();
                    place = i;
                }
            }
       }

       System.out.println("Title: " + bookArr[place].getTitle());
       System.out.println("Author: " + bookArr[place].getAuthor());
       System.out.println("firstEdition: " + bookArr[place].getFirstEdition());
    }
}