import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate {
    public static void main(String[] args) {

        int [] arr = {33,98,33,99,100,100};

        Set <Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        System.out.println("Unique elements: " + set);
    }
}
