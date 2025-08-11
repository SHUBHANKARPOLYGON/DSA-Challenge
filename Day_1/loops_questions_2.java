/*print the table of a number input by the user */

package Day_1;

import java.util.Scanner;

public class loops_questions_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(i*N);
        }
    }
}
