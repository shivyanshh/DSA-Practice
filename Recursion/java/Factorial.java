package Recursion.java;

public class Factorial {
    public static void main(String[] args){
        int n = 5;
        Solution2 obj = new Solution2();
        int factorial =  obj.Factor(n);
        System.out.println("Factorial of "+ n+ " is : "+factorial);
    }
}
class Solution2{
    int fact = 1;
    public int Factor(int n){
        if(n!=1){
            fact *= n;
            n--;
            Factor(n);
        }
        return fact;
    }
}
