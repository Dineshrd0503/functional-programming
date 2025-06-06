//You need to use lambda expression to multiply a given number n by 5.
//You need to complete the function helperFunction that does not take any argument. This function expects an object of Multiply as a return type. Multiply is an interface that has the member function multiplyBy5. Your helperFunction uses lambda expression to implement the multiplyBy5 within helperFunction itself. Then you return the object. The driver code will call the multiplyBy5 method and print the result using it.
//
//Examples:
//
//Input: 5
//Output: 25
//Explanation: 5 * 5 = 25
//Input: 6
//Output: 30
//Explanation: 6 * 5 = 30
public class Pratice2 {
    interface Multiply {
        int multiplyBy5(int n);
    }
    public static Multiply helperFunction() {
        // Your code here
        return n-> n*5;

        // Implement the multiplyBy5(int n) method using lambda expression. The
        // implemented function should return n*5
    }
    public static void main(String[] args) {
        System.out.println("Using lambda expression in Java functional programming");
        System.out.println("Creating a Multiply object using a helper function");
        Multiply multiply = helperFunction();
        System.out.println("Calling the multiplyBy5 method on the Multiply object with input 3");
        int result = multiply.multiplyBy5(3);
        System.out.println("Result: " + result); // Should print 15
    }
}
