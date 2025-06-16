package WarmUp;

public class CountDigits {
    public static void main(String[] args){
        int test = 555666;
        tools obj = new tools();
        int digits = obj.CountDigit(test);
        System.out.println("Number of digits in the given number is: " + digits);
    }
}
class tools{
    public int CountDigit(int number){
        int check = -1;
        int i =1 ;
        while(check != 0){
            if(number/10 != 0){
                number = number/10;
                i++;
            }
            else if(number/10 == 0){
                check =0;
            }
        }
        return i;
    }
}