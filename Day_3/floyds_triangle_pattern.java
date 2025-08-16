package Day_3;

public class floyds_triangle_pattern {
    public static void main(String[] args) {
        int n=4;
        int num=1; //initialize the number to start from
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num+" ");
                num++; //increment the number after printing
            }
            System.out.println();
        }
    }
}
