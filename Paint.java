//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;   //paint covers 350 sq ft/gal
            int length, width, height;
            double totalSqFt;          
            double paintNeeded;        
 
            //Declare and initialize the length, width, and height of the room
            length = 15;
            width = 11;
            height = 8;
 
            //Compute the total square feet to be painted--think about the dimensions of each wall
            totalSqFt = (height*width*4 + length * width);
            System.out.println (totalSqFt);
            //Compute the amount of paint needed
            paintNeeded = (int) (Math.ceil(totalSqFt/ 350));
 
            //Print the length, width, and height of the room and the number of gallons of paint needed.
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Number of gallons of paint needed: " + paintNeeded);
        }
}