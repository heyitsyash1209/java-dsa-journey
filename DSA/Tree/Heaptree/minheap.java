package DSA.Tree.Heaptree;

public class minheap {

    int[] heap;
    int size;
    int capacity;

    // constructor
    minheap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // get parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    // get left child
    int left(int i) {
        return 2 * i + 1;
    }

    // get right child
    int right(int i) {
        return 2 * i + 2;
    }

    //  insert element
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap overflow");
            return;
        }

        // add at end (complete binary tree rule)
        heap[size] = value;
        int current = size;
        size++;

        // fix heap property (heapify up)
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // swap helper
    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // print heap
    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
 
        minheap h = new minheap(10);

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(60);
        h.insert(70);

        System.out.println("Heap elements:");
        h.printHeap();
    }
}