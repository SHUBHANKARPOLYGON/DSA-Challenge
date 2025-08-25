package Day_4;

public class N_factorial_fuction {
    int factorial(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }
        return num;
    }
    public static void main(String[]args){
        N_factorial_fuction obj=new N_factorial_fuction();
        int output=obj.factorial(5);
        System.out.println(output);
    }
}
