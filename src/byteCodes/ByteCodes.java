package byteCodes;

import java.util.ArrayList;
import java.util.List;

public class ByteCodes {
	
	/*La generación de los bytecodes se ha mejorado para bucles for, 
	lo que proporciona una mejora en el enfoque de traducción*/
	public static void main(String args[]) throws Exception {
		System.out.println("This is the main");
		
		List<String> data = new ArrayList<>(); 
		for (String b : data);
		
		/* Codigo generado:
		{ Iterator i$ = data.iterator(); for (; i$.hasNext(); ) { String b = (String)i$.next(); } b = null; i$ = null; }
		
		Declarar la variable del iterador fuera del bucle for 
		permite que se le asigne un valor nulo tan pronto como ya no se use. 
		Esto lo hace accesible para el GC, que luego puede obtener
		deshacerse de la memoria no utilizada.*/
	}
}
