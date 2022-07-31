public class casting {
    //ejemplos de casteo y como de un numero flotante obtener solo la parte entera
    public static void main(String[] args) {
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //estimated
        // round to 2

        int estimatedMonthlyDogs = (int)  monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Ejemplo de entero a decimal
        int a = 30;
        int b = 12;

        System.out.println(a/b);
        System.out.println((double)a/b);

        //En el casteo no es necesario incluirlo explicitamente, solo en los casos que la convercion en de un dato mayor a uno menor
        //Ejemos:

        char n = '1';
        int nInt = n;
        System.out.println(nInt); // Arroja 49 que es el codigo ASCII de 1

        short nShort = (short) n;
        System.out.println(nShort);

    }
}
