public class StackMain {
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

      
        while (stack.peek() != -1) {
            System.out.println("Peek: " + stack.peek());
            stack.pop();
            System.out.println("After Pop:");
            stack.display();
        }

    }
}
