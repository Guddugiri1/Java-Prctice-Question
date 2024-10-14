import java.util.Iterator;

public class MyPriorityQueueExample {
    public static void main(String args[]) {
        // Use java.util.PriorityQueue to avoid naming conflicts
        java.util.PriorityQueue<String> queue = new java.util.PriorityQueue<String>();

        // Adding elements to the priority queue
        queue.add("Rajendra");
        queue.add("Mahendra");
        queue.add("Raja");
        queue.add("Technolamror");
        queue.add("Rahul");

        // Displaying the head element of the queue
        System.out.println("head: " + queue.element()); // Retrieves, but does not remove, the head
        System.out.println("head: " + queue.peek()); // Retrieves, but does not remove, the head

        // Iterating through the queue elements
        System.out.println("iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing elements from the priority queue
        queue.remove(); // Removes the head element
        queue.poll(); // Removes the head element (similar to remove)

        // Displaying the queue after removing two elements
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
