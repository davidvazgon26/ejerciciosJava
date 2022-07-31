public class switchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("You selected mode Light Mode");
                break;
            case "Night":
                System.out.println("You selected mode Night Mode");
                break;
            case "Blue Dark":
                System.out.println("You selected mode Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("You selected mode Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion correcta");
        }
    }
}
