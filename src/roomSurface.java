
import java.util.Scanner;

/**Class: ITEC 2140
 * AUTHOR : Jamarian St. Aimee
 * version 1.0
 * Course: ITEC 2140 SPRING 2023
 * WRITTEN: FEBUARY 4 203
 *
 * DESCRIPTION: FINDING HOW MANY GALLONS AND QUARTS OF PAINT WILL BE NEEDED FOR THE ROOM
 */

public class roomSurface {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int TotalAreaofWalls;
        int TotalArea;


        System.out.println("What is the length of the room: ");
        int length = input.nextInt();
        System.out.println("What is the width of the room : ");
        int width = input.nextInt();
        System.out.println("How many windows are in this room?  ");
        int num_windows = input.nextInt();
        System.out.println("How many doors are in the room?  ");
        int num_doors = input.nextInt();

        int windows = 15 * num_windows;
        int door = 21 * num_doors;
        int space_occupied = door + windows;

        int area = length * width;

        TotalAreaofWalls = length * width * 4 ;
        TotalArea = TotalAreaofWalls - space_occupied;
        int gallon = TotalArea / 350;
        double quarts = gallon % 4;




        System.out.println("The area of 1 wall is: " + area );
        System.out.println("The space occupied by windows is  " + windows + " square ft");
        System.out.println("The space occupied by doors is  " + door + " square ft ");
        System.out.println("The space occupied by both the door and windows are  " + space_occupied + " square ft ");
        System.out.println("The total area of the room is  " + TotalAreaofWalls + " square ft");

        System.out.println("You will need " + gallon + " gallons and " + quarts +  " quart of paint for this room !  ");



    }
}