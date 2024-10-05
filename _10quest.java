
//Create a Stack of strings. Push 3 strings onto the stack and then search for a specific string to find its position in the stack.

import java.util.Stack;

 class StringStackExample {
    public static void main(String[] args) {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // Push 3 strings onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Search for a specific string
        String searchString = "Banana";
        int position = stack.search(searchString);

        // Check if the string was found
        if (position != -1) {
            System.out.println(searchString + " found at position: " + position);
        } else {
            System.out.println(searchString + " not found in the stack.");
        }
    }
}
