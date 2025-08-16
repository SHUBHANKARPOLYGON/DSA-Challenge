package Day_3;

public class floyds_char_triangle_pattern {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
