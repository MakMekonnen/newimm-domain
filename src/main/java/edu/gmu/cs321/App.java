package edu.gmu.cs321;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee data_entry = new DataEntry(1, "bob");
        Employee reviewer = new Reviewer(2, "steve");
        Employee approver = new Approver(3, "cuk");
    }
}
