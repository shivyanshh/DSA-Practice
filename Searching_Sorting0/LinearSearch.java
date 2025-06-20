package Searching_Sorting0;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {4,9,1,0,2};
        Linear obj = new Linear();
        int target = 2;
        int indexT = obj.SearchLinear(nums, target);
        System.out.println("The number "+target+" is at index: "+ indexT);
    }
}
class Linear{
    public int SearchLinear(int[] nums, int target){
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                index = i;
                return index;
            }
        }
        return index;
    }
}
