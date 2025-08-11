package Day_1;
/*lets check while and do-while */

public class conditions_check {
    public static void main(String[] args) {
        int i=12; //initialized i to 12
        // Using while loop
        while(i<11){
            System.out.println(i);
            i++;
        }

        //using do-while loop
        do { 
            System.out.println(i);   
            i++;
        } while (i<11);
    }
}
