public class Arrays {
    public static void main(String[] args) {
        //usando las 2 formas de declarar arreglos
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        //arreglo de 2 dimensiones
        String[][] cities = new String[4][2]; //primer [] es el renglon y segundo [] es la columna

        //Arreglo de 3 dimensiones
        int [][][] numbers = new int [2][2][2]; // los elementos por dimencion se indican dentro de los corchetes

        // Asignando versiones
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cuocake";
        androidVersions[3] = "Donut";

        for (int i = 0; i <=3 ; i++) {
            System.out.println(androidVersions[i]);
        }

        //Lo mismo que arriba pero con forEach
        System.out.println("Usando forEach****************************");

        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println("forEach de 2 dimensiones **********************");

        for (String[] par:cities) {
            for (String item:par) {
                System.out.println(item);
            }
        }

/*        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        //creando changuito en 4 dimensiones

        String [][][][] animals = new String [2][3][2][2];
        animals [1][0][0][1]= "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);

    }
}
