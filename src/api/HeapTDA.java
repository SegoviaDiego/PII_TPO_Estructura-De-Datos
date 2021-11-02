package api;

public abstract class HeapTDA {
    /*
    Inserta un elemento valor en el heap
    Costo: Logarítmico
    */
    public abstract void push(int valor);

    /*
    Elimina el primer elemento del heap
    Costo: Logarítmico
    */
    public abstract void pop();

    /*
    Devuelve el primer elemento del heap
    Costo: Constante
    */
    public abstract int top();
}

