package Bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Program");
        Scanner sc = new Scanner((System.in));

        // assigning the X coordinates
        System.out.println("Enter the X-axis co-ordinates of line1");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();


        // assigning the Y coordinates
        System.out.println("Enter the Y-axis Co-ordinates of line1");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();


        //calculating the length of two Lines

        double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));


        // assigning the X coordinates
        System.out.println("Enter the X-axis co-ordinates of line1");
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();


        // assigning the Y coordinates
        System.out.println("Enter the Y-axis Co-ordinates of line1");
        int y3 = sc.nextInt();
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
