import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> {
    private ArrayList<T> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(T data) // This function add data to the back of the queue
    {
        queue.add(data);
    }

    public boolean isEmpty() // This function checks, is queue empty and returns true or false
    {
        return queue.isEmpty();
    }

}
