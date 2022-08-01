//aplicacion para mandar SOS con la lampara de nuestro celular

public class whileLoop {
        //ver si esta prendida la lampara
        static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while(isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }

    //Enviar mensaje SOS
    // usamos void cuando no retorna nada la funcion o metodo
    public static void printSOS(){
        System.out.println("...___...");
    }

    //Ver el estado de la aplicacion
    public static boolean turnOnOffLight(){
        //Usando ternarios
        isTurnOnLight=(isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
