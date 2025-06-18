package Arrays0;

public class RemoveElements {
    public static void main(String[] args){
        // int array[] = {3,2,1,5,3,4,8,3};
        int array[] ={0,1,2,2,3,0,4,2};
        solution1 obj = new solution1();
        int array2[] = obj.method(array, 2);
        for(int n : array2){
            System.out.print(n+" ");
        }
    }
}
class solution1{
    public int[] method(int array[], int val){
        int x= 0;
        for(int i=0;i<array.length;i++){
            if(val!=array[i]){
                array[x]=array[i];
                x++;
            }
        }
        return array;
    }
}