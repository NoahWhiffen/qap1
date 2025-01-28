// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 28th, 2025

package Time;
public class TestTime {
    
    public static void main(String[] args) {
        
        // Create time objects.
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
    
        // Output time before changes.
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
        System.out.println("-------------------------------------------");

        // Call methods on both objects.
        t1.nextSecond();
        t2.previousSecond();

        //Output after calling methods on times.
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
        System.out.println("-------------------------------------------");
    }
    
 
}
