// Clase principal que contiene el punto de inicio del programa
public class Main {
    public static void main(String[] args) {
        
        // INSTANCIACIÓN DE OBJETOS: Creamos un objeto a partir de la clase Estudiante
        Estudiante estudiante1 = new Estudiante(
            "Ana Lopez", 
            20, 
            "Ingeniería en Desarrollo de Software"
        );

        // USO DE MÉTODO: Llamamos al método para mostrar la información en consola
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");
        estudiante1.mostrarDatos();
    }
}

// CREACIÓN DE CLASES: Definición de la clase Estudiante
class Estudiante {
    // DEFINICIÓN DE ATRIBUTOS
    String nombre;
    int edad;
    String carrera;

    // IMPLEMENTACIÓN DE CONSTRUCTOR: Inicializa los atributos del objeto
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // IMPLEMENTACIÓN DE MÉTODO: Define una acción que puede realizar el objeto
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Carrera: " + this.carrera);
    }
}
