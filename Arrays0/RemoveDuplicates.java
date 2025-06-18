package Arrays0;

public class RemoveDuplicates {
    public static void main(String[] args){
        int array[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Before removing duplicates:");
        for(int n: array){
            System.out.print(n+" ");
        }
        System.out.println();



        int unique = 0;
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(i==0){
                unique = array[i];
                index++;
            }
            else if(unique!=array[i]){
                unique = array[i];
                array[index] = array[i];
                index++;
            }
        }






        System.out.println("After removing duplicates:");
        for(int n: array){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
