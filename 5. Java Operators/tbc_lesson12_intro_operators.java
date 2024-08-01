public class tbc_lesson12_intro_operators {
    public static void main(String[] args) {
        subtraction(50, 50);
        addition(30, 50);
        division(90, 70);
        multiplication(50, 90);
    }
    public static void subtraction(Integer hatdog1, Integer hatdog2) {
        double sub1 = hatdog1;
        double sub2 = hatdog2;
        System.out.println("");
        System.out.println("This is how subtraction work!");
        System.out.println(String.valueOf((int) sub1) + " - " + String.valueOf((int) sub2) + " =");
        System.out.println(sub1 - sub2);
        System.out.println("");
    }
    public static void addition(Integer hatdog1, Integer hatdog2) {
        double sub1 = hatdog1;
        double sub2 = hatdog2;
        System.out.println("");
        System.out.println("This is how addition work!");
        System.out.println(String.valueOf((int) sub1) + " + " + String.valueOf((int) sub2) + " =");
        System.out.println(sub1 + sub2);
        System.out.println("");
    }
    public static void division(Integer hatdog1, Integer hatdog2) {
        float sub1 = hatdog1;
        float sub2 = hatdog2;
        System.out.println("");
        System.out.println("This is how division work!");
        System.out.println(String.valueOf(sub1) + " / " + String.valueOf(sub2) + " =");
        System.out.println(sub1 / sub2);
        System.out.println("");
    }
    public static void multiplication(Integer hatdog1, Integer hatdog2) {
        double sub1 = hatdog1;
        double sub2 = hatdog2;
        System.out.println("");
        System.out.println("This is how multiplication work!");
        System.out.println(String.valueOf((int) sub1) + " * " + String.valueOf((int) sub2) + " =");
        System.out.println(sub1 * sub2);
        System.out.println("");
    }
}