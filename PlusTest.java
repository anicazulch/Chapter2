
// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
          System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
          // This will print the two statements joined together on one line
          System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
          // This will print the first sentence followed by 55 then print the other sentence right after 
          System.out.println ("8 plus 5 is " + 8 + 5);
          // It will just print 85 following the string because it is not in parentheses 
          System.out.println ("8 plus 5 is " + (8 + 5));
          // It will add the two number together and print 13 after the string
          System.out.println (8 + 5 + " equals 8 plus 5.");
          // It will added the two numbers first because of the order of operations then print the string
        }
}