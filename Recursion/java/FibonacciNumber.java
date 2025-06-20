package Recursion.java;
public class FibonacciNumber{
    public static void main(String[] args){
        int n = 9;
        Solution4 obj = new Solution4();
        int fibonacci = obj.Fibonacci(n);
        System.out.println("The Fibonacci Number of "+n+" is :"+fibonacci);
    }
}
class Solution4{
    public int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}