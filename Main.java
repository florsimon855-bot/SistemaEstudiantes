public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
            "Ana Lopez",
            20,
            "Ingeniería en Desarrollo de Software"
        );

        Profesor profesor1 = new Profesor(
            "Carlos Martinez",
            35,
            "Programación",
            18000
        );

        System.out.println("=== DATOS DEL ESTUDIANTE ===");
        estudiante1.mostrarDatos();

        System.out.println("\n=== DATOS DEL PROFESOR ===");
        profesor1.mostrarDatos();
    }
}
