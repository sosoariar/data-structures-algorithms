package com.soso.chapter02;

/**
 * @Description:
 * 1. 从小到大排序
 * @Date:Created in 23:56 2021/10/8
 */
public class BubbleSort {

    private static void sort(int[] nums){

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }

    }

    private static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = SortTools.genArray(10000,0,10000);

        long start = System.currentTimeMillis();
        BubbleSort.sort(nums);
        long end = System.currentTimeMillis();

        System.out.println("Cost Time: "+(end - start)+" ms");
        System.out.println("is Sorted? "+SortTools.isSorted(nums));
    }

}
