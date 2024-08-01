public class lesson6_numbers_datatypes {
    public static void main(String[] args) {
        
        // This activity will start on Integer types, that renders the use of `byte`, `short`, `int` and `long`.
        // I will be producing the required values (the lowest you can go on a specific digit to the highest.)
        byte no1 = -128;
        System.out.println(no1);
        byte no2 = 127;
        System.out.println(no2);

        short no3 = -32768;
        System.out.println(no3);
        short no4 = 32767;
        System.out.println(no4);

        int no5 = -2147483648;
        System.out.println(no5);
        int no6 = 2147483647;
        System.out.println(no6);

        long no7 = -9223372036854775808L;
        System.out.println(no7);
        long no8 = 9223372036854775807L;
        System.out.println(no8);

        // For the next activity, I will be doing float and double.
        /* To take note, the precision of a floating point value indicates how many digits the value can have after the decimal point.
        The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
        Therefore it is safer to use double for most calculations. */
        float priceDrink = 49.99f;
        System.out.println("PhP " + priceDrink);
        double valuePi = 3.141592653589793d;
        System.out.println(valuePi);
    }
    
}
