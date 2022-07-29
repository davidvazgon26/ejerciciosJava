public class DataTypes {
    public static void main(String[] args) {
        //the int only support until 10 digits
        int n = 1234567890;
        // the types of integers are: byte(-128 until 127), short(-32768 until 32767), int (-2147483648 until 2147483647)
        // and long (-9223372036854775808 until 9223372036854775807)
        long nn = 1234567890123456789L; // the difference between int and long is that long carries in the end a letter "L"

        //Float Data
        //Float accept from 1.40129846432481707e-45 until 3.40282346638528860e+38
        //Double accept from 4.94065645841246544e-324d until 1.79769313486231570e+308d

        double nD = 123.4568684648684;
        float nF =  123.456F;
        System.out.println(n);
        System.out.println(nn);
        System.out.println(nD);
        System.out.println(nF);
    }
}
