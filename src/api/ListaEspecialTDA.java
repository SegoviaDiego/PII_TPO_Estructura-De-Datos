package api;


public abstract class ListaEspecialTDA{

	public abstract int size();
	/**
	* @Tarea_Nombre: size
	* @Tarea_Descripción: devolver el tamaño de la lista
	* @Devuelve: tamaño del arreglo en int
	* @Precondiciones: tiene que estar inicializada la lista
	*/
	public abstract void append(int valor);
	/**
	* @Tarea_Nombre: append
	* @Tarea_Descripción: agrega un elemento al final de la lista
	* @Parámetros: dato int
	* @Precondiciones: tiene que estar inicializada la lista
	* @Postcondiciones: la lista tiene 1 elemento mas, aumenta la cantidad de elementos
	*/
	public abstract void clear();
	/**
	* @Tarea_Nombre: clear
	* @Tarea_Descripción: vacia la lista
	* @Precondiciones: tiene que estar inicializada la lista
	* */
	public abstract ListaEspecialTDA copy();
	/**
	* @Tarea_Nombre: copy
	* @Tarea_Descripción: genera una copia de la lista
	* @Devuelve: devolve una lista del tipo ListaEspecialTDA
	* @Precondiciones: las listas deben estar inicializadas
	*/
	public abstract int count(int valor);
	/**
	* @Tarea_Nombre: count
	* @Tarea_Descripción: cuenta la cantidad de veces que aparece un valor
	* @Parámetros: valor a buscar en int
	* @Devuelve: cantidad de apariciones en int
	* @Precondiciones: tiene que estar inicializada la lista
	*/
	public abstract void extend(ListaEspecialTDA list);
	/**
	* @Tarea_Nombre: extend
	* @Tarea_Descripción: agrega una lista al final de la original
	* @Parámetros: lista del tipo ListaEspecialTDA
	* @Precondiciones: las listas deben estar inicializadas 
	*/
	public abstract int index(int valor) throws Exception;
	/**
	* @Tarea_Nombre: index
	* @Tarea_Descripción: busca el primer valor "valor" en la lista
	* @Parámetros: valor int
	* @Devuelve: ubicacion del valor en int
	* @Precondiciones: la lista debe estar inicializada
	* @Excepción: NoSuchElementException si el elemento no esta en la lista
	*/
	public abstract int pop(int index) throws Exception;
	/**
	* @Tarea_Nombre: pop
	* @Tarea_Descripción: elimina un elemento de la lista
	* @Parámetros: indice del valor a eliminar en int
	* @Devuelve: el elemento eliminado en int
	* @Precondiciones: la lista debe estar inicializada
	* @Postcondiciones: reacomoda la lista sin el elemento eliminado
	* @Excepción: ArrayIndexOutOfBoundsException si el indice pasado es superior al tamaño de la lista
	*/
	public abstract void remove(int valor);
	/**
	* @Tarea_Nombre: remove
	* @Tarea_Descripción: eliminar el valor deseado, el primero q encuentre
	* @Parámetros: valor a eliminar en int
	* @Precondiciones: la lista debe estar inicializada
	* @Postcondiciones: reacomoda la lista sin el elemento eliminado
	*/
	public abstract void reverse();
	/**
	* @Tarea_Nombre: reverse
	* @Tarea_Descripción: invierte los valores de una lista
	* @Precondiciones: las listas deben estar inicializadas
	* @Postcondiciones: genero una lista auxiliar
	*/
	public abstract void sort();
	/**
	* @Tarea_Nombre: sort
	* @Tarea_Descripción: ordena la lista de menor a mayor por burbujeo
	* @Precondiciones: la lista debe estar inicializada
	* @Postcondiciones: la lista queda ordenada
	*/
	public abstract boolean isSorted();
	/**
	* @Tarea_Nombre: isSorted
	* @Tarea_Descripción: verifica si la lista esta ordenada
	* @Devuelve: un valor booleano si esta ordenada o no
	* @Precondiciones: la lista debe estar inicializada
	*/
	public abstract boolean binarySearch(int valor) throws Exception;
	/**
	* @Tarea_Nombre: binarySearch
	* @Tarea_Descripción: busqueda binaria de un elemento
	* @Parámetros: elemento a buscar en int
	* @Devuelve: valor booleano si el elemento esta o no
	* @Precondiciones: la lista debe estar inicializada
	* @Excepción: Exception si la lista no esta ordenada
	*/
	public abstract void inicializarLista();
	/**
	* @Tarea_Nombre: inicializarLista
	* @Tarea_Descripción: pone en 0 los elementos de la lista
	* @Postcondiciones: la lista queda inicializada
	*/
	public abstract int getValor(int valor);
	/**
	* @Tarea_Nombre: getValor
	* @Tarea_Descripción: busca el elemento del indice valor
	* @Parámetros: indice a buscar en int
	* @Devuelve: valor encontrado en el indice pasado
	* @Precondiciones: la lista debe estar inicializada
	*/
}
