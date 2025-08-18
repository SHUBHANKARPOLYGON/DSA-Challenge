package Day_4;

public class function_parameter {

     int sum(int a,int b){
        int s=a+b;
        System.out.println("The sum is: " + s);
        return s;
    }

    public static void main(String[] args) {
        //function calling
        function_parameter obj=new function_parameter();
        obj.sum(5,10);
    }
}
