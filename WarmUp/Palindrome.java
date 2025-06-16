package WarmUp;
//reverse of that number should be equal to the actual number
public class Palindrome {
    public static void main(String[] args){
        int test = 10101;
        tools1 obj = new tools1();
        boolean condition = obj.CheckPalindrome(test);
        System.out.println("Our number is Palindrome? : " + condition);
    }
}
class tools1{
    public static boolean CheckPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}
