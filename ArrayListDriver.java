/**
 * Array List Driver DO NOT MODIFY THIS CLASS
 * 
 * @GrayKnight
 * @11/16/10, 11/5/12, 2/4/16
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDriver
{
    //instance variables
    private ArrayList<Integer> myRandomInts = new ArrayList<Integer>();
    private int myNumValues, myHighVal, myLowVal;

    /**
     * Driver Method
     * DO NOT MODIFY
     */
    public void driver()
    {
      
       //DO NOT MODIFY THIS METHOD
       //call a private method to survey the user
       this.userSurvey();
        
       //Call a private method to fill the instance array.
       this.randomArrayListFiller();
       
       //perform calculations
       double mean = ArrayListCalculator.meanFinder(myRandomInts);
       double stddev = ArrayListCalculator.stdDevFinder(myRandomInts);
       int highest = ArrayListCalculator.highFinder(myRandomInts);
       int lowest = ArrayListCalculator.lowFinder(myRandomInts);
       
       //display information
       System.out.println(ArrayListCalculator.aListDisplay(myRandomInts));
       System.out.println("The mean is : " + mean);
       System.out.println("The standard deviation is : " + stddev);
       System.out.println("The highest value is : " + highest);
       System.out.println("The lowest value is : " + lowest);
    
    }
    
    //DO NOT MODIFY THIS METHOD
    //Surveys the user for preferences regarding the instance ArrayList
    private void userSurvey()
    {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("This program will create an ArrayList of random integers and calculate statistics.\n\n" +
                          "How many integers do you want in the array? (up to 200):");
       myNumValues = scan.nextInt();
        if (myNumValues > 0 && myNumValues <= 200){ //enforcing conditions
         System.out.print("Enter the lowest possible value :");
         myLowVal = scan.nextInt();
         System.out.print("Enter the highest possible value :");
         myHighVal = scan.nextInt();
         while(myHighVal < myLowVal){//enforcing conditions
             System.out.print("The highest possible value must be greater than " + myLowVal +
             ".\nRe-enter the highest possible value :");
             myHighVal = scan.nextInt();
            }
       }
       else System.out.println("Invalid Entry");
    }

    //DO NOT MODIFY
    //fills the instance ArrayList myRandInts with random integers from myLowVal to myHighVal
    private void randomArrayListFiller()
    {
        myRandomInts = new ArrayList<Integer>();
        Random rand = new Random();
        for(int x = 0; x < myNumValues; x++)
        {
            myRandomInts.add(rand.nextInt(myHighVal - myLowVal + 1) + myLowVal);
        }
    }
}