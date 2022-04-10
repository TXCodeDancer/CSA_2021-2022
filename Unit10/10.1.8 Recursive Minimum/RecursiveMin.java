import java.util.*;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while (true){
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             
             if (number == -1){
                 break;
             }
             else {
                 numbers.add(number);
             }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }
    
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        
        // Base Case: What is the smallest ArrayList you can have? 
        // What is the minimum value of that array?
        if(numbers.size() == 1)
        {
            return numbers.get(0);
        }
    
        // Recursive call: How do you find the minimum of the rest of the ArrayList?
        //                 (Not including the last element)
        int lastValueIdx = numbers.size() - 1;
        int lastValue = numbers.get(lastValueIdx);
        numbers.remove(lastValueIdx);
        int minValue = findMinimum(numbers);
    
        // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
        if(lastValue < minValue)
            minValue = lastValue;
            
        return minValue;
    }
}
