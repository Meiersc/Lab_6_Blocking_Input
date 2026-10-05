import java.util.Scanner;

public class CtoFConverter {
    static void main(String[] args) {
        int temp = 0;
        int math= (int) 1.8;
        Scanner in = new Scanner(System.in);
        boolean done = false; // a control variable
        double Fctemp= 0;
        double Ftemp = 0;
        do {
            System.out.println("What's the temperature? ");
            if (in.hasNextInt()) {
                temp = in.nextInt();
                in.nextLine();// clear the buffer
                done = true;
                Ftemp= temp*1.8;
                Fctemp= Ftemp+32;

            } else {
                String thrash = in.nextLine(); //read the bad input
                System.out.println("You must enter a valid Temperature, not " + thrash);
            }
        } while (!done); // we loop until done is true
        System.out.println("The temperature in c is " + temp);
        System.out.println("The temperature in F is "+Fctemp);
    }
}

