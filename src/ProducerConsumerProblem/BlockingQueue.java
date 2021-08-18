package ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BlockingQueue {
    private final Lock lock = new ReentrantLock();
    private final Condition empty = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private static final int totalTasks = 10;
    Queue<Task> tasks = new ArrayDeque<>(totalTasks);

    public void add(Task t) {
        CopyOnWriteArrayList<Integer> x=new CopyOnWriteArrayList<>();
        lock.lock();
        try {
            while (tasks.size() == totalTasks) {
                empty.await();
            }
            tasks.add(t);
            notEmpty.signalAll();
        } catch (Exception ex) {

        } finally {
            lock.unlock();
        }

    }

    public Task get() throws InterruptedException {
        lock.lock();
        try {
            while (tasks.size() == 0) {
                notEmpty.await();
            }
            Task k = tasks.remove();
            empty.signalAll();
            return k;

        } catch (Exception ex) {

        } finally {
            lock.unlock();
        }

        return null;
    }
}
