package Day_3;

public class triangle_pattern_char {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ch+" ");
            }
            ch++; //Increment the character after each row
            System.out.println();
        }
    }
}
