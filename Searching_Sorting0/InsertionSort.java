package Searching_Sorting0;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {9, 3, 7, 1, 6, 2, 8, 5, 4};
        Solution2 obj = new Solution2();
        obj.SortInstertion(nums);
        for(int n: nums){
            System.out.print(n+" ");
        }
    }    
}
class Solution2{
    public int[] SortInstertion(int[] nums){
        for(int i =1;i<nums.length;i++){
            int current = nums[i];
            int previous = i-1;
            for(int j = previous;j>=0;j--){
                if(nums[previous]>current){
                    int temp = nums[previous];
                    nums[previous]=nums[previous+1];
                    nums[previous+1]=temp;
                    previous--;
                }
            }
        }
        return nums;
    }
}
