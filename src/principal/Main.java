package principal;

import impl.MinHeap;

public class Main {
    public static void main(String[] args) {
        // TODO: Add testing methods for every implemented TDA.

        testHeapImplementation();
    }

    public static void testHeapImplementation() {
        System.out.println("Testing Min Heap implementation...");
        MinHeap heap = new MinHeap();
        heap.push(8);
        heap.push(10);
        heap.push(17);
        heap.push(12);
        heap.push(14);
        heap.push(20);
        heap.push(13);
        heap.push(11);
        heap.push(15);

        System.out.println("Print sorted heap:");
        MinHeap.printHeap(heap);

        System.out.println(1);
    }
}
