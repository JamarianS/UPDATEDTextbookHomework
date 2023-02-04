/**Class: ITEC 2140
 * AUTHOR : Jamarian St. Aimee
 * version 1.0
 * Course: ITEC 2140 SPRING 2023
 * WRITTEN: FEBUARY 4 203
 *
 * DESCRIPTION: FINDING THE TOTAL NUMBER OF HOURS AND MINUTES ARE IN A SECOND
 */





import java.util.Scanner;
        public class TimeCalc {
            public static void main(String[]args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter in the number of seconds: ");
                int seconds = input.nextInt();
                int minutes = seconds / 60 ;
                int hours = minutes / 60;

                System.out.println("There is " + hours + " hours " + minutes + " minutes " + " and " + seconds + " seconds ");



    }
}


