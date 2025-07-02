import java.util.Scanner;

public class Day2 {
    public  static  void  main (String[] args){

        double num1, num2;
        char operator;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number :");
        num1 = input.nextDouble();

        System.out.print("Enter Your Options (+ , - , * , /) :");
        operator=input.next().charAt(0);

        System.out.print("Enter 2nd number :");
        num2 = input.nextDouble();

        switch (operator){
            case '+':
                result=num1+num2;
                System.out.print(num1 +" + "+num2+ " = "+ result);
                break;
            case '-':
                result=num1-num2;
                System.out.print(num1 +" - "+num2+ " = "+ result);
                break;
            case '*':
                result=num1*num2;
                System.out.print(num1 +" * "+num2+ " = "+ result);
                break;
            case '/':
                result=num1/num2;
                System.out.print(num1 +" / "+num2+ " = "+ result);
                break;
        }


    }
}
