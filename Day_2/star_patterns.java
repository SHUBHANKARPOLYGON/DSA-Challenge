/* make * pattern where n=4  */

package Day_2;

public class star_patterns {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    } 
}
