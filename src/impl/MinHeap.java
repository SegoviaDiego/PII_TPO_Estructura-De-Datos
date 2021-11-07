package impl;

import api.HeapTDA;

import java.util.HashSet;

public class MinHeap extends HeapTDA {

    protected int[] data;
    protected int size;

    public MinHeap() {
        this(1000);
    }

    public MinHeap(int size) {
        this.data = new int[size];
        this.size = 0;
    }

    public static void printHeap(MinHeap heap) {
        for (int i = 0; i < heap.size; i++) {
            System.out.println(heap.data[i]);
        }
    }

    /**
     * Para encontrar si un valor existe dentro del heap, iteramos por cada uno de los valores hasta encontrar el item
     * deseado o llegar al final del heap y retornar false.
     *
     * @Costo: O(n). Lineal. Porque en el peor de los casos se tienen que recorrer todos los valores del heap.
     */
    public static boolean hasValue(MinHeap heap, int value) {
        int index = 0; // O(1)
        boolean response = false; // O(1)

        while (index < heap.size && !response) {  // O(n). Lineal. Porque en el peor de los casos, debe llegar hasta el ultimo elemento para encontrar el valor (recorre todos los n elementos de heap).
            if (heap.data[index] == value) // O(1)
                response = true; // O(1)

            index++; // O(1)
        }

        return response; // O(1)
    }

    /**
     * Este metodo se encarga de ordenar un array recibido por parametro, para realizar eso realiza una copia de todos
     * los valores del array en un Heap, para luego removerlos de manera ordenada (menor a mayor) y agregarlos a un
     * nuevo array ordenado.
     *
     * @Costo: O(2 (n log n)). Porque se realizan 2 operaciones de O(n log n) dentro del método.
     */
    public static int[] sortArray(int[] array) {
        int index = 0; // O(1)
        int size = array.length; // O(1)
        int[] sortedArray = new int[size]; // O(1)
        HeapTDA heap = new MinHeap(array.length); // O(1)

        for (int value : array) // O(n log n). Porque recorremos cada elemento del array y, por cada uno, hacemos un heap.push que cuesta O(log n).
            heap.push(value); // O(log n)

        while (index < size) { // O(n log n). Porque recorremos cada elemento del array y, por cada uno, hacemos un heap.pop que cuesta O(log n).
            sortedArray[index] = heap.top(); // O(1)
            heap.pop(); // O(log n)

            index++; // O(1)
        }

        return sortedArray; // O(1)
    }

    /**
     * Este metodo valida crea 2 HashSets para guardar todos los valores de ambos heaps. Para validar si
     * los Heaps son equivalentes (si tienen los mismos valores dentro) realiza un equals de Sets. Este metodo
     * nos permite validar si 2 sets tienen los mismos valores dentro.
     *
     * @Costo: O(3n). Porque se realizan 3 operaciones de O(n) dentro del método.
     */
    public static boolean equivalentTo(MinHeap a, MinHeap b) {
        HashSet<Integer> aValues = new HashSet<>(); // O(1)
        HashSet<Integer> bValues = new HashSet<>(); // O(1)

        for (int i = 0; i < a.size; i++) // O(n)
            aValues.add(a.data[i]); // O(1)

        for (int j = 0; j < a.size; j++) // O(n)
            bValues.add(b.data[j]); // O(1)

        return aValues.equals(bValues); // O(n). El método AbstractCollection.containsAll interno de Java realiza un foreach de cada uno de los valores. También valida tamaño y referencia pero esas operaciones son obviables por ser O(1)
    }

    /**
     * @Tarea_Nombre: push
     * @Tarea_Descripción: Inserta un elemento en el Heap, manteniendo el orden del arbol.
     * @Parámetros: int valor: Entero a insertar en el heap.
     * @Devuelve: Void.
     * @Precondiciones: Ninguno.
     * @Postcondiciones: El size del heap crece en 1 y podemos encontrar el elemento dentro del heap.
     * @Excepción: Ninguno.
     * @Costo: O(log n). Logaritmico
     */
    @Override
    public void push(int valor) {
        this.data[size] = valor; // O(1)
        size++; // O(1)

        heapifyUp();  // O(log n)
    }

    /**
     * @Tarea_Nombre: pop
     * @Tarea_Descripción: Elimina el primer elemento del Heap, es decir, el elemento minimo.
     * @Parámetros: Ninguno.
     * @Devuelve: Void.
     * @Precondiciones: Ninguno.
     * @Postcondiciones: El size del heap decrece en 1.
     * @Excepción: IllegalStateException: "No hay valores en el Heap.". Se lanza cuando el Heap no tiene ningun valor.
     */
    @Override
    public void pop() {
        if (size == 0) throw new IllegalStateException("No hay valores en el Heap.");

        this.data[0] = this.data[this.size - 1];
        size--;

        this.heapifyDown();
    }

    /**
     * @Tarea_Nombre: top
     * @Tarea_Descripción: Devuelve el primer elemento del Heap, en este caso el elemento minimo.
     * @Parámetros: Ninguno
     * @Devuelve: Devuelve un INT, siendo este el elemento minimo del Heap.
     * @Precondiciones: El heap no puede estar vacio.
     * @Postcondiciones: Ninguno
     * @Excepción: IllegalStateException: "No hay valores en el Heap.". Se lanza cuando el Heap no tiene ningun valor.
     */
    @Override
    public int top() {
        if (size == 0) throw new IllegalStateException("No hay valores en el Heap."); // O(1)
        return this.data[0]; // O(1)
    }

    /**
     * @Tarea_Nombre: getLeftChildIndex
     * @Tarea_Descripción: Calcula y devuelve el indice para el hijo izquierdo desde una posición dada.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este la posición del hijo izquierdo del punto evaluado.
     * @Costo: O(1). Constante.
     */
    private int getLeftChildIndex(int index) {
        return 2 * index + 1; // O(1)
    }

    /**
     * @Tarea_Nombre: getRightChildIndex
     * @Tarea_Descripción: Calcula y devuelve el indice para el hijo derecho desde una posición dada.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este la posición del hijo derecho del punto evaluado.
     * @Costo: O(1). Constante.
     */
    private int getRightChildIndex(int index) {
        return 2 * index + 2; // O(1)
    }

    /**
     * @Tarea_Nombre: getParentIndex
     * @Tarea_Descripción: Calcula y devuelve el indice para el padre desde una posición dada.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este la posición del padre del punto evaluado.
     * @Costo: O(1). Constante.
     */
    private int getParentIndex(int index) {
        return (index - 1) / 2; // O(1)
    }

    /**
     * @Tarea_Nombre: hasLeftChild
     * @Tarea_Descripción: Verifica que la posición evaluada pueda tener un hijo a la izquierda y devuelve un booleano con la respuesta.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un boolean, siendo este True si la posición tiene un hijo a la izquierda o false en caso contrario.
     * @Costo: O(1). Constante.
     */
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size; // O(1)
    }

    /**
     * @Tarea_Nombre: hasRightChild
     * @Tarea_Descripción: Verifica que la posición evaluada pueda tener un hijo a la derecha y devuelve un booleano con la respuesta.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un boolean, siendo este True si la posición tiene un hijo a la derecha o false en caso contrario.
     * @Costo: O(1). Constante.
     */
    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size; // O(1)
    }

    /**
     * @Tarea_Nombre: hasParent
     * @Tarea_Descripción: Verifica que la posición evaluada pueda tener un padre y devuelve un booleano con la respuesta.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un boolean, siendo este True si la posición tiene un padre o false en caso contrario.
     * @Costo: O(1). Constante.
     */
    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0; // O(1)
    }

    /**
     * @Tarea_Nombre: getLeftChild
     * @Tarea_Descripción: Devuelve el valor perteneciente al hijo izquierdo en la posición dada del heap.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este el valor en la posición del hijo izquierdo.
     * @Costo: O(1). Constante.
     */
    private int getLeftChild(int index) {
        return this.data[this.getLeftChildIndex(index)]; // O(1)
    }

    /**
     * @Tarea_Nombre: getRightChild
     * @Tarea_Descripción: Devuelve el valor perteneciente al hijo derecho en la posición dada del heap.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este el valor en la posición del hijo derecho.
     * @Costo: O(1). Constante.
     */
    private int getRightChild(int index) {
        return this.data[this.getRightChildIndex(index)]; // O(1)
    }

    /**
     * @Tarea_Nombre: getParent
     * @Tarea_Descripción: Devuelve el valor perteneciente al padre en la posición dada del heap.
     * @Parámetros: int index: Posición a evaluar.
     * @Devuelve: Devuelve un INT, siendo este el valor en la posición del padre.
     * @Costo: O(1). Constante.
     */
    private int getParent(int index) {
        return this.data[this.getParentIndex(index)]; // O(1)
    }

    /**
     * @Tarea_Nombre: swap
     * @Tarea_Descripción: Intercambia la posición de 2 valores en el heap.
     * @Parámetros: int i: Posición del elemento a intercambiar. int j: posición del segundo elemento a intercambiar.
     * @Costo: O(1). Constante.
     */
    private void swap(int i, int j) {
        int temp = this.data[i]; // O(1)
        this.data[i] = this.data[j]; // O(1)
        this.data[j] = temp; // O(1)
    }

    /**
     * @Tarea_Nombre: heapifyUp
     * @Tarea_Descripción: Ordena el Heap hacia arriba, es decir, se asegura que los valores sean decrecientes desde la ultima posición.
     * @Costo: O(log n). Logarítmica.
     */
    private void heapifyUp() {
        int index = size - 1; // O(1)
        while (hasParent(index) && getParent(index) > data[index]) { // O( log n ), siendo N la cantidad de nodos en el arbol. Porque comenzando desde la ultima posición, el elemento tendrá log n nodos hacia arriba.
            swap(getParentIndex(index), index);  // O(1)
            index = getParentIndex(index);  // O(1)
        }
    }

    /**
     * @Tarea_Nombre: heapifyDown
     * @Tarea_Descripción: Ordena el Heap hacia abajo, es decir, se asegura que los valores sean crecientes desde la primer posicion (valor minimo).
     * @Costo: O(log n). Logarítmica.
     */
    private void heapifyDown() {
        int index = 0; // O(1)
        while (hasLeftChild(index)) { // O( log n ), siendo N la cantidad de nodos en el arbol. Porque comenzando desde la primer posición y siempre eligiendo el hijo más pequeño, recorreremos una cantidad log n (1 nodo por nivel).
            int smallerChildIndex = getLeftChildIndex(index);  // O(1)

            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {  // O(1)
                smallerChildIndex = getRightChildIndex(index);  // O(1)
            }

            if (data[index] < data[smallerChildIndex]) { // O(1)
                break;
            }

            swap(index, smallerChildIndex); // O(1)

            index = smallerChildIndex; // O(1)
        }
    }
}
