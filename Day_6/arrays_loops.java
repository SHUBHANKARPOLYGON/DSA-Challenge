
import java.util.Scanner;

public class arrays_loops {
    
    public static void main(String[] args) {
        int size=4;
        int[] marks=new int[size];     //Array Created with size 4
        Scanner sc=new Scanner(System.in);    //Scanner class is used to take input from the user

        //Input  
        for(int i=0;i<size;i++){
            System.out.println("Enter value: "+(i+1));
            marks[i]=sc.nextInt();    //taking input from the user and storing it in the array at index i
    }
    System.out.println();

        //Output
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);   //Print the values stored in the array at index i
        }
        sc.close();
    }
}
    