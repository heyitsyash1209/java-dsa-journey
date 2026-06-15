package DSA.Tree.Heaptree;

public class maxheap {

    int[] heap;
    int size;
    int capacity;

    maxheap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    // left child
    int left(int i) {
        return 2 * i + 1;
    }

    // right child
    int right(int i) {
        return 2 * i + 2;
    }
        public void insert(int val) {

        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = val;
        int i = size;
        size++;
        while (i != 0 && heap[i] > heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }
    public int deleteMax() {

        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int root = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return root;
    }
    void heapifyDown(int i) {

        int largest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] > heap[largest]) {
            largest = l;
        }

        if (r < size && heap[r] > heap[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {

        maxheap h = new maxheap(10);

        h.insert(10);
        h.insert(50);
        h.insert(20);
        h.insert(5);
        h.insert(40);

        System.out.println("Max Heap:");
        h.print();

        System.out.println("Deleted Max: " + h.deleteMax());

        System.out.println("After Deletion:");
        h.print();
    }
}