import java.util.Scanner;
import java.util.Arrays;

public class p7AaronForehand {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter? ");
        int n = input.nextInt();
        
        double [] numbers = new double[n];
        fillArray(numbers);
        double average = averageArray(numbers);
        
        System.out.printf("The average is %4.2f",average);
        System.out.println("");
        printArray(numbers);
        
        
    }
    
    public static void fillArray(double [] array)
    {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < array.length;i++)
        {
            System.out.println("Enter a number to fill array: ");
            array[i] = input.nextDouble();
        }
    }
    
    public static double averageArray(double [] array)
    {
        int sum = 0;
        for(int y=0;y < array.length;y++)
        {
            sum += array[y];
        }
        double average = sum / array.length;
        return average;
    }
    
    public static void printArray(double [] array)
    {
        System.out.print("[");
        for(int u = 0; u< array.length;u++)
        System.out.print(array[u] + ", ");
        System.out.print("]");
    }
}

/**
 * Program to generate and populate an array with student scores
 * input
 *
 * @author Nathaniel Johnson
 */
public class StudentScores {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create placeholders
        String grade;
       
        //Get input for # of students and assign it to array
        System.out.print("Enter the number of students: ");       
        int[] studentArray = new int[input.nextInt()];

        System.out.println("");

        //Get input for scores and add them to an array
        System.out.print("Enter " + studentArray.length + " scores: ");
        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = input.nextInt();
        }
        
        //Sort the array holding student values
        Arrays.sort(studentArray);
        int best = studentArray[studentArray.length - 1];
        
        //Using a For loop to populate the elements of the array
        for(int i = 0; i < studentArray.length; i++){
            if(studentArray[i] >= best - 10){
                grade = "A";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 20){
                grade = "B";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 30){
                grade = "C";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 40){
                grade = "D";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else{
                grade = "F";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
        }
    }
}

