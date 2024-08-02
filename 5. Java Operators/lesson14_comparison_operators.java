public class lesson14_comparison_operators {

    public static void main (String[] args) {
        compop1(); // equal to: returns true or false when x is/is not equal to y.
        compop2(); // not equal: returns true when value is not equal. returns false when opposite.
        compop3(); /* greater than: returns true when x is greater than y. returns false when x is not greater/less than y. if found equal,
                    it will return false. */
        compop4(); /* less than: rules are the opposite of compop3. if x smaller than y, true; if x larger than y, false. if found equal,
                    same rule on compop3 */
        compop5(); // greater than or equal to: same rule on compop3, but when equal, it will return true.
        compop6(); // less than or equal to: same rule on compop4, but when equal, it will return true.
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
    public static void compop3 () {
        byte ex1_true = 42;
        byte ex2_true = 34;
        System.out.println(ex1_true > ex2_true); // returns true because ex1 is bigger than ex2.
        byte ex1_false = 15;
        byte ex2_false = 25;
        System.out.println(ex1_false > ex2_false); // returns false because ex1 is not bigger than ex2.
        byte ex1_eqFalse = 30;
        byte ex2_eqFalse = 30;
        System.out.println(ex1_eqFalse > ex2_eqFalse); // returns false because ex1 is equal, but not bigger than ex2.
    }
    public static void compop4 () {
        byte ex1_true = 25;
        byte ex2_true = 30;
        System.out.println(ex1_true < ex2_true); // returns true because ex1 is smaller than ex2.
        byte ex1_false = 52;
        byte ex2_false = 25;
        System.out.println(ex1_false < ex2_false); // returns false because ex1 is not smaller than ex2.
        byte ex1_eqFalse = 127;
        byte ex2_eqFalse = 127;
        System.out.println(ex1_eqFalse < ex2_eqFalse); // returns false because ex1 is equal, but not smaller than ex2.
    }
    public static void compop5 () {
        byte ex1_eqTrue = 50;
        byte ex2_eqTrue = 50;
        System.out.println(ex1_eqTrue >= ex2_eqTrue); // returns true because ex1 has the same value/is equal on/to ex2.
        byte ex1_true = 12;
        byte ex2_true = 6;
        System.out.println(ex1_true >= ex2_true); // returns true because ex1 is bigger than ex2.
        byte ex1_false = 89;
        byte ex2_false = 120;
        System.out.println(ex1_false >= ex2_false); // returns false because ex1 is not bigger than ex2.
    }
    public static void compop6 () {
        byte ex1_eqTrue = 112;
        byte ex2_eqTrue = 112;
        System.out.println(ex1_eqTrue <= ex2_eqTrue); // returns true because ex1 has the same value/is equal on/to ex2.
        byte ex1_true = 50;
        byte ex2_true = 100;
        System.out.println(ex1_true <= ex2_true); // returns true because ex1 is smaller than ex2.
        byte ex1_false = 121;
        byte ex2_false = 98;
        System.out.println(ex1_false <= ex2_false); // returns false because ex1 is not smaller than ex2.
    }
}
