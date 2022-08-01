public class metodosConMain {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo = pi * r2
        System.out.println(circleArea(y));

        //Area de una esfera = 4*PI*r2
        System.out.println(sphereArea(y));

        //Volummen de una esfera = (4/3)*pi * r3
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos a dolares: "+ converToDolar(200, "MXN") );
        System.out.println("Pesos a dolares: "+ converToDolar(1000, "COP") );


    }

    //los metodos que comparten con Main van por fuera de el y llevan la palabra static

    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI * Math.pow(r,3);
    }

    //Otro ejemplo para convertir pesos mexicanos y/o colombianos a dolares
    //Tambien aprovechamos para usar la funcion de documentacion llamada javadocs como sigue:

    /**
     * Description: Funcion para convertir de MXN y COP a Dls.
     * @param quantity Cantidad de dinero a convertir
     * @param currency acepta valores de pesos Mexicanos "MXN" y pesos Colombianos "COP"
     * @return quantity devuelve la convercion a dolares Americanos
     * */

    public static double converToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
