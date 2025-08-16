package Day_3;

public class reverse_triangle_pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
