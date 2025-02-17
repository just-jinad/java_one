import java.util.*;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to your java classes, please enter your name ");

        Scanner sc = new Scanner(System.in);

        String student_ = sc.nextLine();

        // System.out.println("Welcome to your java classes, please enter your name ");

        if (student_.equals("Jinad") || student_.equals("Tope")) {

            System.out.println("Welcome to your java classes " + student_ + " Enter your age");

            String age = sc.nextLine();
            int realAge = Integer.parseInt(age);            
            if (realAge >= 18) {
                System.out.println("You should'nt be in primary school " + student_);

            } else if (realAge >= 10) {

                System.out.println("Based on your age " + realAge + ", you should be in the university " + student_);
                System.out.println("This class was made for you");

            } else if (realAge < 9) {

                System.out.println("Why are you here in the first place");

            } else {
                System.out.println("Eyin fans mi, otti lo far oooh");
            }

        } else {

            System.out.println("Who are thou " + student_);
        }

        sc.close();
    }
}