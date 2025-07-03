public class Overloading {
    public static void main(String[] args){

        fun(10); // this is for int fun
        fun("Argha"); // this is for string fun


    }

    //same name but different arguments.
    static void fun(int a){
        System.out.println(a);
    }

    static void fun( String name){
        System.out.println(name);
    }

}
