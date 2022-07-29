public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono de $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: -$50 de descuento

        salary = salary-50;
        System.out.println(salary);

        //extras 2 horas $30 c/u
        // Comida - $45
        salary = salary + (30*2) - 45;

        System.out.println(salary);

        //Actualizando cadenas de te3xto

        String employeeName = "David";
        employeeName = employeeName + " Alejandro";
        employeeName = employeeName + " Vazquez";
        employeeName = employeeName + " Gonzalez";

        System.out.println(employeeName);

        }
}
