import java.util.Scanner;

public class Sum {
    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter 1st number:");
    int num1 = input.nextInt();
    int num2 = num1 + 10 ;

    System.out.print(num2);
    }
}
