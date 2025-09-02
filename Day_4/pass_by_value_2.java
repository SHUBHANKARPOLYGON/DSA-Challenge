package Day_4;

public class pass_by_value_2 {
    int changex(int x){
        x=2*x;
        System.out.println(x);

        return x;
    }
    public static void main(String[] args) {
        int x=5;
        pass_by_value_2 obj=new pass_by_value_2();
        obj.changex(x);
        System.out.println(x);
    }
}
