package Arrays0;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        Solution8 obj = new Solution8();
        int number = obj.FindSingleNumber(nums);
        System.out.println("The single number is: "+number);
    }
}

class Solution8{
    public int FindSingleNumber(int[] nums){




        //Approach---2 using Bitwise XOR
        int unique =0; 
        for(int i=0;i<nums.length;i++){
            unique ^= nums[i];
        }
        return unique;

















        //APPROACH--1
        // int TheNumber = -1;
        // HashMap<Integer,Integer> container = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(container.containsKey(nums[i])!= true){
        //         container.put(nums[i], 1);
        //     }
        //     else{
        //         container.put(nums[i], 2);
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(container.get(nums[i])==1){
        //         TheNumber = nums[i];
        //     }
        // }
        // return TheNumber;
    }
}
