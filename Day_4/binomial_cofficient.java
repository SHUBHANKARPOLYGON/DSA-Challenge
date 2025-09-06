package Day_4;

public class binomial_cofficient {

    int binomial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n=8;
        int r=2;
        binomial_cofficient obj=new binomial_cofficient();
        int output=obj.binomial(n)/(obj.binomial(n-r)*obj.binomial(r));
        System.out.println(output);
    }
}
