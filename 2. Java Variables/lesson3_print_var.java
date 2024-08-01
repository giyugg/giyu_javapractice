public class lesson3_print_var {
    public static void main(String[] args) {
        
        /* In this activity, I will be combining `str` values, using the irl example that people use everyday 
        with also a use of `+` */
        String nickname = "Giyu";
        System.out.println("Hello " + nickname + "!");

        /* Now, I will be combining `string` values by creating a class named firstName and lastName
        and combine then into class named fullName. */
        String firstName = "Jonathan ";
        String lastName = "Lambert";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        /* For this next activity, I will be combining `integer` values 
        and this involves real use of mathematical operations. In this example,
        I will subtract the present year to the birth year- to get the current age based on year. */
        // Note that this value is not accurate enough because year is only given, not the exact birth-date. 
        int presentYear = 2024;
        int birthYear = 1970;
        System.out.println(presentYear - birthYear);

        // In this next lesson that I learned, I will be declaring many variables to sum up in `println`.
        // To use this in real life scenario, I will be adding fares per transport from my house to school.
        int homeToJeep1 = 13;
        int jeep1ToJeep2 = 13;
        int jeep2ToTrycicle = 60;
        System.out.println(homeToJeep1 + jeep1ToJeep2 + jeep2ToTrycicle);
        // Also, I can also use this same code, but in one-line code using comma.
        // This in real life scenario is the fare from my school to home.
        int trycicleToJeep2 = 60, jeep2ToJeep1 = 13, jeep1ToHome = 13;
        System.out.println(trycicleToJeep2 + jeep2ToJeep1 + jeep1ToHome);

        // For the next same-lesson, I will do one value to multiple variables
        // The scenario is someone who sells a hotdog sandwich for a price of 40 pesos on 3 person.
        int person1, person2, person3;
        person1 = person2 = person3 = 40;
        System.out.println(person1 + person2 + person3);
    }
}
