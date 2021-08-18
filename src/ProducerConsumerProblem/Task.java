package ProducerConsumerProblem;

public class Task {
    int t;

    public int getT() {
        return t;
    }
    Task()
    {
        t=this.hashCode();
    }
}
