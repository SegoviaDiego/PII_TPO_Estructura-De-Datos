package api;

public interface ColaPrioridadTDA {
    /**
     * @Tarea_Nombre: InicializarCola
     * @Tarea_Descripción: Inicializa la cola. Crea los atributos necesarios para su correcto funcionamiento. Es requerido para hacer cualquier otra operacion con la estructura.
     * @Parámetros: Ninguno.
     * @Devuelve: Void.
     * @Precondiciones: Ninguno.
     * @Postcondiciones: La cola puede ser utilizada.
     * @Excepción: Ninguno
     */
    void InicializarCola();

    /**
     * @Tarea_Nombre: AcolarPrioridad
     * @Tarea_Descripción: Agrega un elemento con una prioridad especifica a la cola.
     * @Parámetros: INT x: El valor a agregar. INT Prioridad: La prioridad del elemento agregado.
     * @Devuelve: Void.
     * @Precondiciones: Inicializar la cola con el metodo InicializarCola.
     * @Postcondiciones: El tamaño de la cola crece en 1.
     * @Excepción: Ninguno
     */
    void AcolarPrioridad(int x, int prioridad);

    /**
     * @Tarea_Nombre: Desacolar
     * @Tarea_Descripción: Desacola el primer elemento de la cola.
     * @Parámetros: Ninguno.
     * @Devuelve: Void.
     * @Precondiciones: Inicializar la cola con el metodo InicializarCola. La cola no debe estar vacia
     * @Postcondiciones: El tamaño de la cola decrece en 1.
     * @Excepción: Ninguno
     */
    void Desacolar();

    /**
     * @Tarea_Nombre: ColaVacia
     * @Tarea_Descripción: Devuelve un booleano diciendo si la cola esta vacia o no.
     * @Parámetros: Ninguno.
     * @Devuelve: Boolean
     * @Precondiciones: Inicializar la cola con el metodo InicializarCola.
     * @Postcondiciones: Ninguno.
     * @Excepción: Ninguno
     */
    boolean ColaVacia();

    /**
     * @Tarea_Nombre: Primero
     * @Tarea_Descripción: Devuelve un INT con el valor del elemento con mas prioridad de la cola.
     * @Parámetros: Ninguno.
     * @Devuelve: Int
     * @Precondiciones: Inicializar la cola con el metodo InicializarCola.
     * @Postcondiciones: Ninguno.
     * @Excepción: Ninguno
     */
    int Primero();

    /**
     * @Tarea_Nombre: Prioridad
     * @Tarea_Descripción: Devuelve un INT con la prioridad del elemento con mas prioridad de la cola.
     * @Parámetros: Ninguno.
     * @Devuelve: Int
     * @Precondiciones: Inicializar la cola con el metodo InicializarCola.
     * @Postcondiciones: Ninguno.
     * @Excepción: Ninguno
     */
    int Prioridad();

}

