import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> stackList;

    public Stack() {
        this.stackList = new LinkedList<>();
    }

    public void push(int data) {
        stackList.addFirst(data);
    }

    public int peek() {
        return stackList.isEmpty() ? -1 : stackList.getFirst();
    }

    public void pop() {
        if (!stackList.isEmpty()) {
            stackList.removeFirst();
        } else {
            System.out.println("Stack is empty");
        }
    }
    public void display() {
        System.out.println(stackList);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        
        stack.display();
    }
}
