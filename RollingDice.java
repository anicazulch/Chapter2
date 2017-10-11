
// **************************************************
//   RollingDice.java
//
//   To simulate the rolling of a pair of dice
// **************************************************
 
import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int die1, die2, totalRoll; 
 
          die1 = generator.nextInt(6) + 1;
          die2 = generator.nextInt(6) + 1;
          totalRoll = die1 + die2;
 
 
          System.out.println ("Your first die rolled " + die1 + " and your second die rolled " + die2);
          System.out.println ("The sum of your dice is " + totalRoll);
        }
}