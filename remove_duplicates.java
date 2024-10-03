package DSCcp;

import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt(); // Read each element
        }

        System.out.println(Arrays.toString(removeDup(arr)));
    }
    static int[] removeDup(int[] nums){
        int n=nums.length;
        int i=0;
        for (int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                nums[i+1]= nums[j];
                i++;
            }
        }

        return Arrays.copyOfRange(nums, 0, i+1);
    }
}
