package Day_4;

import java.util.Scanner;

public class binomial_cofficient {

    int binomial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        System.out.println("Enter r value:");
        int r=sc.nextInt();
        // int n=8;
        // int r=2;
        binomial_cofficient obj=new binomial_cofficient();
        int output=obj.binomial(n)/(obj.binomial(n-r)*obj.binomial(r));
        System.out.println("Output:"+output);
    }
}
