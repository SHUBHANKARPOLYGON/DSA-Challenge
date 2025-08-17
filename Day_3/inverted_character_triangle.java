package Day_3;

public class inverted_character_triangle {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
