
public class Profesor extends Persona {

    private String materia;
    private double sueldo;

    public Profesor(String nombre, int edad, String materia, double sueldo) {
        super(nombre, edad);
        this.materia = materia;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Materia: " + this.materia);
        System.out.println("Sueldo: $" + this.sueldo);
    }
}
