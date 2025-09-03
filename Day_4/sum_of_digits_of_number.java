package Day_4;

public class sum_of_digits_of_number {
    int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem; // sum+=rem
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        sum_of_digits_of_number obj=new sum_of_digits_of_number();
        int result=obj.sum(12345);
        System.out.println(result);
    }
}
