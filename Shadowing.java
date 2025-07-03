public class Shadowing {
    static int x = 90; // this will be shadowed at multiple times...
    public static void main(String[] args){
        System.out.println(x); // output:90
        num();// output also : 90
        // but on the other hand if we create a new int value in  this main function then the value will be change..
        int x = 30;
        System.out.println(x);
    }
    static void num(){
        System.out.println(x);
    }
}
