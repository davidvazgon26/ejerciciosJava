import java.util.Scanner;

public class ScannerLab {
    public static void main(String[] args) {
        //this class can read data from keyboard
        Scanner scanner = new Scanner(System.in);

        //Message for the client
        System.out.println("Ingrese su nombre: ");

        //Read a integer value for keyboard
        String nom = scanner.nextLine();

        //Show data
        System.out.println("Hola como estas " + nom + "?");
    }
}
