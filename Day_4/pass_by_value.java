package Day_4;

public class pass_by_value {
    
    int sum(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        int x=5;
        int y=6;
        pass_by_value obj=new pass_by_value();
        int output=obj.sum(x, y);
        System.out.println(output);
    }
}
