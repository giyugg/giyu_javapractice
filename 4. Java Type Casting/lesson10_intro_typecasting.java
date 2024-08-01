public class lesson10_intro_typecasting {
    public static void main(String[] args) {
        
        /* In Java, there are two types of casting:
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte. */

        // Widening Casting example:
        int number = 9;
        double conv_number = number; // This function will do an automatic casting: int -> double

        System.out.println(number); // Value of int
        System.out.println(conv_number); // Value of int but converted to double
        System.out.println((double) number); // In much easier way so that you don't need the line 13 anymore.

        // Narrowing Casting example:
        double test_number = 75.87d;
        int double_toInt = (int) test_number; // This function is now on manual casting: double to int.

        System.out.println(test_number); // Value of double
        System.out.println(double_toInt); // Value of double but converted to int (Note that round-off rule on numerical rule is not followed here.)
    }
}
