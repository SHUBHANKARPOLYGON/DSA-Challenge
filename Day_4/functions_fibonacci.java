package Day_4;

public class functions_fibonacci {

    int fibo(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args){
        functions_fibonacci obj=new functions_fibonacci();
        int result=obj.fibo(4);
        System.out.println(result);
    }
}

