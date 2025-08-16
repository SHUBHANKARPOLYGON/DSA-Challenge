package Day_3;

public class reverse_triangle_character {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n-1;i++){
            char ch=(char) ('A'+i);
            for(int j=i+1;j>0;j--){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
