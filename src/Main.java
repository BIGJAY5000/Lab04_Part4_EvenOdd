import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
        int num;

        System.out.println("Enter a number please");
        num = scan.nextInt();

        if (num % 2 == 1)
            System.out.println("your number is odd");
        else
            System.out.println("your number is even");
    }
}