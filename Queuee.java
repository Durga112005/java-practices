import java.util.Queue;
import java.util.LinkedList;

public class Queuee {
    public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println("Queue : " + q);
    System.out.println("Removed element : " + q.remove());
    System.out.println("After Removal : " + q);

    }
}
