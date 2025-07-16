public class Array_sum {
    public static void main(String[]args){
        int [] arr = {3,6,8,2,1};
        int sum =0;

        for (int num : arr){
            sum += num;
        }
        System.out.println(sum);
    }
}
