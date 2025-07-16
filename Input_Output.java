import java.util.Scanner;

public class Input_Output {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] arr = new int[3];

        System.out.println("Enter values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Values are");
        for ( int num : arr){
            System.out.println(num + " ");
        }
    }
}
