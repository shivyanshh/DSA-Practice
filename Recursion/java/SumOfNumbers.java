package Recursion.java;

public class SumOfNumbers {
    public static void main(String[] args){
        int n =5;
        Solution1 obj =  new Solution1();
        int sums = obj.Sum(n);
        System.out.println("Sum of n to 1 is : "+sums);
    }
}
class Solution1{
    int sum = 0;
    public int Sum(int n){
        if(n!=0){
            sum += n;
            n--;
            Sum(n);
        }
        return sum;
    }
}