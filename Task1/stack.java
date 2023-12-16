import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class stack<T> {
    private List<T> stack;


    public stack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int lastIndex = stack.size() - 1;
        T poppedElement = stack.remove(lastIndex);
        return poppedElement;
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public T peek() {
        return stack.get(stack.size()-1);
    }


    public int size() {
        return stack.size();
    }


    public static void main(String[] args) {

        stack<Integer> stack1 = new stack<>();


        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        while (!stack1.isEmpty()) {
            System.out.println("Popped :) -> " + stack1.pop());
        }


    }
}