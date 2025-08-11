/*Print the sum of first N natural number */

package Day_1;

public class loops_question {
    public static void main(String[] args) {
        int N=4;
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
