package Bridgelabz;

import java.util.Scanner;

public class LineComparision  {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Program");
        Scanner sc= new Scanner((System.in));

        // assigning the X coordinates
        System.out.println("Enter the x-axis co-ordinates");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        // assigning the Y coordinates
        System.out.println("Enter the Y-axis Co-ordinates");
        int y1=sc.nextInt();
        int y2=sc.nextInt();

        //calculating the length of two Lines

        double lineLength=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The length of Line is" + lineLength);
    }
}
