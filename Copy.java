import java.util.Arrays;

public class Copy {
    public static void main (String[] args){
        int [] original = {1,2,3,4,5};
        int [] copy = Arrays.copyOf(original,original.length);

        System.out.println(Arrays.toString(copy));
    }
}
