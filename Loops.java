import java.util.Scanner;

public class Loops {
    public static void main (String[] args){


        Scanner value = new Scanner(System.in);
        System.out.print("Enter value:");
        int val = value.nextInt();

//        int price = 2000;
//         if(val>price){
//             System.out.print("ok");
//         } else {
//             System.out.print("Try next time");
//         }

        for (int i = 1; i <= 10; i++) {
            System.out.println(val +" * "+ i + " = " + val*i );
        }



    }
}
