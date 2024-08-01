public class lesson14_comparison_operators {

    public static void main (String[] args) {
        compop1(); // equal to: returns true or false when x is/is not equal to y.
        compop2(); // not equal: returns true when value is not equal. returns false when opposite.
        compop3(); /* greater than: returns true when x is greater than y. returns false when x is not greater/less than y. if found equal,
                      it will return false. */
        //compop4(); /* less than: rules are the opposite of compop3. if x smaller than y, true; if x larger than y, false. if found equal,
        //            same rule on compop3 */
        //compop5(); // greater than or equal to: same rule on compop3, but when equal, it will return true.
        //compop6(); // less than or equal to: same rule on compop4, but when equal, it will return true.
    }
    public static void compop1 () {
        byte ex1_true = 4;
        byte ex2_true = 4;
        System.out.println(ex1_true == ex2_true); // returns true because ex1 is equal to ex2.
        byte ex1_false = 9;
        byte ex2_false = 10;
        System.out.println(ex1_false == ex2_false); // returns false because ex1 is not equal to ex2.
    }
    public static void compop2 () {
        byte ex1_true = 15;
        byte ex2_true = 20;
        System.out.println(ex1_true != ex2_true); // returns true because ex1 is not equal to ex2.
        byte ex1_false = 11;
        byte ex2_false = 11;
        System.out.println(ex1_false != ex2_false); // returns false because ex1 is equal to ex2.
    }
}
