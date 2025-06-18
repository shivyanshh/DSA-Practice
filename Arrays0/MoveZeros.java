package Arrays0;
//Have to rearrange moving all zeroes to back without disturbing the relative order of non-zero elements

public class MoveZeros {
    public static void main(String[] args){
        int nums[] = {1,0};
        Solution5 obj = new Solution5();
        obj.moveZeroes(nums);

        for(int n: nums){
            System.out.print(n+" ");
        }
    }
}
class Solution5{
    public void moveZeroes(int[] nums) {
        int tracker =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int store = nums[i];
                nums[i] =0;
                nums[tracker] = store;
                tracker++;
            }
        }
    }
}