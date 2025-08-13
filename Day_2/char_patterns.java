package Day_2;

public class char_patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n-1;i++){
            char ch='A';
            for(int j=0;j<=n-1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
