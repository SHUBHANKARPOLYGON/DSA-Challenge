package Day_2;

public class square_pattern {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num);
                num=num+1; //num++;
            }
            System.out.println();
        } 
    System.out.println("After Pattern: "+num);
    }
}
