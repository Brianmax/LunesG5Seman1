public class Operaciones {
    public static void main(String[] args) {
        int estudiantesJava = 40;
        int nuevosMatriculados = 10;

        System.out.println("Estudiantes actuales: " + estudiantesJava);
        System.out.println("Estudiantes nuevos: " + nuevosMatriculados);
        int totalEstudiantes = estudiantesJava + nuevosMatriculados;
        System.out.println("Total estudiantes: " + totalEstudiantes);

        // sacar el perimetro de un cuadrado
        int lado = 10;
        int perimetro = lado + lado + lado + lado;
        System.out.println("El perimetro del cuadrado es: " + perimetro);

        // multiplicacion

        int ladoCuadrado = 300000000;
        int area = ladoCuadrado * ladoCuadrado;
        System.out.println("El area del cuadrado es: " + area);

        // division

        int a = 5;
        int b = 2;

        float respuesta = (float) a/b;
        System.out.println("Respuesta division: " + respuesta);

        // division caso 2

        float a2 = 5f;
        float b2 = 2f;

        float respuesta2 = a2/b2;
        System.out.println("Division caso 2: " + respuesta2);

        // cambiar el valor de una variable

        String nombre = "George";
        nombre = "Jose";

        float precioMenu = 12.5f;

        precioMenu = 13.0f;

        final float PI = 3.14f;

        // PI = 3.12f; no se puede cambiar de valor

    }
}
