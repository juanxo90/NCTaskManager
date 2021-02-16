package mx.edu.j2se.carrillo.tasks;

public class Main {
	public static void main(String[] args) {

		Persona estudianteNC = new Persona(); // Crear un nuevo objeto
		// asignar atributos definidos en la clase, para persona
		estudianteNC.setEdad(18);
		estudianteNC.setNombre("Eduardo");
		String loDejaron = estudianteNC.loDejanEntrarAlBar(); // mandando la edad
		System.out.println(estudianteNC.getNombre() + " " + loDejaron);

		Persona estudianteNC2 = new Persona(); // Crear nuevo objeto
		estudianteNC2.setNombre("Arturo Herrera");
		estudianteNC2.setEdad(12);
		loDejaron = estudianteNC2.loDejanEntrarAlBar();
		System.out.println(estudianteNC2.getNombre() + " " + loDejaron);
	}

}
