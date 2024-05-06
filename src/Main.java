//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       int miPrimeraVariable = 18;
       System.out.println(miPrimeraVariable);
       System.out.println("Hola mundo");

       int miSegundaVariable = 29;
        System.out.println(miSegundaVariable);
        // datos de tipo flotante
        float estaturaMetros = 1.6f;
        double sensorData = 1.78;
        //declarar short y int
        // datos de tipo entero
        byte edad = -127; // -128 to 127
        short capacity = 2;
        // short capacity = 32768; // excede la capacidad
        int users = 2147483647; // buffer overflow
        long worldPopulation = 2147483647;

        // datos de tipo caracter
        char letra = 'a';
        char numero = '2';
        // datos de tipo cadena
        String nombre = "George";

        // declarar las variables necesarias para poder mapear la informacion de
        // edad, estatura, nombre, ciudad
        byte miEdad = 27;
        float miEstatura = 1.70f;
        String miNombre = "George";
        String miCiudad = "Arequipa";
        // Mi nombre es George tengo 27 anios y vivo en Arequipa
        System.out.println("Mi nombre es " + miNombre + " tengo " + miEdad + " anios y vivo en " + miCiudad);
    }
}