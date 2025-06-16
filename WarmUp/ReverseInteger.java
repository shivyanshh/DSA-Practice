package WarmUp;

public class ReverseInteger {
    public static void main(String[] args){
        int test = -901;
        Reverse obj = new Reverse();
        int reversedValue = obj.reversing(test);
        System.out.println("Reversed Value is: " + reversedValue);
    }
}
class Reverse{
    public int reversing(int num){
        if(num < 0){
            int xCopy = num * (-1);
            int reverse =0;
            while (xCopy > 0){
                int digit = xCopy % 10;
                reverse = reverse *10 + digit;
                xCopy = xCopy /10;
            }
            return reverse*(-1);
        }
        else{
            int xCopy = num;
            int reverse =0;
            while (xCopy > 0){
                int digit = xCopy % 10;
                reverse = reverse *10 + digit;
                xCopy = xCopy /10;
            }
            return reverse;
        }
    }
}
