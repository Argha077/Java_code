public class Largest_and_Smallest {
    public static void main(String[] args){
        int [] arr={2,8,9,5,3};
        int max = arr[0] , min = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) max= arr[i];
            if (arr[i] < min) min=arr[i];
        }

        System.out.print("max:" + max + ",min:" + min);
    }
}
