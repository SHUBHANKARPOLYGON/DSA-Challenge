package Day_3;

public class inverted_triangle_pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n-1;i++){
            //spaces print at start of each row
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //numbers print 
            for(int j=0;j<n-i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
