
public class ListaEnlazada {

	Nodo nodoInicio;
	Nodo nodoFin;

	// 1) Crear lista enlazada
	public ListaEnlazada() {
		nodoFin = nodoInicio = null;
	}

	// 2) Agregar elemento al inicio
	public void agregarElemenentoAlInicio(int dato) {
		Nodo nodoNuevo = new Nodo(dato);

		if (nodoInicio == null) {
			nodoFin = nodoInicio = nodoNuevo;
		} else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}
	}

	public void mostrarElementos() {
		Nodo nodoActual = nodoInicio;

		while (nodoActual != null) {
			System.out.print("[" + nodoActual.getDato() + "]-->");
			nodoActual = nodoActual.getEnlace();
		}
	}

	public void eliminarInicio() {
		if (nodoInicio != null) {
			nodoInicio = nodoInicio.getEnlace();
		}

	}

	public void insertarFinal(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		
		if (nodoInicio != null) {
			nodoFin.setEnlace(nuevoNodo);
			nodoFin = nuevoNodo;
		} else {
			nodoFin = nodoInicio = nuevoNodo;
		}
	}

	public void eliminarFinal() {
		Nodo aux = nodoInicio;
		if (nodoInicio != null) {
			while (aux.getEnlace() != null) {
				nodoFin=aux;
				aux=aux.getEnlace();
			}
			nodoFin.setEnlace(null);
			nodoFin=aux;
		}

	}
	
	public int eliminarDatoEspecifico(int dato) {

		if (vacia()) {
			System.out.println("No hay elementos a eliminar");
			return -1;
		} else if (nodoInicio.getDato() == dato) {
			System.out.println("\nEncontrado en el primer nodo");
			int d = nodoInicio.getDato();
			nodoInicio = nodoInicio.getEnlace();
			return d;
		}else if (nodoInicio == nodoFin) {
			return -1;
		} else {
			Nodo nodoAnterior, nodoSiguiente;
			nodoAnterior = nodoInicio;
			nodoSiguiente = nodoInicio.getEnlace();
			
			while (nodoSiguiente.getDato() != dato && nodoSiguiente.getEnlace() != null) {
				nodoAnterior = nodoAnterior.getEnlace();
				nodoSiguiente = nodoSiguiente.getEnlace();
			}

			if (nodoSiguiente.getDato() == dato) {
				
				nodoAnterior.setEnlace(nodoSiguiente.getEnlace());
				return nodoSiguiente.getDato();
			} else
				return -1;

		}

	}
	
	public int mostrarCantidadElementos() {
		Nodo aux = nodoInicio;
		if (nodoInicio!=null) {
			int cont = 0;
			while(aux!=null){
				cont+=1;
				aux=aux.getEnlace();
			}
			return cont;
		} else {
			return 0;
		}
	}
	public boolean vacia() {
		if (nodoInicio==null) {
			return false;
			
		}
		return true;
		
	}
	
	public String mostrarPromedio(ListaEnlazada l) {
		double promedio = 0;
		Nodo nodoActual = l.nodoInicio;
		int cont = 0;
		while(nodoActual.getEnlace()!= null) {
			promedio = promedio + nodoActual.getDato();
			nodoActual = nodoActual.getEnlace();
			cont+=1;
		}
		promedio = promedio/cont;
		String retorno = "";
		if (promedio<10) {
			retorno = promedio + "-" + "Congelacion";
		} else if(promedio<20){
			retorno = promedio + "-" + "Frio";
		}else if (promedio<30) {
			retorno = promedio + "-" + "Normal";
		}else if (promedio<40) {
			retorno = promedio + "-" + "Alta";
		}
		return retorno;
		
	}
	

}