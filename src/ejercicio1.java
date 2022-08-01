/*
Usando los dos tipos de casting que aprendiste (implícito y explícito),
resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.

        char c = ‘z’; conviertelo a int
        int i = 250; conviertelo a long y luego de long a short
        double d = 301.067; conviertelo a long
        int ii = 100; súmale 5000.66 y conviertelo a float
        int iii = 737; multiplícalo por 100 y conviertelo a byte
        double dd = 298.638; divídelo entre 25 y conviertelo a long
*/


public class ejercicio1 {
    public static void main(String[] args) {

        char c = 'z';
        int i = 250;
        double d = 301.067;
        int ii = 100;
        int iii = 737;
        double dd = 298.638;
        System.out.println(c);
        System.out.println("Converting to integer (ASCII)");
        System.out.println((int)c); // alt + 122
        System.out.println("Converting to long");
        System.out.println((long) i);
        System.out.println("Converting to short");
        System.out.println((short)i);
        System.out.println("Converting d to long");
        System.out.println((long) d);
        System.out.println("Converting integer to float and add 5000.66");
        System.out.println(ii+5000.66);
        System.out.println("int iii = 737; multiplying for 100 and converting to byte");
        System.out.println((byte) iii*100);
        System.out.println("double dd = 298.638; dividing between 25 and converting to long");
        System.out.println((long) dd/25);




    }
}
