import java.util.*;;

public class Array {
    public static void main(String[] args){
        // learning arrays in java

        String[] myArray = new String[2];

        myArray[0] = "H";
        myArray[1] = "Hi";
        // myArray[2] = "Hi1";
        //It was throwing out of bounds error when I tried to use 2 inside the array bracket

        String t = myArray[1];
        // System.out.println(t);

        // Another method

        int myNum[] = {1,3,4,5,6};

        int j = myNum[2];

        // System.out.println(j);


        //USE OF FOR LOOPS 

        int k = 0;
         k +=1;
         k +=2;
         k +=3;
        //  System.out.println(k);
        //Making a multiplication table with java for loop

        Scanner sc = new Scanner(System.in);
        System.out.println( " enter a number ");
        int userNum = sc.nextInt();

        System.out.println(userNum + " this is the number entered by the user ");

        int x = userNum;

        for(int i = 1; i <=12; i++ ){
            for( int y = x; y<= x; y++){
                System.out.println(x + " x " + i + " = " + x*i);
            }
        }
        
        sc.close();
    }
}
