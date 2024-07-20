import java.util.*;

public class QueueJava {
    public Node first, last;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }
        else {
            oldlast.next = last;
        }
    }

    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public void printQueue() {
        Node current = first;
        System.out.println("Items in the Queue: ");
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueJava queue = new QueueJava();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a String to enque(or type 'd' for dequeue, 'e' for exit): ");
            String input = scanner.nextLine();

            if (input.equals("e")) {
                break;
            }
            else if (input.equals("d")) {
                String item = queue.dequeue();
                System.out.println("Item Dequeued: " + item);
            }
            else {
                queue.enqueue(input);
                System.out.println("Item Enqueued: " + input);
            }
        }

        queue.printQueue();
        scanner.close();
    }
}