import java.util.Scanner;

public class ScannerLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor ingresa tu Nombre, Edad y altura separados por un espacio solamente:");

        //Read the name
        String nom = scanner.next();

        //Read the age
        int age = scanner.nextInt();

        //Read the height
        Double height = scanner.nextDouble();

        //Show Data for console
        System.out.println("Hola "+ nom + ", tu edad es: "+ age + " y tu altura es de: "+height);

    }
}
