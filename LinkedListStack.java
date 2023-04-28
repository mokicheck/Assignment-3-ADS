import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack() {
        stack = new LinkedList<T>();
    }

    public void pushMethod(T data) // This function adds an element to the top of the stack.
    {
        stack.addFirst(data);
    }

    public boolean isEmpty() // This function checks, is stack empty and returns true or false
    {
        return stack.isEmpty();
    }
}
