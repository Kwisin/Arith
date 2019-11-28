package Sword;

import java.util.Arrays;

public class skan {
    public static void main(String[] args) {
        int[] arr = {1,3,2,9,5};
        Arrays.sort(arr);
        for(int e : arr){
            System.out.println(e);
        }
        String s = "0123456";
        System.out.println(s.substring(2));
        System.out.println((int)5/2);
    }
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return null;
        }
        Arrays.sort(nums);
        int s = 0, e = nums.length-1;
        int[] result = new int[2];
        while(s < e){
            if(nums[s]+nums[e]<target){
                s++;
            }else if(nums[s]+nums[e]>target){
                e--;
            }else{
                result[0]=s;
                result[1]=e;
            }
        }
        return result;
    }
}
