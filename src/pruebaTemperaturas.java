
public class pruebaTemperaturas {

	public static void main(String[] args) {
		
		ListaEnlazada l1 = new ListaEnlazada();
		l1.agregarElemenentoAlInicio(1);
		l1.agregarElemenentoAlInicio(10);
		l1.agregarElemenentoAlInicio(15);
		l1.agregarElemenentoAlInicio(40);
		l1.agregarElemenentoAlInicio(19);
		l1.agregarElemenentoAlInicio(22);
		System.out.println(l1.mostrarPromedio(l1));
		
	}

}
