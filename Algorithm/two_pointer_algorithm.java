import java.util.Arrays;
public class two_pointer_algorithm {
    public static void main(String[] args){
        int[] arr = {-3, 4, 7, -9, -5, 3, 2, 18, 12, 11};
        int target = 11;
        boolean result = logic(arr, target);
        System.out.println("Pair with target sum " + target + " exists: " + result);
    }

    public static boolean logic(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
       
        
   
    }
}
