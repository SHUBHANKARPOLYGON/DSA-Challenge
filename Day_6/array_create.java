public class array_create{

public static void main(String[] args) {
    int[] marks={99,100,54,36,88};
    marks[0]=500; //updating the value of marks[0]

    System.out.println(marks[0]); //index starts with 0
    System.out.println(marks[1]); 
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
    
    //valid index of an array of size n is 0 to n-1
    //marks[5]=100; //this will give an error because index 5 is out of bounds for an array of size 5

    System.out.println(marks[5]);
}
}