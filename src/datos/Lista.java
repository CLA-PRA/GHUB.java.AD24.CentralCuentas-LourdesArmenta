package datos;

public class Lista<T> {
	//primer elemento de la lista
	private Nodo<T> cabeza;
	//Total de elementos de la lista
	private int tamanio;
	//Constructor por defecto
	public Lista() {
		cabeza = null;
		tamanio=0;
	}
	//Devuelve el tamanio de la lista
	public int getTamanio() {
		return tamanio;
	}
	/*
	 * Consulta si la lista esta vacia
	 */
	public boolean esVacia() {
		if(cabeza==null)
			return true;
		else
			return false;
	}
	/*
	 * Agrega un nuevo nodo al final de la lista
	 */
	public void agregar(T valor) {
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setValor(valor);
		if (esVacia()) {
			//Como hay un solo nodo, el siguiente apunta al mismo
			nuevo.setSiguiente(nuevo);
			cabeza = nuevo;
		} else {
			//agregar al final de la lista
			Nodo<T> aux = cabeza;
			//Hacer el cambio en la condución de fin de la lista
			while (aux.getSiguiente() !=cabeza) {
			
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			//Enlaza el último nodo con el primero
			nuevo.setSiguiente(cabeza);
		}
		tamanio++;
	}
	/**
	 * inserta un nuevo nodo en la lista
	 * @param valor a agregar
	 * @param posición donde se inserta el nodo el nodo
	 * @throws posicionIlegalException en caso que la
	 * posición no existe
	 */
	public void insertar(T valor, int pos) throws 
	    PosicionIlegalException{
		//Para insertar la posicion debe estar entre 0 y el tamaño
		//y además, debe haber al menos un dato de la lista
		if (pos>=0 && pos<=tamanio) {
			Nodo<T> nuevo = new Nodo<T>();
			nuevo.setValor(valor);
			//el nuevo nodo a insertar esta al comienzo de la lista
			if (pos==0) {
				//Buscar el último nodo
				Nodo<T> ultimo = cabeza;
				while (ultimo.getSiguiente() !=cabeza) {
					ultimo = ultimo.getSiguiente();
				}
				
				nuevo.setSiguiente(cabeza);
				cabeza=nuevo;
				//Enlazar el último con el primero
				ultimo.setSiguiente(cabeza);
			}else {
				//El nodo a insertar va al final de la lista
				if (pos==tamanio) {
					Nodo<T> aux = cabeza;
					//Hacer el cambio porque ahora la lista es circular
					//y el último ya no apunta a null, sino a la cabeza
					while (aux.getSiguiente() !=cabeza) {
						aux = aux.getSiguiente();
					}
					aux.setSiguiente(nuevo);
					//Enlazar el último con el primero
					nuevo.setSiguiente(cabeza);
				}
				//El nodo a insertar esta en el medio
				else {
					Nodo<T> aux = cabeza;
					for(int i=0;i<=pos-2;i++) {
						aux = aux.getSiguiente();
					}
					Nodo<T> siguiente = aux.getSiguiente();
					aux.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
				}
			}
			tamanio++;
		}else {
			throw new PosicionIlegalException();
		}
	}
	/**
	 * Devuelve el valor de una determinada posicion
	 * @param pos posicion
	 * @return el valor de tipo T
	 */
	public T getValor(int pos) throws PosicionIlegalException{
		if (pos>=0 && pos<tamanio)
		{
			T valor;
			if (pos==0) {
				valor = cabeza.getValor();
				return valor;
			}
			else {
				Nodo<T> aux = cabeza;
				for (int i=0;i<=pos-1;i++) {
					aux = aux.getSiguiente();
				}
				valor = aux.getValor();
			}
			return valor;
		}
		else
		{
			throw new PosicionIlegalException();
		}
			
	}
	/**
	 * Elimina un nodo en una determinada posicion
	 * @param pos posicion
	 * @throw PosicionIlegalException
	 */
	public void remover(int pos) throws PosicionIlegalException{
		if (pos >= 0 && pos < tamanio)
		{
			if (pos == 0) {
				//Buscar el último nodo para enlazarlo con la nueva cabeza
				Nodo<T> ultimo = cabeza;
				while (ultimo.getSiguiente() !=cabeza) {
					ultimo = ultimo.getSiguiente();
				}
				//Desplaza la cabeza al siguiente nodo
				
				cabeza = cabeza.getSiguiente();
				//Enlaza el ultimo con la nueva cabeza
				ultimo.setSiguiente(cabeza);
				tamanio--;
			}
			else {
				//aux apunta junto al nodo anterior al que se elimina
				Nodo<T> aux = cabeza;
				for(int i = 0;i<=pos-2;i++) {
					aux = aux.getSiguiente();
				}
				//prox apunta junto al nodo qie se elimino
				Nodo<T> prox = aux.getSiguiente();
				aux.setSiguiente(prox.getSiguiente());
				tamanio--;
			}
		}
		else
		{
			throw new PosicionIlegalException();
		}
	}
	
	/**
	 * Elimina todos los nodos de la la lista
	 */
	public void limpiar() {
		cabeza = null;
		tamanio = 0;
	}

}
