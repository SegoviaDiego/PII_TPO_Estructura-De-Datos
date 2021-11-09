package api;

public abstract class HeapTDA {
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
    /*
    Inserta un elemento valor en el heap
    Costo: Logarítmico
    */
    public abstract void push(int valor);

    /**
     * @Tarea_Nombre: pop
     * @Tarea_Descripción: Elimina el primer elemento del Heap, es decir, el elemento minimo.
     * @Parámetros: Ninguno.
     * @Devuelve: Void.
     * @Precondiciones: Ninguno.
     * @Postcondiciones: El size del heap decrece en 1.
     * @Excepción: IllegalStateException: "No hay valores en el Heap.". Se lanza cuando el Heap no tiene ningun valor.
     */
    /*
    Elimina el primer elemento del heap
    Costo: Logarítmico
    */
    public abstract void pop();

    /**
     * @Tarea_Nombre: top
     * @Tarea_Descripción: Devuelve el primer elemento del Heap, en este caso el elemento minimo.
     * @Parámetros: Ninguno
     * @Devuelve: Devuelve un Item, siendo este el elemento minimo del Heap.
     * @Precondiciones: El heap no puede estar vacio.
     * @Postcondiciones: Ninguno
     * @Excepción: IllegalStateException: "No hay valores en el Heap.". Se lanza cuando el Heap no tiene ningun valor.
     */
    /*
    Devuelve el primer elemento del heap
    Costo: Constante
    */
    public abstract int top();
}

