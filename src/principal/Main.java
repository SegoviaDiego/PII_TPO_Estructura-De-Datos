package principal;

import impl.MinHeap;

public class Main {
    public static void main(String[] args) {
        // TODO: Add testing methods for every implemented TDA.

        testHeapImplementation();
    }

    public static void testHeapImplementation() {
        System.out.println("Testing Min Heap implementation...");

        System.out.println();
        testHeapHasValue();

        System.out.println();
        System.out.println();
        testHeapSortArray();

        System.out.println();
        System.out.println();
        testEquivalentHeaps();

    }

    public static void testHeapHasValue() {
        System.out.println("Testing Heap has value...");
        MinHeap heap = new MinHeap();
        heap.push(1);
        heap.push(2);
        heap.push(3);
        heap.push(4);
        heap.push(5);

        System.out.println("Tiene el valor 1? " + MinHeap.hasValue(heap, 1));
        System.out.println("Tiene el valor 5? " + MinHeap.hasValue(heap, 5));
        System.out.println("Tiene el valor 6? " + MinHeap.hasValue(heap, 6));
    }

    public static void testHeapSortArray() {
        System.out.println("Testing Heap sort array...");
        int[] unsortedArray = {4, 122, 43, 64, 512, 1, 123, 511};

        System.out.println("Unsorted Array:");
        for (int value : unsortedArray) {
            System.out.print(value + ", ");
        }

        int[] sortedArray = MinHeap.sortArray(unsortedArray);

        System.out.println("");
        System.out.println("Sorted Array:");
        for (int value : sortedArray) {
            System.out.print(value + ", ");
        }
    }

    public static void testEquivalentHeaps() {
        System.out.println("Testing Equivalent heaps...");
        MinHeap a = new MinHeap();
        MinHeap b = new MinHeap();
        MinHeap c = new MinHeap();

        // Contiene los valores 1, 2, y 3.
        a.push(1);
        a.push(2);
        a.push(3);

        // Contiene los valores 1, 2, y 3.
        b.push(3);
        b.push(2);
        b.push(1);

        // Contiene los valores 5, 6, y 7.
        c.push(7);
        c.push(6);
        c.push(5);

        System.out.println("es A equivalente a B? " + MinHeap.equivalentTo(a, b));
        System.out.println("es A equivalente a C? " + MinHeap.equivalentTo(a, c));
        System.out.println("es B equivalente a C? " + MinHeap.equivalentTo(b, c));
    }
}
