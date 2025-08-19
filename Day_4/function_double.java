package Day_4;

public class function_double {
    
    double sum(double a, double b){
        double s=a+b;
        System.out.println("The sum is: " + s);
        return s;
    }
    
    public static void main(String[] args) {
        function_double obj=new function_double();
        obj.sum(5,10);
    }
}
