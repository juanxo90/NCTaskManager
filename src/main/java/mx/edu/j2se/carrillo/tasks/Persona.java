package mx.edu.j2se.carrillo.tasks;

public class Persona {
    String nombre;
    int edad;
    String sexo;
    Float altura;
    String nacionalidad;

    // get and set ...
    /**
     * @return String
     */


    public String getNombre(){
        return this.nombre;
    }

    // Para poner el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // creamos un metodo que no es main
    public String loDejanEntrarAlBar(){
        // Escribimos condicional
        if (this.edad >= 18) {
            return "Bienvenido al Bar!!";
        }
        else {
            return "Sigue participando :C";
        }

    }
}
 /*
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
  */