package Arrays0;

public class ReverseString {
    public static void main(String[] args){
        String[] s ={"H","a","n","n","a","h"};
        solution2 obj = new solution2();
        obj.StringReversal(s);
        for(int i = 0; i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
class solution2{
    public void StringReversal(String[] s){
        int left = 0;
        int right = s.length-1;
        while(left<right){
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }
}
