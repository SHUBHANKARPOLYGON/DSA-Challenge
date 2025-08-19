package Day_4;

public class function_min_of_2 {

    int min(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        function_min_of_2 obj=new function_min_of_2();
        int result=obj.min(5,10);
        System.out.println(result);
    }
}
