/**Class: ITEC 2140
 * AUTHOR : Jamarian St. Aimee
 * version 1.0
 * Course: ITEC 2140 SPRING 2023
 * WRITTEN: FEBUARY 4 203
 *
 * DESCRIPTION: CALCULATE THE BASE AREA AND VOLUME OF A CYLINDER
 */





import java.util.Scanner;
public class volumearea {
    public static void main(String[]args) {
        double TotalArea;
        double Volume;
        double pi = 3.1416;

        Scanner  input = new Scanner(System.in);

        System.out.println("Enter the radius of the base circle: ");
        double radius = input.nextDouble();

        System.out.println("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        TotalArea = radius * radius * pi;
        Volume = radius * radius * pi * length;


        System.out.println("The radius is: " + radius);
        System.out.println("The length is: " + length);
        System.out.println("The area is: " + TotalArea);
        System.out.println("The volume is: " + Volume);





    }
}
