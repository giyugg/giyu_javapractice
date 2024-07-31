public class lesson4_real_life_example {
    public static void main(String[] args) {
        
        /* In this last lesson on variables, I will be creating a data of an individual student about his or her information on their school.
        with the new statements I learned, I will be using the following:

        Float: to identify a data that can understand decimal numbers- knowing that after number, `f` should be present
        to tell Java that the value is float
        Char: to identify a data that it only reads/stores a single character (ranging from a-z/A-Z). 
        and Long: to store/handle large numerical numbers. As float have the rule to add `f` after a number, long also have
        the same ruleset, but using `L`*/

        // Student's data:
        String studentFirstName = "Kyle ";
        String studentLastName = "Acuna";
        long studentID = 20240731001L;
        int studentAge = 17;
        float studentBalance = 9543.92f;
        char studentGrade = 'A';

        // To print the variables:
        System.out.println("Student Name: " + studentFirstName + studentLastName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Remaining Balance: PhP " + studentBalance);
        System.out.println("Student Final Grade: " + studentGrade);
    }
}
