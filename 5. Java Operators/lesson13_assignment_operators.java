public class lesson13_assignment_operators {

    public static void main (String[] args) {
        op1(); // (x=5) expected: 5
        op2(); // (x=x+3) expected: 10
        op3(); // (x=x-4) expected: 12
        op4(); // (x=x*4) expected: 52
        op5(); // (x=x/5) expected: 7
        op6(); // (x=x%13) expected: 4
        op7(); // (x=x&6) expected: 2
        op8(); // (x=x|2) expected: 10
        op9(); // (x=x^10) expected: 6
        op10(); // (x=x>>2) expected: 3
        op11(); // (x=x<<10) expected: 21504
    }
    public static void op1 () {
        int varX = 5;
        System.out.println(varX);
    }
    public static void op2 () {
        int varX = 7;
        varX += 3;
        System.out.println(varX);
    }
    public static void op3 () {
        int varX = 16;
        varX -= 4;
        System.out.println(varX);
    }
    public static void op4 () {
        int varX = 13;
        varX *= 4;
        System.out.println(varX);
    }
    public static void op5 () {
        int varX = 35;
        varX /=5;
        System.out.println(varX);
    }
    public static void op6 () {
        int varX = 134;
        varX %=13;
        System.out.println(varX);
    }
    public static void op7 () {
        int varX = 19;
        varX &=6;
        System.out.println(varX);
    }
    public static void op8 () {
        int varX = 8;
        varX |=2;
        System.out.println(varX);
    }
    public static void op9 () {
        int varX = 12;
        varX ^= 10;
        System.out.println(varX);
    }
    public static void op10 () {
        int varX = 14;
        varX >>= 2;
        System.out.println(varX);
    }
    public static void op11 () {
        int varX = 21;
        varX <<= 10;
        System.out.println(varX);
    }
}
