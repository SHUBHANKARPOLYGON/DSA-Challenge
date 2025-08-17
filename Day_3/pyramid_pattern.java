package Day_3;

public class pyramid_pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n-1;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //numbers print
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            //decreasing numbers
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
