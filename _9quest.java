//Create a Stack of 5 numbers. Pop all the elements one by one and print each element as it is removed.
import java.util.Stack;

 class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push 5 numbers onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Pop all elements one by one and print them
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped element: " + element);
        }
    }
}
