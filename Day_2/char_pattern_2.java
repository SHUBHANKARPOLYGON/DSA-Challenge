package Day_2;

public class char_pattern_2 {
    public static void main(String[] args){
        int n=3;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("After Pattern: "+ch);
    }
}
