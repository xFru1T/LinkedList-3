import java.util.LinkedList;
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();
    public void enqueue(T item) {
        list.addLast(item);
    }
    public T dequeue() {
        return list.removeFirst();
    }
    public String toString() {
        return list.toString();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Elemets: " + queue);
        System.out.println("Delete element: " + queue.dequeue());
        System.out.println("Result: " + queue);
    }
}
