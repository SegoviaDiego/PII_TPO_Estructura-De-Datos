package api;

public abstract class ListaEspecialTDA {
    /*
    Devuelve el tamaño de la lista (la cantidad de elementos)
    Costo: Constante
    */
    public abstract int size();

    /*
    Agrega el elemento valor al final de la lista
    Costo: Constante
    */
    public abstract void append(int valor);

    /*
    Elimina todos los elementos de la lista
    Costo: Constante
    */
    public abstract void clear();

    /*
    Genera una copia completa de la lista
    Costo: Lineal
    */
    public abstract ListaEspecialTDA copy();

    /*
    Cuenta cuántas apariciones hay del elemento valor en la lista
    Costo: Lineal
    */
    public abstract int count(int valor);

    /*
    Agrega la lista recibida por parámetro al final de la lista original
    */
    public abstract void extend(ListaEspecialTDA lista);

    /*
    Busca en qué posición de la lista se encuentra el elemento valor;
    si aparece varias veces, devuelve la primera
    En caso de no existir, lanza una excepción
    */
    public abstract int index(int valor);

    /*
    Elimina el elemento de la posición index
    Permite la utilización de índices negativos;
    En caso de sobrepasar el tamaño de la lista, lanza una excepción;
    Devuelve el valor eliminado de la lista
    Costo: Lineal
    */
    public abstract int pop(int index);

    /*
    Elimina el elemento valor de la lista; si aparece varias veces, elimina la primera
    En caso de no existir, lanza una excepción
    Costo: Lineal
    */
    public abstract void remove(int valor);


    /*
    Invierte la lista
    */
    public abstract void reverse();

    /*
    Ordena los elementos de la lista
    */
    public abstract void sort();

    /*
    Chequea si la lista está ordenada (creciente o decrecientemente)
    */
    public abstract boolean isSorted();

    /*
    Busca el valor ingresado mediante una búsqueda binaria
    Si la lista no está ordenada (creciente o decrecientemente), lanza una excepción
    */
    public abstract boolean binarySearch(int valor);
}
