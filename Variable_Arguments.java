import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable_Arguments {
    public static void main(String[] args){
        fun(1,90,39,90,69);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
