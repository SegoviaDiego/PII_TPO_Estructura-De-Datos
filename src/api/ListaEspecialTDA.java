package api;


public abstract class ListaEspecialTDA{

	public abstract int size();
	public abstract void append(int valor);
	public abstract void clear();
	public abstract ListaEspecialTDA copy();
	public abstract int count(int valor);
	public abstract void extend(ListaEspecialTDA lista);
	public abstract int index(int valor) throws Exception;
	public abstract int pop(int index) throws Exception;
	public abstract void remove(int valor);
	public abstract void reverse();
	public abstract void sort();
	public abstract boolean isSorted();
	public abstract boolean binarySearch(int valor) throws Exception;
	public abstract void inicializarLista();
	public abstract int getValor(int i);
	
}
