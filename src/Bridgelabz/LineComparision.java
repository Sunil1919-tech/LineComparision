package Bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Program");
        Scanner sc = new Scanner((System.in));

        // assigning the lin1 X&Y coordinates
        System.out.println("Enter the X & Y co-ordinates of line1");
        System.out.println("x1= ");
        int x1 = sc.nextInt();
        System.out.println("y1= ");
        int y1= sc.nextInt();
        System.out.println("x2= ");
        int x2 = sc.nextInt();
        System.out.println("y2= ");
        int y2 = sc.nextInt();


        double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));


        // assigning the X &Y coordinates
        System.out.println("Enter the  X & Y co-ordinates line2");
        System.out.println("x3= ");
        int x3 = sc.nextInt();
        System.out.println("y3= ");
        int y3 = sc.nextInt();
        System.out.println("x4= ");
        int x4 = sc.nextInt();
        System.out.println("y4= ");
        int y4 = sc.nextInt();
        double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));


        System.out.println("The length of Line1 is" + lineLength1);
        System.out.println("The length of line2 is " +lineLength2);

        if(lineLength1==lineLength2) {
            System.out.println("Two Lines are Equal");
        }
        else
         {
            System.out.println("Two Lines are Not Equal");
        }

    }
}
