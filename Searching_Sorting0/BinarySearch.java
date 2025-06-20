package Searching_Sorting0;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        Binary obj = new Binary();
        int target =12 ;
        int index = obj.SearchBinary(nums, target);
        System.out.println("Target: "+target +" at index: "+index );

    }
}
class Binary{
    public int SearchBinary(int[] nums,int target){
        int left = 0;
        int right =  nums.length-1;
        while(left<=right){
            int midvalue =(left + right)/ 2;
            if(nums[midvalue]==target){
                return midvalue;
            }
            else if(nums[midvalue]>target){
                right=midvalue-1;
            }
            else{
                left = midvalue+1;
            }
        }
        return -1;
    }
}