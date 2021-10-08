package com.soso.chapter02;

/**
 * @Description:
 * @Date:Created in 23:51 2021/10/8
 */
public class SortTools {

    private SortTools(){
    }

    public static int[] genArray(int n, int left, int right){
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = (int)(Math.random()*(right-left+1)+left);
        }
        return nums;
    }

    public static boolean isSorted(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }

}
