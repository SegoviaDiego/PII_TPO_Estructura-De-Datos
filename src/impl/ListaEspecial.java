package impl;


import java.util.NoSuchElementException;
import api.ListaEspecialTDA;

public class ListaEspecial extends ListaEspecialTDA {
 
	private static final int maxSize = 100;
	private int cantElem;
	private int[] lista;
			
	
	public void inicializarLista() {
		lista = new int[maxSize];	
		cantElem = 0;
	}
	  
	public int size() {
        return cantElem;
    }
	
	public boolean vacia() {
		return cantElem==0;
	}
 
    public void append(int valor) {
    	lista[cantElem]=valor;    
    	cantElem++;
    }
    
    public int getValor(int indice) {
    	int valor = 0;
		lista[indice]=valor;
    	return valor;
    }
    
    public void sacarUltimo() {
    	cantElem--;
    }

    public void clear() {
    	lista = new int[maxSize];	
		cantElem = 0;
    }
   
    public ListaEspecialTDA copy() {
    	ListaEspecialTDA copia = new ListaEspecial();
    	copia.inicializarLista();  	 
    	for(int i = 0;i<size();i++) {
         	copia.append(lista[i]);   
         }    	
    	return copia;
    }

    public int count(int valor) {
    	int contador=0;    	
        for(int i = 0;i<size();i++) {
        	if(lista[i]==valor)
        		contador++;
        }  	
    	return contador;
    }


    public void extend(ListaEspecialTDA list) {  	
    	// list al final de la original
    	int elementos = list.size();   	
    	for(int i = 0;i<elementos;i++) {
         	lista[cantElem]=(list.getValor(i));
         	cantElem++;
         }  	
    }


    public int index(int valor) {
    	int indice=0;
    	try {
    	for(int i = 0;i<size();i++) {
        	if(lista[i]==valor) {
        		indice=i;
        	break;
        	}
    	}
    	}
        catch(NoSuchElementException e) { //REVISAR - TODO
        	//return indice;
        	}
        finally {       
        }  	  
      	return indice;  
    }

    public int pop(int index) {
    	int itemElim= (int) lista[index];
    	try {
    	lista[index]=0;
    	    	
    	}
        catch(NoSuchElementException e) { //REVISAR - TODO INDICES NEGATIVOS ?
        	//return indice;
        	}
        finally {       
        }  	  
   	
   	
        return itemElim;
    }


    public void remove(int valor) {
    	int indice=0;
    	int i=0;
    	while(i < size() && (int)lista[i]!=valor) {
    		i++; 		
    	}
    	if((int)lista[i]==valor) {
		indice=i;
		
		for(int n = indice+1; n<size(); n++) {  //reacomodo los elementos
    	lista[n-1]=lista[n];
    		
    	}
  	}
    	//TODO agregar el try catch si no encuentra el elemento
    }


    public void reverse() {
    	int n=0;
    	int [] reversa = new int [maxSize];
    	for(int i = size();i>0;i--) {
    	reversa[n]= lista[i];
    	n++;
    	} 	
    	for(int i=0; i<size();i++) {
        lista[i]= reversa[i];
        }
    }


    public void sort() {
    	//de menor a mayor
    	int aux=0;
    	while(isSorted()==false) {
    	for(int i=0; i<size();i++) {
    		for(int j=1;j<(size()-i);j++) {
    			if((int)lista[j-1]>(int)lista[j]) {
    			aux=(int) lista[j-1];
    			lista[j-1]=lista[j];
    			lista[j]= aux;
    			}
    		}
    	}
    	}
    }

    public boolean isSorted() {
    	int i = 0;
    	boolean flag = false;
    	while(i<size() && flag==false) {
    		if((int)lista[i]>(int)lista[i+1]);  //de menor a mayor
    		flag=true;  		
    		i++;   		
        }
        return flag;
    }

    public boolean binarySearch(int valor) {
    	//TODO primero pregunta si esta ordenada y sino lanza excepcion
    	//busqueda binaria del valor
        return false;
    }
}
