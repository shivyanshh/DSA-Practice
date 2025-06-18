package Arrays0;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution4 obj = new Solution4();
        obj.merge(nums1, 3, nums2, 3);

    }
}
class Solution4{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1copy = Arrays.copyOfRange(nums1, 0, m); //index m is exclusive
        int p1 = 0;
        int p2 = 0;

        for(int i =0 ; i<m+n;i++){
            if(p2>=n || (p1<m && n1copy[p1]<nums2[p2])){
                nums1[i] = n1copy[p1];
                p1++;
            }
            else{
                nums1[i] = nums2[p2];
                p2++;
            }
        }

        for(int z: nums1){
            System.out.print(z+" ");
        }
    }
}