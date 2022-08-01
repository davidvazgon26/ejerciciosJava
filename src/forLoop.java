public class forLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <=10; i++) {
            printSOS();
        }
    }

    //Enviar mensaje SOS
    // usamos void cuando no retorna nada la funcion o metodo
    public static void printSOS() {
        System.out.println("...___...");
    }

    //Ver el estado de la aplicacion
    public static boolean turnOnOffLight() {
        //Usando ternarios
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
