public class lesson5_intro_datatypes {
    public static void main(String[] args) {
        
        /*In this activity, I will explain the Primitive Data Types from byte to char */

        // (1 byte) byte: stores whole numbers from -128 to 127.
        byte ex1 = -128;
        byte ex2 = 127;
        // (2 bytes) short: stores whole numbers from -32,768 to 32,767
        short ex3 = -32768;
        short ex4 = 32767;
        // (4 bytes) int: stores whole numbers from -2,147,483,648 to 2,147,483,647
        int ex5 = -2147483648;
        int ex6 = 2147483647;
        // (8 bytes) long: stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // Take note that after the number, you should put `L` after the number, like this on the example below:
        long ex7 = -9223372036854775807L;
        long ex8 = 9223372036854775806L;
        // (4 bytes) float: stores fractional numbers. for storing 6 decimal digits.
        // Note that you should put `f` after the number, like `long` rule.
        float ex9 = 123.456789f; // Found an issue that 8 is not showing.
        float ex10 = 987.6654321f; // See that if you run this code, instead of 6 decimal digits, it became 4 digits. Still thinking the problem for this.
        float ex11 = 1020.30405060f; // Same problem on Line 22.
        // (8 bytes) double: stores fractional numbers. good for storing long decimal digits (limited to 15 decimal digits).
        // Same rule for `long` and `float`, with the use of `d` in this case.
        double ex12 = 1.234567891234567d;
        double ex13 = 9.8765432101234567d; // Reproduced to 16 digits for test purposes. After testing, the last digit didn't show, which is a good case for this because the limit is 15 digit decimal.
        // (1 bit) boolean: just a value of true or false statement.
        // If `long`, `float`, and `double` have rules that states to use a specific letter after a digit, there is none on boolean.
        boolean ex14 = true;
        boolean ex15 = false;
        // (2 bytes) char: to store a single character/letter- not applicable for a numerical/digit.
        char ex16 = 'A';
        char ex17 = 'C';

        // This line will now print the code presented to this activity:
        System.out.println("Data Types Example of uses: ");
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);
        System.out.println(ex5);
        System.out.println(ex6);
        System.out.println(ex7);
        System.out.println(ex8);
        System.out.println(ex9);
        System.out.println(ex10);
        System.out.println(ex11);
        System.out.println(ex12);
        System.out.println(ex13);
        System.out.println(ex14);
        System.out.println(ex15);
        System.out.println(ex16);
        System.out.println(ex17);
    }
    
}
