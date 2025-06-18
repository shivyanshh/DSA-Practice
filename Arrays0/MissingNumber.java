package Arrays0;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {0,1};
        Solution7 obj = new Solution7();
        int x =obj.missingNumber(nums);
        System.out.println("The missing number is: "+ x);
    }
}
class Solution7{
    public int missingNumber(int[] nums) {
        // int sequence = 0;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(sequence==nums[j]){
        //             sequence++;
        //         }
        //     }
        // }
        // System.out.println(sequence);
        // return sequence;




        int n = nums.length;
        int sum = n*((n+1))/2;
        int trial = 0;
        for(int i = 0;i<nums.length;i++){
            trial += nums[i];
        }
        int TheNumber = sum - trial;
        return TheNumber;















    }
}