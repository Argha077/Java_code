import java.util.Scanner;

public class New {
    public  static  void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("Sum is :" + sum);

        input.close();

    }
}
