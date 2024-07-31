public class lesson2_intro_var {
    public static void main(String[] args) {

        // This block is to make a variable- only storing text, not numbers.
        String name = "Giyu";
        System.out.println(name);

        /*  This block that I'll use is to store a number, but not allowed to store a text.
        In my own thoughts, I think you can also do math here.*/
        int age = 17;
        System.out.println(age);

        /* If I don't want to overwrite existing values, I'll use the `final` keyword.
        Based on w3s: this will declare the variable as "final" or "constant", which means unchangeable and read-only. */
        final int yearage = 18;
        System.out.println(yearage);
    }
}