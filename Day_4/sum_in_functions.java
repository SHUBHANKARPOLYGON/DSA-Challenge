//Calculate sum of numbers from 1 to N using functions

package Day_4;

public class sum_in_functions {
    int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        sum_in_functions obj=new sum_in_functions();
        int output=obj.sum(5);
        System.out.println(output);
    }
}
