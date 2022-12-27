package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.setEdad(24);
		persona.setNombre("Juan");
		persona.setTelefono(1122334455);
		
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());
	}
}

class Persona{
	
	private int edad;
	private String nombre;
	private int telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
