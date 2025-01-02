package src.main.java.Multithreading;

import java.util.LinkedList;
import java.util.Queue;

// Producer Consumer Problem
public class BlockingQueue {

    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap)
    {
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item)
    {
        synchronized (q)
        {
            while(q.size() == capacity) // if ---> while
            {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            q.add(item);
            q.notifyAll();
            return true;

        }
    }

    public int remove()
    {
        synchronized (q)
        {
            while(q.size() == 0) // if ---> while
            {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            int element = q.poll();
            q.notifyAll();
            return element;

        }
    }

}
