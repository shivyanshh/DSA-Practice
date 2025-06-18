package Arrays0;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution6 obj = new Solution6();
        int consecutive = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Max consecutive ones are :" + consecutive);
    }
}
class Solution6{
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int streak = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i] != 0){
                streak++;
                if(streak>max){
                    max = streak;
                }
            }
            else{
                streak = 0;
            }
        }
        return max;
    }
}