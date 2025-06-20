package Searching_Sorting0;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {7,1,5,4,3,2};
        Selection obj = new Selection();
        obj.SortSelection(nums);
        for(int n: nums){
            System.out.print(n+" ");
        }
    }
}
class Selection{
    public int[] SortSelection(int[] nums){
        int pointer = 0;
        for(int i=0;i<nums.length;i++){
            int min = pointer;
            for(int j = pointer;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            int temp = nums[pointer];
            nums[pointer]=nums[min];
            nums[min]=temp;
            pointer++;
        }
        return nums;
    }

}
