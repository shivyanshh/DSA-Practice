package Recursion.java;

public class PowerOf2 {
    public static void main(String[] args){
        int n = 6;
        Solution3 obj = new Solution3();
        boolean cond = obj.isPowerOfTwo(n);
        System.out.println("If number "+n+" is a power of 2 : " + cond);
    }
}
class Solution3{
    public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;          // edge case: negatives or zero

    if (n == 1) return true;           // base case: 2^0 = 1

    if (n % 2 != 0) {
        return false;                  // not divisible by 2, so not a power of 2
    }

    return isPowerOfTwo(n / 2);        // recursive call
}

}
