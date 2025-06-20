package Searching_Sorting0;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums ={5,2,4,1};
        Solution1 obj = new Solution1();
        obj.Bubble(nums);

        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
class Solution1{
    public int[] Bubble(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean isSwapped = false;
            int temp = 0;
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    isSwapped = true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
        return nums;
    }
}
