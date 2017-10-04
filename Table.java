// ***************************************************************
//   Table.java
//
//   Prints a table of student grades
// ***************************************************************
public class Table
{
        // ------------------------
        // main prints the list
        // ------------------------
        public static void main (String[] args)
        {
            makeTable();
        }
        public static void makeTable(){
            makeHeader();
            labelColumns();
            populateRows();
        }
        public static void makeHeader(){
            System.out.println ("------------------------------------------");
            System.out.println ("==\t\tStudent Points\t\t==");
            System.out.println ("------------------------------------------");
        }
        public static void labelColumns(){
            System.out.println ("Name\t\tLab\tBonus\tTotal");
            System.out.println ("-----\t\t----\t----\t-----");
        }
        public static void populateRows(){
            populateOneRow("Anna Mary",70,4);
            populateOneRow("Zebadiah",65,9);
            populateOneRow("JimBob\t",41,3);
            populateOneRow("Jesabelle",57,7);
            populateOneRow("Kristof\t",51,5);
        }
        public static void populateOneRow(String name, int lab, int bonus){
            System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
            
        }
}
