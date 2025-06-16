package WarmUp;

public class Programming101 {
    public static void main(String[] args){
        int number = 9;
        int number2 = 10;
        System.out.println(number+number2);
        System.out.println(number+" "+number2);
        

        int arr[] = {1,2,3,4};
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();

        example obj = new example();
        System.out.println(obj.id);
        System.out.println(obj.name);

        obj.hello();



        
    }
}
class example{
    int id = 100;
    String name = "Jon Snow";

    public void hello(){
        System.out.println("hello");
    }
}