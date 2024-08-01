public class lesson12_intro_operators {

    public static void main (String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
        modulus();
        increment();
        decrement();
    }
    //  For this activity, I will perform basic operations on Java.
    public static void addition () {
        int valueX = 438;
        int valueY = 289;
        int result = valueX + valueY;
        System.out.println(result);
    }
    public static void subtraction () {
        int valueX = 981;
        int valueY = 254;
        int result = valueX - valueY;
        System.out.println(result);
    }
    public static void multiplication () {
        double valueX = 58.24d;
        double valueY = 4d;
        double result = valueX * valueY;
        System.out.println(result);
    }
    public static void division () {
        double valueX = 232.96;
        double valueY = 4d;
        double result = valueX / valueY;
        System.out.println(result);
    }
    public static void modulus () {
        int valueX = 235;
        int valueY = 42;
        int result = (valueX % valueY);
        System.out.println(result);
    }
    public static void increment () {
        int valueX = 9;
        ++valueX;
        System.out.println(valueX);
    }
    public static void decrement () {
        int valueX = 10;
        --valueX;
        System.out.println(valueX);
    }
}
